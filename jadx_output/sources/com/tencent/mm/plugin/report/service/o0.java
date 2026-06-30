package com.tencent.mm.plugin.report.service;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f158293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f158295f;

    public o0(com.tencent.mm.plugin.report.service.g0 g0Var, java.util.concurrent.Callable callable, java.lang.String str, long j17) {
        this.f158293d = callable;
        this.f158294e = str;
        this.f158295f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        java.io.InputStream inputStream = null;
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) {
            i17 = gm0.j1.b().h();
            str = gm0.j1.u().c() == null ? null : c01.z1.r();
        } else {
            str = null;
            i17 = 0;
        }
        try {
            try {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
                org.json.JSONArray jSONArray = (org.json.JSONArray) this.f158293d.call();
                int length = jSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    jSONObject.put("tag", this.f158294e);
                    jSONObject.put("uin", i17);
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject put = new org.json.JSONObject().put("protocol_ver", 1).put("phone", o45.wf.f343026d).put("os_ver", wo.q.f447780a).put("report_time", this.f158295f);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193109e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                byte[] bytes = jSONObject2.put("head", put.put("revision", str2)).put("items", jSONArray).toString().getBytes();
                int length2 = bytes.length;
                java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(length2)).getBytes()).toLowerCase();
                byte[] a17 = kk.y.a(bytes);
                com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
                kk.d.b(pByteArray, a17, lowerCase.getBytes());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
                sb6.append("https://");
                sb6.append(string);
                sb6.append("/cgi-bin/mmsupport-bin/stackreport");
                sb6.append("?version=");
                sb6.append(java.lang.Integer.toHexString(o45.wf.f343029g));
                sb6.append("&devicetype=");
                sb6.append(wo.q.f447780a);
                sb6.append("&filelength=");
                sb6.append(length2);
                sb6.append("&sum=");
                sb6.append(lowerCase);
                sb6.append("&reporttype=1&NewReportType=110");
                if (str != null && str.length() != 0) {
                    sb6.append("&username=");
                    sb6.append(str);
                }
                java.lang.String sb7 = sb6.toString();
                org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
                org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(sb7);
                org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(pByteArray.value);
                byteArrayEntity.setContentType("binary/octet-stream");
                httpPost.setEntity(byteArrayEntity);
                inputStream = defaultHttpClient.execute(httpPost).getEntity().getContent();
                com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "POST returned: " + com.tencent.mm.sdk.platformtools.t8.e(inputStream));
                if (inputStream == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReportManagerKvCheck", e17, "Failed to upload cLog.", new java.lang.Object[0]);
                if (inputStream == null) {
                    return;
                }
            }
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th6;
        }
    }
}
