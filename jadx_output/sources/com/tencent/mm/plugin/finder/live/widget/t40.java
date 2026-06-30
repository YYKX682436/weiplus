package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f119866d;

    public t40(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f119866d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshCategoryVisionGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f119866d;
        q50Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(q50Var.f118183e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.k50(q50Var);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.l50(q50Var);
        k0Var.v();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327340h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshCategoryVisionGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
