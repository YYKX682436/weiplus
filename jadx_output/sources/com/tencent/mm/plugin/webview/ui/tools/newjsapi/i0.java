package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.i0 f186242d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.i0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context;
            if (webViewUI.f183866w2 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("url");
                java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("brandName");
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("userName");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    bundle.putString("key_brand_name", str2);
                    bundle.putString("key_brand_user_name", str3);
                    bundle.putString("key_url", str);
                }
                bundle.putBoolean("key_current_info_show", true);
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
        return yc1.q.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "currentMpInfoShow";
    }
}
