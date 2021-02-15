public class Carlson extends Human{

    public Carlson(){
        super();
    }

    public Carlson(String name){
        super(name);
    }

    public Carlson(String name, Sex sex){
        super(name, sex);
    }

    public Carlson(String name, Sex sex, HumanStatus status){
        super(name, sex, status);
    }

    public Carlson(String name, Sex sex, HumanStatus status, Location location){
        super(name, sex, status, location);
    }

    public Carlson(String name, Sex sex, HumanStatus status, Location location, String place){
        super(name, sex, status, location, place);
    }

    @Override
    public String getStringLocation(){
        Location location = this.getLocation();
        if (location == Location.FLYING){
            return "самостоятельно летит с помощью пропеллера";
        }
        else if (location == Location.LYING){
            return "разлёгся";
        }
        else if(location == Location.SITTING){
            return "рассиживается";
        }
        else{
            return "мило стоит";
        }
    }

    @Override
    public void makeSad(String reason){
        System.out.println("Карлсоны не бывают в депрессии, все будет хорошо");
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + " набивает рот едой");
    }

    @Override
    public void eat(String reason){
        System.out.println(this.getName() + " набивает рот предметом: " + reason);
    }
}
