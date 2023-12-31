package com.example.sharemind.counselor.domain;

import com.example.sharemind.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Counselor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "counselor_id")
    private Long counselorId;

    private String nickname;

    private String email;

    private String name;

    private String phoneNumber;

    private String accountNumber;

    @Builder
    public Counselor(String nickname, String email, String name, String phoneNumber, String accountNumber) {
        this.nickname = nickname;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }
}
