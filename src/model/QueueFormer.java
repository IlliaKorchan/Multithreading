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
    private List<Student> allStudents = new ArrayList();
    private BlockingQueue<Student> queue = new ArrayBlockingQueue(50, true);

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
        while (queue.remainingCapacity() != 0) {
            Random random = new Random();
            Student randomStudent = allStudents.get(random.nextInt(allStudents.size()));
            queue.add(randomStudent);
        }
    }

    public void remove(int index) {
        queue.remove(index);
    }
}