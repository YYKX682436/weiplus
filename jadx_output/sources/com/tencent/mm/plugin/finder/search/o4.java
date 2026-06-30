package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class o4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u4 f125802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f125803e;

    public o4(com.tencent.mm.plugin.finder.search.u4 u4Var, yz5.l lVar) {
        this.f125802d = u4Var;
        this.f125803e = lVar;
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
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.finder.search.u4 u4Var = this.f125802d;
        u4Var.f125891l = u4Var.f125888i.getItem(i17).toString();
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "onItemClick : " + i17 + " query:" + u4Var.f125891l);
        u4Var.c(u4Var.f125883d, 2);
        this.f125803e.invoke(u4Var.f125891l);
        if (kotlin.jvm.internal.o.b(u4Var.f125891l, u4Var.f125881b.getEditText().getText().toString())) {
            u4Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
