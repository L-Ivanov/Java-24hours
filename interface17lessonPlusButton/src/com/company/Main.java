package com.company;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Playback frame = new Playback();
        String a = frame.text;
        System.out.println(a);
        Function<Integer, Integer> increment = number -> number+1;
        int b = increment.apply(5);
        int c = increment.apply(4);
        System.out.println(c);
        Consumer<String> print = System.out::println;
        print.accept("Hi");
        Function<Integer, Integer> in = h -> h/2;
        int asd = in.apply(2);
        System.out.println(asd);

        print.accept("Peter");
        Supplier<Integer> genRandomInt = ()-> new Random().nextInt(2);
        int adad = genRandomInt.get();
        System.out.println(adad);
        Predicate<Integer> check = x -> x % 2 == 0;
        boolean check1 = check.test(3);
        System.out.println(check1);
        List<String> list1 = new ArrayList<>();
        list1.add("Peter");
        list1.add("John");
        list1.add("P");
        list1.add("eter");
        long count = list1.stream().count();
        list1.stream().forEach(System.out::println);

        System.out.println(count);
        list1.stream().filter(x->x.contains("Peter")).forEach(System.out::println);
        Stream<String> aaaa = Stream.of("AK", "Ak1");
        aaaa.filter(h->Character.isUpperCase(h.charAt(1))).forEach(System.out::println);
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        list.stream().map(x->x*4).forEach(System.out::println);





    }



}
