package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.u f187934d = new com.tencent.mm.plugin.webview.webcompt.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        if (com.tencent.mm.plugin.webview.webcompt.f1.f187803k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "jsEngine resume");
            com.tencent.mm.plugin.webview.webcompt.f1.f187803k = false;
            com.tencent.mm.plugin.webview.webcompt.h0.b(h0Var).resume();
        }
        return jz5.f0.f302826a;
    }
}
