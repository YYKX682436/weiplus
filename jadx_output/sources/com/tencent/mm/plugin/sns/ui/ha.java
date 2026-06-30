package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ha extends com.tencent.mm.plugin.sns.ui.ma {
    public ha(com.tencent.mm.plugin.sns.ui.na naVar, com.tencent.mm.plugin.sns.ui.la laVar, android.animation.AnimatorSet animatorSet) {
        super(laVar, animatorSet);
    }

    @Override // com.tencent.mm.plugin.sns.ui.ma
    public void a(com.tencent.mm.plugin.sns.ui.pa paVar, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$3");
        paVar.s(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$3");
    }
}
