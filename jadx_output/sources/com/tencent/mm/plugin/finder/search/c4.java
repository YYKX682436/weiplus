package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.k4 f125647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.c5 f125648e;

    public c4(com.tencent.mm.plugin.finder.search.k4 k4Var, com.tencent.mm.plugin.finder.search.c5 c5Var) {
        this.f125647d = k4Var;
        this.f125648e = c5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f125647d.f125744c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        com.tencent.mm.plugin.finder.search.i4.f125724b.getList(0).clear();
        i4Var.a();
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.finder.search.h4.f125713d);
        com.tencent.mm.plugin.finder.search.c5 c5Var = this.f125648e;
        if (c5Var != null) {
            c5Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
