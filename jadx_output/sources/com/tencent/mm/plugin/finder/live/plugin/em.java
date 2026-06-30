package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class em implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112435d;

    public em(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f112435d = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112435d;
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = hmVar.f112834u;
        int i17 = com.tencent.mm.plugin.finder.live.plugin.hm.U1;
        finderLiveGiftTagView.b(i17);
        hmVar.f112834u.getRv().getChildAt(i17).performClick();
    }
}
