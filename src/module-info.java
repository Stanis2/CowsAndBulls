module CowsAndBulls {
    requires javafx.controls;
    requires javafx.fxml;
    exports tsi.stanislaw.cab to javafx.graphics, javafx.fxml;
    opens tsi.stanislaw.cab to javafx.fxml, javafx.base;
}