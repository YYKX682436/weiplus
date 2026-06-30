package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class fc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.fc f186093d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.fc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("fontSize");
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetFontSizeCallback", "doSetFontSizeCb, fontSize is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetFontSizeCallback", "doSetFontSizeCb, fontSize = " + str);
        try {
            com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
            if (b17 != null) {
                b17.W1(str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiSetFontSizeCallback", "setFontSizeCb, ex = " + e17.getMessage());
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setFontSizeCallback";
    }
}
