package com.company;

import com.company.model.Some;
import com.company.repo.Repo;
import com.company.repo.RepoImpl;
import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {

    public static void main(String[] args){
        // record
        System.out.println(new Some("name",100L).equals(new Some("name",100L)));

        // 密封类 接口private方法
        final RepoImpl repo = new RepoImpl();
        repo.call();
        // 多行字符串
        var msg = """
                hello,
                    新jdk
                """;
        System.out.println(msg);
        // 优化的switch
        System.out.println(switchCase(msg));
        System.out.println(switchCase(100));
        System.out.println(switchCase(100L));
        System.out.println(switchCase(List.of("a", "b", "c")));
        System.out.println(switchCase(Map.of("a", "b", "c", "d")));
    }

    private static String switchCase(Object o) {
        return switch (o) {
            case String str -> "is " + String.class.getSimpleName();
            case Integer value -> "is " + Integer.class.getSimpleName();
            case Long value -> "is " + Long.class.getSimpleName();
            default -> "unknown " + o.getClass().getSimpleName();
        };
    }
}
