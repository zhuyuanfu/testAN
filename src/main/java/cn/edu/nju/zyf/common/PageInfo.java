package cn.edu.nju.zyf.common;

import java.util.List;

/**
 * 
 * @author yuanf
 * @param <T>
 * @description 
 * @date 2017-12-10
 */
public class PageInfo<T> {
	private Integer pageNumber;
	private Integer pageSize;
	private Long total;
	private List<T> rows;
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
