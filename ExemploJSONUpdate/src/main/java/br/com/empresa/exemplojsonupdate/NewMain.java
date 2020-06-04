/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemplojsonupdate;

import java.util.Comparator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original ="{\"id\":1,\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"]}";
        
        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(original);
        
            JSONObject itemMes = new JSONObject();
            JSONArray meses = new JSONArray();
            meses.add("12");
            meses.add("24");
            itemMes.put("mesesAlternativo", meses);
            json.put("Valor",itemMes);
            System.out.println("JSON com mesesAlternativo (novo elemento) "+json.toJSONString());

            JSONArray mesesOriginal =  (JSONArray) json.get("meses");
            mesesOriginal.add("12");
            Comparator c;
            c=new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int v1,v2;
                    v1=Integer.valueOf(o1);
                    v2=Integer.valueOf(o2);
                    return  v1-v2;
                    //return  v1.compareTo(v2); //se usar strings
                }
            };
            mesesOriginal.sort(c);
            json.replace("meses",mesesOriginal);
            System.out.println("JSON com meses modificado  "+json.toJSONString());
        } catch (Exception e) {
        }
    }
    
}
