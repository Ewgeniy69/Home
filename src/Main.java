public class Main {
    public static void main(String[] args) {
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

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
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

        var bw1 = 78.2;
        var bw2 = 82.7;
        var totalWeight = bw1 + bw2;
        System.out.println(totalWeight);
        var differenceBw1AndBw2 = bw2 - bw1;
        System.out.println("Разница в весе между двумя боксерами составляет " + differenceBw1AndBw2 + " кг");
        var totalResult = bw2 % bw1;
        System.out.println("Остаток от деления между двумя весами составил " + totalResult);

        var totalTime = 640;
        var timeForEveryone = 8;
        var numberOfPersons = totalTime / timeForEveryone;
        System.out.println(numberOfPersons);
        numberOfPersons = numberOfPersons + 94;
        System.out.println(numberOfPersons);
        var totalTimeToOverPersons = numberOfPersons * timeForEveryone;
        System.out.println("Если в компании работает " + numberOfPersons + " человека, то всего " + totalTimeToOverPersons + " часа работы может быть поделено между сотрудниками");




    }
}