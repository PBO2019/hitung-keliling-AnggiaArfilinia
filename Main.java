public class Main {
    public static void main(String[]args){
        Bujursangkarr b = new Bujursangkarr();
        Lingkarann a = new Lingkarann();

        b.setsisi(4);
        b.Keliling();
        System.out.println("Keliling = " + b.getKll());

        a.setd(10);
        a.hitungkeliling();
        System.out.println("Keliling = " + a.getKeliling());
    }
}
