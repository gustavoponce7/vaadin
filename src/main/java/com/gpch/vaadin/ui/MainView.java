package com.gpch.vaadin.ui;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private final LogIn logIn;

    public MainView() {
        logIn = new LogIn();
        add(logIn);
    }
}
