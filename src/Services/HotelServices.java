
package Services;

import Model.Hotel;


public interface HotelServices {
public Hotel addHotel(Hotel hotel);
public boolean deletHotel(String id);
public Hotel updataHotel(Hotel hotel);
public boolean statueshRoom(Hotel hotel);
    
}
