package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class y9 extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public android.animation.ValueAnimator f171623o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f171624p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.tencent.mm.plugin.sns.ui.pa paVar, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f171624p = paVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
        if (snsInfo != null) {
            android.animation.ValueAnimator valueAnimator = this.f171623o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f171623o = ofFloat;
            com.tencent.mm.plugin.sns.ui.pa paVar = this.f171624p;
            ofFloat.setStartDelay(com.tencent.mm.plugin.sns.ui.pa.k(paVar).alphaAnimBtnInfo.f166012b);
            this.f171623o.setDuration(com.tencent.mm.plugin.sns.ui.pa.k(paVar).alphaAnimBtnInfo.f166011a);
            this.f171623o.addUpdateListener(new com.tencent.mm.plugin.sns.ui.x9(this));
            this.f171623o.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        boolean z17 = false;
        if (snsInfo == null || snsInfo.getAdXml().adCardActionBtnInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        } else {
            com.tencent.mm.plugin.sns.storage.i iVar = snsInfo.getAdXml().adCardActionBtnInfo.alphaAnimBtnInfo;
            if (iVar != null && iVar.f166011a > 0) {
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m(((com.tencent.mm.plugin.sns.storage.SnsInfo) obj).getSnsId(), ((com.tencent.mm.plugin.sns.storage.SnsInfo) obj2).getSnsId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        return m17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.pa paVar = this.f171624p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        try {
            this.f171623o.cancel();
            com.tencent.mm.plugin.sns.ui.pa.i(paVar).setTextColor(com.tencent.mm.plugin.sns.ui.pa.d(paVar).getResources().getColor(com.tencent.mm.R.color.f478724ff));
            com.tencent.mm.plugin.sns.ui.pa.i(paVar).setBackground(com.tencent.mm.plugin.sns.ui.pa.d(paVar).getResources().getDrawable(com.tencent.mm.R.drawable.b1f));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.x();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6");
    }
}
