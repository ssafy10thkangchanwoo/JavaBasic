import java.util.*;

public class Sample {
    public static void main(String[] args) {
//        String a = "a";
        String a = new String("abc abdaefg");
        String b = new String("b");
        String c = "a";
        String d = "a";

        String[] result = a.split("a");


        System.out.println(a.equals(c));
        System.out.println(a==c);
        System.out.println(d.equals(c));
        System.out.println(a.replaceAll(".","12"));
        System.out.println(a.substring(1,5));
        System.out.println(Arrays.toString(result));
        System.out.println(Check.typeof(a));
        System.out.println(String.format("I am %s years old %s  %%", 2, b));

        System.out.println(String.format("Exception %10s", "10spaceoverhowsad"));
        System.out.println(String.format("Exception %15s", "10space"));

        System.out.println(String.format("Exception %-15s", "10space"));

        System.out.println(String.format("Exception %15.3f", 1.234567));
        System.out.printf("Exception %10s \n", "10spaceoverhowsad");


        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb);
        String sbS = sb.toString();
        System.out.println(sbS);

        String ex1 = "";
        ex1 += "hello";
        ex1 += " ";
        ex1 += "java come on";
        System.out.println(ex1);

        sb.insert(11,"들어갔다");
        System.out.println(sb);
        System.out.println(sb.substring(0,7));

        int[] odds = {1,3,5,7,9};
        String[] weeks = {"월", "화", "수", "목", "금"};

        System.out.println(Arrays.toString(odds));
        System.out.println(weeks);
        System.out.println(Arrays.toString(weeks));
        String[] weeks2 = new String[7];
        weeks2[0] ="월";
        weeks2[3] ="월";

        weeks2[5] ="화";

        System.out.println(Arrays.toString(weeks2));
        System.out.println(weeks2);
        System.out.println(weeks2[0]);

        for (int i = 0; i < weeks2.length; i++) {
            if (weeks2[i] == null) {System.out.println("weeee");}
            else {
                System.out.println(weeks2[i]);
            }
        }


        // 제네릭스 도입 전에는 List 안에 있는 요소들은 Object로 다뤄졌음.
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("11");
        pitches.add("22");

        pitches.add(2,"22");
        System.out.println(pitches.get(1));
        System.out.println(pitches.size());

        System.out.println(pitches.contains("11"));
        System.out.println(pitches.remove("22"));
        System.out.println(pitches.remove(0));
        System.out.println(pitches.remove(0));

        System.out.println(pitches);
        pitches.add("finalAdd1111");



        ArrayList pitches_NoGeneric = new ArrayList();
        pitches_NoGeneric.add("1111");
        pitches_NoGeneric.add("2222");
        System.out.println((pitches_NoGeneric.get(0)));


        String[] data = {"ki", "wi", "oi"};
        ArrayList<String> AL = new ArrayList<>(Arrays.asList(data));
        System.out.println((AL));

        ArrayList<String> AL2 = new ArrayList<>(Arrays.asList("111", "222", "333"));
        System.out.println((AL2));

        String ALR = "";
        for (int i = 0; i < AL2.size(); i++) {
            ALR += AL2.get(i);
            ALR += ",";
        }
        ALR = ALR.substring(0, ALR.length()-1);
        System.out.println(ALR);

        String ALR2 = String.join(" : ", AL2);
        System.out.println(ALR2);
        String dataR = String.join(" : ", data);
        System.out.println(dataR);

        AL2.sort(Comparator.reverseOrder());
        System.out.println(AL2);
        AL.sort(Comparator.reverseOrder());
        System.out.println(AL);


        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map);
        System.out.println(map.get("people"));
        System.out.println(map.get("people1"));
        System.out.println(map.getOrDefault("people1", "없는 키값"));
        System.out.println(map.containsKey("사람"));
        System.out.println(map.containsValue("사람"));
        System.out.println(map.remove("people"));
        System.out.println(map);
        map.put("people", "사람");

        map.put("mouse", "쥐");
        System.out.println(map.size());
        System.out.println(map.keySet());
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);

        HashSet<String> set = new HashSet<>(Arrays.asList("h", "e", "l", "l", "o"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(1,3,5,8,10));

        System.out.println(s1);
        System.out.println(s2);

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        System.out.println(s1);
//        System.out.println(s1.retainAll(s2));
//
//        System.out.println(s1);


        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        substract.remove(9);
        substract.add(1);
        substract.addAll(Arrays.asList(1,3,5));
        System.out.println(substract);

        enum CoffeeType {
            Americano,
            ICe_Americano,
            Cafe_Latte
        }

        System.out.println(Arrays.toString(CoffeeType.values()));
        System.out.println((CoffeeType.Americano));

        for (CoffeeType t: CoffeeType.values()) {
            System.out.println(t);
        }

        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(num);
        System.out.println(n);
        System.out.println(Check.typeof(n));

        num = ""+ n;
        System.out.println(num);
        System.out.println(String.valueOf(n));
        System.out.println(Integer.toString(n));

        String f_num = "123.456";
        double dd = Double.parseDouble(f_num);
        System.out.println(dd);

        int m1 = 123;
        double d1 = m1;
        System.out.println(d1);

        double d2 = 123.45;
        int n2 = (int) d2;
        System.out.println(n2);

        double m2 = Double.parseDouble(f_num);
        System.out.println(m2);

        final int m4 = 123;
        final ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b"));
        System.out.println(arr1);
        arr1.add("3");
        System.out.println(arr1);
//        final ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b"));

        final List<String> arr2 = List.of("a", "b");
        System.out.println(arr2);
        arr2.add("3");














    }

}
