package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class h0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.h0 f186215d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context;
            if (webViewUI.f183866w2 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("key_current_info_show", false);
                com.tencent.mm.plugin.webview.ui.tools.ld ldVar = webViewUI.f183866w2;
                ldVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.ad(ldVar, bundle));
            }
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return yc1.a0.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "currentMpInfoHide";
    }
}
