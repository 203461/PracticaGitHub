public class QueueCliente{
    public static final int DEFAULT_SIZE=5;
    private Cliente data[];
    private int index = 0;
    
    public QueueCliente() { data=new Cliente[DEFAULT_SIZE] ; }

    public QueueCliente(int s){
        data=new Cliente[s];
    }

    public boolean isEmpty() { return index==0; }
    
    public void enqueue(Cliente obj) throws Exception{
        if(index==data.length -1){
            throw new Exception("Queue is full. remove objects");
        }
        this.data[index]=obj;
        this.index++;
    }

    public Cliente dequeue() throws Exception{
        if(isEmpty())
            throw new Exception("La cola is empty");
        Cliente obj=this.data[0];
        for(int i=0; i<this.index-1; i++){
            data[1]=data[i+1];
        }
        this.index--;
        return obj;
    }
    public Cliente peek() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is empty");
        return this.data[0];
    }
}