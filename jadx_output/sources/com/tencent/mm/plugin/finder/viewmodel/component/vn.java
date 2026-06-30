package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class vn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f136258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.rn f136259e;

    public vn(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        this.f136258d = eoVar;
        this.f136259e = rnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$3$getItemConvert$1$onBindViewHolder$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.eo.O6(this.f136258d, this.f136259e.f135814h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$3$getItemConvert$1$onBindViewHolder$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
