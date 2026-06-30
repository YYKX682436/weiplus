package u64;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f424993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f424994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.g5 f424995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f424996g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.g5 f424997h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, r45.g5 g5Var, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo2, r45.g5 g5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424993d = i17;
        this.f424994e = aDInfo;
        this.f424995f = g5Var;
        this.f424996g = aDInfo2;
        this.f424997h = g5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        u64.h hVar = new u64.h(this.f424993d, this.f424994e, this.f424995f, this.f424996g, this.f424997h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        u64.h hVar = (u64.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.f76 f76Var;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        r45.f76 f76Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        u64.p pVar = u64.p.f425023a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        int i17 = this.f424993d;
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6 || i17 == 7) {
            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "reportAnalyse of " + i17 + " !");
            l44.t5 b17 = l44.t5.b();
            jz5.l lVar = i17 == 2 ? new jz5.l(this.f424994e, this.f424995f) : new jz5.l(this.f424996g, this.f424997h);
            com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = (com.tencent.mm.plugin.sns.storage.ADInfo) lVar.f302833d;
            r45.g5 g5Var = (r45.g5) lVar.f302834e;
            r45.du5 du5Var = null;
            java.lang.String str = aDInfo != null ? aDInfo.uxInfo : null;
            if (str == null) {
                str = "";
            }
            b17.a(str, g5Var != null ? pVar.g(g5Var) : "", 4, 0);
            b17.c();
            if (g5Var != null && (f76Var2 = g5Var.f374885d) != null) {
                du5Var = f76Var2.f374077e;
            }
            java.lang.String g17 = x51.j1.g(du5Var);
            ca4.c0.b(6, (g5Var == null || (f76Var = g5Var.f374885d) == null || (snsObject = f76Var.f374076d) == null) ? 0L : snsObject.Id, aDInfo, new com.tencent.mm.plugin.sns.storage.ADXml(g17 != null ? g17 : ""));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportAnalyse", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$4");
        return f0Var;
    }
}
