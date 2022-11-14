public class Main {
    public static void main(String[] args) {
        System.out.println(" Заданиие 2.0 ");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println( "Задание 2.1");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        System.out.println( "Задание 2.2");
        var firstBoxerWeight = 78.2;
        System.out.println(firstBoxerWeight + " кг! ");
        var secondBoxerWeight = 82.7;
        System.out.println(secondBoxerWeight + " кг! ");
        var totalWeight = firstBoxerWeight+secondBoxerWeight;
        System.out.println(" Общий вес бойцов " + totalWeight + " кг !");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(" Разница между бойцами составляет " + weightDifference + " кг!");
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference2 + " кг! ");


        System.out.println( "Задание 2.3");
        var totalWorkingHours = 640;
        var onePersonWorkingTime = 8;
        var totalEmployees = totalWorkingHours / onePersonWorkingTime;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек ");
        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * onePersonWorkingTime;
        System.out.println(" Если в компании работает "+ totalEmployees + " человека, то всего " + totalWorkingHours +   " часа работы может быть поделено между сотрудниками ");

    }
}