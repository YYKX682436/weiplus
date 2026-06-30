package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class l implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f163347e;

    public l(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f163346d = yVar;
        this.f163347e = snsInfo;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        long j17;
        com.tencent.mm.plugin.sns.ad.widget.adpag.d0 d0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163346d;
        java.lang.String j18 = yVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163347e;
        sb6.append(snsInfo.getSnsId());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        sb6.append(", mInPAGPlayingPeriod is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        boolean z17 = yVar.f163376y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(j18, sb6.toString());
        if (e0Var == l44.e0.f316102p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            boolean z18 = yVar.f163376y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            if (!z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                yVar.f163376y = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                android.os.Handler handler = yVar.f163375x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.tencent.mm.plugin.sns.ad.widget.adpag.k kVar = new com.tencent.mm.plugin.sns.ad.widget.adpag.k(yVar);
                com.tencent.mm.plugin.sns.ad.widget.adpag.a y17 = com.tencent.mm.plugin.sns.ad.widget.adpag.y.y(yVar);
                if (y17 == null || (d0Var = y17.f163327d) == null) {
                    j17 = 2000;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                    j17 = d0Var.f163336g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                }
                handler.postDelayed(kVar, j17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
