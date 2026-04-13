//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int age = 3;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }


        if (age >= 2 && age <= 6) {
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


        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения");
        }


        int passengers = 103;
        if (passengers <= 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (passengers > 60 && passengers <= 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне мест нет");
        }


        int one = 15;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }


    }

}