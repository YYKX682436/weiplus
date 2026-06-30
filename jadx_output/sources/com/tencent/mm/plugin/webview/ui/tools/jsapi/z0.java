package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes4.dex */
public final class z0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.z0 f185577d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.z0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("miniProgramAppId");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        boolean z17 = obj2 == null || obj2.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, "reportMiniProgramPageData:fail invalid appId", null);
        } else {
            km5.q g27 = ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).g2(obj2);
            nw4.n nVar = gVar instanceof nw4.n ? (nw4.n) gVar : null;
            java.lang.Object s17 = nVar != null ? nVar.s() : null;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = s17 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) s17 : null;
            if (mMFragmentActivity != null) {
                g27.f(mMFragmentActivity);
            }
            ((km5.q) g27.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.x0(env, msg))).s(new com.tencent.mm.plugin.webview.ui.tools.jsapi.y0(env, msg));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return nd1.f2.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reportMiniProgramPageData";
    }
}
