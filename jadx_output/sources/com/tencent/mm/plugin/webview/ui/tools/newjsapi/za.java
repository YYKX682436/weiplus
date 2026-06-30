package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class za extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.za f186712d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.za();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.ya yaVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ya(env);
        int i17 = ax4.f.f15127a;
        ax4.a.a(70);
        java.lang.String str = (java.lang.String) msg.f340790a.get("key_request_full_url_query");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = java.lang.String.format("&wx_header=1&pass_ticket=%s", str);
        }
        java.lang.String str2 = msg.f340790a.get("url") + str;
        java.lang.String str3 = (java.lang.String) msg.f340790a.get(ya.b.METHOD);
        if (str3 == null) {
            str3 = "GET";
        }
        java.lang.String str4 = str3;
        java.lang.String str5 = (java.lang.String) msg.f340790a.get("header");
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = (java.lang.String) msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        com.tencent.mars.xlog.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]url:%s", str2);
        java.lang.String str7 = (java.lang.String) msg.f340790a.get("key_request_header");
        if (str7 == null) {
            str7 = "";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str7);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str5);
                java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    hashMap.put(next2, jSONObject2.optString(next2));
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TmplWebViewJsAPi", "", e17);
        }
        dw4.a.a(new ax4.d(str4, str2, hashMap, str6, yaVar, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 331;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "request";
    }
}
