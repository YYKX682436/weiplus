package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class o0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0 f186401d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f186402e;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        if ((context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && (e3Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).L1) != null) {
            java.util.Iterator it = e3Var.X.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.core.i3) it.next()).n();
            }
        }
        f186402e = msg.f341013c;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "SPA-Trace, JsApiDoAuthCurrentUrl call");
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 397;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "doAuthCurrentUrl";
    }
}
