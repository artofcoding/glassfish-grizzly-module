package eu.artofcoding.test.grizzly;

import com.sun.grizzly.tcp.http11.GrizzlyAdapter;
import com.sun.grizzly.tcp.http11.GrizzlyRequest;
import com.sun.grizzly.tcp.http11.GrizzlyResponse;

import java.io.IOException;

public class HelloWorld extends GrizzlyAdapter {

    @Override
    public void service(GrizzlyRequest request, GrizzlyResponse response) throws Exception {
        try {
            response.getWriter().println("Hello!");
        } catch (IOException e) {
            throw e;
        }
    }

}
