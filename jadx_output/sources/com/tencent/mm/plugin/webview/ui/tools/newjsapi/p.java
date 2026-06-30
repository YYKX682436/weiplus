package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class p extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.p f186418d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.p();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallFinderJsHandler", "callFinderJsHandler");
        java.lang.Object obj = msg.f340790a.get("businessType");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f340790a.get("finderJumpId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj3 = msg.f340790a.get("commentScene");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.Object obj4 = msg.f340790a.get("status");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str5 = str4 != null ? str4 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("businessType", str);
            jSONObject.put("finderJumpId", str2);
            jSONObject.put("commentScene", str3);
            jSONObject.put("status", str5);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallFinderJsHandler", "callFinderJsHandler json: " + jSONObject);
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.ipcinvoker.extension.l.a(str6, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.m.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 480;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "callFinderJsHandler";
    }
}
