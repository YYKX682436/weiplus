package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class x1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.x1 f186649d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetFinderRedDot", "JsApiGetFinderRedDot");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Object obj = msg.f340790a.get("businessType");
            if (obj != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetFinderRedDot", "businessType :" + obj);
                jSONObject.put("businessType", obj);
            }
            java.lang.Object obj2 = msg.f340790a.get("redDotPath");
            if (obj2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetFinderRedDot", "redDotPath :" + obj2);
                jSONObject.put("redDotPath", obj2);
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
            java.lang.String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$GetFinderRedDotData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.v1.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.w1(env, msg));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetFinderRedDot", e17, "handleMsg exception", new java.lang.Object[0]);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getFinderRedDot";
    }
}
