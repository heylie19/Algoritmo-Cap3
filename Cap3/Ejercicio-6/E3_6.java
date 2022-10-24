public class E3_6{  

    public static void main(String[]arg) {

            Enlazada lista = new Enlazada();

            lista.agregar("Paz");
            lista.agregar(1995);
            lista.agregar("Amor y Paz");
            lista.agregar(2002);

            System.out.print("El penultimo elemento es "+ lista.obtener(lista.size()-2));


    }
}