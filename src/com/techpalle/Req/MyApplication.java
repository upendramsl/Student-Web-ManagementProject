package com.techpalle.Req;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.techpalle.model.Student;

@SuppressWarnings("deprecation")
public class MyApplication
{
	public void reg(Student s1)
	{
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
        Student s12=new Student(s1.getName(),s1.getEmail(),s1.getMobile(),s1.getPass());
        s.save(s12);
        t.commit();
        s.close();
        sf.close();
	}
	@SuppressWarnings("rawtypes")
	public boolean login(String email,String pass)
	{
		boolean b=true;
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		String hql="select Email,Pass from Student where Email=:value1 and Pass=:value2";
		Query q=s.createQuery(hql);
		q.setParameter("value1",email);
		q.setParameter("value2",pass);
		Object o=q.uniqueResult();
		
		if(o!=null)
		{
		    b=true;
		}
		else
		{
			b=false;
		}
		
		t.commit();
		s.close();
		sf.close();
		return b;
	
		
	}
	public static ArrayList<Student> showAll()
	{
		ArrayList<Student> al=new ArrayList<>();
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		String hql="from Student";
		Query q=s.createQuery(hql);
		ArrayList<Student> a=(ArrayList<Student>) q.list();
		al.addAll(a);
	
		t.commit();
		s.close();
		sf.close();
		return al;
	
		
	}
	
	
}
