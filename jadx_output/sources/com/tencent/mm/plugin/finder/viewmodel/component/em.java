package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class em implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f134279f;

    public em(android.view.View view, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        this.f134277d = view;
        this.f134278e = s0Var;
        this.f134279f = finderHorizontalVideoDrawerUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$applyShrinkOpLayout$refreshShare$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f134277d;
        view2.performClick();
        view2.post(new com.tencent.mm.plugin.finder.viewmodel.component.dm(this.f134278e, this.f134279f));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$applyShrinkOpLayout$refreshShare$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
