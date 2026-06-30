package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.t f187912d = new com.tencent.mm.plugin.webview.webcompt.t();

    public t() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("webcompt://");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        sb6.append(((cl0.g) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187798f).getValue()).getString("iframeUrlPattern"));
        return sb6.toString();
    }
}
