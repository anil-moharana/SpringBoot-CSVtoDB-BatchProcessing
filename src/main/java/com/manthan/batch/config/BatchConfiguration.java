package com.manthan.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.manthan.batch.listener.JobListener;
import com.manthan.batch.model.CreditInfo;
import com.manthan.batch.processor.CreditInfoProcessor;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	private String SQL_insertAll = "INSERT INTO credit_details(ID,NAME,LIMIT_BAL,SEX,EDUCATION,MARRIAGE,AGE,PAY_0,PAY_2,PAY_3,PAY_4,PAY_5,PAY_6,BILL_AMT1, BILL_AMT2,BILL_AMT3, BILL_AMT4, BILL_AMT5, BILL_AMT6, PAY_AMT1, PAY_AMT2, PAY_AMT3,PAY_AMT4, PAY_AMT5, PAY_AMT6,default_payment_next_month)VALUES(:ID, :NAME, :LIMIT_BAL, :SEX, :EDUCATION, :MARRIAGE, :AGE,:PAY_0,:PAY_2,:PAY_3,:PAY_4,:PAY_5,:PAY_6,:BILL_AMT1,:BILL_AMT2,:BILL_AMT3,:BILL_AMT4,:BILL_AMT5,:BILL_AMT6,:PAY_AMT1,:PAY_AMT2,:PAY_AMT3,:PAY_AMT4,:PAY_AMT5,:PAY_AMT6,:default_payment_next_month)";

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public DataSource dataSource;

	@Bean
	public FlatFileItemReader<CreditInfo> reader() {

		FlatFileItemReader<CreditInfo> reader = new FlatFileItemReader<CreditInfo>();
		reader.setResource(new ClassPathResource("credit_card57066ea.csv"));
		reader.setLineMapper(new DefaultLineMapper<CreditInfo>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames(new String[] { "ID", "NAME", "LIMIT_BAL", "SEX", "EDUCATION", "MARRIAGE", "AGE",
								"PAY_0", "PAY_2", "PAY_3", "PAY_4", "PAY_5", "PAY_6", "BILL_AMT1", "BILL_AMT2",
								"BILL_AMT3", "BILL_AMT4", "BILL_AMT5", "BILL_AMT6", "PAY_AMT1", "PAY_AMT2", "PAY_AMT3",
								"PAY_AMT4", "PAY_AMT5", "PAY_AMT6", "default_payment_next_month" });
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<CreditInfo>() {
					{
						setTargetType(CreditInfo.class);
					}
				});
			}
		});
		return reader;
	}

	@Bean
	public CreditInfoProcessor processor() {
		return new CreditInfoProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<CreditInfo> writer() {

		JdbcBatchItemWriter<CreditInfo> writer = new JdbcBatchItemWriter<CreditInfo>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<CreditInfo>());
		System.out.println(SQL_insertAll);
		writer.setSql(SQL_insertAll);
		writer.setDataSource(dataSource);
		return writer;
	}

	@Bean
	public Job importUserJob(JobListener listener) {
		return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer()).listener(listener)
				.flow(step1()).end().build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<CreditInfo, CreditInfo>chunk(10).reader(reader()).processor(processor())
				.writer(writer()).build();
	}
}