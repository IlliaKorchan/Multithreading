package controller;

import model.QueueFormer;
import model.universities.BiologyUniversity;
import model.universities.MathUniversity;
import model.universities.PolytechnicalUniversity;

import static view.StringContainer.BIOLOGY_UNIVERSITY;
import static view.StringContainer.MATHEMATICAL_UNIVERSITY;
import static view.StringContainer.POLYTECHNICAL_UNIVERSITY;

public class Controller {

    public void process() {
        QueueFormer queueFormer = new QueueFormer();
        queueFormer.fill();

        Thread biologyUniversity = new Thread(new BiologyUniversity(queueFormer, BIOLOGY_UNIVERSITY));
        Thread polytechnicalUniversity = new Thread(new PolytechnicalUniversity(queueFormer, POLYTECHNICAL_UNIVERSITY));
        Thread mathUniversity = new Thread(new MathUniversity(queueFormer, MATHEMATICAL_UNIVERSITY));

        biologyUniversity.start();
        polytechnicalUniversity.start();
        mathUniversity.start();

    }
}
