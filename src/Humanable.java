public interface Humanable {
    public String getName();
    public Sex getSex();
    public HumanStatus getStatus();
    public Location getLocation();
    public String getPlace();
    public void setStatus(HumanStatus status);
    public void setLocation(Location location);
    public void setPlace(String place);
}

