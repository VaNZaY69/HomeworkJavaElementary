package com.vanzay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Task> listAllTask = new ArrayList<>();
        List<Task> listCompletedTask = new ArrayList<>();
        for (int i = 0; i < listAllTask.size(); i++) {
            if (listAllTask.get(i).state == "completed") {
                int number = i + 1;
                System.out.println(number + ". " + listAllTask.get(i));
            }
        }
        List<Task> listUncompletedTask = new ArrayList<>();
        for (int i = 0; i < listAllTask.size(); i++) {
            if (listAllTask.get(i).state == "uncompleted") {
                int number = i + 1;
                System.out.println(number + ". " + listAllTask.get(i));
            }
        }
        System.out.println("1.Add task\n" +
                "2.See a list of all tasks\n" +
                "3.See the list of completed tasks\n" +
                "4.See the list of uncompleted tasks\n" +
                "5.Mark the task as completed\n");

        System.out.println("Please enter number desired operation: ");
        int numberOperation = scanner.nextInt();
        String str1 = scanner.nextLine(); //scanner bug fix

        if (numberOperation == 1) {
            System.out.println("Please write down your task: ");
            String writeTask = scanner.nextLine();
            listAllTask.add(new Task(writeTask));
            System.out.println("Task is listed.");

        } else if (numberOperation == 2) {
            for (int i = 0; i < listAllTask.size(); i++) {
                int number = i + 1;
                System.out.println(number + ". " + listAllTask.get(i));
            }
        } else if (numberOperation == 3) {
            for (int i = 0; i < listCompletedTask.size(); i++) {
                int number = i + 1;
                System.out.println(number + ". " + listAllTask.get(i));
            }
        } else if (numberOperation == 4) {
            for (int i = 0; i < listUncompletedTask.size(); i++) {
                int number = i + 1;
                System.out.println(number + ". " + listAllTask.get(i));
            }
        } else if (numberOperation == 5) {
            System.out.println("Please enter the number of the task from the list of not completed, \n" +
                    "which you would like to mark as completed: ");
            int numberTask = scanner.nextInt();
            String str2 = scanner.nextLine(); //scanner bug fix
            listUncompletedTask.get(numberTask).setState(listUncompletedTask.get(numberTask).state);
            System.out.println("Task marked as completed.");
        }

    }
}
