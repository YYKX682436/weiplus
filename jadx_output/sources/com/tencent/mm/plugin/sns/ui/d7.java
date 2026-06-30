package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f168174d;

    public d7(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        this.f168174d = offlineVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$5");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = this.f168174d;
        if (com.tencent.mm.plugin.sns.ui.OfflineVideoView.c(offlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OfflineVideoView.c(offlineVideoView).getVisibility() != 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d hide loading.", java.lang.Integer.valueOf(offlineVideoView.hashCode()));
            com.tencent.mm.plugin.sns.ui.OfflineVideoView.c(offlineVideoView).setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$5");
    }
}
