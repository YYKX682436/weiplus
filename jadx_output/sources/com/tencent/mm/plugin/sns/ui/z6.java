package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f171678e;

    public z6(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView, java.lang.String str) {
        this.f171678e = offlineVideoView;
        this.f171677d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$1");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = this.f171678e;
        if (offlineVideoView.f166412g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d fresh thumb image", java.lang.Integer.valueOf(hashCode()));
            offlineVideoView.f166412g.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(this.f171677d, 1.0f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$1");
    }
}
