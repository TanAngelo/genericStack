import java.sql.SQLOutput;

public class Stack<T>  {		//generischer parameter definierung, generischer typ t

    private Object[] stack;
    private int counter = -1;	//momentan belegtes element

    public Stack(int size) {
        this.stack = new Object[size];
    }
    public Stack() {
        this(10); //ruft konstruktor selber klasse auf (this.stack = new Object[10];)
    }

    public void push(T item) {
        if(this.counter == this.stack.length -1) {
            return;
        }
        this.counter++;
        this.stack[this.counter] = item;
    }

    public T peek() {
        if(this.counter == -1) {
            throw new RuntimeException("Stack empty");
        }
        T item = (T) this.stack[this.counter];
        return item;
    }

    public T pop() {
        T removedItem = this.peek();
        this.counter--;
        return removedItem;
        //return (T) this.stack[this.counter--];
    }

    public void list() {
        String result = "";
        result += this.stack[0];
        for(int i = 1; i <= this.counter; i++) {
            result += ", " + this.stack[i];
        }
        System.out.println(result);
    }
}
