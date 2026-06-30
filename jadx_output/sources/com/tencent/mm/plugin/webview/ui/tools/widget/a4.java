package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f187102e;

    public a4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var, java.lang.Runnable runnable) {
        this.f187101d = o4Var;
        this.f187102e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f187101d.k();
        java.lang.Runnable runnable = this.f187102e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
