package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class k6 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f129414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.o6 f129415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f129416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f129417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f129418h;

    public k6(com.tencent.mm.plugin.finder.ui.o6 o6Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        this.f129415e = o6Var;
        this.f129416f = linearLayoutManager;
        this.f129417g = f0Var;
        this.f129418h = f0Var2;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.ui.o6 o6Var = this.f129415e;
            com.tencent.mm.plugin.finder.ui.j6 j6Var = new com.tencent.mm.plugin.finder.ui.j6(o6Var, recyclerView, this.f129416f, this.f129418h, this.f129417g);
            o6Var.f129580o = j6Var;
            recyclerView.postDelayed(j6Var, 20L);
        } else if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.n1().r()).booleanValue()) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f129416f;
            if (linearLayoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) {
                ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) linearLayoutManager).f132641z = 0;
            }
        }
        this.f129414d = true;
        kotlin.jvm.internal.f0 f0Var = this.f129418h;
        this.f129417g.f310116d = f0Var.f310116d;
        f0Var.f310116d = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.ui.o6 o6Var = this.f129415e;
        java.lang.Runnable runnable = o6Var.f129580o;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
            o6Var.f129580o = null;
        }
        o6Var.f129579n += i18;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N0().r()).booleanValue()) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        if (this.f129414d) {
            com.tencent.mm.plugin.finder.ui.o6 o6Var2 = this.f129415e;
            com.tencent.mm.plugin.finder.ui.o6.n(o6Var2, recyclerView, this.f129416f, this.f129418h.f310116d, this.f129417g.f310116d, o6Var2.f129579n);
            this.f129414d = false;
        }
        o6Var.o(recyclerView, this.f129416f, o6Var.f129579n, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
