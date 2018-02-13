public class MainFactory {

    public static void main(String[] args) {
        Araba hatchbackAraba=ArabaFactory.getAraba("Hatchback");
        Araba sedanAraba=ArabaFactory.getAraba("Sedan");


        System.out.println(hatchbackAraba.getTip());
        System.out.println(sedanAraba.getTip());
    }
}
