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
@Table(name = "car_park")
public class CarPark {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;
    private String plateNumber;
    private String vehicleType;
    private Date entryTime;
    private Date exitTime;

}
