package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class a0 extends com.tencent.mm.plugin.sns.ad.widget.living.z {
    public a0(kotlin.jvm.internal.h0 h0Var, android.view.View view, i64.b1 b1Var, int i17) {
        super("AdNickNameLivingComponent", (androidx.lifecycle.y) h0Var.f310123d, view, i17, b1Var);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        boolean z17 = false;
        if (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        } else {
            s34.n0 n0Var = adXml.adHeadLivingInfo;
            if (n0Var != null && n0Var.a() && adXml.adHeadStateInfo == null && adXml.headWeWorkProfileInfo == null && adXml.adLiveInfo == null) {
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo lastModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo currentModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        kotlin.jvm.internal.o.g(lastModel, "lastModel");
        kotlin.jvm.internal.o.g(currentModel, "currentModel");
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m(lastModel.getSnsId(), currentModel.getSnsId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic$bindAdNickNameLivingComponent$1");
        return m17;
    }
}
