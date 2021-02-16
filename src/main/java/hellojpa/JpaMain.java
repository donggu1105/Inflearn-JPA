package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Iterator;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();/*JPA에서는 항상 트랜잭션 관리를 해줘야*/

        EntityTransaction tr = em.getTransaction();
        tr.begin();

        try {

            Member member = new Member(200L,"name");
            em.persist(member);
            em.flush();

            System.out.println("==========");
            tr.commit();

        } catch (Exception e) {
            tr.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}


