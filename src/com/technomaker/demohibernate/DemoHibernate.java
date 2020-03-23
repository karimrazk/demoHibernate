package com.technomaker.demohibernate;

import org.hibernate.classic.Session;
import org.hibernate.Transaction;

import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.util.HibernateUtil;

public class DemoHibernate {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Formation formationHibernate = new Formation("Hibernate");
        Formation formationSpring = new Formation("Spring");

        try {
            session.saveOrUpdate(formationHibernate);
            session.saveOrUpdate(formationSpring);

            transaction.commit();

            System.out.println(formationHibernate);
            System.out.println(formationSpring);

        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }

    }

}
