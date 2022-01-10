package activities;

public class Activity3 {
    public static void main(String[] args){
        double give_age_in_sec = 1000000000;
        double earth_orbital_period = 31557600;
        double mercury_orbital_period = 0.2408467;
        double venus_orbital_period = 0.61519726;
        double mars_orbital_period = 1.8808158;
        double jupiter_orbital_period = 11.862615;
        double saturn_orbital_period = 29.447498;
        double uranus_orbital_period = 84.016846;
        double neptune_orbital_period = 164.79132;
        double age_on_earth = (give_age_in_sec/earth_orbital_period);
        System.out.println("Age on Earth: " + age_on_earth);
        System.out.println("Age on Mercury: " + age_on_earth/mercury_orbital_period);
        System.out.println("Age on Venus: " + age_on_earth/venus_orbital_period);
        System.out.println("Age on Mars: " + age_on_earth/mars_orbital_period);
        System.out.println("Age on Jupiter: " + age_on_earth/jupiter_orbital_period);
        System.out.println("Age on Saturn: " + age_on_earth/saturn_orbital_period);
        System.out.println("Age on Uranus: " + age_on_earth/uranus_orbital_period);
        System.out.println("Age on Neptune: " + age_on_earth/neptune_orbital_period);
    }
}
