public class Main {

public static void main(String[] args) throws Exception {

    QueueCliente unifila = new QueueCliente(20);
    
	unifila.enqueue(new Cliente( "TC", 10));
    unifila.enqueue(new Cliente( "TC", 8));
    unifila.enqueue(new Cliente( "E", 5));
    
    

    while (!unifila.isEmpty()){
        Cliente c= unifila.dequeue();
        System.out.println("Tipo pago: "+ c.getTipoPago() + " Arts:" + c.getArticulos());
    }
}


}
