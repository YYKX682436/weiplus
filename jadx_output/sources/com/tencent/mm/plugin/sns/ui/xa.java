package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xa implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI f171501e;

    public xa(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI, java.lang.String str) {
        this.f171501e = snsAdNativeLandingPagesPreviewUI;
        this.f171500d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
        if (str != null) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "jump use old xml " + str.length());
            int i17 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.f166678h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            this.f171501e.V6(this.f171500d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
        return f0Var;
    }
}
