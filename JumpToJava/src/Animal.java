interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4;

    static int speed() {
        return LEG_COUNT * 30;
    }

}


public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    HouseDog(String name) {
        this.name = name;
    }

    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
//            this.setName("bulldog");
            this.name = "bulldog";

        }


    }
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        if (hour == 1) {
            System.out.println(this.name + " zzz in house for " + hour + "hour");
        } else {
            System.out.println(this.name + " zzz in house for " + hour + "hours");

        }
    }

}

class Tiger extends Animal implements Predator{
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
//
//    void feed(Lion lion) {
//        System.out.println("feed banana");
//    }
    }

