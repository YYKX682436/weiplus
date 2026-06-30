package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f136091g;

    public u5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        this.f136088d = finderBulletUIC;
        this.f136089e = s0Var;
        this.f136090f = baseFinderFeed;
        this.f136091g = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f136088d.P6(this.f136089e, this.f136090f, this.f136091g, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
