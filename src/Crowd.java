public class Crowd {
    private WeatherCondition preference;
    private CrowdStatus status;
    private String place;

    public Crowd(){
        preference = new WeatherCondition(Season.SUMMER, Time.AFTERNOON, Atmosphere.LOUDNESS);
        this.status = CrowdStatus.MESSING;
        this.place = "Улица";
        System.out.println("Создана толпа, которая любит гулять при перечисленных дефолтных обстоятельствах. Время года: "
                + this.preference.getStringSeason() + ". Время суток: " + this.preference.getStringTime()
                + ". Атмосфера: " + this.preference.getStringAtmosphere() + ". Сейчас толпа: " + this.getStringStatus()
                + " в месте: " + this.place + ".");
    }

    public Crowd(WeatherCondition preference){
        this.preference = preference;
        this.status = CrowdStatus.MESSING;
        this.place = "Улица";
        System.out.println("Создана толпа, которая любит гулять при перечисленных обстоятельствах. Время года: "
                + this.preference.getStringSeason() + ". Время суток: " + this.preference.getStringTime()
                + ". Атмосфера: " + this.preference.getStringAtmosphere() + ". Сейчас толпа: " + this.getStringStatus()
                + " в месте: " + this.place + ".");
    }

    public Crowd(WeatherCondition preference, CrowdStatus status){
        this.preference = preference;
        this.status = status;
        this.place = "Улица";
        System.out.println("Создана толпа, которая любит гулять при перечисленных обстоятельствах. Время года: "
                + this.preference.getStringSeason() + ". Время суток: " + this.preference.getStringTime()
                + ". Атмосфера: " + this.preference.getStringAtmosphere() + ". Сейчас толпа " + this.getStringStatus()
                + " в месте: " + this.place + ".");
    }

    public Crowd(WeatherCondition preference, CrowdStatus status, String place){
        this.preference = preference;
        this.status = status;
        this.place = place;
        System.out.println("Создана толпа, которая любит гулять при перечисленных обстоятельствах. Время года: "
                + this.preference.getStringSeason() + ". Время суток: " + this.preference.getStringTime()
                + ". Атмосфера: " + this.preference.getStringAtmosphere() + ". Сейчас толпа " + this.getStringStatus()
                + " в месте: " + this.place + ".");
    }

    public WeatherCondition getPreference(){
        return this.preference;
    }

    public CrowdStatus getStatus(){
        return this.status;
    }

    public String getStringStatus(){
        CrowdStatus status = this.getStatus();
        if (status == CrowdStatus.CRYING){
            return "плачет";
        }
        else if (status == CrowdStatus.LAUGHING){
            return "смеётся";
        }
        else if (status == CrowdStatus.MESSING){
            return "ничего не делает";
        }
        else if (status == CrowdStatus.SCOLDING){
            return "бранится";
        }
        else if (status == CrowdStatus.SCREAMING){
            return "кричит";
        }
        else if (status == CrowdStatus.SINGING){
            return "поёт";
        }
        else if (status == CrowdStatus.TALKING){
            return "болтает";
        }
        else{
            return "гуляет";
        }
    }

    public String getPlace(){
        return this.place;
    }

    public void setPreference(WeatherCondition preference){
        this.preference = preference;
        System.out.println("Предпочтения толпы изменены. Время года: " + this.preference.getStringSeason()
                + ". Время суток: " + this.preference.getStringTime() + ". Атмосфера: "
                + this.preference.getStringAtmosphere() + ".");
    }

    public void setStatus(CrowdStatus status){
        this.status = status;
        System.out.println("Состояние толпы изменено. Сейчас толпа: " + this.getStringStatus() + ".");
    }

    public void setPlace(String place){
        this.place = place;
        System.out.println("Состояние толпы изменено. Сейчас толпа гуляет в месте: " + this.place + ".");
    }

    public void walk(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.WALKING;
            System.out.println("Толпа начала гулять.");
        }
        else{
            System.out.println("Толпа не хочет гулять =(");
        }
    }

    public void talk(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.TALKING;
            System.out.println("Толпа начала говорить.");
        }
        else{
            System.out.println("Толпа не хочет говорить =(");
        }
    }

    public void scream(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.SCREAMING;
            System.out.println("Толпа начала кричать.");
        }
        else{
            System.out.println("Толпа не хочет кричать =(");
        }
    }

    public void sing(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.SINGING;
            System.out.println("Толпа начала петь.");
        }
        else{
            System.out.println("Толпа не хочет петь =(");
        }
    }

    public void laugh(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.LAUGHING;
            System.out.println("Толпа начала смеяться.");
        }
        else{
            System.out.println("Толпа не хочет смеяться =(");
        }
    }

    public void scold(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.SCOLDING;
            System.out.println("Толпа начала браниться.");
        }
        else{
            System.out.println("Толпа не хочет браниться =(");
        }
    }

    public void cry(WeatherCondition weather){
        if (this.preference.equals(weather)){
            this.status = CrowdStatus.CRYING;
            System.out.println("Толпа начала плакать.");
        }
        else{
            System.out.println("Толпа не хочет плакать =(");
        }
    }

    public void mess(){
        this.status = CrowdStatus.MESSING;
    }

    @Override
    public String toString(){
        String text = "Погода -> " + this.preference.toString() + " Состояние: " + this.getStringStatus()
                + ". Место: " + this.getPlace() + ".";
        return text;
    }

    @Override
    public int hashCode(){
        int ans = 0;
        for (int i = 0; i < this.getPlace().length(); i++){
            ans = (ans + (int)this.getPlace().charAt(i)) % 2000000000;
        }
        ans = (ans + this.getStringStatus().length()) % 2000000000;
        return ans;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Crowd crowd = (Crowd) o;
        if (this.hashCode() != crowd.hashCode()) return false;
        return (this.getPlace() == crowd.getPlace() && this.getStringStatus() == crowd.getStringStatus()
                && this.getPreference() == crowd.getPreference());
    }


}
