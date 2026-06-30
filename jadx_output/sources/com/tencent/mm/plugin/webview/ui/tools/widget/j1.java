package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class j1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f187338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m1 f187339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f187340f;

    public j1(com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var, android.content.res.Configuration configuration) {
        this.f187339e = m1Var;
        this.f187340f = configuration;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = this.f187339e;
        android.view.View view2 = m1Var.f281402h;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = m1Var.E();
            android.view.View view3 = m1Var.f281402h;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
        }
        android.view.View view4 = m1Var.f281401g;
        if (view4 != null) {
            view4.post(new com.tencent.mm.plugin.webview.ui.tools.widget.b1(m1Var, this.f187340f));
        }
        m1Var.D();
        int i17 = this.f187338d + 1;
        this.f187338d = i17;
        if (i17 < 2 || (view = m1Var.f281401g) == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
