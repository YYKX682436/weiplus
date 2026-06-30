package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class w6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.w6 f186605d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.w6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Object obj = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (obj != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView scene :" + obj);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, obj);
            }
            java.lang.Object obj2 = msg.f340790a.get("tipsWording");
            if (obj2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderCreateAcctView", "OpenFinderCreateAcctView tipsWording :" + obj2);
                jSONObject.put("tipsWording", obj2);
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
            java.lang.String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.t6.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.v6(env, msg));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderCreateAcctView", e17, "handleMsg exception", new java.lang.Object[0]);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 411;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderCreateAcctView";
    }
}
