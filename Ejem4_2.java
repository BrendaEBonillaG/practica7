public class Ejem4_2 {
    public static void main(String[] args){
        for (int n = 0; n < 15; n++){
            if (n % 3 == 0){
                continue;
            }
            System.out.println("Numero ="+ n + "...");
        }
        return;
    }
}
