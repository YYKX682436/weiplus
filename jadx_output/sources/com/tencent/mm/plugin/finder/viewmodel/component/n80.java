package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n80 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t80 f135281e;

    public n80(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var) {
        this.f135280d = view;
        this.f135281e = t80Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f135280d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = this.f135281e;
        int h17 = com.tencent.mm.ui.bl.h(t80Var.getActivity());
        int a17 = com.tencent.mm.ui.bl.a(t80Var.getActivity());
        android.view.ViewGroup.LayoutParams layoutParams = t80Var.getRootView().findViewById(com.tencent.mm.R.id.f482428ec).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = a17 + h17;
        return true;
    }
}
