/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.*;
 
              //   JSONArray array=(JSONArray)obj;
                // JSONObject jo=(JSONObject) array.get(0);
              //  System.out.println(jo.get("id_usuario"));

/**
 *
 * @author Jeyson
 */
public class ClientRestful {
    public ClientRestful() {
   }
              
   public JSONArray Get(String get,String json){
         String str="";
         JSONArray array=null;
       try {


		URL url = new URL("https://taapp-kuan.c9.io/"+get);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		String input = json;

		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
              
		while ((output = br.readLine()) != null) {
			//System.out.println(output);
                        str+=output;
		}

		conn.disconnect();
              Object obj=JSONValue.parse(str);
               array=(JSONArray)obj;
	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }
   return array;
   }
}
