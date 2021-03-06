package com.trimc.blogger.jaxrs.mongo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:config/mongo.properties")
public class AppConfig {

	@Value("${mongo.db}")
	private String	database;

	@Value("${mongo.host}")
	private String	host;

	@Value("${mongo.port}")
	private Integer	port;

	public String getDatabase() {
		return database;
	}

	public String getHost() {
		return host;
	}

	public Integer getPort() {
		return port;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
}
