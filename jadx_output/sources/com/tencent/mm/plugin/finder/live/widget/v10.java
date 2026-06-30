package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v10 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f120025d;

    public v10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var) {
        this.f120025d = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f120025d;
        if (z10Var.f120494c.x0()) {
            android.view.View view = z10Var.f120498g;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin = com.tencent.mm.ui.bl.c(z10Var.f120492a.getContext());
            return;
        }
        android.view.View view2 = z10Var.f120498g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = com.tencent.mm.ui.bl.c(z10Var.f120492a.getContext());
    }
}
