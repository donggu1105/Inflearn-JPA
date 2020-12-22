package hellojpa;

import org.hibernate.internal.build.AllowSysOut;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

       System.out.println("123");
        System.out.println("test");
    }
}
