package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class y extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.y f186669d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearFinderRedDot", "cleanFinderRedDot");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Object obj = msg.f340790a.get("businessType");
            if (obj != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearFinderRedDot", "businessType :" + obj);
                jSONObject.put("businessType", obj);
            }
            java.lang.Object obj2 = msg.f340790a.get("redDotPath");
            if (obj2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearFinderRedDot", "redDotPath :" + obj2);
                jSONObject.put("redDotPath", obj2);
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
            java.lang.String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiClearFinderRedDot$ClearFinderRedDotData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.w.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x(env, msg));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiClearFinderRedDot", e17, "handleMsg exception", new java.lang.Object[0]);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOff;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "cleanFinderRedDot";
    }
}
