package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.m5 f125714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f125715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125716f;

    public h5(com.tencent.mm.plugin.finder.search.m5 m5Var, int i17, java.lang.String str) {
        this.f125714d = m5Var;
        this.f125715e = i17;
        this.f125716f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f125714d.f125778c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f125715e);
        java.lang.String str = this.f125716f;
        if (str == null) {
            str = "";
        }
        pVar.invoke(valueOf, str);
        com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
        int i17 = this.f125715e;
        synchronized (k5Var) {
            java.util.LinkedList list = com.tencent.mm.plugin.finder.search.k5.f125748b.getList(0);
            if (list != null) {
            }
        }
        k5Var.a();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.search.j5(k5Var));
        this.f125714d.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
