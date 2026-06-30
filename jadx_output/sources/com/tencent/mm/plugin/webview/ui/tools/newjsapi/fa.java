package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class fa extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.fa f186089d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.fa();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadFinderFeed", "preloadFinderFeed main process:%b", java.lang.Boolean.valueOf(n17));
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("items");
        java.lang.Object obj = msg.f340790a.get("batchLoadScene");
        if (obj == null || (str = obj.toString()) == null) {
            str = "0";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        boolean z17 = str2 == null;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, msg.f341019i + ":param invalid", null);
            return false;
        }
        bundle.putString("KEY_REQUEST_DATA", str2);
        bundle.putInt("KEY_REQUEST_SCENE", P);
        if (n17) {
            new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ea().invoke(bundle, null);
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.ui.tools.newjsapi.ea.class, null);
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "preloadFinderFeed";
    }
}
