package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.m5 f125675d;

    public e5(com.tencent.mm.plugin.finder.search.m5 m5Var) {
        this.f125675d = m5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f125675d.f125782g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
        synchronized (k5Var) {
            java.util.LinkedList list = com.tencent.mm.plugin.finder.search.k5.f125748b.getList(0);
            if (list != null) {
                list.clear();
            }
        }
        k5Var.a();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.search.j5(k5Var));
        this.f125675d.f125779d.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
