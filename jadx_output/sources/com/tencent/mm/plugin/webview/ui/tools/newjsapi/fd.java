package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class fd extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.fd f186094d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.fd();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = env.f340863d;
        if (!z17) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183849q2;
        c6Var.getClass();
        c6Var.h0(0L, new java.util.ArrayList(), false, false, -1, 1);
        gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return be1.j0.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showMenu";
    }
}
