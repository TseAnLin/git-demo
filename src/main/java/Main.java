public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GradeConverter converter = new GradeConverter();
        for(int i=0 ;i<105;i++){
            System.out.println(i+";"+converter.converter(i));
        }
    }
}