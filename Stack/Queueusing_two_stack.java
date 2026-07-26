class MyQueue {
    private Stack<Integer>main;
    private Stack<Integer>helper;
    public MyQueue() {
        main=new Stack<>();
        helper=new Stack<>();
    }
    
    public void push(int x) {
        
        // now we push the elment into the helper as we can retrive later like the fifo 
        while(main.size()>0){
            helper.push(main.pop());
        }
        // first we push the x in the main stack then the 
        main.push(x);

         while(helper.size()>0){
            main.push(helper.pop());
        }
        
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
      
    }
    
    public boolean empty() {
        return main.size()==0;
    }
}

