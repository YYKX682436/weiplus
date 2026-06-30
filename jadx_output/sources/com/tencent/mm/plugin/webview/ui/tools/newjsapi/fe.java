package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class fe extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.fe f186095d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.fe();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("mask");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        java.lang.Object obj2 = msg.f340790a.get("business");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        nw4.g gVar = env.f340863d;
        if (str == null) {
            gVar.e(msg.f341013c, "SimAuth:fail key[business] is null", null);
            return true;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (D1 == 1) {
            h0Var.f310123d = js.d1.f301423d;
        } else {
            if (D1 != 2) {
                gVar.e(msg.f341013c, "SimAuth:fail key[mask] must be mask(1) or pure(2)", null);
                return true;
            }
            h0Var.f310123d = js.d1.f301424e;
        }
        kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ee(env, h0Var, str, msg, null), 2, null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "SimAuth";
    }
}
