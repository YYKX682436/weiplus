package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class y5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136529e;

    public y5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, in5.s0 s0Var) {
        this.f136528d = finderBulletUIC;
        this.f136529e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.X6(this.f136528d, this.f136529e, false, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
