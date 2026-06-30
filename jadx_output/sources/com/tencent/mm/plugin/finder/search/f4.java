package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.k4 f125696e;

    public f4(int i17, com.tencent.mm.plugin.finder.search.k4 k4Var) {
        this.f125695d = i17;
        this.f125696e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        com.tencent.mm.plugin.finder.search.i4.f125724b.getList(0).remove(this.f125695d);
        i4Var.a();
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.finder.search.h4.f125713d);
        this.f125696e.d();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
