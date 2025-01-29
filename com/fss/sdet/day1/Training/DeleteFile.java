package com.fss.sdet;

import java.io.File;

public class DeleteFile {

public static void main(String[] args) {
    File f=new File("./write.txt");
    f.deleteOnExit();

}
}
