package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.t2 f179070d;

    public s2(com.tencent.mm.plugin.wallet.pwd.ui.t2 t2Var) {
        this.f179070d = t2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        byte[] a17;
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + java.io.File.separator + android.os.Environment.DIRECTORY_DOWNLOADS + "/.tmfs/sk_k_g.dat");
        java.lang.String str = "";
        java.lang.String str2 = (!file.exists() || (a17 = gs4.y.a(file.getAbsolutePath())) == null || a17.length <= 0) ? "" : new java.lang.String(a17);
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.lang.String str3 = null;
            try {
                java.lang.String b17 = gs4.y.b();
                if (android.text.TextUtils.isEmpty(b17)) {
                    b17 = gs4.y.c();
                }
                if (android.text.TextUtils.isEmpty(b17)) {
                    str = b17;
                } else {
                    try {
                        bArr = android.util.Base64.decode(b17.getBytes(), 0);
                    } catch (java.lang.Exception unused) {
                        bArr = null;
                    }
                    str = new java.lang.String(gs4.x.a(bArr, null), "gbk");
                }
            } catch (java.lang.Throwable unused2) {
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("guid", str);
                    jSONObject2.put("secretId", str2);
                    jSONObject.put("req", jSONObject2);
                } catch (org.json.JSONException unused3) {
                }
                java.lang.String jSONObject3 = jSONObject.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.SgLiveChecker", "url: https://jprx.m.qq.com/data/2241/forward request: " + jSONObject3);
                try {
                    javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL("https://jprx.m.qq.com/data/2241/forward").openConnection();
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setRequestProperty("User-Agent", "QQPimSecure");
                    httpsURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpsURLConnection.setRequestMethod("POST");
                    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(httpsURLConnection.getOutputStream(), com.tencent.mapsdk.internal.rv.f51270c));
                    bufferedWriter.write(jSONObject3);
                    bufferedWriter.close();
                    int responseCode = httpsURLConnection.getResponseCode();
                    com.tencent.mars.xlog.Log.i("http_test", "responseCode: " + responseCode);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    if (responseCode == 200) {
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpsURLConnection.getInputStream()));
                        while (true) {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb6.append(readLine);
                            sb6.append("\n");
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SgLiveChecker", "result: " + sb6.toString());
                    str3 = sb6.toString();
                } catch (java.net.MalformedURLException | java.net.ProtocolException | java.io.IOException unused4) {
                }
                try {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject(str3);
                    if (jSONObject4.getInt("ret") == 0) {
                        if (jSONObject4.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).getJSONObject("resp").getInt("status") == 1) {
                            z17 = true;
                        }
                    }
                } catch (java.lang.Exception unused5) {
                }
            }
        }
        this.f179070d.f179081i.runOnUiThread(new com.tencent.mm.plugin.wallet.pwd.ui.r2(this, z17));
    }
}
