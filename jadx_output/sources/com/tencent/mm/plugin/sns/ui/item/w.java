package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class w extends k84.d4 {
    public w(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView, int i17, int i18, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.bs bsVar, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        super(str, yVar, view, view2, view3, adSocialAttitudeView, adAttitudePlayView, adAttitudeAttractView, i17, i18, b1Var, iVar, bsVar, baseViewHolder);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        boolean z17 = k84.f4.g(snsInfo) && mb4.r.k(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        if (snsInfo == null || snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
            z17 = false;
        } else {
            z17 = com.tencent.mm.sdk.platformtools.t8.m(snsInfo.getSnsId(), snsInfo2.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
        return z17;
    }
}
