package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public final class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187575d;

    public u5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187575d = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter;
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter sayFooter2;
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187575d;
        sayFooter = z5Var.getSayFooter();
        sayFooter.setVisibility(0);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = sayFooter.f187045m;
        if (weImageView != null) {
            weImageView.setImageResource(sayFooter.g(com.tencent.mm.R.attr.f478194d7));
        }
        sayFooter2 = z5Var.getSayFooter();
        sayFooter2.postInvalidate();
        z5Var.D.postInvalidate();
    }
}
