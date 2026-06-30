package kr;

/* loaded from: classes15.dex */
public final class b extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.panel.EmojiPanelRecyclerView f311290d;

    public b(com.tencent.mm.emoji.panel.EmojiPanelRecyclerView emojiPanelRecyclerView) {
        this.f311290d = emojiPanelRecyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            if (this.f311290d.getAdapter() instanceof a85.a) {
                androidx.recyclerview.widget.f2 adapter = this.f311290d.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                ((a85.a) adapter).f2385p = true;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f311290d.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int w17 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).w();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = this.f311290d.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int y17 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager2).y();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i18 = 0;
            for (int i19 = w17; i19 <= y17; i19++) {
                if (i19 >= 1 && (this.f311290d.getAdapter() instanceof a85.a)) {
                    androidx.recyclerview.widget.f2 adapter2 = this.f311290d.getAdapter();
                    kotlin.jvm.internal.o.e(adapter2, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                    if (((a85.a) adapter2).y(i19) instanceof ir.g) {
                        androidx.recyclerview.widget.f2 adapter3 = this.f311290d.getAdapter();
                        kotlin.jvm.internal.o.e(adapter3, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                        ir.u0 y18 = ((a85.a) adapter3).y(i19);
                        kotlin.jvm.internal.o.e(y18, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiItem");
                        arrayList2.add(((ir.g) y18).f293836b);
                    }
                }
                if (this.f311290d.p0(i19) instanceof lr.y0) {
                    i18++;
                    androidx.recyclerview.widget.k3 p07 = this.f311290d.p0(i19);
                    kotlin.jvm.internal.o.e(p07, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.SimilarEmojiNormalViewHolder");
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                    t0Var.getClass();
                    t0Var.z(new kr.a((lr.y0) p07), i18 / 2, false);
                }
            }
            if (this.f311290d.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 1) {
                if (w17 != 0) {
                    w17--;
                }
                ((ku5.t0) ku5.t0.f312615d).g(new z75.b(w17 + arrayList2.size(), arrayList2));
            }
        } else if ((i17 == 1 || i17 == 2) && (this.f311290d.getAdapter() instanceof a85.a)) {
            androidx.recyclerview.widget.f2 adapter4 = this.f311290d.getAdapter();
            kotlin.jvm.internal.o.e(adapter4, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
            if (((a85.a) adapter4).f2385p) {
                androidx.recyclerview.widget.f2 adapter5 = this.f311290d.getAdapter();
                kotlin.jvm.internal.o.e(adapter5, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                ((a85.a) adapter5).f2385p = false;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = this.f311290d.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager4 = this.f311290d.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager4, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                int y19 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager4).y();
                for (int w18 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager3).w(); w18 <= y19; w18++) {
                    if (this.f311290d.p0(w18) instanceof lr.y0) {
                        androidx.recyclerview.widget.k3 p08 = this.f311290d.p0(w18);
                        kotlin.jvm.internal.o.e(p08, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.SimilarEmojiNormalViewHolder");
                        ((lr.y0) p08).f320614g.pause();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        yz5.a loadMoreCall;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        int childCount = gridLayoutManager != null ? gridLayoutManager.getChildCount() : 0;
        int itemCount = gridLayoutManager != null ? gridLayoutManager.getItemCount() : 0;
        int w17 = gridLayoutManager != null ? gridLayoutManager.w() : 0;
        if (childCount + w17 >= itemCount && w17 >= 0 && (loadMoreCall = this.f311290d.getLoadMoreCall()) != null) {
            loadMoreCall.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
