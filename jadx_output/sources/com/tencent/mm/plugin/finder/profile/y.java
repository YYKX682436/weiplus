package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.b0 f124864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e95 f124865e;

    public y(com.tencent.mm.plugin.finder.profile.b0 b0Var, r45.e95 e95Var) {
        this.f124864d = b0Var;
        this.f124865e = e95Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f124864d.f123320n;
        if (lVar != null) {
            lVar.invoke(this.f124865e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
