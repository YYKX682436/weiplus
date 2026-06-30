package u64;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f424982d;

    /* renamed from: e, reason: collision with root package name */
    public int f424983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ta6 f424984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424985g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.ta6 ta6Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424984f = ta6Var;
        this.f424985g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        u64.d dVar = new u64.d(this.f424984f, this.f424985g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        java.lang.Object invokeSuspend = ((u64.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f424983e;
        r45.n76 n76Var = null;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1920, 0);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            u64.p pVar = u64.p.f425023a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toSnsAdPullReq", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            r45.ta6 ta6Var = this.f424984f;
            kotlin.jvm.internal.o.g(ta6Var, "<this>");
            r45.m76 m76Var = new r45.m76();
            m76Var.setBaseRequest(ta6Var.getBaseRequest());
            m76Var.f380205d = ta6Var.f386239d;
            m76Var.f380206e = ta6Var.f386240e;
            m76Var.f380207f = ta6Var.f386241f;
            m76Var.f380208g = ta6Var.f386242g;
            m76Var.f380209h = ta6Var.f386243h;
            m76Var.f380210i = ta6Var.f386244i;
            m76Var.f380211m = ta6Var.f386245m;
            m76Var.f380212n = ta6Var.f386246n;
            m76Var.f380213o = ta6Var.f386247o;
            m76Var.f380214p = ta6Var.f386248p;
            m76Var.f380215q = ta6Var.f386249q;
            m76Var.f380216r = ta6Var.f386250r;
            m76Var.f380217s = ta6Var.f386251s;
            m76Var.f380218t = ta6Var.f386252t;
            m76Var.f380219u = ta6Var.f386253u;
            m76Var.f380220v = ta6Var.f386254v;
            m76Var.f380221w = ta6Var.f386255w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toSnsAdPullReq", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            u64.c cVar = new u64.c(m76Var, 25444, "/cgi-bin/mmoc-bin/adplayinfo/sns_pull_request_adobject", null);
            this.f424982d = currentTimeMillis;
            this.f424983e = 1;
            obj = kotlinx.coroutines.a4.c(30000L, cVar, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
                throw illegalStateException;
            }
            j17 = this.f424982d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        k64.b bVar = (k64.b) obj;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
        if ((bVar != null && bVar.a() == 0) && bVar.b() == 0) {
            n76Var = (r45.n76) bVar.c();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adpull result not ok ! ");
            sb6.append(bVar != null ? new java.lang.Integer(bVar.a()) : null);
            sb6.append(", ");
            sb6.append(bVar != null ? new java.lang.Integer(bVar.b()) : null);
            com.tencent.mars.xlog.Log.e("AdPullRequestHelper", sb6.toString());
        }
        jz5.l lVar = new jz5.l(java.lang.Boolean.TRUE, n76Var);
        u64.p pVar2 = u64.p.f425023a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.g5 f17 = pVar2.f(lVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        boolean v17 = f17 != null ? com.tencent.mm.plugin.sns.model.x.v(f17) : false;
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "adDynamic, updateSuccess=" + v17);
        if (v17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 8);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 9);
        }
        if (f17 != null) {
            java.lang.String g17 = x51.j1.g(f17.f374886e);
            java.lang.String g18 = x51.j1.g(f17.f374885d.f374077e);
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.N0(g17, g18)) {
                    r45.f76 f76Var = f17.f374885d;
                    ca4.c0.d((f76Var == null || (snsObject = f76Var.f374076d) == null) ? 0L : com.tencent.mm.sdk.platformtools.t8.r1(new java.lang.Long(snsObject.Id)), g17, g18);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdPullRequestHelper", "reportAdPullException: " + th6);
            }
            y74.e eVar = y74.e.f459784a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            ((ku5.t0) ku5.t0.f312615d).g(new y74.b(currentTimeMillis2, 1));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
        } else {
            y74.e eVar2 = y74.e.f459784a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            ((ku5.t0) ku5.t0.f312615d).g(new y74.b(currentTimeMillis2, 0));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
        }
        u64.p.c(this.f424985g, lVar);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        return f0Var;
    }
}
