package ch.heigvd.res.io;

import java.util.HashMap;
import java.util.Map;

public class MyExpirementData implements IData{
		
	public MyExpirementData(String operation, String strategy, long blockSize, long fileSizeInBytes, long durationInMs ){
		map = new HashMap<String, Object>();
		map.put("operation", operation);
		map.put("strategy", strategy);
		map.put("blockSize", blockSize);
		map.put("fileSizeInBytes", fileSizeInBytes);
		map.put("durationInMs", durationInMs);
	}

	public String[] getKeys() {
		
		return new String[] {"operation", "strategy", "blockSize", "fileSizeInBytes", "durationInMs"};
	}

	public Object getValue(String key) {
		return map.get(key);
	}
	private Map<String, Object> map;
}
