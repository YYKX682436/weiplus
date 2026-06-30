package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135553d;

    public pj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135553d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135553d;
        rl5.r rVar = new rl5.r(blVar.getContext(), view);
        rVar.F = true;
        rVar.f397335J = blVar.getString(com.tencent.mm.R.string.k28);
        rVar.f397355y = new com.tencent.mm.plugin.finder.viewmodel.component.mj(blVar);
        rVar.f397354x = new com.tencent.mm.plugin.finder.viewmodel.component.oj(blVar);
        rVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
