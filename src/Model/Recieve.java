package Model;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Recieve {
    
    private Hotel hotel;
    private Room room;
    private Tourist tourist;
    private Date date ;
    private boolean state;

    public Recieve() {
      date = new Date(); 
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
      
    }
}
