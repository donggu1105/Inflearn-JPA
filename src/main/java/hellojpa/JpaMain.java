package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();/*JPA에서는 항상 트랜잭션 관리를 해줘야*/

        EntityTransaction tr = em.getTransaction();
        tr.begin();

        //code

        try {/*데이터베이스 테이블을 대상으로 하는게 아닌 JPQL 객체대상으로 동적쿼리를 짤수있도록 하는것*/
            /*테이블이 아닌 객체를 대상으로 검색하는 객체 지향쿼리
            * */
            List<Member> result = em.createQuery("SELECT m FROM Member as m WHERE 1=1")
                    .setFirstResult(5)
                    .setMaxResults(8)
                    .getResultList();

            for(Member m : result) {
                System.out.println("Member :"+ m.getName());
            }
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
        } finally {
        em.close();
        }
        emf.close();
    }
}


