public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor(230);
        compareNumbers(12, 15);
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign (){
        int a = 10, b = -20, result = a + b;
        if(result >= 0){
            System.out.println("Result is " + result + " positive");
        } else {
            System.out.println("Result is " + result + " negative");
        }
    }
    static void printColor(int value){
         if (value <=0){
            System.out.println("Red");
        }else if (value >0 && value <=100 ){
            System.out.println("Yellow");
        }else {
            System.out.println("Green");
        }
    }
    static void compareNumbers(int a, int b){
         if (a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
