package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn f116582d;

    public p5(com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn finderLiveGiftSendBtn) {
        this.f116582d = finderLiveGiftSendBtn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map reportSdkViewInfo;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn finderLiveGiftSendBtn = this.f116582d;
        finderLiveGiftSendBtn.d();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = finderLiveGiftSendBtn.f115950f;
        reportSdkViewInfo = finderLiveGiftSendBtn.getReportSdkViewInfo();
        ((cy1.a) rVar).Cj("finder_live_gift_send_again", view, reportSdkViewInfo, 25561);
    }
}
