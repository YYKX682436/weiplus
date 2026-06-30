package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class w7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.w7 f186606d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.w7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderSearchView", "openFinderSearchView");
        java.lang.String str = (java.lang.String) msg.f340790a.get("allSearchWord");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("selectIndex");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) msg.f340790a.get("reportInfo");
        java.lang.String str5 = str4 != null ? str4 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("allSearchWord", new org.json.JSONArray(str));
            jSONObject.put("selectIndex", str2);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str3);
            jSONObject.put("reportInfo", str5);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderSearchView", "openFinderPostView json: " + jSONObject);
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.ipcinvoker.extension.l.a(str6, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderSearchView$OpenFinderSearchViewTaskData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.t7.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.v7(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodSetNgStrength;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderSearchView";
    }
}
