public class Main {
    public static void main(String[] args) {
        // Inefficient
        String info = "";
info += "My name is Gokhan.";
        info += " ";
        info += "I am a builder";
System.out.println(info);
// More efficient
        StringBuilder sb = new StringBuilder();
sb.append("My name is Gurkan.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
System.out.println(sb.toString());// sb also run
//Diffrent
        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");
System.out.println(s.toString());
// Formatting //
System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");
//formatting integer point value
        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);//-10d
for (int i=0; i<5; i++){
            System.out.printf("%5d: some text here\n",i); // d:decimal,integer  f:float  x:hex  C:unicode  o:octal
            //"%2d: %s\n",i, "some text here"
        }
//formatting floating point value
        System.out.printf("Total value: %.2f\n",5.6);
        System.out.printf("Total value: %.2f\n",5.6874);
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
        System.out.printf("Default floating-point format: %f \n", 1234567.123); //default 6 digits
        System.out.printf("Floating-point with commas: %,f \n", 1234567.123);
        System.out.printf("Negative floating-point default: %,f \n", -1234567.123);
        System.out.printf("Negative floating-point option: %,(f \n", -1234567.123);
        System.out.printf("Line-up positive and negative values: \n");
        System.out.printf("% ,.2f \n% ,.2f \n", 1234567.123, -1234567.123);
        
        System.out.println("##################################");

        int  b, c;
        double  y;

        double x = 47.8;
        y = 55.67;
        System.out.printf("x = %15f y = %8g", x, y); // f,g,a for floating-point values 
        System.out.println();
        int a = 3;
        b = 26; //hex:1a 
        c = 354;
        System.out.printf("a = %1$5d b = %2$5x c = %3$2o", a, b, c); //o:octal  x:hex  d:decimal(integer)
        System.out.println();
        a = 11;
        b = 121;
        c = 251;
        System.out.printf("%na = %1$-5d b = %2$-5x c = %3$-5o", a, b, c); // $ : justify left
        System.out.println();
        a = 25;
        b = 55;
        c = 155;
        System.out.printf("a = %3$d b = %1$x c = %2$o", a, b, c); //%[argument_index$][flags][width][.precision]
        
}
}