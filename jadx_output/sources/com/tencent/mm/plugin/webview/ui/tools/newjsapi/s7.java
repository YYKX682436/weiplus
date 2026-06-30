package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.s7 f186520d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderPostView", "openFinderPostView");
        java.lang.String str = (java.lang.String) msg.f340790a.get("jumpInfo");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("postInfo");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) msg.f340790a.get("callBackKey");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) msg.f340790a.get("optionalInfo");
        java.lang.String str5 = str4 != null ? str4 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("jumpInfo", new org.json.JSONObject(str));
        } catch (java.lang.Throwable unused) {
        }
        try {
            jSONObject.put("postInfo", new org.json.JSONObject(str2));
        } catch (java.lang.Throwable unused2) {
        }
        try {
            jSONObject.put("callBackKey", str3);
        } catch (java.lang.Throwable unused3) {
        }
        try {
            jSONObject.put("optionalInfo", new org.json.JSONObject(str5));
        } catch (java.lang.Throwable unused4) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderPostView", "openFinderPostView jumpInfo: " + ((java.lang.String) msg.f340790a.get("jumpInfo")) + ", postInfo: " + ((java.lang.String) msg.f340790a.get("postInfo")));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFinderPostView json: ");
        sb6.append(jSONObject);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderPostView", sb6.toString());
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.ipcinvoker.extension.l.a(str6, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderPostView$OpenFinderViewTaskData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.p7.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r7(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderPostView";
    }
}
