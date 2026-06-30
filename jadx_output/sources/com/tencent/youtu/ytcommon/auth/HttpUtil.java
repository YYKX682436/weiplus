package com.tencent.youtu.ytcommon.auth;

/* loaded from: classes7.dex */
public class HttpUtil {
    private static final java.lang.String CHARSET_UTF8 = "UTF-8";
    private static final int DEFAULT_TIMEOUT_MILLIS = 10000;

    /* loaded from: classes7.dex */
    public interface HttpResponseListener {
        void onFail(int i17);

        void onSuccess(java.lang.String str);
    }

    private static java.net.HttpURLConnection buildConnection(java.lang.String str, int i17) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setConnectTimeout(i17);
        httpURLConnection.setReadTimeout(i17);
        return httpURLConnection;
    }

    private static java.lang.String getResponse(java.net.HttpURLConnection httpURLConnection, com.tencent.youtu.ytcommon.auth.HttpUtil.HttpResponseListener httpResponseListener) {
        int responseCode;
        try {
            responseCode = httpURLConnection.getResponseCode();
        } catch (java.lang.Exception unused) {
        }
        if (responseCode != 200) {
            if (httpResponseListener != null) {
                httpResponseListener.onFail(responseCode);
            }
            return null;
        }
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            sb6.append(new java.lang.String(bArr, 0, read));
        }
        inputStream.close();
        java.lang.String sb7 = sb6.toString();
        if (httpResponseListener != null) {
            httpResponseListener.onSuccess(sb7);
        }
        return sb7;
    }

    public static java.lang.String post(java.lang.String str, java.lang.String str2, com.tencent.youtu.ytcommon.auth.HttpUtil.HttpResponseListener httpResponseListener) {
        java.net.HttpURLConnection buildConnection = buildConnection(str, 10000);
        buildConnection.setRequestProperty("Content-Type", "application/json");
        buildConnection.setRequestMethod("POST");
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.io.OutputStream outputStream = buildConnection.getOutputStream();
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
        }
        return getResponse(buildConnection, httpResponseListener);
    }
}
