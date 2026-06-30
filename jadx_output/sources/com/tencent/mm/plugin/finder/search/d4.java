package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class d4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f125658d;

    public d4(yz5.l lVar) {
        this.f125658d = lVar;
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
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        r45.ju2 ju2Var = com.tencent.mm.plugin.finder.search.i4.f125724b;
        java.lang.String string = ((r45.ku2) ju2Var.getList(0).get(i17)).getString(1);
        if (string == null) {
            string = "";
        }
        this.f125658d.invoke(string);
        java.lang.String string2 = ((r45.ku2) ju2Var.getList(0).get(i17)).getString(1);
        i4Var.b(string2 != null ? string2 : "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
