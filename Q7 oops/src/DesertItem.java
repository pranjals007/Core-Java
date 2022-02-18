import java.util.Scanner;

public abstract class DesertItem {
    abstract public int getCost();
}
class Candy extends DesertItem {
    int TotalCandies=0;
    int DollarInRupee = 60;

    public int addCandies(int candies){
        TotalCandies+=candies;
        return  TotalCandies;

    }

    public int getCost() {
        return TotalCandies*DollarInRupee;
    }
}
class Cookie extends DesertItem {
    int TotalCookies=0;
    int EuroInRupee =70;
    public int addCookies(int cookies){
        TotalCookies+=cookies;
        return  TotalCookies;

    }

    public int getCost() {
        return TotalCookies*EuroInRupee;
    }
}
class IceCream extends DesertItem {
    int totalIceCream=0;
    public int addIceCreams(int iceCreams){
        totalIceCream +=iceCreams;
        return totalIceCream;
    }

    public int getCost() {
        return 0;
    }
}

