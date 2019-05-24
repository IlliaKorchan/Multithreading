package model.students;

import static view.StringContainer.BIOLOGIST;

public class Biologist implements Student {

    @Override
    public String getSpec() {
        return BIOLOGIST;
    }
}
