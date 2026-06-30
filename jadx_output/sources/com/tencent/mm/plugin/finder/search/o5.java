package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class o5 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u5 f125804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f125805e;

    public o5(com.tencent.mm.plugin.finder.search.u5 u5Var, yz5.p pVar) {
        this.f125804d = u5Var;
        this.f125805e = pVar;
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
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.finder.search.u5 u5Var = this.f125804d;
        u5Var.f125900m = u5Var.f125898h.getItem(i17).toString();
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "onItemClick : " + i17 + " query:" + u5Var.f125900m);
        this.f125805e.invoke(java.lang.Integer.valueOf(i17), u5Var.f125900m);
        if (kotlin.jvm.internal.o.b(u5Var.f125900m, u5Var.f125895e.getEditText().getText().toString())) {
            u5Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/RingtoneSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
