package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f168112d;

    public c7(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        this.f168112d = offlineVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$4");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = this.f168112d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d show loading. downloadMode %d", java.lang.Integer.valueOf(offlineVideoView.hashCode()), java.lang.Integer.valueOf(offlineVideoView.hashCode()));
        if (com.tencent.mm.plugin.sns.ui.OfflineVideoView.c(offlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OfflineVideoView.c(offlineVideoView).getVisibility() != 0) {
            com.tencent.mm.plugin.sns.ui.OfflineVideoView.c(offlineVideoView).setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$4");
    }
}
