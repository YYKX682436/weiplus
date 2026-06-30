package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class dh extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC, com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout) {
        super(rlLayout);
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f123632e = finderProfileTingAudioUIC;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public int a() {
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f123632e.f123482n).getValue()).getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.a0();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public void b() {
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.profile.uic.ch(this.f123632e, this));
    }
}
