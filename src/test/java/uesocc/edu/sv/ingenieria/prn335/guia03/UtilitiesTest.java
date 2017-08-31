
   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Luis
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {

    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class).addClass(Utilities.class).addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }

    @Inject
    private Utilities utilities;

    @Test
    public void probarMetodogetResume() {
        String fraseEsperada = "Bienvenidos a la mat";
        String fraseCompleta = "Bienvenidos a la materia de programacion 3 ";
        String resultado = utilities.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    @Test
    public void probarMetodogetResume1() {
        String fraseEsperada = "Hola Mundo!";
        String fraseCompleta = "Hola Mundo!";
        String resultado = utilities.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);
    }
     @Test
    public void probarMetodogetResume2() {
        String fraseEsperada = null;
        String fraseCompleta = null;
        String resultado = utilities.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    
    
    
    @Test
    public void probarMetodoCapitalizar() {
        String fraseEsperada2 = "Pruebas De Unidad Con Junit & Arquillian";
        String texto="prueBas De UNIDAD con JUnit & arQuillian";
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
    @Test
    public void probarMetodoCapitalizar1() {
        String fraseEsperada2 = "";
        String texto="";
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
     @Test
    public void probarMetodoCapitalizar2() {
        String fraseEsperada2 = null;
        String texto=null;
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
    
       @Test
    public void probarMetodoContar() {
        int fraseEsperada= 1;
        String frase="2017";
        String texto = "Bienvenidos a la materia de programacion 3 ciclo II 2017 ";
        int resultado = utilities.contarCoincidencias(frase, texto);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    @Test
    public void probarMetodoContar1() {
        int fraseEsperada= 2;
        String frase="MA";
        String texto = "Bienvenidos a la materia de programacion 3 ciclo II 2017 ";
        int resultado = utilities.contarCoincidencias(frase, texto);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    @Test
   public void probarMetodoContar2() {
        int fraseEsperada= 0;
        String frase="bienvenido";
        String texto = null;
        int resultado = utilities.contarCoincidencias(frase ,texto);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    

}


  