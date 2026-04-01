//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int age = 2;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }



        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }



        int speed = 59;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }



        boolean goToKindergarten = age >= 2 && age <= 6;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        boolean goToSchool = age >= 7 && age <= 17;
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        boolean goToUniversity = age >= 18 && age <= 24;
        if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        boolean goToWork = age > 24;
        if (goToWork) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }




        }

}