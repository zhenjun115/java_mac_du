package com;

public class Main
{
    public static void main( String[] args )
    {
        String userHome = System.getProperty( "user.name" );
        System.out.printf( "Hello Du: %n", userHome );
    }
}
