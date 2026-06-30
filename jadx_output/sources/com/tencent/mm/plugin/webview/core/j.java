package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181852d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181852d;
        com.tencent.mars.xlog.Log.i(r0Var.T(), "WebView-Trace inject#" + r0Var.U());
        r0Var.f0().b();
        r0Var.g0().k();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((com.tencent.mm.plugin.webview.core.e3) r0Var).n1().b(false, com.tencent.mm.plugin.webview.ui.tools.qd.f186783e);
        return jz5.f0.f302826a;
    }
}
