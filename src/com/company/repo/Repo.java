package com.company.repo;

public sealed interface Repo permits RepoImpl {

    private void inner() {
        System.out.println("call");
    }

    default void call() {
        inner();
        doCall();
    }

    public void doCall();


}
