package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class r implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f124165e;

    public r(android.view.View view, com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f124164d = view;
        this.f124165e = o0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f124164d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f124165e;
        int h17 = com.tencent.mm.ui.bl.h(o0Var.getActivity());
        android.view.ViewGroup.LayoutParams layoutParams = o0Var.W6().getLayoutParams();
        layoutParams.height += h17;
        o0Var.W6().setLayoutParams(layoutParams);
        jz5.g gVar = o0Var.f124029q;
        android.view.ViewGroup.LayoutParams layoutParams2 = ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.topMargin = h17;
        ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setLayoutParams(layoutParams3);
        android.view.ViewGroup.LayoutParams layoutParams4 = o0Var.X6().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) layoutParams4;
        ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin = h17;
        o0Var.X6().setLayoutParams(cVar);
        return true;
    }
}
