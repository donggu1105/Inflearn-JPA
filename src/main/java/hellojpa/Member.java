package hellojpa;

import javax.persistence.*;

@Table(name = "USER")
@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "user_name")
    private String name;

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


