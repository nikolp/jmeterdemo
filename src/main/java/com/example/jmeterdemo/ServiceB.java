package com.example.jmeterdemo;

import lombok.SneakyThrows;

import java.util.Random;

public class ServiceB {
    Random random = new Random();

    @SneakyThrows
    void methodB() {
        int sleepMillis = random.nextInt(400, 600);
        Thread.sleep(sleepMillis);
    }
}
