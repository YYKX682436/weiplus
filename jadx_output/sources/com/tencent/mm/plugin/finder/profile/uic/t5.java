package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class t5 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124225c;

    public t5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f124225c = finderProfileFeedUIC;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        recyclerView = this.f124225c.getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        return (i17 != 0 || (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 0) <= 0) ? 1 : 3;
    }
}
