package Model;

import Enum.Days;
import Enum.Mouths;
import Enum.RoomType;
import Enum.Weeks;
import java.util.List;

public class Room {

    private long id;
    private int floor;
    private String room_number;
    private RoomType type;
    private double price;
    private List<Days>days;
    private List<Weeks>weeks;
    private List<Mouths>mouths;

    private Hotel hotel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public double getPrice() {
        return  price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
	public int compareTo(Object o) {		
		return getRoom_number().compareTo(((Room) o).getRoom_number());
	}

}
