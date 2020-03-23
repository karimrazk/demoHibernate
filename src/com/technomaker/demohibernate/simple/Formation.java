package com.technomaker.demohibernate.simple;

public class Formation {
	
	private Long id;
	private String theme;

	public Formation(String theme) {
		super();
		this.theme = theme;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Formation{" +
				"id=" + id +
				", theme='" + theme + '\'' +
				'}';
	}
}
