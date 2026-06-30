package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class u0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.u0 f185424d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.u0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.websearch.l2.f(msg.f340790a, "type"), "game")) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.f88828s);
        } else {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.f88828s);
        }
        env.f340863d.e(msg.f341013c, "preloadMiniProgramEnv:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 302;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "preloadMiniProgramEnv";
    }
}
