
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push(new String("Angelo"));
        stack.push(new String("Martin"));
        stack.push(new String("Aran"));
        System.out.println(stack.peek());
        stack.pop();
        stack.list();
    }
}
