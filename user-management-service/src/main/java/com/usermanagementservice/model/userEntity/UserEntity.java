package com.usermanagementservice.model.userEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;


@Data
@AllArgsConstructor
@Entity
@Table("user")
public class UserEntity implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(unique = true)
        private String userName;
        @Column(unique = true)
        private String email;
        private String password;

}
