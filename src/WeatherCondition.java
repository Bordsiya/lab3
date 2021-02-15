public class WeatherCondition implements Weatherable{
    private Season season;
    private Time time;
    private Atmosphere atmosphere;

    public WeatherCondition(){
        this.season = Season.AUTUMN;
        this.time = Time.MORNING;
        this.atmosphere = Atmosphere.SILENCE;
        System.out.println("Задана дефолтная погода: " + this.getStringSeason()
                + ", " + this.getStringTime() + ", " + this.getStringAtmosphere() + ".");
    }

    public WeatherCondition(Season season){
        this.season = season;
        this.time = Time.MORNING;
        this.atmosphere = Atmosphere.SILENCE;
        System.out.println("Задана погода: " + this.getStringSeason()
                + ", " + this.getStringTime() + ", " + this.getStringAtmosphere() + ".");
    }

    public WeatherCondition(Season season, Time time){
        this.season = season;
        this.time = time;
        this.atmosphere = Atmosphere.SILENCE;
        System.out.println("Задана погода: " + this.getStringSeason()
                + ", " + this.getStringTime() + ", " + this.getStringAtmosphere() + ".");
    }

    public WeatherCondition(Season season, Time time, Atmosphere atmosphere){
        this.season = season;
        this.time = time;
        this.atmosphere = atmosphere;
        System.out.println("Задана погода: " + this.getStringSeason()
                + ", " + this.getStringTime() + ", " + this.getStringAtmosphere() + ".");
    }

    @Override
    public Season getSeason() {
        return this.season;
    }

    @Override
    public Time getTime() {
        return this.time;
    }

    @Override
    public Atmosphere getAtmosphere() {
        return this.atmosphere;
    }

    @Override
    public void setSeason(Season season) {
        this.season = season;
        System.out.println("Время года изменено на: " + this.getStringSeason());
    }

    @Override
    public void setTime(Time time) {
        this.time = time;
        System.out.println("Время суток изменено на: " + this.getStringTime());
    }

    @Override
    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
        System.out.println("Атмосфера изменена на: " + this.getStringAtmosphere());
    }

    public String getStringSeason(){
        Season season = this.getSeason();
        if (season == Season.AUTUMN){
            return "осень";
        }
        else if (season == Season.SPRING){
            return "весна";
        }
        else if (season == Season.SUMMER){
            return "лето";
        }
        else{
            return "зима";
        }
    }

    public String getStringTime(){
        Time time = this.getTime();
        if (time == Time.AFTERNOON){
            return "день";
        }
        else if (time == Time.MORNING){
            return "утро";
        }
        else if (time == Time.EVENING){
            return "вечер";
        }
        else{
            return "ночь";
        }
    }

    public String getStringAtmosphere(){
        Atmosphere atmosphere = this.getAtmosphere();
        if (atmosphere == Atmosphere.LOUDNESS){
            return "шумно";
        }
        else{
            return "тихо";
        }
    }

    @Override
    public String toString(){
        String text = "Время года: " + this.getStringSeason() + ". Время суток: " + this.getStringTime()
                + ". Атмосфера: " + this.getStringAtmosphere() + ".";
        return text;
    }

    @Override
    public int hashCode(){
        int ans = 0;
        for (int i = 0; i < this.getStringSeason().length(); i++){
            ans = (ans + (int)this.getStringSeason().charAt(i)) % 2000000000;
        }
        ans = (ans + this.getStringAtmosphere().length()) % 2000000000;
        return ans;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        WeatherCondition weatherCondition = (WeatherCondition) o;
        if (this.hashCode() != weatherCondition.hashCode()) return false;
        return (this.getStringSeason() == weatherCondition.getStringSeason()
                && this.getStringTime() == weatherCondition.getStringTime()
                && this.getStringAtmosphere() == weatherCondition.getStringAtmosphere());
    }
}
