public class Cliente {
    private String tipoPago;
    private int articulos;
    
    public Cliente(String tipoPago, int articulos){
        this.tipoPago=tipoPago;
        this.articulos=articulos;
       if(tipoPago=="TC"){
        
        Cliente c= unifila.dequeue();
        System.out.println("Tipo pago: "+ c.getTipoPago() + " Arts:" + c.getArticulos());
        }
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getArticulos() {
        return articulos;
    }

    public void setArticulos(int articulos) {
        this.articulos = articulos;
    }
    
    
}
