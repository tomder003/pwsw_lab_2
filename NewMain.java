package com.mycompany.pwsw_lab2;

public class NewMain {

    public static void main(String[] args) {
        RGB mojKolor=RGBController.inicjalizuj(100, 100, 100);
        RGBController.wyswietl(mojKolor);
        RGB mojKolor2=RGBController.inicjalizuj(20, 70, 120);
        RGB mojKolor3=RGBController.mieszaj(mojKolor, mojKolor2);
        RGBController.wyswietl(mojKolor3);
    }
    
}
