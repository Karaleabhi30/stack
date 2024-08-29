import java.util.Stack;

public class stack {
    public static void fillstack(Stack<Integer> s){

    int temp = s.pop();

    // stack(s);
    s.push(temp);
    return;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        } 
            
        }
    }



    // public static void reverse(Stack<Integer> s){
    // if(s.isEmpty())
    // {
    //     return;
    // }

    // int top = s.pop();
    // reverse(s);
    // pushBottom(s, top);
    // }