package k84;

/* loaded from: classes4.dex */
public final class d6 extends k84.c6 {
    public d6(kotlin.jvm.internal.h0 h0Var, android.view.View view, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        super("AdSocialPatComponent", (androidx.lifecycle.y) h0Var.f310123d, view, b1Var, iVar, baseViewHolder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r4.isPatAd() == true) goto L8;
     */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r0 = "isComponentExist"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic$bindAdSocialPatComponent$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r4 == 0) goto L17
            boolean r4 = r4.isPatAd()
            r2 = 1
            if (r4 != r2) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d6.n(java.lang.Object):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic$bindAdSocialPatComponent$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo lastModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo currentModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic$bindAdSocialPatComponent$1");
        kotlin.jvm.internal.o.g(lastModel, "lastModel");
        kotlin.jvm.internal.o.g(currentModel, "currentModel");
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m(lastModel.getSnsId(), currentModel.getSnsId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic$bindAdSocialPatComponent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic$bindAdSocialPatComponent$1");
        return m17;
    }
}
