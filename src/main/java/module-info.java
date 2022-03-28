module MavenProjetos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires java.persistence;
	requires org.hibernate.orm.core;
    opens MavenProjetos.VidracariaProjeto to javafx.fxml;
    exports MavenProjetos.VidracariaProjeto;
}