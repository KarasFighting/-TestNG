package Test;
/*package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.alibaba.fastjson.JSONObject;

//��ȡ����ִ�нӿ�
public class HttpUtils {
	
	//ҳ��ץȡ��Ϣ
	public static CloseableHttpClient httpclient =null;
	
	public static void OpenHttpClient() {
		//�������
		httpclient = HttpClients.createDefault();
		
	}
	
	public void CloseHttpClient() {
		//�ر������
		try {
			httpclient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		httpclient=null;
	}
	
	 public static JSONObject visitUrl(String url){
	        //CloseableHttpClient httpclient = HttpClients.createDefault();
	        
	        HttpGet httpGet = new HttpGet(url);
//	        HttpPost httpPost = new HttpPost(url);
	        JSONObject jsonObj=null;
	        try {
	            CloseableHttpResponse response = httpclient.execute(httpGet);
	            HttpEntity entity = response.getEntity();
	            
	            StringBuilder jsonStr = new StringBuilder();
	            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"), 8 * 1024);
	            String line = null;
	            
	            while ((line = bufferedReader.readLine()) != null) {
	                jsonStr.append(line + "/n");
	            }
	            EntityUtils.consume(entity);
	            //��ȡJSON�����ֵ
	            jsonObj = new JSONObject();
	           // jsonObj = jsonStr.toString();
	            response.close();


	        } catch (ClientProtocolException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();

	        }

	        
	        return jsonObj;
	    }

}

*/

//���Է���feedback@yiibai.com
public class RandomEmailGenerator {

    public String generate() {
        return "feedback@yiibai.com";
    }

}







