public class Lingkarann {
        public static void main(String[] args) {
            Lingkarann a = new Lingkarann();
            a.keliling();
        }


        private int d = 6;
        private double pi = 22/7;
        private double kll ;

        void keliling() {
            kll = pi*d;
            System.out.println("Keliling lingkaran = " + kll);
        }
}
