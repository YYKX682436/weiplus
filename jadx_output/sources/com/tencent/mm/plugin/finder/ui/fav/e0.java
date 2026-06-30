package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class e0 extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.g0 f129164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.ui.fav.g0 g0Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        super(finderRefreshLayout);
        this.f129164e = g0Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.m1
    public void onChanged() {
        androidx.recyclerview.widget.f2 adapter;
        super.onChanged();
        java.lang.String str = this.f129164e.f129170p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChanged,adapter=");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f132666d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        java.lang.Integer num = null;
        sb6.append(recyclerView != null ? recyclerView.getAdapter() : null);
        sb6.append(",data size=");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderRefreshLayout.getRecyclerView();
        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
            num = java.lang.Integer.valueOf(adapter.getItemCount());
        }
        sb6.append(num);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        super.onItemRangeChanged(i17, i18);
        java.lang.String str = this.f129164e.f129170p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemRangeChanged positionStart=");
        sb6.append(i17);
        sb6.append(",itemCount=");
        sb6.append(i18);
        sb6.append(",adapter=");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f132666d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        java.lang.Integer num = null;
        sb6.append(recyclerView != null ? recyclerView.getAdapter() : null);
        sb6.append(",data size=");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderRefreshLayout.getRecyclerView();
        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
            num = java.lang.Integer.valueOf(adapter.getItemCount());
        }
        sb6.append(num);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        super.onItemRangeInserted(i17, i18);
        java.lang.String str = this.f129164e.f129170p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemRangeInserted positionStart=");
        sb6.append(i17);
        sb6.append(",itemCount=");
        sb6.append(i18);
        sb6.append(",adapter=");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f132666d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        java.lang.Integer num = null;
        sb6.append(recyclerView != null ? recyclerView.getAdapter() : null);
        sb6.append(",data size=");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderRefreshLayout.getRecyclerView();
        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
            num = java.lang.Integer.valueOf(adapter.getItemCount());
        }
        sb6.append(num);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishLoadMore(reason);
        java.lang.String str = this.f129164e.f129170p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreFinishLoadMore reason=");
        sb6.append(reason);
        sb6.append(",adapter=");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f132666d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        java.lang.Integer num = null;
        sb6.append(recyclerView != null ? recyclerView.getAdapter() : null);
        sb6.append(",data size=");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderRefreshLayout.getRecyclerView();
        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
            num = java.lang.Integer.valueOf(adapter.getItemCount());
        }
        sb6.append(num);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishRefresh(reason);
        java.lang.String str = this.f129164e.f129170p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreFinishRefresh reason=");
        sb6.append(reason);
        sb6.append(",adapter=");
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f132666d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        java.lang.Integer num = null;
        sb6.append(recyclerView != null ? recyclerView.getAdapter() : null);
        sb6.append(",data size=");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderRefreshLayout.getRecyclerView();
        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
            num = java.lang.Integer.valueOf(adapter.getItemCount());
        }
        sb6.append(num);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
