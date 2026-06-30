package u64;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424986d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424987e;

    public e(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
        u64.e eVar = new u64.e((kotlin.coroutines.Continuation) obj3);
        eVar.f424986d = (jz5.l) obj;
        eVar.f424987e = (jz5.l) obj2;
        java.lang.Object invokeSuspend = eVar.invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.l lVar = new jz5.l((jz5.l) this.f424986d, (jz5.l) this.f424987e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$1");
        return lVar;
    }
}
