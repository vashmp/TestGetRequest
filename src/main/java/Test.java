import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Test {

    public static void main(String[] args) throws IOException {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            String url = "https://speller.yandex.net/services/spellservice/checkText?text=Совпадение+интересное+слово+но+мало+кто+представляет+истенное+падение+сов";
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse resp1 = httpClient.execute(httpGet);
            String sResp = EntityUtils.toString(resp1.getEntity());
            System.out.println(sResp);
            resp1.close();

    }
}
