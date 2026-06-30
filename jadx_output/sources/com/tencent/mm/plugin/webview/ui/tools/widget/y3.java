package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187611d;

    public y3(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187611d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f187611d.d().requestLayout();
    }
}
