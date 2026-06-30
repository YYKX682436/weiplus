package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f119947d;

    public u5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        this.f119947d = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f119947d;
        if (d6Var.f118061c.x0()) {
            return;
        }
        android.view.View view = d6Var.f118073o;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.tencent.mm.ui.bl.c(d6Var.f118059a.getContext());
    }
}
