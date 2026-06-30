package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class et implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f134299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw2.c0 f134300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f134301g;

    public et(int i17, androidx.recyclerview.widget.RecyclerView recyclerView, dw2.c0 c0Var, com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        this.f134298d = i17;
        this.f134299e = recyclerView;
        this.f134300f = c0Var;
        this.f134301g = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f134298d;
        if (i17 > 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f134299e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$resetLiveRecyclerViewState$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$resetLiveRecyclerViewState$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            dw2.c0 c0Var = this.f134300f;
            if (c0Var != null) {
                c0Var.y("FinderHDRVideoOrientationUIC", false, true);
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f134301g;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f134299e;
        recyclerView2.post(new com.tencent.mm.plugin.finder.viewmodel.component.dt(ptVar, recyclerView2));
    }
}
