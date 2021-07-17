package com.vanzay;

public class Task implements InterfaceTask {
    public String task;
    protected String state = "uncompleted";

    public Task(String task) {
        this.task = task;
    }

    @Override
    public String setState(String state) {
        this.state = state;
        return state;
    }

    @Override
    public String getTask() {
        return task;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return task + ", " + state;
    }
}
