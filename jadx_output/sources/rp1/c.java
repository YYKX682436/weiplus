package rp1;

/* loaded from: classes10.dex */
public final class c extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView f398362d;

    public c(com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView) {
        this.f398362d = contentFloatBallRecyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (!(recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        int w17 = linearLayoutManager.w();
        boolean z17 = linearLayoutManager.y() == linearLayoutManager.getItemCount() - 1 && !recyclerView.canScrollHorizontally(1);
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f398362d;
        if (z17) {
            contentFloatBallRecyclerView.f93412r2 = true;
            contentFloatBallRecyclerView.f93413s2 = false;
            contentFloatBallRecyclerView.f93408n2 = false;
        } else {
            if (w17 == 0 && !recyclerView.canScrollHorizontally(-1)) {
                contentFloatBallRecyclerView.f93408n2 = false;
                contentFloatBallRecyclerView.f93412r2 = false;
                contentFloatBallRecyclerView.f93413s2 = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
