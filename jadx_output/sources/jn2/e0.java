package jn2;

/* loaded from: classes5.dex */
public final class e0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f300588d;

    public e0(jn2.f0 f0Var) {
        this.f300588d = f0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlinx.coroutines.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i18 > 0) {
            jn2.f0 f0Var = this.f300588d;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = f0Var.f300602h.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int y17 = linearLayoutManager.y();
                jn2.c1 c1Var = f0Var.f300600f;
                if (c1Var == null) {
                    kotlin.jvm.internal.o.o("rvAdapter");
                    throw null;
                }
                int itemCount = c1Var.getItemCount();
                if (f0Var.f300611t > 0 && itemCount != 0 && y17 >= itemCount - 1 && !f0Var.f300609r && (y0Var = f0Var.f300599e) != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new jn2.a0(f0Var, null), 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$setupLoadMoreListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
