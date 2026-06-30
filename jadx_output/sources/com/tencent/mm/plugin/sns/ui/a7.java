package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f167727e;

    public a7(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView, java.lang.String str) {
        this.f167727e = offlineVideoView;
        this.f167726d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$2");
        this.f167727e.j(this.f167726d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$2");
    }
}
