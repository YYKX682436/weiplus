package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zb implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f171686a;

    public zb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f171686a = snsAdNativeLandingPagesUI;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$29");
        try {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().favEditTag();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f171686a.f166700d, "favorite edittag fail, ex = " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$29");
    }
}
