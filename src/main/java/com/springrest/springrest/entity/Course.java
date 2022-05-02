package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
		
		@Id
		@GeneratedValue
		private long id;
		private String title;
		private String Description;
		
		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Course(long id, String title, String description) {
			super();
			this.id = id;
			this.title = title;
			this.Description = description;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		@Override
		public String toString() {
			return "Course [id=" + id + ", title=" + title + ", Description=" + Description + "]";
		}
		

}
