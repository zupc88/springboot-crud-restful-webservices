package net.javaguides.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "domain_name")
	private String domainName;

	@Column(name = "instance_name")
	private String InstanceName;
	
	@Column(name = "hostName")
	private String hostName;
	
	@Column(name = "urlHealthCheck")
	private String urlHealthCheck;

	@Column(name = "throughput")
	private String throughput;

	@Column(name = "heapMemory")
	private String heapMemory;

	public User() {
		
	}
	
	public User(String domainName, String InstanceName, String hostName, String urlHealthCheck, String throughput, String heapMemory) {
		super();
		this.domainName = domainName;
		this.InstanceName = InstanceName;
		this.hostName = hostName;
		this.urlHealthCheck = urlHealthCheck;
		this.throughput = throughput;

	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) { this.domainName = domainName; }

	public String getInstanceName() {
		return InstanceName;
	}
	public void setInstanceName(String InstanceName) {
		this.InstanceName = InstanceName;
	}

	public String gethostName() {
		return hostName;
	}
	public void sethostName(String hostName) {
		this.hostName = hostName;
	}

	public String geturlHealthCheck() {
		return urlHealthCheck;
	}
	public void seturlHealthCheck(String urlHealthCheck) {
		this.urlHealthCheck = urlHealthCheck;
	}
	public String getthroughput() {
		return throughput;
	}
	public void setthroughput(String throughput) {
		this.throughput = throughput;
	}
}
