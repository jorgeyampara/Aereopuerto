import com.sun.source.util.SourcePositions;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //cliente
        Cliente carlos = new Cliente( 1,"carlos", "vargas","prado");


        //ciudad
        Ciudad cochabamba = new Ciudad( 1, "Cochabamba");
        Ciudad santaCruz = new Ciudad( 2, "Sanata Cruz");
        Ciudad beni = new Ciudad( 3, "Beni");


        //categoria
        Categoria turista = new Categoria( 1, "Turista");


        //Aeropuerto Cochabamba
        Aereopuerto jorgeWilsterman = new Aereopuerto("JW","Jorge Wilsterman",cochabamba);
        Aereopuerto viruViru = new Aereopuerto("VV","viru viru",santaCruz);
        Aereopuerto orielLea = new Aereopuerto("OL","Oriel Liea",beni);



        //vuelos
        List<Vuelo> vuelo = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA-23", Calendar.getInstance().getTime(),jorgeWilsterman,viruViru);
        vuelo.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-54", Calendar.getInstance().getTime(),viruViru,orielLea);
        vuelo.add(santaCruzTarija);

        //Billete
        Billete billete = new Billete(1,Calendar.getInstance().getTime(),167,carlos,cochabamba,santaCruz,turista,vuelo);

        System.out.println("ID: " + billete.getIdBillete());
        System.out.println("Fecha: " + billete.getFechaEmision());
        System.out.println("Precio: " + billete.getPrecioTotal());
        System.out.println("Cliente: " + billete.getCliente());
        System.out.println("Origen: " + billete.getOrigen());
        System.out.println("Destino: " + billete.getDestino());
        System.out.println("Categoria: " + billete.getCategoria());
        System.out.println("Vuelos: " + billete.getVuelos());
        for (Vuelo vuelos : billete.getVuelos()){
            System.out.println("Codigo vuelo: " + vuelos.getCodigoVuelo() + "// Salida" +vuelos.getSalida() + "// origen: " + vuelos.getOrigen());
        }



    }
}
