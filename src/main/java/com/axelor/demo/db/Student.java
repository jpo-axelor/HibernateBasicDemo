package com.axelor.demo.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

  @Id 
  @GeneratedValue 
  private Long id;

  private String name;

  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  private List<Email> emailList;

  public Student() {}

  public Student(String name, List<Email> emailList) {
    this.name = name;
    this.emailList = emailList;
  }

  public Student(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Email> getEmailList() {
    return emailList;
  }

  public void setEmailList(List<Email> emailList) {
    this.emailList = emailList;
  }

  public void addEmailListItem(Email item) {
    if (emailList == null) {
      emailList = new ArrayList<>();
    }
    item.setStudent(this);
    emailList.add(item);
  }
}
