public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public String performTask(String task) {
        batteryLevel = batteryLevel - 10;
        return name + " Is performing task: " + task;
    }

    public String energyReport() {
        return "My energy level is at " + batteryLevel;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        System.out.println(codey.performTask("Dancing"));
        System.out.println(codey.performTask("Cleaning"));
        System.out.println(codey.energyReport());

    }

}