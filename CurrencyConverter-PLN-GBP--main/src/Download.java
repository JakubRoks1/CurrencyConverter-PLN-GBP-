import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Download implements Runnable {
    String link;
    File out;

    public Download(String link, File out) {
        this.link = link;
        this.out = out;
    }

    @Override
    public void run() {

    }
}

