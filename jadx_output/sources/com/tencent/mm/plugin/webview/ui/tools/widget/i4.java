package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187266e;

    public i4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var, int i17) {
        this.f187265d = o4Var;
        this.f187266e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n g07;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f187265d.G;
        if (r0Var == null || (g07 = r0Var.g0()) == null) {
            return;
        }
        g07.L(this.f187266e, 0);
    }
}
