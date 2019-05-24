package model.students;

import static view.StringContainer.MATHEMATICIAN;

public class Mathematician implements Student {

    @Override
    public String getSpec() {
        return MATHEMATICIAN;
    }
}
