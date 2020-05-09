package app;

import framework.Button;
import framework.OnClickListener;

public class Keyboard {

    private Button button;

    public Keyboard(){

    }

    public void start(String key){
            if (key.equals("q")){
                button = new Button();
                Escape escape = new Escape();
                button.setOnClickListener(escape);
            } else if (key.equals("t")){
                button = new Button();
                Tab tab = new Tab();
                button.setOnClickListener(tab);
            } else if (key.equals("e")){
                button = new Button();
                Enter enter = new Enter();
                button.setOnClickListener(enter);
            } else {
                System.out.println("Key does not exist");
            }
    }

    public Button getButton(){
        return button;
    }
}
