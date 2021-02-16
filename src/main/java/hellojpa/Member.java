package hellojpa;

import javax.persistence.*;


@Entity
public class Member {

    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private int aj;

    public Member() {

    }
    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


