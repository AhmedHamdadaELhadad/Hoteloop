
package Services;

import Model.PaidMoney;
import Model.Recieve;
import Model.Tourist;


public interface TouristService {
public  Tourist register(Tourist tourist);
public  Tourist signin(String username,String passwprd);
public  Tourist signup(String username,String passwprd);
public  Recieve recieve(Recieve recieve);
public  PaidMoney recieve(PaidMoney paidMoney);











}
