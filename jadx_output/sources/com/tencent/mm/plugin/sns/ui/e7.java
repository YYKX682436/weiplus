package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f168225d;

    public e7(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        this.f168225d = offlineVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = this.f168225d;
        if (com.tencent.mm.plugin.sns.ui.OfflineVideoView.a(offlineVideoView) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
            return false;
        }
        if (((android.view.View) com.tencent.mm.plugin.sns.ui.OfflineVideoView.a(offlineVideoView)).getAlpha() < 1.0f) {
            offlineVideoView.o(true, 1.0f);
        }
        if (com.tencent.mm.plugin.sns.ui.OfflineVideoView.a(offlineVideoView).isPlaying()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            offlineVideoView.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            int currentPosition = com.tencent.mm.plugin.sns.ui.OfflineVideoView.a(offlineVideoView).getCurrentPosition();
            offlineVideoView.t(currentPosition);
            if (currentPosition / 1000 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "onTimerExpired, curPos=" + currentPosition + ", video.alpha=" + com.tencent.mm.plugin.sns.ui.OfflineVideoView.b(offlineVideoView).getAlpha() + ", video.visble=" + com.tencent.mm.plugin.sns.ui.OfflineVideoView.b(offlineVideoView).getVisibility() + ", thumb.alpha=" + offlineVideoView.f166412g.getAlpha() + ", thumb.visble=" + offlineVideoView.f166412g.getVisibility());
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "onTimerExpired, isPlaying=false");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
        return true;
    }
}
