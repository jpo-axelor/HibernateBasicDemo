package com.axelor.demo.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Email {

  @Id @GeneratedValue private Long id;

  private String emailAddress;

  @ManyToOne 
  @JoinColumn(name="student_id")
  private Student student;

  public Email() {}

  public Email(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Long getId() {
    return id;
  }
}
