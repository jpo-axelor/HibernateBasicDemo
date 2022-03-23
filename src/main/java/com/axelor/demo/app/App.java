package com.axelor.demo.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.demo.db.Email;
import com.axelor.demo.db.Student;

public class App {

  public static void main(String[] args) {
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myJpaUnit");
    EntityManager entityManager = emfactory.createEntityManager();
    entityManager.getTransaction().begin();

    Student student = new Student("TestName");

    Email email1 = new Email("test1@email");
    Email email2 = new Email("test2@email");

    student.addEmailListItem(email1);
    student.addEmailListItem(email2);

    entityManager.persist(student);

    entityManager.getTransaction().commit();
    entityManager.close();
    emfactory.close();
  }
}
