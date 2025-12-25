import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        enum CoffeeType {
                아메리카노,
                라떼,
            아아
        }
        System.out.println(CoffeeType.라떼);

        int[] odds = new int[7];
        String[] str = new String[5];
        System.out.println(odds.length);
        System.out.println(odds);
        System.out.println(Arrays.toString(odds));
        System.out.println(Arrays.toString(str));
        str[2] = "i";
        System.out.println(Arrays.toString(str));

        ArrayList arrlist = new ArrayList();

        arrlist.add("133");
        System.out.println((arrlist.get(0)));

        arrlist.add("2e");
        System.out.println((arrlist.get(0)));

        arrlist.add(0,"2e");
        arrlist.add(0,"2e");

        System.out.println((arrlist.size()));
        System.out.println((arrlist.get(0)));
        System.out.println((arrlist.get(3)));
        arrlist.add(1,"e");
        System.out.println((arrlist.remove("f")));

        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        System.out.println((arrlist2.getFirst()));
        arrlist2.add(32);
        System.out.println((arrlist2.getFirst()));
        System.out.println((arrlist2.get(3)));
        ArrayList<String> arrlist3 = new ArrayList<>(Arrays.asList("1","2","3"));
        String str_3 = String.join(",",arrlist3);
        System.out.println(str_3);
        System.out.println("".join("",arrlist3));

        String[] str1 = new String[]{"A", "C", "L", "D"};
        System.out.println(String.join(",", str1));

        arrlist2.sort(Comparator.naturalOrder());
        arrlist2.sort(Comparator.reverseOrder());
        System.out.println(arrlist2);

        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));


        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(5));

        System.out.println(cal2.add(5));
        System.out.println(cal2.sub(5));
    //
    //        Animal cat = new Animal();
    //        Animal dog = new Animal();
    //        // Animal, 클래스라는 것은 자료형의 타입과 매우 비슷해보이는데?
    //        System.out.println(cat.name);
    //        cat.setName("Kate");
    //        dog.setName("Toto");
    //        System.out.println(cat.name);
    //        System.out.println(dog.name);
    //
    //        Counter myCounter = new Counter();
    //        System.out.println("bofore update" + myCounter.count);
    //
    //        Updater myUpdater = new Updater();
    //        // myUpdater.update(myCounter.count);
    //        myUpdater.update(myCounter);
    //        System.out.println("after update" + myCounter.count);

        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);

        dog.sleep();

        HouseDog houseDog = new HouseDog("titi");
        houseDog.setName("happy");
        System.out.println(houseDog.name);
        houseDog.sleep();
        houseDog.sleep(1);
        houseDog.sleep(4);

        HouseDog bijyu = new HouseDog("bijyu");
        System.out.println(bijyu.name);

        HouseDog bulldog = new HouseDog(2);
        System.out.println(bulldog.name);

        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        lion.printFood();



    }
}
