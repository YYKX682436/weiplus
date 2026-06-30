package u64;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f425017d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f425018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ta6 f425020g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, r45.ta6 ta6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425019f = str;
        this.f425020g = ta6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        u64.l lVar = new u64.l(this.f425019f, this.f425020g, continuation);
        lVar.f425018e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        java.lang.Object invokeSuspend = ((u64.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j2 j2Var;
        kotlinx.coroutines.flow.j2 j2Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f425017d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.l.d((kotlinx.coroutines.y0) this.f425018e, null, null, new u64.d(this.f425020g, this.f425019f, null), 3, null);
            java.util.Map a17 = u64.p.a();
            java.lang.String str = this.f425019f;
            synchronized (a17) {
                try {
                    j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) u64.p.a()).get(str);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                    throw th6;
                }
            }
            java.util.Map b17 = u64.p.b();
            java.lang.String str2 = this.f425019f;
            synchronized (b17) {
                try {
                    j2Var2 = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) u64.p.b()).get(str2);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                    throw th7;
                }
            }
            if (j2Var == null || j2Var2 == null) {
                com.tencent.mars.xlog.Log.e("AdPullRequestHelper", "combine error with: uuid = " + this.f425019f);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                return f0Var;
            }
            u64.k kVar = new u64.k(j2Var2, j2Var, this.f425019f, null);
            this.f425017d = 1;
            if (kotlinx.coroutines.a4.c(30000L, kVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1920, 12);
        com.tencent.mars.xlog.Log.e("AdPullRequestHelper", "request of " + this.f425019f + " time out! ");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1");
        return f0Var2;
    }
}
