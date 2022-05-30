package com.example;

import com.ibm.mm.viewer.CMBDocument;
import com.ibm.mm.viewer.CMBStreamingDocServices;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleConverter {
    public static void main(final String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        final CMBStreamingDocServices docServices = new CMBStreamingDocServices(new ExampleCallback(), null);
        final Path pathToFile = Paths.get("FileName.mda");
        final InputStream inputStream = Files.newInputStream(pathToFile);
        final CMBDocument doc = docServices.loadDocument(inputStream, 1, "image/tiff", "application/vnd.ibm.modcap", null, null, null);
        final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Exported.tiff"));
        doc.write(bos);
        bos.close();
        inputStream.close();
    }
}
