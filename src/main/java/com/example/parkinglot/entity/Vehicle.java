package com.example.parkinglot.entity;

import com.example.parkinglot.entity.enums.VechileModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
  private String vehicleNo;
  private String vehicleOwnerName;
  private LocalDateTime enterTime;
  private int durationInHours;
  private int floorNumber;
  private int slotNumber;
  private VechileModel vechileModel;
  private String ownerName;
}
