public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(520, 5.20);
        System.out.println("Arithmetic: Integer 520 and Double 5.20");
        System.out.println("520 + 5.20 = " + arithmetic.add());
        System.out.println("520 - 5.20 = " + arithmetic.subtract());
        System.out.println("520 * 5.20 = " + arithmetic.multiply());
        System.out.println("520 / 5.20 = " + arithmetic.divide());
        System.out.println("Min of 520 and 5.20 is " + arithmetic.getMin());
        System.out.println("Max of 520 and 5.20 is " + arithmetic.getMax());

        System.out.println("\nMyMap");
        MyMap<Object, Object> myMap = new MyMap<>();
        myMap.put("Key0", 100);
        myMap.put("Key1", 'a');
        myMap.put("Key2", "Hello");
        myMap.put("Key3", arithmetic);
        System.out.println(myMap);
        System.out.println("Removing: " + myMap.remove("Key2"));
        System.out.println("Getting: " + myMap.get("Key2"));
    }
}