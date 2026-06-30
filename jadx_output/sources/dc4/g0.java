package dc4;

/* loaded from: classes4.dex */
public class g0 extends k84.q1 {
    public g0(dc4.l0 l0Var, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView, int i17, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        super(str, yVar, view, adSocialAttitudeView, adAttitudePlayView, i17, b1Var, iVar);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        boolean z17 = k84.f4.g(snsInfo) && k84.q1.U(snsInfo) && !mb4.r.k(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        if (snsInfo == null || snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
            z17 = false;
        } else {
            z17 = com.tencent.mm.sdk.platformtools.t8.m(snsInfo.getSnsId(), snsInfo2.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$3");
        return z17;
    }
}
