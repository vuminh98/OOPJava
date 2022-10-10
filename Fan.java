public class Fan {
    public static void main(String[] args) {
        Constant fan1 = new Constant(Constant.FAST, true, 10, "yellow");
        System.out.println(fan1.toString());
        Constant fan2 = new Constant(Constant.MEDIUM, false, 5, "blue");
        System.out.println(fan2.toString());
    }
    public static class Constant {
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

private int speed = SLOW;
private boolean status = false;
private double radius = 5;
private String color = "blue";

        public Constant(int speed, boolean status, double radius, String color) {
            this.speed = speed;
            this.status = status;
            this.radius = radius;
            this.color = color;
        }

        public String toString() {
            if (status == true) {
                return "Fan1: " + " speed: " + speed + " color: " + color + " radius: " +  radius + " fan is on";
            } else {
                return "Fan2" + " color: " + color + " radius: " + radius + " fan is off";
            }
        }
    }
}

