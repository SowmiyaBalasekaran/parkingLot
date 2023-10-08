package com.example.parkinglot.service;

import com.example.parkinglot.entity.enums.VechileModel;
import com.example.parkinglot.modal.GetParkingLotResponse;
import com.example.parkinglot.modal.VehicleLeavingResponse;

public interface ParkingLotService {
  public GetParkingLotResponse getParkingLot(String userName, VechileModel vechileModel,
      String vehicleNumber, String vehicleOwnerName);

  public VehicleLeavingResponse registerLeavingVehicle(String vehicleNumber);
}
