package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.i2 f186245d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.i2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNewLifeContact", "JsApiGetNewLifeContact");
        zg0.q2 a17 = env.a();
        if (a17 == null || (str = a17.i()) == null) {
            str = "";
        }
        zg0.q2 a18 = env.a();
        if (a18 == null || (str2 = ((com.tencent.mm.plugin.webview.core.r0) a18).Z()) == null) {
            str2 = "";
        }
        if (!(str2.length() == 0)) {
            str = str2;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetNewLifeContact$NewLifeGetNewLifeContactData("", "", str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.f2.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h2(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 369;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getNewLifeContact";
    }
}
