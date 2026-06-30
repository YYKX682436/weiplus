package com.tencent.mm.plugin.finder.view;

/* loaded from: classes9.dex */
public final class t7 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderContactSortView f133091d;

    public t7(com.tencent.mm.plugin.finder.view.FinderContactSortView finderContactSortView) {
        this.f133091d = finderContactSortView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderContactSortView$init$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (j17 >= 0) {
            com.tencent.mm.plugin.finder.view.FinderContactSortView finderContactSortView = this.f133091d;
            if (j17 < finderContactSortView.getDatas().size()) {
                android.content.Intent intent = new android.content.Intent();
                java.lang.Object obj = finderContactSortView.getDatas().get((int) j17).f260898b;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
                intent.putExtra("finder_username", ((ya2.b2) obj).D0());
                com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
                android.content.Context context = finderContactSortView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                iyVar.c(context, intent);
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context2 = finderContactSortView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                i0Var.mk(context2, intent);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderContactSortView$init$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
