package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pp implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f170252a;

    public pp(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        this.f170252a = snsSightPlayerUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.op(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f170252a;
        if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.Z6(snsSightPlayerUI) != null) {
            com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.Z6(snsSightPlayerUI).setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
    }
}
