package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135853d;

    public s20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135853d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initMergeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135853d;
        f50Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, f50Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.setClass(f50Var.getActivity(), com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI.class);
        f50Var.getActivity().startActivityForResult(intent, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initMergeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
