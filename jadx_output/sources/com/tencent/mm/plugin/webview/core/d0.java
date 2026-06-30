package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181776d;

    public d0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f181776d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181776d;
        r0Var.b0().postUIDelayed((java.lang.Runnable) ((jz5.n) r0Var.T).getValue(), 800L);
    }
}
