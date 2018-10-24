package tsi.stanislaw.cab;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import java.util.Random;
import java.util.Scanner;

public class Main_controller {
    private int turnNr;
    private static Random rand = new Random();
    private static Scanner scan = new Scanner(System.in);
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Turn> turns;

    public void initialize() {
        System.out.println("Initialized");
        String randNum = String.format("%04d%n", rand.nextInt(9999));
        System.out.println(randNum);
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
        String scanNum = scanNumber();
        scanNum.equals(num1.getValue());
    }

    private String scanNumber() {
        int scanNum1 = scan.nextInt(num1.getValue());
        int scanNum2 = scan.nextInt(num2.getValue());
        int scanNum3 = scan.nextInt(num3.getValue());
        int scanNum4 = scan.nextInt(num4.getValue());
        System.out.println("Scanned numbers: " + scanNum1 + scanNum2 + scanNum3 + scanNum4);

        if (scanNum1 == num1.getValue() || scanNum2 == num2.getValue() || scanNum3 == num3.getValue() || scanNum4 == num4.getValue()) {
            Turn n1 = new Turn();
            n1.setGuess("1");
        }
        return null;
    }
}
