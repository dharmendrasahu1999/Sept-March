public class ThirdClass {
    public static void main(String[] args) {
        String str = "Java";
         str = str.toLowerCase();
         //toLowerCase will create object in heap not in string pool
        System.out.println(str);
    }
}
