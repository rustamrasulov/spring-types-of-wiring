package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 dusk;

    @Override
    public String toString() {
        return ", в зайце утка " + dusk.toString();
    }

    @Autowired
    private void setDuck(Duck5 duck) {
        this.dusk = duck;
    }
}
