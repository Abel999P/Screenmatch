package com.joel.screenmatch.principal;

import java.util.Scanner;

import com.joel.screenmatch.model.DatosSerie;
import com.joel.screenmatch.service.ConsumoAPI;
import com.joel.screenmatch.service.ConvierteDatos;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraMenu(){
        var opcion= "-1";
        while (opcion != "0") {
            String menu = """
                    1 - Buscar series 
                    2 - Buscar episodios
                    3 - Mostrar series buscadas
                                  
                    0 - Salir
                    """;

            System.out.println(menu);
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    
                    break;
                case "0":
                    System.out.println("Cerrando aplicacion...");
                    break;
                default:
                    break;
            }
        }
    }


}
