package db.parkinglot.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sort;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private int totalSpace;

    @ManyToOne(fetch = FetchType.EAGER, cascade = jakarta.persistence.CascadeType.ALL, targetEntity = Member.class)
    @JoinColumn(name = "member_Id")
    private Member member;

    private int leftSpace;

    private String startTime;

    private String endTime;

    private String fee;

    private int feePerHour;

    private int dayFee;

    private int monthFee;

    private String significant;

    private String company;

    private String contactNumber;

}
