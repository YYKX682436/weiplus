package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class f6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.f6 f186083d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("urlList");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.g gVar = env.f340863d;
        if (K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "urlList is empty");
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("bizType");
        if (obj == null) {
            obj = "";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("urlList", str);
        boolean b17 = kotlin.jvm.internal.o.b(obj, "1");
        bundle.putInt("bizType", b17 ? 1 : 0);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.ui.tools.newjsapi.d6.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e6(new java.lang.ref.WeakReference(gVar), b17 ? 1 : 0, msg.f341013c));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return vb1.g.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "onWebPageUrlExposed";
    }
}
