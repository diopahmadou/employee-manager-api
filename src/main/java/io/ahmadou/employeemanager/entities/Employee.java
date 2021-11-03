package io.ahmadou.employeemanager.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 50)
    private String name;

    @Column(length = 100)
    private String department;

    @Column(length = 100)
    private String position;

    private double salary;

    @Column(name="hiring_date")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date hiringDate;

}
