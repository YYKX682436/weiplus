package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f167751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f167752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bd f167753f;

    public ad(com.tencent.mm.plugin.sns.ui.bd bdVar, int i17, int i18) {
        this.f167753f = bdVar;
        this.f167751d = i17;
        this.f167752e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play time ");
        int i17 = this.f167751d;
        sb6.append(i17);
        sb6.append(" video time ");
        int i18 = this.f167752e;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", sb6.toString());
        com.tencent.mm.plugin.sns.ui.bd bdVar = this.f167753f;
        if (i18 > 0) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = bdVar.f167909d;
            int i19 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.f166766h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            snsAdNativeLandingTestUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI2 = bdVar.f167909d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            snsAdNativeLandingTestUI2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        }
        if (bdVar.f167909d.f166768e.getVideoTotalTime() != i18) {
            bdVar.f167909d.f166768e.setVideoTotalTime(i18);
        }
        bdVar.f167909d.f166768e.a(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4$1");
    }
}
