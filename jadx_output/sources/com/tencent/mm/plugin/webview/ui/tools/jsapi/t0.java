package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public final class t0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.t0 f185409d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.t0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, dm.i4.COL_USERNAME);
        java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, "appId");
        java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        int e17 = com.tencent.mm.plugin.websearch.l2.e(msg.f340790a, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        if (f17 == null || f17.length() == 0) {
            if (f18 == null || f18.length() == 0) {
                env.f340863d.e(msg.f341013c, "predownloadMiniProgramPackage:fail invalid data", null);
                return true;
            }
        }
        com.tencent.mm.plugin.appbrand.service.q6 q6Var = new com.tencent.mm.plugin.appbrand.service.q6();
        q6Var.f88751a = f17;
        q6Var.f88752b = f18;
        q6Var.f88754d = f19;
        q6Var.f88755e = null;
        q6Var.f88753c = e17;
        q6Var.f88756f = new com.tencent.mm.plugin.webview.ui.tools.jsapi.s0(f18, e17, env, msg, q6Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreDownloadMiniProgramPackage", "triggerPreDownloadForRequest with appId:" + f18 + ", username:" + f17 + ", path:" + f19 + ", scene:" + e17);
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).a4(q6Var);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.eb.NAME;
    }
}
