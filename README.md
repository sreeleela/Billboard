# Billboard

Login into Billboard, password: sp2017.<br>
User can load content, clear or writecontent and save.<br>

# Instruction to run this project
Make sure you have ant and gwt installed in eclipse.<br>
Import project into eclipse.<br>
Right click on project -> run as -> GWT Development Mode with Jetty<br>
Double click on the link, http://127.0.0.1:8888/Billboard.html <br>
<br>
If error occurs (in windows), open cmd (command prompt)<br>
>netstat -ano|findstr ":9876"<br>
you get [PID] here<br>
>taskkill /f /im [PID]<br>
