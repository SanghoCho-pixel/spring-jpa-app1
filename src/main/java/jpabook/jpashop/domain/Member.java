package jpabook.jpashop.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private Address address;
}
