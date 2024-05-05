package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Month {
    private Integer monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}
