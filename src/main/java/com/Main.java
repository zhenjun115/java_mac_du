package com;

import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class Main
{
    public static void main( String[] args )
    {
        String userHome = System.getProperty( "user.name" );
        System.out.printf( "Hello Du: %n", userHome );
        try {
            for (FileStore store: FileSystems.getDefault().getFileStores()) {
                long total = store.getTotalSpace() / 1024;
                long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / 1024;
                long avail = store.getUsableSpace() / 1024;
                System.out.format("%-20s %12d %12d %12d%n", store, total, used, avail);
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        
    }
}
