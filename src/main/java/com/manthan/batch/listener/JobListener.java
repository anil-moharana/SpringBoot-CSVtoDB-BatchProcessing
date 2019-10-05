package com.manthan.batch.listener;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.manthan.batch.model.CreditInfo;

@Component
public class JobListener extends JobExecutionListenerSupport {
	private static final Logger log = LoggerFactory.getLogger(JobListener.class);
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! JOB FINISHED! Time to verify the results");
			List<CreditInfo> results = jdbcTemplate.query(
					"SELECT ID, NAME, LIMIT_BAL, SEX, EDUCATION, MARRIAGE, AGE, PAY_0, PAY_2, PAY_3, PAY_4, PAY_5, PAY_6, BILL_AMT1, BILL_AMT2, BILL_AMT3, BILL_AMT4, BILL_AMT5, BILL_AMT6, PAY_AMT1, PAY_AMT2, PAY_AMT3, PAY_AMT4, PAY_AMT5, PAY_AMT6, default_payment_next_month\r\n"
							+ "FROM credit_details;",
					new RowMapper<CreditInfo>() {
						@Override
						public CreditInfo mapRow(ResultSet rs, int row) throws SQLException {
							return new CreditInfo(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
									rs.getInt(5), rs.getInt(6), 
									 rs.getInt(7),  rs.getInt(8),  rs.getInt(9),
									 rs.getInt(10),  rs.getInt(11),  rs.getInt(12),  rs.getInt(13), 
									 rs.getDouble(14), rs.getDouble(15), rs.getDouble(16), rs.getDouble(17), 
									 rs.getDouble(18), rs.getDouble(19), rs.getDouble(20), rs.getDouble(21), 
									 rs.getDouble(22), rs.getDouble(23), rs.getDouble(24), rs.getDouble(25), rs.getInt(26));
							
							
						
							
							
						}
					});

			for (CreditInfo creditInfo : results) {
				log.info("Found <" + creditInfo + "> in the database.");
			}
		}

	}
}
