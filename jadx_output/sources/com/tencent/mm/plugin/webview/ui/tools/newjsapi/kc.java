package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class kc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.kc f186323d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.kc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String obj;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        zg0.q2 a17 = env.a();
        java.lang.String str = null;
        com.tencent.mm.plugin.webview.core.e3 e3Var = a17 instanceof com.tencent.mm.plugin.webview.core.e3 ? (com.tencent.mm.plugin.webview.core.e3) a17 : null;
        nw4.g gVar = env.f340863d;
        if (e3Var == null) {
            e(msg, gVar, "fail_invalid_state");
        } else {
            java.lang.Object obj2 = msg.f340790a.get("visualEffect");
            if (obj2 != null && (obj = obj2.toString()) != null) {
                str = r26.n0.u0(obj).toString();
            }
            if (str == null || str.length() == 0) {
                str = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
            }
            if (kotlin.jvm.internal.o.b(str, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
                e3Var.n1().b(false, com.tencent.mm.plugin.webview.ui.tools.qd.f186783e);
            } else if (kotlin.jvm.internal.o.b(str, "hidden")) {
                e3Var.n1().b(true, com.tencent.mm.plugin.webview.ui.tools.qd.f186783e);
            } else {
                e(msg, gVar, "fail_invalid_arguments");
            }
            e(msg, gVar, "ok");
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 504;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setVisualEffectOnCapture";
    }

    public final void e(nw4.y2 y2Var, nw4.g gVar, java.lang.String str) {
        gVar.e(y2Var.f341013c, y2Var.f341019i + ':' + str, null);
    }
}
