package com.tencent.mm.plugin.finder.viewmodel.component;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.do, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Cdo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f134153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.rn f134154e;

    public Cdo(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar, com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar) {
        this.f134153d = eoVar;
        this.f134154e = rnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$showPendingBalance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.eo.O6(this.f134153d, this.f134154e.f135814h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$showPendingBalance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
