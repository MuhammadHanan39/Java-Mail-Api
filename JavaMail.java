
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class JavaMail {

    public static void main(String[] args) {

        Properties properties=new Properties();
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.port",587);


        //username and password
        String username="hannanshaikh150";
        String password="";
        //Setting up the session
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });


        //After setting session Now create a Message

        String to="hannanshaikh150@gmail.com";
        String from="moizs3700@gmail.com";
        String subject="Sending email using Jakarta email api";
        String text="Hello I am using the jakarta email api service to send the email.";
try{


        Message msg=new MimeMessage(session);

        msg.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
        msg.setFrom(new InternetAddress(from));
        msg.setSubject(subject);
        msg.setText(text);

        //Sending email
        Transport.send(msg);



}catch (Exception e){
    e.printStackTrace();
}








    }


}
