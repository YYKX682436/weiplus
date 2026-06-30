package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView f123359d;

    public d(com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView) {
        this.f123359d = finderCollectionFilterView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView.f123340h;
        com.tencent.mm.plugin.finder.profile.filter.FinderCollectionFilterView finderCollectionFilterView = this.f123359d;
        finderCollectionFilterView.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderCollectionFilterView", "handleMoreClick");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.profile.filter.b bVar = finderCollectionFilterView.f123341d;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        intent.putExtra("finder_username", bVar.f123356c);
        com.tencent.mm.plugin.finder.profile.filter.b bVar2 = finderCollectionFilterView.f123341d;
        if (bVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.protobuf.g a17 = bVar2.f123355b.a();
        intent.putExtra("KEY_LAST_BUFFER", a17 != null ? a17.g() : null);
        com.tencent.mm.plugin.finder.profile.filter.b bVar3 = finderCollectionFilterView.f123341d;
        if (bVar3 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        intent.putExtra("finder_collection_business_type", bVar3.f123355b.c());
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = finderCollectionFilterView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.ek(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
