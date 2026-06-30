package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class h3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f173950d;

    public h3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var) {
        this.f173950d = q3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f173950d;
        com.tencent.mars.xlog.Log.i(q3Var.f174190e, "onViewAttachedToWindow() called with: v = " + v17);
        q3Var.l(v17);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f173950d;
        com.tencent.mars.xlog.Log.i(q3Var.f174190e, "onViewDetachedFromWindow() called with: v = " + v17);
        q3Var.f174210x0 = true;
        q3Var.c();
    }
}
