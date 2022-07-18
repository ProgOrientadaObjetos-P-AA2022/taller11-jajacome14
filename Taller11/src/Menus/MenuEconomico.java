package Menus;

import Carta.Menu;

public class MenuEconomico extends Menu {

    private double porcDesc;

    public MenuEconomico(String cade, double valIni, double porcDes) {
        super(cade, valIni);
        porcDesc = porcDes;
    }

    public void establecerDescuentoP(double n) {
        porcDesc = n;
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni - (valIni * porcDesc / 100);
    }

    public double obtenerDescuentoP() {
        return porcDesc;
    }

    @Override
    public String toString() {
         String cadena = String.format("Menu Económico\n%s", super.toString());
        cadena = String.format("%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menu:%.2f\n",
                cadena,
                obtenerDescuentoP(),
                obtenerValorMenu());
        return cadena;
    }
}