module nodomain.a2p1k02.register_system_v2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens nodomain.a2p1k02.register_system_v2 to javafx.fxml;
    exports nodomain.a2p1k02.register_system_v2;
}