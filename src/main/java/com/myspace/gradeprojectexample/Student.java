package com.myspace.gradeprojectexample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Student implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;
	@org.kie.api.definition.type.Label("marks")
	private java.lang.Integer marks;

	@org.kie.api.definition.type.Label(value = "grade")
	private java.lang.String grade;

	public Student() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.Integer getMarks() {
		return this.marks;
	}

	public void setMarks(java.lang.Integer marks) {
		this.marks = marks;
	}

	public java.lang.String getGrade() {
		return this.grade;
	}

	public void setGrade(java.lang.String grade) {
		this.grade = grade;
	}

	public Student(java.lang.String id, java.lang.Integer marks,
			java.lang.String grade) {
		this.id = id;
		this.marks = marks;
		this.grade = grade;
	}

}