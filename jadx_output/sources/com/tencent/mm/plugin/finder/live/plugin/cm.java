package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112176e;

    public cm(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i17) {
        this.f112175d = hmVar;
        this.f112176e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112175d;
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = hmVar.f112834u;
        int i17 = this.f112176e;
        finderLiveGiftTagView.b(i17);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) kz5.n0.a0(hmVar.D1, i17);
        if (wxRecyclerView != null) {
            com.tencent.mm.plugin.finder.live.plugin.hm.x1(hmVar, wxRecyclerView, i17);
        }
    }
}
