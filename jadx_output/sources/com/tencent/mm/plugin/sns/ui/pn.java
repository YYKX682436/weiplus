package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qn f170249d;

    public pn(com.tencent.mm.plugin.sns.ui.qn qnVar) {
        this.f170249d = qnVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16$1");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.qn qnVar = this.f170249d;
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = qnVar.f170350a;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z17 = snsOnlineVideoActivity.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        intent.putExtra("sns_update_preview_video_del", z17);
        qnVar.f170350a.setResult(-1, intent);
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity2 = qnVar.f170350a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity2.P = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        qnVar.f170350a.finish();
        qnVar.f170350a.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16$1");
    }
}
