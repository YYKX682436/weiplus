package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class s7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (!jSONObject.has("url")) {
            this.f143443f.a("url is required");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Intent intent = new android.content.Intent();
        try {
            java.lang.String string = jSONObject.getString("url");
            if (!string.startsWith("http")) {
                sb6.append("http://");
            }
            sb6.append(string);
            int i17 = jSONObject.has("customizeStatusBarColor") ? jSONObject.getInt("customizeStatusBarColor") : 0;
            java.lang.String string2 = jSONObject.has("statusBarStyle") ? jSONObject.getString("statusBarStyle") : null;
            boolean z18 = jSONObject.has("appendDeviceInfo") ? jSONObject.getBoolean("appendDeviceInfo") : true;
            intent.putExtra("nextAnimIn", ra3.h0.a(jSONObject));
            intent.putExtra("currentAnimOut", ra3.h0.b(jSONObject));
            if (z18) {
                if (sb6.toString().contains("?")) {
                    sb6.append("&");
                } else {
                    sb6.append("?");
                }
                try {
                    sb6.append("deviceName=");
                    sb6.append(fp.s0.b(o45.wf.f343026d, com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.lang.Exception unused) {
                }
                sb6.append("&imei=");
                try {
                    sb6.append("&deviceBrand=");
                    sb6.append(fp.s0.b(android.os.Build.BRAND, com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.lang.Exception unused2) {
                }
                try {
                    sb6.append("&deviceModel=");
                    sb6.append(fp.s0.b(wo.w0.m(), com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.lang.Exception unused3) {
                }
                sb6.append("&from=");
                sb6.append("liteApp#" + str);
                sb6.append("&version=");
                sb6.append(o45.wf.f343029g);
                try {
                    sb6.append("&lang=");
                    sb6.append(fp.s0.b(com.tencent.mm.sdk.platformtools.m2.d(), com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.lang.Exception unused4) {
                }
                try {
                    sb6.append("&ostype=");
                    sb6.append(fp.s0.b(wo.q.f447784e, com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.lang.Exception unused5) {
                }
                sb6.append("&timeZone=");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.k0());
            }
            intent.putExtra("rawUrl", sb6.toString());
            intent.putExtra("convertActivityFromTranslucent", false);
            intent.putExtra("customize_status_bar_color", i17);
            intent.putExtra("status_bar_style", string2);
            intent.putExtra("prePublishId", "liteApp#1#1");
            intent.putExtra("KPublisherId", "liteApp#1#1");
            intent.addFlags(268435456);
            intent.putExtra("shouldCheckLimitedMode", java.lang.Boolean.valueOf(jSONObject.optBoolean("shouldCheckLimitedMode", true)));
            j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent, null);
            this.f143442e.d();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiStartWebview", e17, "parse json", new java.lang.Object[0]);
            this.f143443f.a("exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
