package Menus;

import Carta.Menu;

public class MenuNino extends Menu {

    private double helado;
    private double pastel;

    public MenuNino(String cade, double valIni, double helad, double pastl) {
        super(cade, valIni);
        helado = helad;
        pastel = pastl;
    }

    public void establecerHelado(double c) {
        helado = c;
    }

    public void establecerPastel(double c) {
        pastel = c;
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni + helado + pastel;
    }

    public double obtenerHelado() {
        return helado;
    }

    public double obtenerPastel() {
        return pastel;
    }

    @Override
    public String toString() {
           String cadena = String.format("Menu de Ninos\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor Porcion Helado:%.2f\n"
                + "\tValor Porcion Pastel:%.2f\n"
                + "\tValor del Menu:%.2f\n", cadena,
                obtenerHelado(),
                obtenerPastel(),
                obtenerValorMenu());
        return cadena;
    }

}