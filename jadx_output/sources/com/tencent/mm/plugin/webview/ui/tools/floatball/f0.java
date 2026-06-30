package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f184198e;

    public f0(java.lang.String str, com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f184197d = str;
        this.f184198e = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184203c.remove(this.f184197d);
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f184198e;
        if (e3Var.L) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1553L, 11L, 1L, false);
            if (e3Var.L) {
                e3Var.y1();
            }
        }
    }
}
