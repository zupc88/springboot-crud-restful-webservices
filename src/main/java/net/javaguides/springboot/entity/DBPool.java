package net.javaguides.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "dbpool")
public class DBPool {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "poolName")
	private String poolName;

	@Column(name = "activeCount")
	private Integer activeCount;

	@Column(name = "idleCount")
	private Integer idleCount;

	@Column(name = "maxSize")
	private Integer maxSize;

	@OneToOne()
	private User user;

	public DBPool() {

	}

	public DBPool(String poolName, Integer activeCount, Integer idleCount, Integer maxSize) {
		super();
		this.activeCount = activeCount;
		this.idleCount = idleCount;
		this.maxSize = maxSize;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getPoolName() {
		return poolName;
	}

	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}

	public Integer getActiveCount() {
		return activeCount;
	}

	public void setActiveCount(Integer activeCount) {
		this.activeCount = activeCount;
	}

	public Integer getIdleCount() {
		return idleCount;
	}

	public void setIdleCount(Integer idleCount) {
		this.idleCount = idleCount;
	}

	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}
}
