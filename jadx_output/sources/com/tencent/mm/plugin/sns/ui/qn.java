package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qn implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f170350a;

    public qn(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f170350a = snsOnlineVideoActivity;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f170350a;
        snsOnlineVideoActivity.f167336y1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.j7(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.pn(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
    }
}
