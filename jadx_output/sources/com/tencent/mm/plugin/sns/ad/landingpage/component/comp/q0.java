package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class q0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public android.view.View.OnClickListener B;

    public q0(android.content.Context context, f54.k kVar, android.view.ViewGroup viewGroup) {
        super(context, kVar, viewGroup);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderRepeatPickBtnComp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBtnClick, cid=");
        ab4.d0 p17 = p();
        sb6.append(p17 != null ? p17.f2817d : null);
        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderRepeatPickBtnComp", sb6.toString());
        android.view.View.OnClickListener onClickListener = this.B;
        if (onClickListener != null) {
            onClickListener.onClick(W());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderRepeatPickBtnComp");
    }
}
