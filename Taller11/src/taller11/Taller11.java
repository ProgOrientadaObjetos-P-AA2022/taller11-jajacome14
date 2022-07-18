package taller11;

import java.util.ArrayList;

import Carta.Cuenta;
import Carta.Menu;
import Menus.MenuCarta;
import Menus.MenuDia;
import Menus.MenuEconomico;
import Menus.MenuNino;

public class Taller11 {

    public static void main(String[] args) {

        ArrayList<Menu> InventarioCarta = new ArrayList<>();

        MenuNino Ninos1 = new MenuNino("HOT DOG ", 1.25, 2.00, 2.50);
        MenuNino Ninos2 = new MenuNino("salchipapa", 1.75, 0.50, 2.00);

        MenuEconomico Economico1 = new MenuEconomico("Combo económico de "
                + "(hamburguesa + paspas + hotdog + refresco)", 5 , 10);

        MenuDia DiaMenu = new MenuDia("Panceta a la Parrilla ", 5, 7.50 ,20.50 );

        MenuCarta CartaMenu = new MenuCarta("Costillas ", 7., 5, 8 , 10 );

        InventarioCarta.add(Ninos1);
        InventarioCarta.add(Ninos2);
        InventarioCarta.add(Economico1);
        InventarioCarta.add(DiaMenu);
        InventarioCarta.add(CartaMenu);

        for (int i = 0; i < InventarioCarta.size(); i++) {
            InventarioCarta.get(i).establecerValorMenu();
        }

        Cuenta cuenta = new Cuenta ("JAVIER JACOME ", 12, InventarioCarta);
        cuenta.establecerSubtotal();
        cuenta.establecerTotal();

        System.out.println(cuenta);

    }

}