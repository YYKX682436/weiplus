package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f170982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.d0 f170983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f170984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.sns.ui.widget.ad.d0 d0Var, com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f170983e = d0Var;
        this.f170984f = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.widget.ad.c0 c0Var = new com.tencent.mm.plugin.sns.ui.widget.ad.c0(this.f170983e, this.f170984f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        return c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.ad.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f170982d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f170982d = 1;
            if (kotlinx.coroutines.k1.b(1500L, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = com.tencent.mm.plugin.sns.ui.widget.ad.d0.f170986f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCanceled$p", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18");
        boolean z17 = this.f170983e.f170987d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCanceled$p", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.widget.ad.v0.z(this.f170984f);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processThreeImageViews$18$onAnimationEnd$1");
        return f0Var;
    }
}
