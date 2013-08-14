package com.sandune;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main( String[] args )
    {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext( "Beans.xml" );

        HelloWorld obj = ( HelloWorld ) context.getBean( "helloWorld" );
        HelloIndia objIndia = ( HelloIndia ) context.getBean( "helloIndia" );
        obj.getMessage1();
        obj.getMessage2();

        objIndia.setMessage1( "object 1" );
        objIndia.setMessage2( "object 1" );
        objIndia.setMessage3( "object 1" );

        objIndia.getMessage1();
        objIndia.getMessage2();
        objIndia.getMessage3();

        HelloIndia objIndia2 = ( HelloIndia ) context.getBean( "helloIndia" );
        objIndia2.getMessage1();
        objIndia2.getMessage2();
        objIndia2.getMessage3();

        // Getting the variable/property values from the bean template in XML
        NuGen nuGen = ( NuGen ) context.getBean( "nuGen" );
        nuGen.getText1();
        nuGen.getText2();
        nuGen.getText3();

        context.registerShutdownHook();
        context.close();

    }
}
