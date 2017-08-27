public class CharStackTester{
  public static void main(String[] args){
    CharStack stack = new CharStack();

    //Test push and pop
    stack.push ('a'); //stack = a
    stack.push ('b'); //stack = ba
    stack.push ('c'); //stack = cba
    System.out.println(stack.pop()); //shows c
    System.out.println(stack.pop()); //shows b
    System.out.println(stack.pop()); //shows a
    //Continue to test all other methods to make sure
    //they work as they should.
  }
}
