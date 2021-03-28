package net.javaguides.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "thread")
public class Thread {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "activeCount")
	private Integer activeCount;

	@Column(name = "idleCount")
	private Integer idleCount;

	@Column(name = "maxSize")
	private Integer maxSize;

	@OneToOne()
	private User user;

	public Thread() {

	}

	public Thread(Integer activeCount, Integer idleCount, Integer maxSize) {
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
