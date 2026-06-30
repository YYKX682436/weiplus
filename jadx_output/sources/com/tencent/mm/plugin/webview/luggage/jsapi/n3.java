package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182404d;

    public n3(com.tencent.mm.plugin.webview.luggage.jsapi.o3 o3Var, sd.b bVar) {
        this.f182404d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.b bVar = this.f182404d;
        java.lang.String optString = bVar.f406597b.f344506c.optString("url");
        org.json.JSONObject optJSONObject = bVar.f406597b.f344506c.optJSONObject("header");
        java.lang.String optString2 = bVar.f406597b.f344506c.optString(ya.b.METHOD);
        java.lang.String optString3 = bVar.f406597b.f344506c.optString("body");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            try {
                jSONObject.put("errMsg", "url is null");
            } catch (org.json.JSONException unused) {
            }
            bVar.c("fail", jSONObject);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2) || !(optString2.equalsIgnoreCase("GET") || optString2.equalsIgnoreCase("POST"))) {
            try {
                jSONObject.put("errMsg", "method is valid");
            } catch (org.json.JSONException unused2) {
            }
            bVar.c("fail", jSONObject);
            return;
        }
        try {
            java.net.URL url = new java.net.URL(optString);
            java.lang.String a17 = com.tencent.xweb.d.g().a("." + url.getHost());
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(true);
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    httpURLConnection.addRequestProperty(next, optJSONObject.optString(next));
                }
            }
            httpURLConnection.addRequestProperty("user-agent", ((sd.a) bVar.f406596a).getRuntime().e());
            if (a17 != null) {
                httpURLConnection.addRequestProperty("cookie", a17);
            }
            if (optString2.equalsIgnoreCase("GET")) {
                httpURLConnection.setRequestMethod("GET");
            } else if (optString2.equalsIgnoreCase("POST")) {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), com.tencent.mapsdk.internal.rv.f51270c));
                bufferedWriter.write(optString3);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            java.lang.String responseMessage = httpURLConnection.getResponseMessage();
            if (responseCode != 200 && responseCode != 206) {
                jSONObject.put("responseMsg", responseMessage);
                bVar.c("fail", jSONObject);
                return;
            }
            java.lang.String contentEncoding = httpURLConnection.getContentEncoding();
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            java.io.InputStream bufferedInputStream = (contentEncoding == null || !contentEncoding.toLowerCase().contains("gzip")) ? new java.io.BufferedInputStream(inputStream) : new java.util.zip.GZIPInputStream(inputStream);
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(bufferedInputStream);
            char[] cArr = new char[4096];
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            while (true) {
                try {
                    try {
                        int read = inputStreamReader.read(cArr);
                        if (-1 == read) {
                            break;
                        } else {
                            stringWriter.write(cArr, 0, read);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequest", "convertStreamToString: read, %s", e17.getMessage());
                        jSONObject.put("errMsg", e17.getMessage());
                        bVar.c("fail", jSONObject);
                        com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
                        jSONObject.put("responseMsg", responseMessage);
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, stringWriter.toString());
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
                    com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
                    jSONObject.put("responseMsg", responseMessage);
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, stringWriter.toString());
                    bVar.e(jSONObject);
                    throw th6;
                }
            }
            com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
            com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
            jSONObject.put("responseMsg", responseMessage);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, stringWriter.toString());
            bVar.e(jSONObject);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequest", e18.getMessage());
            try {
                jSONObject.put("errMsg", e18.getMessage());
            } catch (org.json.JSONException unused3) {
            }
            bVar.c("fail", jSONObject);
        }
    }
}
