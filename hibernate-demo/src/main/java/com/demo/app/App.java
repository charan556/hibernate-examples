package com.demo.app;

import org.hibernate.Session;

import com.demo.config.HibernateUtil;
import com.demo.model.Student;

public class App {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Student student = new Student();
		student.setStudentAge("31");
		student.setStudentName("Charan");

		session.save(student);
		session.getTransaction().commit();

		System.out.println(":: student object saved");
	}
}
