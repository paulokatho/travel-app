package com.katho.travelorder;

import com.katho.flight.Flight;
import com.katho.hotel.Hotel;
import lombok.Data;

@Data
public class TravelOrderDTO {

    private String fromAirPort;
    private String toAirPort;
    private Integer nights;

    public TravelOrderDTO() {

    }
    public TravelOrderDTO(String fromAirPort, String toAirPort, Integer nights) {
        this.fromAirPort = fromAirPort;
        this.toAirPort = toAirPort;
        this.nights = nights;
    }

    public static TravelOrderDTO of(TravelOrder order, Flight flight, Hotel hotel) {
        return new TravelOrderDTO(flight.fromAirPort, flight.toAirPort, hotel.nights);
    }

    public static TravelOrderDTO of(String fromAirPort, String toAirPort, Integer nights) {
        return new TravelOrderDTO(fromAirPort, toAirPort, nights);
    }
}
