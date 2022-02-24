package com.mauriciojdk;

import com.mauriciojdk.model.*;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        Session session = HibernateSession.getSessionFactorys().openSession();

        session.beginTransaction();

        Product product = session.find(Product.class, 2);

        if(product != null){
            session.remove(product);
        }





        /*     //Confere se retorna nulo
        if(product != null){
            product.setName("Product Edited 1");
            product.setPrice(20.00);

            //Realiza o update
            session.update(product);
        }

*/




      /*  Product product = new Product();

        product.setName("P1");
        product.setPrice(10.00);

        //session.save(product);

        //Para utilizar um FIND ALL
        //List<Product> products = session.createQuery("from Product").getResultList();

        Product p1 = session.find(Product.class, 2);

        System.out.println(p1.getName());*/

        session.getTransaction().commit();
    }
}