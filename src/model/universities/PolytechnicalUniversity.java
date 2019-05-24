package model.universities;

import model.QueueFormer;
import model.University;

import java.util.Random;

public class PolytechnicalUniversity extends University {
    public PolytechnicalUniversity(QueueFormer queueFormer, String university) {
        super(queueFormer, university);
    }

    @Override
    public void run() {
        Random random = new Random();

        while (getQueue().peek() != null) {
            int amountOfStudents = random.nextInt(5) + 1;
            for (int i = 0; i < amountOfStudents; i++) {
                check();
                fetch();
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        print();
    }

    @Override
    public void fetch() {
        if (getQueue().peek() != null) {
            try {
                add(getQueue().take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
