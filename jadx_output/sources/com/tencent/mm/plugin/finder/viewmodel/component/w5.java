package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136301e;

    public w5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, in5.s0 s0Var) {
        this.f136300d = finderBulletUIC;
        this.f136301e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6(this.f136300d, this.f136301e, false, false, false, 14, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
