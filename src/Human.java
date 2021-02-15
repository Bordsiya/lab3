public abstract class Human implements Humanable{
    private String name;
    private Sex sex;
    private HumanStatus status;
    private Location location;
    private String place;

    public Human(){
        this.name = "Безликая";
        this.sex = Sex.MALE;
        this.status = HumanStatus.NORMAL;
        this.location = Location.STAYING;
        this.place = "Дом";
        System.out.println("Создан дефолтный человек. Имя: " + this.getName() + ". Пол: "
                + this.getStringSex() + ". Состояние: " + this.getStringStatus() + ". Что делает: "
                + this.getStringLocation() + " в локации " + this.getPlace() + ".");
    }

    public Human(String name){
        this.name = name;
        this.sex = Sex.MALE;
        this.status = HumanStatus.NORMAL;
        this.location = Location.STAYING;
        this.place = "Дом";
        System.out.println("Создан человек. Имя: " + this.getName() + ". Пол: "
                + this.getStringSex() + ". Состояние: " + this.getStringStatus() + ". Что делает: "
                + this.getStringLocation() + " в локации " + this.getPlace() + ".");
    }

    public Human(String name, Sex sex){
        this.name = name;
        this.sex = sex;
        this.status = HumanStatus.NORMAL;
        this.location = Location.STAYING;
        this.place = "Дом";
        System.out.println("Создан человек. Имя: " + this.getName() + ". Пол: "
                + this.getStringSex() + ". Состояние: " + this.getStringStatus() + ". Что делает: "
                + this.getStringLocation() + " в локации " + this.getPlace() + ".");
    }

    public Human(String name, Sex sex, HumanStatus status){
        this.name = name;
        this.sex = sex;
        this.status = status;
        this.location = Location.STAYING;
        this.place = "Дом";
        System.out.println("Создан человек. Имя: " + this.getName() + ". Пол: "
                + this.getStringSex() + ". Состояние: " + this.getStringStatus() + ". Что делает: "
                + this.getStringLocation() + " в локации " + this.getPlace() + ".");
    }

    public Human(String name, Sex sex, HumanStatus status, Location location){
        this.name = name;
        this.sex = sex;
        this.status = status;
        this.location = location;
        this.place = "Дом";
        System.out.println("Создан человек. Имя: " + this.getName() + ". Пол: "
                + this.getStringSex() + ". Состояние: " + this.getStringStatus() + ". Что делает: "
                + this.getStringLocation() + " в локации " + this.getPlace() + ".");
    }

    public Human(String name, Sex sex, HumanStatus status, Location location, String place){
        this.name = name;
        this.sex = sex;
        this.status = status;
        this.location = location;
        this.place = place;
        System.out.println("Создан человек. Имя: " + this.getName() + ". Пол: "
                + this.getStringSex() + ". Состояние: " + this.getStringStatus() + ". Что делает: "
                + this.getStringLocation() + " в локации " + this.getPlace() + ".");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Sex getSex() {
        return this.sex;
    }

    @Override
    public HumanStatus getStatus() {
        return this.status;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public String getPlace() {
        return this.place;
    }

    @Override
    public void setStatus(HumanStatus status) {
        this.status = status;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    public String getStringSex(){
        Sex sex = this.getSex();
        if (sex == Sex.FEMALE){
            return "женщина";
        }
        else{
            return "мужчина";
        }
    }

    public String getStringStatus(){
        HumanStatus status = this.getStatus();
        Sex sex = this.sex;
        if (status == HumanStatus.DIZZY){
            if (sex == Sex.FEMALE){
                return "рассеянная";
            }
            else{
                return "рассеянный";
            }
        }
        else if (status == HumanStatus.EXCITED){
            if (sex == Sex.FEMALE){
                return "воодушевлена";
            }
            else{
                return "воодушевлён";
            }
        }
        else if (status == HumanStatus.NORMAL){
            return "находится в нормальном состоянии";
        }
        else{
            if (sex == Sex.FEMALE){
                return "расстроена";
            }
            else{
                return "расстроен";
            }
        }
    }

    public String getStringLocation(){
        Location location = this.getLocation();
        if (location == Location.LYING){
            return "лежит";
        }
        else if (location == Location.SITTING){
            return "сидит";
        }
        else if (location == Location.FLYING){
            return "летит на чём-то/ком-то";
        }
        else{
            return "стоит";
        }
    }

    public void say(){
        System.out.println(this.name + " говорит");
    }

    public void say(String text){
        System.out.println(this.name + " говорит: \"" + text + "\"");
    }

    public void think(String text){
        System.out.println(this.name + " подумал: \"" + text + "\"");
    }

    public void eat(){
        System.out.println(this.name + " кушает");
    }

    public void eat(String food){
        System.out.println(this.name + " кушает предмет: " + food);
    }

    public void listen(String obj){
        System.out.println(this.getName() + " слышит " + obj);
    }

    public void listenWithEffect(Humanable human){
        System.out.println(this.getName() + " cлушает человека " + human.getName() + " в состоянии: " + this.getStringStatus());
    }

    public void listen(Humanable human){
        System.out.println(this.getName() + " слушает человека " + human.getName());
    }

    public void listen(String obj, WeatherCondition weather){
        if (weather.getAtmosphere() != Atmosphere.SILENCE){
            System.out.println(this.getName() + " слышит " + obj + " отчётливо");
        }
        else{
            System.out.println(this.getName() + " слышит " + obj + ", но звук едва различим");
        }
    }

    public void listen(String obj, Crowd crowd){
        if(crowd.getStatus() != CrowdStatus.MESSING){
            System.out.print(this.getName() + " вслушивается в звуки толпы ");
            if (this.getStatus() == HumanStatus.DIZZY){
                System.out.println("рассеянно");
            }
            else if (this.getStatus() == HumanStatus.EXCITED){
                System.out.println("восторженно");
            }
            else if (this.getStatus() == HumanStatus.SAD){
                System.out.println("грустно");
            }
        }
        else{
            System.out.println(this.getName() + " не слышит звуки толпы");
        }
    }

    public void smell(String obj){
        System.out.println(this.getName() + " ловит аромат предмета: " + obj);
    }

    public void makeDizzy(String reason){
        this.status = HumanStatus.DIZZY;
        System.out.println("У человека: " + this.getName() + " кружится голова, причина: " + reason);
    }

    public void makeNormal(){
        this.status = HumanStatus.NORMAL;
        System.out.println("У человека: " + this.getName() + " всё нормально просто так");
    }

    public void makeNormal(String reason){
        this.status = HumanStatus.NORMAL;
        System.out.println("У человека: " + this.getName() + " всё нормально, причина: " + reason);
    }

    public void makeExcited(){
        this.status = HumanStatus.EXCITED;
        System.out.println("У человека: " + this.getName() + " полный восторг просто так");
    }

    public void makeExcited(String reason){
        this.status = HumanStatus.EXCITED;
        System.out.println("У человека: " + this.getName() + " полный восторг, причина: " + reason);
    }

    public void makeSad(){
        this.status = HumanStatus.SAD;
        System.out.println("У человека: " + this.getName() + " депрессия просто так");
    }

    public void makeSad(String reason){
        this.status = HumanStatus.SAD;
        System.out.println("У человека: " + this.getName() + " депрессия, причина: " + reason);
    }

    public void sit(String place){
        this.location = Location.SITTING;
        this.place = place;
        System.out.println(this.getName() + " присел в месте: " + this.place);
    }

    public void stay(String place){
        this.location = Location.STAYING;
        this.place = place;
        System.out.println(this.getName() + " встал в месте: " + this.place);
    }

    public void lay(String place){
        this.location = Location.LYING;
        this.place = place;
        System.out.println(this.getName() + " лёг в месте: " + this.place);
    }

    public void fly(String place){
        this.location = Location.FLYING;
        this.place = place;
        System.out.println(this.getName() + " летает на чем-то/ком-то в месте: " + this.place);
    }

    public String toString(){
        String text = "Имя: " + this.getName() + ". Пол: " + this.getStringSex() + ". Состояние: " + this.getStringStatus()
                + ". Положение: " + this.getStringLocation() + ". Место: " + this.getPlace() + ".";
        return text;
    }

    @Override
    public int hashCode(){
        int ans = 0;
        for (int i = 0; i < this.getName().length(); i++){
            ans = (ans + (int)this.getName().charAt(i)) % 2000000000;
        }
        ans = (ans + this.getPlace().length()) % 2000000000;
        return ans;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Human human = (Human) o;
        if (this.hashCode() != human.hashCode()) return false;
        return (this.getName() == human.getName() && this.getSex() == human.getSex());
    }
}
