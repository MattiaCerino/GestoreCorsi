package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;*/

public class ConnectDB {
	
	/*private static final String jdbcURL = "jdbc:mysql://localhost/iscritticorsi";
	private static HikariDataSource ds;*/
	
	public static Connection getConnection() throws SQLException {
		/*if (ds == null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(jdbcURL);
			config.setUsername("root");
			config.setPassword("CerinoMattia3");
			
			config.addDataSourceProperty("cachePrepStmts", true);
			config.addDataSourceProperty("prepStmtCacheSize", 250);
			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
			
			ds = new HikariDataSource(config);
		}
		
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Errore di connessione al db");
			throw new RuntimeException();
		}*/
		String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?user=root&password=CerinoMattia3";
		return DriverManager.getConnection(jdbcURL);
	}
	
}
