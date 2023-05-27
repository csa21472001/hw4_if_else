import java.util.concurrent.ThreadLocalRandom;

public class Main
{

    public static void main(String[] args)
    {   task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1()
    {   System.out.println("Задача 1");
        int age = (int)Math.floor(Math.random()*100);
        if(age>=18) {
            System.out.println("Если возраст человека равен "+ age +" то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+ age +" то он не достиг совершеннолетния, нужно немного подождать");
        }
    }

    public static void task2()
    {   System.out.println("Задача 2");
        int temp = (int)Math.floor(Math.random()*100-50);
        if (temp>5) {
            System.out.println("На улице "+ temp +" градусов можно идти без шапки");
        }
        else if (temp == 5) {
            System.out.println("На улице "+ temp +" градусов. Хз че делать.");
        }
        else {
            System.out.println("На улице "+ temp +" градусов нужно надеть шапку.");
        }
    }
    public static void task3()
    {   System.out.println("Задача 3");
        int speed = (int)Math.floor(Math.random()*120);
        if (speed>60) {
            System.out.println("Если скорость "+ speed +" то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+ speed +" можно ездить спокойно");
        }
    }
    public static void task4()
    {   System.out.println("Задача 4");
        int age = (int) Math.floor(Math.random() * 100);
        if (age < 2 ) {
            System.out.println("Если возраст человека равен "+age+" лет, то ему пора спать.");
        } else if (age>=2&&age<=6){
            System.out.println("Если возраст человека равен "+age+" лет, то ему нужно ходить в детский сад.");
        } else if (age>=7&&age<=18) {
            System.out.println("Если возраст человека равен "+age+" лет, то ему нужно ходить в школу.");
        } else if (age>=19&&age<=23) {
            System.out.println("Если возраст человека равен "+age+" лет, то его месть в университете");
        }
        else if (age>=24&&age<=60) {
            System.out.println("Если возраст человека равен "+age+" лет, то ему пора ходить на работу");
        }
        else {
            System.out.println("Если возраст человека равен "+age+" лет, то он может отдохнуть");
        }
    }
    public static void task5()
    {   System.out.println("Задача 5");
        //int age = (int) Math.floor(Math.random());
        int age = ThreadLocalRandom.current().nextInt(0, 18 + 1);
        if (age < 5 ) {
            System.out.println("Если возраст ребенка равен "+age+" лет, то ему нельзя кататься на атракционе.");
        } else if (age>=5&&age<14){
            System.out.println("Если возраст ребенка равен "+age+" лет, можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age>=14) {
            System.out.println("Если возраст ребенка равен "+age+" лет, можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6()
    {   System.out.println("Задача 6");
        //int age = (int) Math.floor(Math.random());
        int passenger = ThreadLocalRandom.current().nextInt(1,  150 + 1);
        if (passenger>=0 && passenger<=60 ) {
            System.out.println("Вы счастливый пассажир номер "+passenger+" для вас есть сидячее место");
        } else if (passenger>60&&passenger<=102){
            System.out.println("Вы пассажир номер "+passenger+" для вас есть стоячее место");
        } else {
            System.out.println("Мест нет. Пожалуйста покиньте вагон");
        }
    }
    public static void task7()
    {   System.out.println("Задача 7");
        int one = 123213 ;
        int two = 17 ;
        int three = 13 ;
        if (one>two&&one>three) {
            System.out.println("Число "+one+" наибольшее из заданных ");
        } else if (two>one&&two>three) {
            System.out.println("Число "+two+" наибольшее из заданных ");
        } else {
            System.out.println("Число "+three+" наибольшее из заданных ");
        }
    }
}