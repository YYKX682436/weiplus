package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f90 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.k90 f134380e;

    public f90(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var) {
        this.f134379d = view;
        this.f134380e = k90Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f134379d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var = this.f134380e;
        int h17 = com.tencent.mm.ui.bl.h(k90Var.getActivity());
        int a17 = com.tencent.mm.ui.bl.a(k90Var.getActivity());
        android.view.ViewGroup.LayoutParams layoutParams = k90Var.getRootView().findViewById(com.tencent.mm.R.id.f482428ec).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = a17 + h17;
        return true;
    }
}
