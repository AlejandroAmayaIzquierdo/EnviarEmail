package dad.Util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class MyEmail {
	
	public static Email simpleEmail(String smtp,int port,boolean ssl,
			String emailFrom,String pass,
			String emailTo,String subject,
			String msg) 
			throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName(smtp);
		email.setSmtpPort(port);
		email.setAuthenticator(new DefaultAuthenticator(emailFrom, pass));
		email.setSSLOnConnect(ssl);
		email.setFrom(emailFrom);
		email.setSubject(subject);
		email.setMsg(msg);
		email.addTo(emailTo);
		return email;
	}

}
