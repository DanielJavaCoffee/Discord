package MavenProjetos.VidracariaProjeto;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.PessoaDao;
import dominio.Pessoa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
	private static Stage stage;

	@Override
	public void start(@SuppressWarnings("exports") Stage s) throws IOException {
		stage = s;
		setRoot("primary", "");
		 

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Tela/TelaDeEntrada.fxml"));
			Parent parent = fxmlLoader.load();
			
			Pessoa pessoa = new Pessoa(null, "Daniel", "Suerda");
			PessoaDao pessoaDao = new PessoaDao();
			pessoaDao.adicionarPessoa(pessoa);

			Scene scene = new Scene(parent);
			s.setScene(scene);
			s.setResizable(false);
			s.show();

		} catch (RuntimeException e) {

		}

	}

	static void setRoot(String fxml) throws IOException {
		setRoot(fxml, stage.getTitle());
	}

	static void setRoot(String fxml, String title) throws IOException {
		Scene scene = new Scene(loadFXML(fxml));
		stage.setTitle(title);
		stage.setScene(scene);
		stage.show();
	}

	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/" + fxml + ".fxml"));
		return fxmlLoader.load();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
