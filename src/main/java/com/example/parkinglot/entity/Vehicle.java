package com.example.parkinglot.entity;

import com.example.parkinglot.entity.enums.VechileModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vechile {
  private String vehicleNo;
  private String vehicleOwnerName;
  private LocalDateTime enterTime;
  private int durationInHours;
  private VechileModel vechileModel;
  private String ownerName;
}
