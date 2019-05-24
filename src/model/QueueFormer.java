package model;

import model.students.Biologist;
import model.students.Mathematician;
import model.students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueFormer {
    private List<Student> allStudents = new ArrayList<>();
    private BlockingQueue<Student> queue = new ArrayBlockingQueue<>(50, true);

    {
        for (int i = 0; i < 200; i++) {
            allStudents.add(new Biologist());
        }
        for (int i = 0; i < 250; i++) {
            allStudents.add(new Mathematician());
        }
    }

    public BlockingQueue<Student> getQueue() {
        return queue;
    }

    public void fill() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(queue.remainingCapacity()); i++) {
            if (allStudents.isEmpty()) {
                break;
            }

            Student randomStudent = allStudents.get(random.nextInt(allStudents.size()));
            try {
                queue.put(randomStudent);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            allStudents.remove(randomStudent);
        }
    }

    public synchronized void check() {
        if (queue.size() < 25) {
            fill();
        }
    }

}