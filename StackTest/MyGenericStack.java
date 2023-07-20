package StackTest;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push (T e) {
        stack.addLast(e);
    }
    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        return stack.removeFirst() ;
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        if (stack.size()==0) return true;
        return false;
    }

}
