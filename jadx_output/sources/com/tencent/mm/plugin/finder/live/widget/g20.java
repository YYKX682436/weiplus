package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class g20 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h20 f118393d;

    public g20(com.tencent.mm.plugin.finder.live.widget.h20 h20Var) {
        this.f118393d = h20Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.live.widget.h20 h20Var = this.f118393d;
        fg2.t1 t1Var = h20Var.f118509u;
        if (t1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = t1Var.f262316a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        fg2.t1 t1Var2 = h20Var.f118509u;
        if (t1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (t1Var2.f262316a.getWidth() == 0) {
            com.tencent.mars.xlog.Log.e(h20Var.f118508t, "onGlobalLayout: width is 0");
        } else {
            h20Var.L(false);
        }
    }
}
