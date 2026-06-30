package n34;

/* loaded from: classes4.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListDataUIC f334548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334548e = snsStarListDataUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        n34.a4 a4Var = new n34.a4(this.f334548e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        return a4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        java.lang.Object invokeSuspend = ((n34.a4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f334547d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC = this.f334548e;
            java.util.ArrayList Q6 = com.tencent.mm.plugin.sns.SnsStarListDataUIC.Q6(snsStarListDataUIC);
            this.f334547d = 1;
            if (com.tencent.mm.plugin.sns.SnsStarListDataUIC.S6(snsStarListDataUIC, Q6, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$insetStarFeed$1$1");
        return f0Var;
    }
}
