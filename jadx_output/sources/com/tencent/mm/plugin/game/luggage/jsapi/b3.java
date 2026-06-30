package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class b3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139600e = "JsApiOpenWebOnPC";

    @Override // sd.c
    public java.lang.String b() {
        return "openWebOnPC";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        java.lang.String str2 = this.f139600e;
        com.tencent.mars.xlog.Log.i(str2, "handleMsg!");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            if (q5Var != null) {
                q5Var.a("openWebOnPC:fail. empty params", null);
                return;
            }
            return;
        }
        java.lang.String optString = e17.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        java.lang.String optString2 = e17.optString("url", "");
        kotlin.jvm.internal.o.d(optString2);
        if (optString2.length() == 0) {
            if (q5Var != null) {
                q5Var.a("openWebOnPC:fail. url is nil or empty!", null);
                return;
            }
            return;
        }
        if (!((d73.i) i95.n0.c(d73.i.class)).Qg()) {
            if (q5Var != null) {
                q5Var.a("openWebOnPCfail. canSendOpenCommand return fail!", null);
                return;
            }
            return;
        }
        if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.g9.f186117d.e()) {
            if (q5Var != null) {
                q5Var.a("openWebOnPC:fail. call too frequently!", null);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            optString = optString2;
        }
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = new com.tencent.mm.plugin.handoff.model.HandOffURL(optString, optString2, "", 0, null, null, null, null, 248, null);
        com.tencent.mars.xlog.Log.i(str2, "openUrlOnPc Success(send success) url:" + optString2 + ", title:" + optString);
        ((d73.i) i95.n0.c(d73.i.class)).f6(handOffURL);
        if (q5Var != null) {
            q5Var.a(null, null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
