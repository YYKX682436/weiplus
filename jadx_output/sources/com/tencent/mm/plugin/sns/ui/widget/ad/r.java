package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f171035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.s f171036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.sns.ui.widget.ad.s sVar, com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171036e = sVar;
        this.f171037f = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.widget.ad.r rVar = new com.tencent.mm.plugin.sns.ui.widget.ad.r(this.f171036e, this.f171037f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.ad.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171035d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f171035d = 1;
            if (kotlinx.coroutines.k1.b(2000L, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = com.tencent.mm.plugin.sns.ui.widget.ad.s.f171040f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCanceled$p", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9");
        boolean z17 = this.f171036e.f171041d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCanceled$p", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.widget.ad.v0.y(this.f171037f);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$9$onAnimationEnd$1");
        return f0Var;
    }
}
