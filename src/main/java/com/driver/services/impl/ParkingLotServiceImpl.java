package com.driver.services.impl;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;
import com.driver.repository.ParkingLotRepository;
import com.driver.repository.SpotRepository;
import com.driver.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    @Autowired
    ParkingLotRepository parkingLotRepository1;
    @Autowired
    SpotRepository spotRepository1;
    @Override
    public ParkingLot addParkingLot(String name, String address) {

        return new ParkingLot();
    }

    @Override
    public Spot addSpot(int parkingLotId, Integer numberOfWheels, Integer pricePerHour) {

        return new Spot();
    }

    @Override
    public void deleteSpot(int spotId) {

        return;
    }

    @Override
    public Spot updateSpot(int parkingLotId, int spotId, int pricePerHour) {

        return new Spot();
    }

    @Override
    public void deleteParkingLot(int parkingLotId) {

    }
}
