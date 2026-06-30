package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class k40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134918d;

    public k40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134918d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$4$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134918d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(f50Var.getActivity());
        u1Var.u("");
        u1Var.g(f50Var.getActivity().getString(com.tencent.mm.R.string.chn));
        u1Var.m(com.tencent.mm.R.string.chl);
        u1Var.a(true);
        u1Var.l(null);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$4$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
