package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134325d;

    public f20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134325d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134325d;
        r45.lk2 lk2Var = f50Var.f134339e;
        if (lk2Var != null) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (zy2.b6.Mh((zy2.b6) c17, f50Var.getActivity(), null, null, null, 12, null)) {
                hc2.e.b(lk2Var, f50Var.getActivity(), f50Var.f134338d);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
