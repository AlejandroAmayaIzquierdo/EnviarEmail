package dad.email;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty nombreServidor = new SimpleStringProperty();
	private IntegerProperty puertoServidor = new SimpleIntegerProperty();
	private BooleanProperty ssl = new SimpleBooleanProperty();
	private StringProperty remitenteEmail = new SimpleStringProperty();
	private StringProperty remitentePassword = new SimpleStringProperty();
	private StringProperty destinatarioEmail = new SimpleStringProperty();
	private StringProperty asunto = new SimpleStringProperty();
	private StringProperty mensaje = new SimpleStringProperty();
	public final StringProperty nombreServidorProperty() {
		return this.nombreServidor;
	}
	
	public final String getNombreServidor() {
		return this.nombreServidorProperty().get();
	}
	
	public final void setNombreServidor(final String nombreServidor) {
		this.nombreServidorProperty().set(nombreServidor);
	}
	
	public final IntegerProperty puertoServidorProperty() {
		return this.puertoServidor;
	}
	
	public final int getPuertoServidor() {
		return this.puertoServidorProperty().get();
	}
	
	public final void setPuertoServidor(final int puertoServidor) {
		this.puertoServidorProperty().set(puertoServidor);
	}
	
	public final BooleanProperty sslProperty() {
		return this.ssl;
	}
	
	public final boolean isSsl() {
		return this.sslProperty().get();
	}
	
	public final void setSsl(final boolean ssl) {
		this.sslProperty().set(ssl);
	}
	
	public final StringProperty remitenteEmailProperty() {
		return this.remitenteEmail;
	}
	
	public final String getRemitenteEmail() {
		return this.remitenteEmailProperty().get();
	}
	
	public final void setRemitenteEmail(final String remitenteEmail) {
		this.remitenteEmailProperty().set(remitenteEmail);
	}
	
	public final StringProperty remitentePasswordProperty() {
		return this.remitentePassword;
	}
	
	public final String getRemitentePassword() {
		return this.remitentePasswordProperty().get();
	}
	
	public final void setRemitentePassword(final String remitentePassword) {
		this.remitentePasswordProperty().set(remitentePassword);
	}
	
	public final StringProperty destinatarioEmailProperty() {
		return this.destinatarioEmail;
	}
	
	public final String getDestinatarioEmail() {
		return this.destinatarioEmailProperty().get();
	}
	
	public final void setDestinatarioEmail(final String destinatarioEmail) {
		this.destinatarioEmailProperty().set(destinatarioEmail);
	}
	
	public final StringProperty asuntoProperty() {
		return this.asunto;
	}
	
	public final String getAsunto() {
		return this.asuntoProperty().get();
	}
	
	public final void setAsunto(final String asunto) {
		this.asuntoProperty().set(asunto);
	}
	
	public final StringProperty mensajeProperty() {
		return this.mensaje;
	}
	
	public final String getMensaje() {
		return this.mensajeProperty().get();
	}
	
	public final void setMensaje(final String mensaje) {
		this.mensajeProperty().set(mensaje);
	}
	
	

}
