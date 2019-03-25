package com.mycompany.pwsw_lab2;


public class RGBController {

    public static void wyswietl(RGB rgb) {
        System.out.println(rgb.toString());
    }
    
    public static RGB inicjalizuj(int r, int g, int b)
    {
        return new RGB(r,g,b);
    }
    
    public static RGB mieszaj(RGB kolor1, RGB kolor2)            
    {
        int r=(kolor1.getR_value()+kolor2.getR_value())/2;
        int g=(kolor1.getG_value()+kolor2.getG_value())/2;
        int b=(kolor1.getB_value()+kolor2.getB_value())/2;
        return new RGB(r,g,b);
    }
}
