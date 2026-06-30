package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qb6 f171409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f171410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, r45.qb6 qb6Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171408d = wVar;
        this.f171409e = qb6Var;
        this.f171410f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        com.tencent.mm.plugin.sns.ui.wsfold.o oVar = new com.tencent.mm.plugin.sns.ui.wsfold.o(this.f171408d, this.f171409e, this.f171410f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long longExtra = this.f171408d.getIntent().getLongExtra("key_ws_feed_id", 0L);
        com.tencent.mm.plugin.sns.storage.s2 y07 = com.tencent.mm.plugin.sns.model.l4.Qj().y0(longExtra);
        this.f171409e.f383810d.clear();
        this.f171409e.f383810d.addAll(this.f171410f);
        y07.field_groupStrcut = this.f171409e.toByteArray();
        boolean z17 = false;
        com.tencent.mm.plugin.sns.model.l4.Qj().update(y07, new java.lang.String[0]);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceUpdateTimeline$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        o75.b eventID = o75.b.f343583d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceUpdateTimeline", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        kotlin.jvm.internal.o.g(eventID, "eventID");
        xc4.p Y6 = gVar.Y6(longExtra);
        if (Y6 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceUpdateTimeline", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            Y6.S1 = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            gVar.g7(Y6, eventID);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceUpdateTimeline", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceUpdateTimeline$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        return valueOf;
    }
}
