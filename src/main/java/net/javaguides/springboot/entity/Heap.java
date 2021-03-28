package net.javaguides.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "heapMemory")
public class Heap {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "current_size")
	private Integer currentSize;

	@Column(name = "current_percent")
	private Integer currentPercent;

	@Column(name = "max_size")
	private Integer maxSize;

	@OneToOne()
	private User user;

	public Heap() {

	}

	public Heap(Integer currentSize, Integer currentPercent, Integer maxSize) {
		super();
		this.currentSize = currentSize;
		this.currentPercent = currentPercent;
		this.maxSize = maxSize;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public Integer getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(Integer currentSize) {
		this.currentSize = currentSize;
	}

	public Integer getCurrentPercent() {
		return currentPercent;
	}

	public void setCurrentPercent(Integer currentPercent) {
		this.currentPercent = currentPercent;
	}

	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}
}
