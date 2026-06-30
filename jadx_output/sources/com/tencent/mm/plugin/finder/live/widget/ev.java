package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ev extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f118282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f118283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f118285g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118286h;

    public ev(androidx.recyclerview.widget.RecyclerView recyclerView, kotlin.jvm.internal.f0 f0Var, yz5.l lVar, kotlin.jvm.internal.f0 f0Var2, yz5.l lVar2) {
        this.f118282d = recyclerView;
        this.f118283e = f0Var;
        this.f118284f = lVar;
        this.f118285g = f0Var2;
        this.f118286h = lVar2;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f118282d;
        if (i18 > 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int y17 = linearLayoutManager.y();
                kotlin.jvm.internal.f0 f0Var = this.f118283e;
                if (y17 != f0Var.f310116d) {
                    f0Var.f310116d = y17;
                    this.f118284f.invoke(java.lang.Integer.valueOf(y17));
                }
            }
        } else if (i18 < 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
            linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager != null) {
                int w17 = linearLayoutManager.w();
                kotlin.jvm.internal.f0 f0Var2 = this.f118285g;
                if (w17 != f0Var2.f310116d) {
                    f0Var2.f310116d = w17;
                    this.f118286h.invoke(java.lang.Integer.valueOf(w17));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
