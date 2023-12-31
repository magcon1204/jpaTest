package kr.ezen.jpademo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cart {
    @Id
    @Column(name = "cart_id")
    private Long id;

    // nullable = false ---> inner join
    // nullable = true(기본값) ---> outer join
    // FK가 만들어짐
    @OneToOne
    @JoinColumn(name="member_id", nullable = false)
    private Member3 member;

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
//                ", member=" + member +
                '}';
    }
}
