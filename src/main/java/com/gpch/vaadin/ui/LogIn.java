package com.gpch.vaadin.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

public class LogIn extends FormLayout {

    public LogIn() {
        TextField email = new TextField();
        email.setLabel("Email");
        email.setPlaceholder("Email");

        PasswordField password = new PasswordField();
        password.setLabel("Password");
        password.setPlaceholder("Password");

        Button loginButton = new Button();
        loginButton.setText("Login");
        add(email, password, loginButton);


    }
}
