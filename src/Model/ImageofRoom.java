package Model;

import java.util.Date;

public class ImageofRoom {

    private String path;

    private Hotel hotel;

    private long id;

    private Date insertion_date;

    public ImageofRoom(String path, Hotel hotel, Date insertion_date) {
        this.path = path;
        this.hotel = hotel;
        this.insertion_date = insertion_date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getInsertion_date() {
        return insertion_date;
    }

    public void setInsertion_date(Date insertion_date) {
        this.insertion_date = insertion_date;
    }




}
