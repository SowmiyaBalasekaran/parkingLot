package com.example.parkinglot.entity;

import com.example.parkinglot.entity.enums.VechileModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private String userName;
  private List<Integer> floorList;
  private int twoWheelersSlotCount;
  private int fourWheelersSlotCount;
  private Map<VechileModel,Double> costPerDuration;
  private Map<Integer, List<Integer>> floorAndTwoWheelerListMap;
  private Map<Integer, List<Integer>> floorAndFloorWheelerListMap;
}
