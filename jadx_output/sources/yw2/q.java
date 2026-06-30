package yw2;

/* loaded from: classes10.dex */
public final class q extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f466663d;

    /* renamed from: e, reason: collision with root package name */
    public int f466664e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f466665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466666g;

    public q(android.content.Context context, yw2.a0 a0Var) {
        this.f466665f = context;
        this.f466666g = a0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if ((i17 == 1 || i17 == 3) && this.f466663d != 3) {
            android.content.Context context = this.f466665f;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.tencent.mm.ui.MMFragmentActivity) context).hideVKB();
        }
        this.f466663d = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        yw2.a0 a0Var = this.f466666g;
        if (i18 > 0 && a0Var.f466608d.t0()) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            a0Var.f466608d.K(linearLayoutManager.y());
        } else if (i18 >= 0 || !a0Var.f466608d.c0()) {
            linearLayoutManager = null;
        } else {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2;
            a0Var.f466608d.t(linearLayoutManager.w());
        }
        if (a0Var.D != null && !a0Var.E) {
            if (linearLayoutManager == null) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                linearLayoutManager = layoutManager3 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager3 : null;
            }
            if (linearLayoutManager != null) {
                int y17 = i18 > 0 ? linearLayoutManager.y() : linearLayoutManager.w();
                if (this.f466664e != y17) {
                    this.f466664e = y17;
                    if (a0Var.f466608d.O(y17)) {
                        a0Var.f466608d.d(y17);
                        a0Var.t();
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("Finder.TimelineDrawerBuilder", "onScrolled: manager is null");
            }
        } else if (this.f466664e != -1) {
            this.f466664e = -1;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$onBuildDrawerBody$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
