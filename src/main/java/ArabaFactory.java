public class ArabaFactory {

    public static Araba getAraba(String tip){

        if("Sedan".equalsIgnoreCase(tip)) return new Sedan();
        else if("Hatchback".equalsIgnoreCase(tip)) return new Hatchback();

        return null;
    }
}
