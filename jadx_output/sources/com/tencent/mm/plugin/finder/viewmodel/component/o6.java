package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class o6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f135426d;

    public o6(yz5.a aVar) {
        this.f135426d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f135426d.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
