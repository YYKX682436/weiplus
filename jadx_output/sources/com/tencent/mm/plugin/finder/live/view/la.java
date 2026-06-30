package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class la implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116464e;

    public la(com.tencent.mm.plugin.finder.live.view.gb gbVar, int i17) {
        this.f116463d = gbVar;
        this.f116464e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f116463d.W;
        if (pVar != null) {
            pVar.invoke(4, java.lang.Integer.valueOf(this.f116464e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
