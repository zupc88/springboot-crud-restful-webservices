package net.javaguides.springboot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "domainName")
	private String domainName;

	@Column(name = "instanceName")
	private String InstanceName;
	
	@Column(name = "hostName")
	private String hostName;
	
	@Column(name = "urlHealthCheck")
	private String urlHealthCheck;

	@Column(name = "throughput")
	private String throughput;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "heapMemory")
	private Heap heapMemory;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "thread")
	private Thread thread;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dbConnectionPool")
	private List<DBPool> dbPoolList = new ArrayList<>();;

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

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getUrlHealthCheck() {
		return urlHealthCheck;
	}

	public void setUrlHealthCheck(String urlHealthCheck) {
		this.urlHealthCheck = urlHealthCheck;
	}

	public String getThroughput() {
		return throughput;
	}

	public void setThroughput(String throughput) {
		this.throughput = throughput;
	}

	public Heap getHeapMemory() {
		return heapMemory;
	}

	public void setHeapMemory(Heap heapMemory) {
		this.heapMemory = heapMemory;
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public List<DBPool> getDbPoolList() {
		return dbPoolList;
	}

	public void setDbPoolList(List<DBPool> dbPoolList) {
		this.dbPoolList = dbPoolList;
	}
}
