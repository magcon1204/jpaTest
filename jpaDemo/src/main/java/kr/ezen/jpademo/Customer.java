package kr.ezen.jpademo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
//    @GeneratedValue
    @Column(name = "customer_id")
    private String id;
    private String password;
    private String name;
    private String email;
    private Date inDate;
    private Date upDate;

    // Customer 하나에 여러 게시글
    // fetch = FetchType.EAGER : 두엔티티의 정보를 한번에
    // fetch = FetchType.LAZY : 필요시에 따로 가져올 때 설정
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER) // Customer 하나에 여러 게시글
    List<Bbs> list = new ArrayList<>();
}
