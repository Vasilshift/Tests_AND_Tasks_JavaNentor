package TestMethod;

public class Main {
    public static void main(String[] args) {
        Formula f1 = new Formula(){
            @Override
            public int calculate(int a){
                return a*5;
            }
        };

        System.out.println(f1.calculate(5));

    }
}
