package corporation.repository;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Column(name = "person_id")
    @Id
    private Long personId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String email;
}
