package datalakeStart;

import com.microsoft.azure.datalake.store.ADLException;
import com.microsoft.azure.datalake.store.ADLStoreClient;
import com.microsoft.azure.datalake.store.DirectoryEntry;
import com.microsoft.azure.datalake.store.IfExists;
import com.microsoft.azure.datalake.store.oauth2.AccessTokenProvider;
import com.microsoft.azure.datalake.store.oauth2.ClientCredsTokenProvider;

public class ServiceToService {
	private static String clientId = "2c92f1fd-a8eb-4dce-86f3-2e2cd8393a7f";
	 private static String authTokenEndpoint = "https://login.microsoftonline.com/cac8ed95-253c-4ea2-9f59-0f809f87957a/oauth2/token";
	 private static String clientKey = "FILL-IN-HERE";
	 
	public static void service2Service(){
		 AccessTokenProvider provider = new ClientCredsTokenProvider(authTokenEndpoint, clientId, clientKey);
	}
}
