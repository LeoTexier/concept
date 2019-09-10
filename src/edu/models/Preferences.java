package edu.models;

import java.util.HashMap;
import java.util.Map;

public class Preferences {
	private Map<String, Object> prefs;
	
	@Override
	public String toString() {
		return "Preferences [prefs=" + prefs + "]";
	}

	public Preferences() {
		prefs=new HashMap<>();
	}
	
	public void setPref(String key,Object value) {
		
		 prefs.put(key, value);		
	}
	
	public Object getValue(String key) {
		
		return prefs.get(key);			
	}
	
	public boolean exists(String key) {
		
		return prefs.containsKey(key);		
	}
	public static Preferences getDefaut() {
		Preferences result = new Preferences();
		result.setPref("admin",true);
		result.setPref("bgColor","black");
		return result;
	}
	
}
