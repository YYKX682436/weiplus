package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class k4 extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout) {
        super(rlLayout);
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f123886e = finderProfileFeedUIC;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public int a() {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        recyclerView = this.f123886e.getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.a0();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public void b() {
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.profile.uic.j4(this.f123886e, this));
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishRefresh(reason);
    }
}
