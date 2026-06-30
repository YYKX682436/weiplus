package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f135083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw2.c0 f135084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f135086h;

    public lt(int i17, androidx.recyclerview.widget.RecyclerView recyclerView, dw2.c0 c0Var, android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        this.f135082d = i17;
        this.f135083e = recyclerView;
        this.f135084f = c0Var;
        this.f135085g = view;
        this.f135086h = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f135082d;
        if (i17 > 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f135083e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$restoreRecyclerView$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$restoreRecyclerView$1$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            dw2.c0 c0Var = this.f135084f;
            if (c0Var != null) {
                c0Var.y("FinderHDRVideoOrientationUIC", false, true);
            }
        }
        android.view.View view = this.f135085g;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.viewmodel.component.kt(this.f135086h, this.f135083e));
        }
    }
}
