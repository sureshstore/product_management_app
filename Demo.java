public class Demo{
    public static void main(String args[]){
        int i=0;
        do{
            System.out.println("Inner Do");
            System.out.println("next.");
            i++;
        } while (i<10);
    }
}