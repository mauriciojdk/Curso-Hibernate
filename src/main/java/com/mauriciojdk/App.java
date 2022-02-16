package com.mauriciojdk;

import com.mauriciojdk.model.HibernateSession;
import org.hibernate.Session;

public class App {
    public static void main( String[] args )  {
        Session session = HibernateSession.getSessionFactory().openSession();
        System.out.println( "Hello World!" );
        System.out.println(session);
    }
}
