package com.jpa.JPADemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	
//    	SessionFactory sf = con.buildSessionFactory();
//    	Session session = sf.openSession();
//    	session.beginTransaction();
//    	
//    	Alien alien = new Alien();
//    	alien.setAid(101);
//    	alien.setAname("Ram");
//    	alien.setTech("Java");
//    	
//    	session.save(alien);
//    	
//    	session.getTransaction().commit();
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	Alien alien = em.find(Alien.class, 101);
    	Alien a = new Alien();
    	a.setAid(9);
    	a.setAname("Maria");
    	a.setTech(".Net");
    	
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(alien);
    }
}
