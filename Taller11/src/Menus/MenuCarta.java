package Menus;

import Carta.Menu;

public class MenuCarta extends Menu {

    private double valGuarni;
    private double valBebi;
    private double porcServi; 

    public MenuCarta(String cade, double valIni,
            double valGuar, double valBb, double porcSer) {
        super(cade, valIni);
        establecerValorGuarnicion(valGuar);
        establecerValorBebida(valBb);
        establecerPorcentajeServicio(porcSer);
    }

    public void establecerValorGuarnicion(double c) {
        valGuarni = c;
    }

    public void establecerValorBebida(double c) {
        valBebi = c;
    }

    public void establecerPorcentajeServicio(double c) {
        porcServi = valIni * (c / 100);
    }

    @Override
    public void establecerValorMenu() {
        valMenu = valIni + valGuarni + valBebi
                + porcServi;
    }

    public double obtenerValorGuarnicion() {
        return valGuarni;
    }

    public double obtenerValorBebida() {
        return valBebi;
    }

    public double obtenerPorcentajeServicio() {
        return porcServi;
    }

    @Override
    public String toString() {
      String cadena = String.format("Menu a la Carta:\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor guarnición: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeServicio(),
                obtenerValorMenu());
        return cadena;
    }
}