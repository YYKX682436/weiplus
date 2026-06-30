package dw2;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f244117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dw2.o f244118e;

    public e(androidx.recyclerview.widget.RecyclerView recyclerView, dw2.o oVar) {
        this.f244117d = recyclerView;
        this.f244118e = oVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f244117d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int w17 = linearLayoutManager != null ? linearLayoutManager.w() : -1;
        if (i17 == 0) {
            dw2.o oVar = this.f244118e;
            if (((java.lang.Boolean) ((jz5.n) oVar.f244147l).getValue()).booleanValue() && !((java.lang.Boolean) ((jz5.n) oVar.f244148m).getValue()).booleanValue()) {
                int a17 = dw2.o.f244134t.a(w17, oVar.f244143h);
                androidx.recyclerview.widget.k3 q07 = recyclerView2.q0(a17, false);
                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                if ((s0Var != null ? s0Var.f293125i : null) instanceof so2.h1) {
                    com.tencent.mars.xlog.Log.i(oVar.f244136a, "onScrollStateChanged: pre render live feed, curPos=" + w17 + ", nextPos=" + a17);
                    oVar.c("NextLiveIdle", w17, true);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                    return;
                }
            }
            oVar.c("ScrollIdle", w17, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
