package com.trelobifteki.demo.elasticsearch.springbootelasticsearchdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@Configuration
public class ElasticsearchConfiguration {

	@Bean
	public Client client() throws UnknownHostException  {
		final Settings elasticsearchSettings = Settings.builder()
		          .put("client.transport.sniff", true)
		          .put("path.home", "/usr/local/Cellar/elasticsearch/6.0")
		          .put("cluster.name", "kokopiko")
		          .build();
		        TransportClient client = new PreBuiltTransportClient(elasticsearchSettings);
		        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
		        return client;
	}
	
	@Bean
	public ElasticsearchOperations elasticsearchTemplate(final Client client) {
		return new ElasticsearchTemplate(client);
	}
	
}
