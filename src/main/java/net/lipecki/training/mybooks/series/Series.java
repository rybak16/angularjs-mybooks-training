package net.lipecki.training.mybooks.series;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author glipecki
 */
public class Series {

	@ApiModelProperty(value = "Internal series id", example = "0", required = false, readOnly = true)
	private Long id;

	@ApiModelProperty(value = "Series name", example = "Mroczna Wieża", required = true, readOnly = false)
	private String name;

	public Series() {
	}

	public Series(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean hasId() {
		return id != null && id > 0;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Series{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
