package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m1 f187109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f187110e;

    public b1(com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var, android.content.res.Configuration configuration) {
        this.f187109d = m1Var;
        this.f187110e = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = this.f187109d;
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o4) m1Var.K;
        android.content.res.Configuration configuration = this.f187110e;
        if (configuration != null) {
            int i17 = o4Var.A;
            int i18 = configuration.orientation;
            if (i17 != i18) {
                o4Var.A = i18;
                o4Var.q();
            }
        } else {
            o4Var.getClass();
        }
        android.view.View view = m1Var.f281402h;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = m1Var.E();
            android.view.View view2 = m1Var.f281402h;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
        m1Var.U();
        android.view.View view3 = m1Var.f281401g;
        if (view3 != null) {
            view3.requestLayout();
        }
    }
}
