public class Main {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(5);
        Cerchio cerchio = new Cerchio(4);
        Forma[] newArray = {quadrato, cerchio};
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i].calcolaArea());
        }
    }
}
