package com.booking.facility.Model;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "timeslot")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Timeslot {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime startime;
    private LocalTime endtime;
    private LocalDate date;
    private int duration;
    private boolean booked;
    private String username;

    @ManyToOne
    @JoinColumn(name = "facility_id", nullable = false)
    @JsonBackReference
    private Facility facility;
}
