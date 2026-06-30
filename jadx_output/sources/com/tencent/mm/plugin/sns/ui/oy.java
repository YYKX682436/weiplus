package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class oy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity f170135d;

    public oy(com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity videoFullScreenActivity) {
        this.f170135d = videoFullScreenActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity$1");
        this.f170135d.setRequestedOrientation(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity$1");
    }
}
