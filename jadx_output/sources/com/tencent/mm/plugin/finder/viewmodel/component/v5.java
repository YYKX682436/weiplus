package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136208f;

    public v5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f136206d = finderBulletUIC;
        this.f136207e = s0Var;
        this.f136208f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f136206d.P6(this.f136207e, this.f136208f, false, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
