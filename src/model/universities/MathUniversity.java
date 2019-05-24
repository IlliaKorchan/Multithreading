package model.universities;

import model.QueueFormer;
import model.University;

import static view.StringContainer.MATHEMATICIAN;

public class MathUniversity extends University {
    public MathUniversity(QueueFormer queueFormer, String university) {
        super(queueFormer, university);
    }

    @Override
    public void run() {
        while (getQueue().peek() != null) {
            fetch();
        }
        print();
    }

    @Override
    public void fetch() {
        specFetch(MATHEMATICIAN);
    }
}
