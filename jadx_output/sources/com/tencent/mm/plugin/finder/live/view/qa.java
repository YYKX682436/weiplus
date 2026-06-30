package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class qa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116609e;

    public qa(com.tencent.mm.plugin.finder.live.view.gb gbVar, int i17) {
        this.f116608d = gbVar;
        this.f116609e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f116608d;
        wt2.a aVar = gbVar.R;
        if (aVar != null && (q57 = aVar.q5()) != null) {
            bf2.c.b(bf2.c.f19598a, q57, 8, 15, null, 0, 24, null);
        }
        yz5.p pVar = gbVar.W;
        if (pVar != null) {
            pVar.invoke(20, java.lang.Integer.valueOf(this.f116609e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
