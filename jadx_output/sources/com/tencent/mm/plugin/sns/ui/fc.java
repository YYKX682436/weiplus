package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fc extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f168338a;

    public fc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f168338a = snsAdNativeLandingPagesUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f168338a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$32");
        try {
            com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "screenOnReceiver:" + intent.getAction());
            if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                snsAdNativeLandingPagesUI.m8();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "screenOnReceiver, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$32");
    }
}
