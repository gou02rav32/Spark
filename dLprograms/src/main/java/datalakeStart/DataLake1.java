package datalakeStart;

import java.io.IOException;

import com.microsoft.azure.datalake.store.ADLException;
import com.microsoft.azure.datalake.store.ADLStoreClient;
import com.microsoft.azure.datalake.store.DirectoryEntry;
import com.microsoft.azure.datalake.store.IfExists;
import com.microsoft.azure.datalake.store.oauth2.AccessTokenProvider;
import com.microsoft.azure.datalake.store.oauth2.DeviceCodeTokenProvider;

public class DataLake1 {
	private static String nativeAppId = "http://localhostText-example/nativeapp";
	
	public static void endUser() {
		System.out.println("End user starting ");
		try {
			AccessTokenProvider provider = new DeviceCodeTokenProvider(nativeAppId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	public static void main(String[] args) {
		endUser();
	}
	
}
