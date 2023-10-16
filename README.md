# Java-Mail-Api
The <strong>JavaMail</strong> is an API that is used to compose, write and read electronic messages (emails).<br><br>
The JavaMail API provides protocol-independent and plateform-independent framework for sending and receiving mails.<br><br>
The <strong>javax.mail</strong> and <strong>javax.mail.activation</strong> packages contains the core classes of JavaMail API.<br>
The JavaMail facility can be applied to many events. It can be used at the time of registering the user (sending notification such as thanks for your interest to my site), forgot password (sending password to the users email id), sending notifications for important updates etc. So there can be various usage of java mail api.<br><br>
<h3>Protocols used in JavaMail API</h3>
There are some protocols that are used in JavaMail API.<br>
<ul>
  <li>SMTP</li>
  <li>POP</li>
  <li>IMAP</li>
  <li>MIME</li>
  <li>NNTP and others</li>
</ul>
<h3>JavaMail Architecture</h3>
The java application uses JavaMail API to compose, send and receive emails. The JavaMail API uses SPI (Service Provider Interfaces) that provides the intermediatory services to the java application to deal with the different protocols. Let's understand it with the figure given below:<br>

![Javamail1](https://github.com/MuhammadHanan39/Java-Mail-Api/assets/107320155/3f001259-c3a8-4939-ba49-8500906934c2)




