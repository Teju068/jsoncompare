package mockdata;

import com.google.common.io.Resources;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class MockData {

    public static String getJSONData(String fileName) throws IOException {
        InputStream inputStream = Resources.getResource(fileName).openStream();
        String json = IOUtils.toString(inputStream);
        return json;
    }

}
