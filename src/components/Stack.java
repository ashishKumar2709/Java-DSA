package components;

public class Stack {
    private int top;
    private int[] stackArr;
    private int maxSize;

    public Stack(int size){
        this.maxSize = size;
        this.top= -1;
        this.stackArr = new int[size];
    }

    public void push(int data){
        if(isFull()){
            reSize(maxSize*2);
        }
        stackArr[++top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = stackArr[top];
        stackArr[top] = 0;
        top--;
        if(top>0 && top==maxSize/4){
            reSize(maxSize/2);
        }
        return data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return stackArr[top];
    }
    public void show(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        for(int s:stackArr){
            System.out.println(s);
        }
    }
    public int size(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public void reSize(int newSize){
        int[] newStackArray = new int[newSize];
        for(int i=0; i<=top;i++){
            newStackArray[i]=stackArr[i];
        }
        stackArr = newStackArray;
        maxSize = newSize;
    }
    public int stackCapacity(){
        return maxSize;
    }
}
