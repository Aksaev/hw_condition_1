public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - Условный оператор");
        System.out.println("------------------------------------");

        System.out.println("Задание 1");
        task1(); // Задание 1
        System.out.println("--------------------");

        System.out.println("Задание 2");
        task2(); // Задание 2
        System.out.println("--------------------");

        System.out.println("Задание 3");
        task3(); // Задание 3
        System.out.println("--------------------");

        System.out.println("Задание 4");
        task4(); // Задание 4
        System.out.println("--------------------");

        System.out.println("Задание 5");
        task5(); // Задание 5
        System.out.println("--------------------");

        System.out.println("Задание 6");
        task6(); // Задание 6
        System.out.println("--------------------");

        System.out.println("Задание 7");
        task7(); // Задание 7
        System.out.println("--------------------");

        System.out.println("Задание 8");
        task8(); // Задание 8
        System.out.println("--------------------");

        System.out.println("Задание 9");
        task9(); // Задание 9
        System.out.println("--------------------");
    }

    // Домашнее задание - 1
    // Задание 1
    public static void task1() {
        int userAge = 17;

        if (userAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (userAge < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }
    // Задание 2
    public static void task2() {
        int age = 24;

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    // Задача 3
    public static void task3() {
        int trainCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = trainCapacity - seatingPlaces; // Стоячие места
        int seatingCheck = 30;
        int standingCheck = 15;

        if (seatingCheck < seatingPlaces) {
            System.out.println("Сидячих мест осталолоь " + (seatingPlaces - seatingCheck));
        }
        if (seatingCheck == seatingPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (standingCheck < standingPlaces) {
            System.out.println("Стоячие мест осталось " + (standingPlaces - standingCheck));
        }
        if (standingCheck == standingPlaces) {
            System.out.println("Стоячие мест нет");
        }
    }

    // Задача 4
    public static void task4() {
        int userAge = 17;

        if (userAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    // Задача 5
    public static void task5() {
        int age = 24;

        if ((age >= 7) && (age < 18)) {
            System.out.println("Ребенок ходит в школу");
        } else if ((age >= 18) && (age < 24)) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    // Задача 6
    public static void task6() {
        int trainCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = trainCapacity - seatingPlaces; // Стоячие места
        int seatingCheck = 30;
        int standingCheck = 15;

        if (seatingCheck < seatingPlaces) {
            System.out.println("Сидячих мест осталолоь " + (seatingPlaces - seatingCheck));
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingCheck < standingPlaces) {
            System.out.println("Стоячие мест осталось " + (standingPlaces - standingCheck));
        } else {
            System.out.println("Стоячие мест нет");
        }
    }

    // Задача 7
    public static void task7() {
        int age = 24;

        if ((age >= 2 && age <= 6)) {
            System.out.printf("Человеку %d лет/года, ему нужно ходить в детский сад", age);
        } else if (age >= 7 && age <= 18) {
            System.out.printf("Человеку %d лет/года, ему нужно ходить в школу\n", age);
        } else if (age > 18 && age < 24) {
            System.out.printf("Человеку %d лет/года, его место в университете\n", age);
        } else if (age >= 24) {
            System.out.printf("Человеку %d лет/года, пора ходить на работу\n", age);
        }
    }

    // Задача 8
    public static void task8() {
        int age = 4;
        boolean attractionAgeNo = age < 5;
        boolean attractionAgeYes = age < 14;
        boolean attractionGo = age >= 14;

        if (attractionAgeNo) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (attractionAgeYes) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else if (attractionGo) {
            System.out.println("Ребёнок может кататься без сопровождения взрослого");
        }
    }

    // Задача 9
    public static void task9() {
        int one = 3;
        int two = 6;
        int free = 3;

        if (one > two) {
            if (one >= free) {
                System.out.println("Наибольшее число one = " + one);
            } else {
                System.out.println("Наибольшее число free = " + free);
            }
            } else if (two > one) {
                if (two >= free) {
                    System.out.println("Наибольшее число two = " + two);
                } else {
                    System.out.println("Наибольшее число free = " + free);
                }
            } else {
                if (one > free) {
                    System.out.println("Наибольшее число one = " + one);
                } else if (free > one) {
                    System.out.println("Наибольшее число free = " + free);
                } else {
                    System.out.println("Числа one = " + one + ", two = " + two + " и free = " + free + " равны");
                }
            }
    }
}