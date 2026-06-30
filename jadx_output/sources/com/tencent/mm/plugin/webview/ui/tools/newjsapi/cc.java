package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class cc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.cc f186016d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.cc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        if (!(context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetBizCustomSharePanel", "setBizCustomSharePanel fail, webview ui is null");
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail, webview ui is null", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context;
        if (webViewUI.f183849q2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetBizCustomSharePanel", "setBizCustomSharePanel fail, menuHelper is null");
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail, menuHelper is null", null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetBizCustomSharePanel", "setBizCustomSharePanel");
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = webViewUI.f183849q2;
        java.util.Map map = msg.f340790a;
        com.tencent.mm.plugin.webview.ui.tools.x3 x3Var = c6Var.f184064u;
        synchronized (x3Var) {
            com.tencent.mars.xlog.Log.i(x3Var.f187644d, "updatePanelInfo");
            ((java.util.ArrayList) x3Var.f187648h).clear();
            ((java.util.LinkedHashMap) com.tencent.mm.plugin.webview.ui.tools.x3.M).clear();
            if (map == null) {
                x3Var.f187649i = false;
                x3Var.f187650j = null;
            } else {
                java.lang.Object obj = map.get("actions");
                java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                x3Var.L = str;
                x3Var.f187650j = x3Var.k(str);
                if (x3Var.i()) {
                    com.tencent.mars.xlog.Log.i(x3Var.f187644d, "update panel info while showing, try to show again");
                    x3Var.m(x3Var.f187645e, x3Var.f187642b, x3Var.f187643c);
                }
            }
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 345;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setBizCustomSharePanel";
    }
}
