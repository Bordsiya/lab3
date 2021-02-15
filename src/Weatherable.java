public interface Weatherable {
    public Season getSeason();
    public Time getTime();
    public Atmosphere getAtmosphere();
    public void setSeason(Season season);
    public void setTime(Time time);
    public void setAtmosphere(Atmosphere atmosphere);
    public String getStringSeason();
    public String getStringTime();
    public String getStringAtmosphere();
}
