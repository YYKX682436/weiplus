package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ta implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a52 f116700e;

    public ta(com.tencent.mm.plugin.finder.live.view.gb gbVar, r45.a52 a52Var) {
        this.f116699d = gbVar;
        this.f116700e = a52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f116699d;
        wt2.a aVar = gbVar.R;
        if (aVar != null) {
            wt2.a.m4(aVar, this.f116700e, null, 2, null);
        }
        wt2.a aVar2 = gbVar.R;
        if (aVar2 != null && (q57 = aVar2.q5()) != null) {
            bf2.c.b(bf2.c.f19598a, q57, 3, 8, null, 0, 24, null);
        }
        gbVar.s(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
