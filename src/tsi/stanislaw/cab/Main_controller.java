package tsi.stanislaw.cab;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class Main_controller {
    private int turnNr;
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Turn> turns;

    public void initialize() {
        System.out.println("Initialized");
    }

    public void send() {
        System.out.println("Pressed: Send");
        turnNr++;
        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();
        System.out.println("Numbers entered: " + n1 + n2 + n3 + n4);
        Turn turn = new Turn();
        turn.setGuess("" + n1 + n2 + n3 + n4);
        turn.setTurnNr(turnNr);

        turns.getItems().add(turn);
    }
}
