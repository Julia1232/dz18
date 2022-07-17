package lesson19;

class Distance {
    private double distance = 10.5;
    public class Converter {
        public void print() {
            double a = distance / 1000;
            System.out.println(distance + " метров равно " + a + " километра");
            double b = a / 1.609;
            System.out.println(a + " километров равно " + b + " мили");
            double d = b / 160900;
            System.out.println(b + " мили равно" + d + " метра");
        }
    }
    public void createConverter(){
        Converter converter = new Converter();
        converter.print();
    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.createConverter();
    }
}