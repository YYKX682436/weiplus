package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class m5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.m5 f186357d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m5();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHideBizCustomSharePanel", "hideBizCustomSharePanel");
        android.content.Context context = env.f340860a;
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        nw4.g gVar = env.f340863d;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHideBizCustomSharePanel", "hideBizCustomSharePanel fail, webview ui is null");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, webview ui is null", null);
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183849q2;
        if (c6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHideBizCustomSharePanel", "hideBizCustomSharePanel fail, menuHelper is null");
            gVar.e(msg.f341013c, msg.f341019i + ":fail, menuHelper is null", null);
            return true;
        }
        com.tencent.mm.plugin.webview.ui.tools.x3 x3Var = c6Var.f184064u;
        x3Var.f187646f = false;
        rv.n2 n2Var = x3Var.f187647g;
        if (n2Var != null) {
            ((ss1.d) ((jz5.n) ((qs1.m) n2Var).f366233f).getValue()).f();
        }
        gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 345;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "hideBizCustomSharePanel";
    }
}
