package com.ekocbiyik.logging.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Audited
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullname;
    private String username;
    private String password;
    private boolean enabled;
    private Date lastLogin;

}
