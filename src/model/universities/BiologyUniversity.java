package model.universities;

import model.QueueFormer;
import model.University;

import static view.StringContainer.BIOLOGIST;

public class BiologyUniversity extends University {

    public BiologyUniversity(QueueFormer queueFormer, String university) {
        super(queueFormer, university);
    }

    @Override
    public void run() {
        while (getQueue().peek() != null) {
            check();
            fetch();
        }
        print();
    }

    @Override
    public void fetch() {
        specFetch(BIOLOGIST);
    }
}
