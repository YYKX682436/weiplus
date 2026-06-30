package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151326d;

    public n2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        this.f151326d = musicMvMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151326d;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.Q6(musicMvMainUIC, musicMvMainUIC.f150982o);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter T6 = musicMvMainUIC.T6();
        int i17 = musicMvMainUIC.f150982o;
        java.lang.Object obj = com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J;
        T6.notifyItemRangeChanged(i17, 1, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J);
    }
}
