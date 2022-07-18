package Menus;

import Carta.Menu;

public class MenuDia extends Menu {

    private double bebida;
    private double postre;

    public MenuDia(String cade, double valIni, double valPos, double valBebi) {
        super(cade, valIni);
        postre = valPos;
        bebida = valBebi;
    }

    public void establecerPostre(double c) {
        postre = c;
    }

    public void establecerBebida(double c) {
        bebida = c;
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni + postre + bebida;
    }

    public double obtenerPostre() {
        return postre;
    }

    public double obtenerBebida() {
        return bebida;
    }

    @Override
    public String toString() {
       String cadena = String.format("Menu del Dia\n%s", super.toString());
        cadena = String.format("%s"
                +"\tValor Bebida:%.2f\n"
                +"\tValor Postre:%.2f\n"
                + "\tValor del Menu:%.2f\n", cadena,
                obtenerBebida(),
                obtenerPostre(),
                obtenerValorMenu());
        return cadena;
    }
}