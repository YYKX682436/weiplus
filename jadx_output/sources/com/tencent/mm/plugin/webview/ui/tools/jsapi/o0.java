package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class o0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.o0 f185298d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.o0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.appbrand.service.r5 r5Var = (com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class);
        nw4.g gVar = env.f340863d;
        if (r5Var != null) {
            r5Var.oh(gVar.d(), msg.f341014d.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), msg.f341014d.opt("arg"));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.JsApiInvokeMiniProgramAPI", "invoke but get NULL IAppBrandServiceForWebView");
        }
        gVar.e(msg.f341013c, "invokeMiniProgramAPI:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.audio.k1.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return pf1.f.NAME;
    }
}
