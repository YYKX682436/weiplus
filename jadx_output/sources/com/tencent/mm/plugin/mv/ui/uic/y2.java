package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes8.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151549e;

    public y2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, int i17) {
        this.f151548d = musicMvMainUIC;
        this.f151549e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151548d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "post stopScroll");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvMainUIC.f150976f;
        if (wxRecyclerView != null) {
            wxRecyclerView.f1();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = musicMvMainUIC.f150976f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.post(new com.tencent.mm.plugin.mv.ui.uic.x2(musicMvMainUIC, this.f151549e));
        }
    }
}
