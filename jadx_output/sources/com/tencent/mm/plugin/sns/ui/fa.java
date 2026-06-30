package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fa implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.na f168320d;

    public fa(com.tencent.mm.plugin.sns.ui.na naVar) {
        this.f168320d = naVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
        com.tencent.mm.plugin.sns.ui.na naVar = this.f168320d;
        com.tencent.mm.plugin.sns.ui.la laVar = naVar.f169986b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
        if (laVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
        com.tencent.mm.plugin.sns.ui.la laVar2 = naVar.f169986b;
        laVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
        java.lang.ref.WeakReference weakReference = laVar2.f169735a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
            obj = null;
        } else {
            obj = weakReference.get();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
        }
        com.tencent.mm.plugin.sns.ui.pa paVar = (com.tencent.mm.plugin.sns.ui.pa) obj;
        if (paVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.f170207y++;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = paVar.f170201s;
            long j17 = snsInfo != null ? snsInfo.field_snsId : 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            int i17 = paVar.f170189d != 0 ? 2 : 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.ui.oa.b(i17, j17, paVar.f170207y);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
    }
}
