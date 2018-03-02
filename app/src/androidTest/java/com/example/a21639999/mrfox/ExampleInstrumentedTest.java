package com.example.a21639999.mrfox;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    private Button entrar;
    private EditText nombre;
    private EditText contrasenia;
    private LoginActivity actividad;

    public ExampleInstrumentedTest() {
        super(LoginActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        entrar = actividad.findViewById(R.id.button);
        nombre = actividad.findViewById(R.id.nombreLogin);
        contrasenia = actividad.findViewById(R.id.contraseniaLogin);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static final String USERNAME = "Juan Raul";
    private static final String PASSWORD = "123456";

    public void testLoginSignup() {
        TouchUtils.tapView(this, nombre);
        getInstrumentation().sendStringSync(USERNAME);

        TouchUtils.tapView(this, contrasenia);
        getInstrumentation().sendStringSync(PASSWORD);

        TouchUtils.clickView(this, entrar);

    }


}