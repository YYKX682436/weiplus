package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class ud implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdProxyUI f170577d;

    public ud(com.tencent.mm.plugin.sns.ui.SnsAdProxyUI snsAdProxyUI) {
        this.f170577d = snsAdProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI$1");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsAdProxyUI.f166771e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        com.tencent.mm.plugin.sns.ui.SnsAdProxyUI snsAdProxyUI = this.f170577d;
        boolean z17 = snsAdProxyUI.f166772d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdBlankUI", "finish, after delay");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            snsAdProxyUI.f166772d = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            snsAdProxyUI.finish();
            snsAdProxyUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI$1");
    }
}
