public class Kiddo extends Human{

    public Kiddo(){
        super();
    }

    public Kiddo(String name){
        super(name);
    }

    public Kiddo(String name, Sex sex){
        super(name, sex);
    }

    public Kiddo(String name, Sex sex, HumanStatus status){
        super(name, sex, status);
    }

    public Kiddo(String name, Sex sex, HumanStatus status, Location location){
        super(name, sex, status, location);
    }

    public Kiddo(String name, Sex sex, HumanStatus status, Location location, String place){
        super(name, sex, status, location, place);
    }

    @Override
    public void makeSad() {
        System.out.println("Малыши не впадают в депрессию!");
    }

}
