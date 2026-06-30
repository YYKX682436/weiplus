package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187583d;

    public v5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187583d = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter;
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter2;
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187583d;
        sayFooter = z5Var.getSayFooter();
        if (!sayFooter.h()) {
            sayFooter.setVisibility(8);
        }
        sayFooter2 = z5Var.getSayFooter();
        sayFooter2.postInvalidate();
        z5Var.D.postInvalidate();
    }
}
