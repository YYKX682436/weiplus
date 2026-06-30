package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181853d;

    public j0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f181853d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181853d;
        int i17 = r0Var.f181947p0;
        java.lang.String Z = r0Var.Z();
        if (Z == null) {
            Z = "";
        }
        r0Var.J(i17, Z);
    }
}
