package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class HttpClientUtil {
    public static org.apache.http.client.HttpClient createHttpClient() {
        org.apache.http.params.BasicHttpParams basicHttpParams = new org.apache.http.params.BasicHttpParams();
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        org.apache.http.params.HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        org.apache.http.params.HttpConnectionParams.setSocketBufferSize(basicHttpParams, 4096);
        org.apache.http.client.params.HttpClientParams.setRedirecting(basicHttpParams, false);
        return new org.apache.http.impl.client.DefaultHttpClient(basicHttpParams);
    }

    public static void setProxy(org.apache.http.client.HttpClient httpClient) {
        java.lang.String netStatus = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus();
        if (android.text.TextUtils.isEmpty(netStatus)) {
            return;
        }
        if (netStatus.equalsIgnoreCase("cmwap") || netStatus.equalsIgnoreCase("3gwap") || netStatus.equalsIgnoreCase("uniwap")) {
            httpClient.getParams().setParameter("http.route.default-proxy", new org.apache.http.HttpHost("10.0.0.172", 80));
        } else if (netStatus.equalsIgnoreCase("ctwap")) {
            httpClient.getParams().setParameter("http.route.default-proxy", new org.apache.http.HttpHost("10.0.0.200", 80));
        }
    }
}
