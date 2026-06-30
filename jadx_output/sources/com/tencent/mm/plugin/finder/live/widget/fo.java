package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class fo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView f118366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Message f118367e;

    public fo(com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView, android.os.Message message) {
        this.f118366d = finderLiveLoopBannerView;
        this.f118367e = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView finderLiveLoopBannerView = this.f118366d;
        finderLiveLoopBannerView.f117666n.sendMessageDelayed(this.f118367e, finderLiveLoopBannerView.getLoopDuration());
    }
}
