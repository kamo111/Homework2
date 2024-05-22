public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1
        var dog = 8.0;
        var cat = 3.0;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalBoxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общая сумма двух бойцов "+totalBoxerWeight+" кг.");
        var differenceBoxerWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница веса двух бойцов "+differenceBoxerWeight+" кг.");
        //Задача 7
        var remainsWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Остаток от деления "+remainsWeight+" кг.");
        //Задача 8
        //1
        var workingHours = 640;
        var workers = 0;
        workers = workingHours / 8;
        System.out.println("Всего работников в компании — " + workers+" человек.");
        //2
        workers = workers + 94;
        var newWorkingHours = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " +  newWorkingHours + " часов работы может быть поделено между сотрудниками.");




    }

}