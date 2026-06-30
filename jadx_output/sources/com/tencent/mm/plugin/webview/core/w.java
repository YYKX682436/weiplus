package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f182001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f182001d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f182001d;
        r0Var.f181926f.dead();
        com.tencent.mm.ui.widget.MMWebView mMWebView = r0Var.f181916a;
        mMWebView.clearView();
        mMWebView.destroy();
        try {
            r0Var.D0();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(r0Var.T(), "destroy ex:" + e17);
        }
        return jz5.f0.f302826a;
    }
}
