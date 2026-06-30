package u64;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424976d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f424977e;

    /* renamed from: f, reason: collision with root package name */
    public int f424978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f424979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f424980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424981i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.mr5 mr5Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424979g = mr5Var;
        this.f424980h = i17;
        this.f424981i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        u64.c cVar = new u64.c(this.f424979g, this.f424980h, this.f424981i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        java.lang.Object invokeSuspend = ((u64.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f424978f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.mr5 mr5Var = this.f424979g;
            int i18 = this.f424980h;
            java.lang.String str = this.f424981i;
            this.f424976d = mr5Var;
            this.f424977e = str;
            this.f424978f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            u64.a aVar2 = new u64.a(rVar);
            k64.h.a(mr5Var, i18, str, aVar2, (r45.js5) r45.n76.class.newInstance(), true);
            rVar.m(new u64.b(aVar2, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1");
        return obj;
    }
}
