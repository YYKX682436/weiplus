package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187586d;

    public w(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var) {
        this.f187586d = d0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187586d;
        d0Var.f187146d.f286177e = java.lang.System.currentTimeMillis();
        d0Var.f187146d.a(d0Var.d());
    }
}
