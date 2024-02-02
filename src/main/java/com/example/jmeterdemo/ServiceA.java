package com.example.jmeterdemo;

import lombok.SneakyThrows;

import java.util.Random;
public class ServiceA {
    Random random = new java.util.Random();
    ServiceB serviceB = new ServiceB();

    @SneakyThrows
    void methodA() {
        serviceB.methodB();
        int sleepMillis = random.nextInt(200, 400);
        Thread.sleep(sleepMillis);
    }
}
