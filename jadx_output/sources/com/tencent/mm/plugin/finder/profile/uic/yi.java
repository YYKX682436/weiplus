package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class yi implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124400d;

    public yi(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        this.f124400d = dkVar;
    }

    @Override // ym5.m1
    public void onChanged() {
        onItemRangeInserted(0, this.f124400d.getFeedLoader().getDataList().size());
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        int i19;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f124400d;
        if (!dkVar.f123643t || ((i19 = dkVar.f123644u) != 98 && i19 != 2)) {
            dkVar.Q6(true);
            return;
        }
        dkVar.O6().clear();
        dkVar.O6().addAll(dkVar.getFeedLoader().getDataList());
        androidx.recyclerview.widget.RecyclerView recyclerView = dkVar.P6().getRecyclerView();
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f124400d.P6().e(true);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f124400d.P6().e(true);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f124400d.P6().i(true);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f124400d;
        if (dkVar.f123643t) {
            int size = dkVar.O6().size();
            dkVar.O6().clear();
            dkVar.O6().addAll(dkVar.getFeedLoader().getDataList());
            androidx.recyclerview.widget.RecyclerView recyclerView = dkVar.P6().getRecyclerView();
            if (recyclerView != null && (adapter2 = recyclerView.getAdapter()) != null) {
                adapter2.notifyItemRangeChanged(i17, i18);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = dkVar.P6().getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.profile.uic.wi(recyclerView2, recyclerView2, dkVar, size));
                return;
            }
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = dkVar.P6().getRecyclerView();
        if (recyclerView3 != null) {
            java.util.ArrayList O6 = dkVar.O6();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            so2.j5 j5Var = (so2.j5) kz5.n0.a0(O6, gridLayoutManager != null ? gridLayoutManager.x() : -1);
            dkVar.f123645v = j5Var != null ? j5Var.getItemId() : -1L;
        }
        androidx.appcompat.app.AppCompatActivity activity = dkVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class);
        r45.nb1 nb1Var = finderProfileAllLayoutUIC.f123426s;
        if (nb1Var != null) {
            finderProfileAllLayoutUIC.T6().clear();
            finderProfileAllLayoutUIC.Z6(nb1Var);
        }
        dkVar.Q6(false);
        if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        if (recyclerView3 != null) {
            recyclerView3.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.profile.uic.xi(recyclerView3, recyclerView3, dkVar));
        }
    }
}
