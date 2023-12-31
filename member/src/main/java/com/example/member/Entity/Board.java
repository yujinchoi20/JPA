package com.example.member.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Board {

    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    @Column(length = 50)
    private String Title;

    @Column(length = 150)
    private String Content;

    @Column(length = 150)
    private String fileName;

    @Column(length = 300)
    private String filePath;

    //Member 엔티티와 다대일 연관관계 매핑
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member; //작성자
}
