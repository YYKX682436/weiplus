package l44;

/* loaded from: classes4.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f316241d;

    /* renamed from: e, reason: collision with root package name */
    public int f316242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f316243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f316243f = i17;
        this.f316244g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        l44.l5 l5Var = new l44.l5(this.f316243f, this.f316244g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        return l5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        java.lang.Object invokeSuspend = ((l44.l5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f316242e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f316244g;
            this.f316241d = str;
            this.f316242e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
            s34.y yVar = new s34.y();
            yVar.f402829a = str;
            adLandingPagesProxy.addAdFinderContract(yVar, this.f316243f, new l44.k5(rVar));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
        return obj;
    }
}
