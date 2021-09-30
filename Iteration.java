public class Iteration {
  public static void main(String[] args) {
    System.out.println("Hello World");
    String st = "Hello World";

    for (int i=0; i<st.length(); i++) {
      if (i%2==0) {
        char c = st.charAt(i);
        System.out.println(c);
            }
    }


  }
}
