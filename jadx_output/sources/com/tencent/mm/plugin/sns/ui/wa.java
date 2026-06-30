package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wa implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI f170742e;

    public wa(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI, android.content.Intent intent) {
        this.f170742e = snsAdNativeLandingPagesPreviewUI;
        this.f170741d = intent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
        if (str != null) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "jump use replaced xml " + str.length());
            int i17 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.f166678h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            this.f170742e.U6(this.f170741d, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
        return f0Var;
    }
}
