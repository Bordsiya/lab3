public class Main {
    public static void main(String []args) {
        Carlson carlson = new Carlson("Карлсон", Sex.MALE, HumanStatus.NORMAL, Location.SITTING, "Крыша");
        Kiddo kiddo = new Kiddo("Малыш", Sex.MALE, HumanStatus.DIZZY, Location.SITTING, "Крыша");
        WeatherCondition weatherCondition = new WeatherCondition(Season.SUMMER, Time.EVENING, Atmosphere.LOUDNESS);
        System.out.print("Предпочтение -> ");
        WeatherCondition preference = new WeatherCondition(Season.SUMMER, Time.EVENING, Atmosphere.LOUDNESS);
        Crowd crowd = new Crowd(preference, CrowdStatus.MESSING, "Улица");
        crowd.walk(weatherCondition);
        carlson.eat("булочка");
        carlson.say();
        kiddo.listenWithEffect(carlson);
        kiddo.makeDizzy("вкусы и запахи");
        kiddo.smell("цветущие липы");
        kiddo.listen("стук каблуков");
        kiddo.makeExcited("атмосфера");
        kiddo.think("Какой летний звук!");
        kiddo.listen("каждый шорох", weatherCondition);
        crowd.talk(weatherCondition);
        crowd.scream(weatherCondition);
        crowd.sing(weatherCondition);
        crowd.scold(weatherCondition);
        crowd.laugh(weatherCondition);
        crowd.cry(weatherCondition);
        kiddo.listen("сплетение звуков", crowd);



    }


}
