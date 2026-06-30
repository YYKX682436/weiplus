package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderBlockListContract$BlockListViewCallback$finishLoadMore$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback f122580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f122582g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBlockListContract$BlockListViewCallback$finishLoadMore$1(boolean z17, com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback, java.util.List list, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f122579d = z17;
        this.f122580e = blockListViewCallback;
        this.f122581f = list;
        this.f122582g = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f122579d;
        java.util.List list = this.f122581f;
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = this.f122580e;
        if (z17) {
            blockListViewCallback.f122572d.f122567f.clear();
            blockListViewCallback.f122572d.f122567f.addAll(list);
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = blockListViewCallback.f122576h;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.P(0);
            androidx.recyclerview.widget.RecyclerView recyclerView = blockListViewCallback.f122575g;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else {
            blockListViewCallback.f122572d.f122567f.addAll(list);
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f463522g = false;
            s3Var.f463521f = !list.isEmpty();
            s3Var.f463523h = list.size();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = blockListViewCallback.f122575g;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = blockListViewCallback.f122578m;
                java.lang.Integer valueOf = wxRecyclerAdapter != null ? java.lang.Integer.valueOf(wxRecyclerAdapter.a0() + this.f122582g.f310116d) : null;
                kotlin.jvm.internal.o.d(valueOf);
                adapter2.notifyItemRangeInserted(valueOf.intValue(), list.size());
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = blockListViewCallback.f122576h;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(s3Var);
        }
        blockListViewCallback.o();
        return jz5.f0.f302826a;
    }
}
