package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181838d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181838d;
        try {
            j17 = r0Var.e0().lb() ? r0Var.e0().J3() : 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(r0Var.T(), "Get Uin Error:" + th6.getLocalizedMessage());
            j17 = -1;
        }
        return new com.tencent.mm.plugin.webview.core.h1(j17);
    }
}
