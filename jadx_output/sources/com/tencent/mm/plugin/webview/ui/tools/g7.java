package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class g7 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184754d;

    public g7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f184754d = c6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184754d;
        c6Var.f184052i.f286177e = java.lang.System.currentTimeMillis();
        c6Var.f184052i.a(c6Var.c().getContext());
    }
}
