package u64;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f424992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424992d = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        u64.g gVar = new u64.g(this.f424992d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        u64.g gVar = (u64.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "tryPreloadResource !");
        u64.p pVar = u64.p.f425023a;
        jz5.l lVar = this.f424992d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.g5 f17 = pVar.f(lVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        } else {
            r45.f76 f76Var = f17.f374885d;
            java.lang.String g17 = x51.j1.g(f76Var != null ? f76Var.f374077e : null);
            if (g17 == null) {
                g17 = "";
            }
            java.lang.String Username = f17.f374885d.f374076d.Username;
            kotlin.jvm.internal.o.f(Username, "Username");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Username)) {
                boolean W = ca4.m0.W(g17);
                boolean e07 = ca4.m0.e0(g17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate contact:");
                sb6.append(Username);
                sb6.append(", isUsePreferedInfo=");
                sb6.append(W);
                sb6.append(", isForbidUpdateContact=");
                sb6.append(e07);
                sb6.append(", snsId=");
                r45.f76 f76Var2 = f17.f374885d;
                sb6.append(ca4.z0.s0((f76Var2 == null || (snsObject = f76Var2.f374076d) == null) ? 0L : snsObject.Id));
                com.tencent.mars.xlog.Log.i("AdPullRequestHelper", sb6.toString());
                if (!W && !e07) {
                    c01.n8.a().c(Username, 3);
                    ((ku5.t0) ku5.t0.f312615d).k(new u64.o(Username), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                }
            }
            n74.v1.e(f17, 1);
            za4.f1.b(f17, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        return f0Var;
    }
}
