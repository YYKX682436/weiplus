package u64;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f424988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f424989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f424991g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jz5.l lVar, jz5.l lVar2, java.lang.String str, kotlin.jvm.internal.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424988d = lVar;
        this.f424989e = lVar2;
        this.f424990f = str;
        this.f424991g = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        u64.f fVar = new u64.f(this.f424988d, this.f424989e, this.f424990f, this.f424991g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        java.lang.Object invokeSuspend = ((u64.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        long j17;
        java.lang.Long l17;
        u64.p pVar;
        long j18;
        u64.p pVar2;
        long j19;
        jz5.l lVar;
        java.util.LinkedList linkedList;
        r45.g5 g5Var;
        r45.f76 f76Var;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject3;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject4;
        java.util.LinkedList linkedList2;
        r45.g5 g5Var2;
        r45.f76 f76Var2;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        u64.p pVar3 = u64.p.f425023a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        jz5.l lVar2 = this.f424988d;
        r45.g5 f17 = pVar3.f(lVar2);
        r45.g5 h17 = pVar3.h(this.f424989e);
        if (f17 == null && h17 == null) {
            lVar = new jz5.l(0, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        } else if (f17 == null) {
            lVar = new jz5.l(5, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        } else if (h17 == null) {
            lVar = new jz5.l(6, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        } else {
            com.tencent.mm.plugin.sns.storage.ADInfo e17 = pVar3.e(f17);
            com.tencent.mm.plugin.sns.storage.ADInfo e18 = pVar3.e(h17);
            boolean z17 = e18.score < e17.score;
            java.lang.String str3 = this.f424990f;
            if (!pVar3.i(str3)) {
                str = "invokeSuspend";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1";
                com.tencent.mars.xlog.Log.i("AdPullRequestHelper", " pull, timeline scores is = " + e17.score + ", " + e18.score);
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "adPull score is lower! ");
                    lVar = new jz5.l(1, java.lang.Boolean.FALSE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    j17 = elapsedRealtime;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j17;
                    kotlin.jvm.internal.g0 g0Var = this.f424991g;
                    g0Var.f310121d = elapsedRealtime2;
                    com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "end process! cost = " + g0Var.f310121d);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                    return lVar;
                }
                r45.n76 n76Var = (r45.n76) lVar2.f302834e;
                java.lang.Long valueOf = (n76Var == null || (linkedList2 = n76Var.f381141d) == null || (g5Var2 = (r45.g5) linkedList2.get(0)) == null || (f76Var2 = g5Var2.f374885d) == null || (snsObject5 = f76Var2.f374076d) == null) ? null : java.lang.Long.valueOf(snsObject5.Id);
                r45.f76 f76Var3 = h17.f374885d;
                if (f76Var3 == null || (snsObject4 = f76Var3.f374076d) == null) {
                    j17 = elapsedRealtime;
                    l17 = null;
                } else {
                    j17 = elapsedRealtime;
                    l17 = java.lang.Long.valueOf(snsObject4.Id);
                }
                if (kotlin.jvm.internal.o.b(valueOf, l17)) {
                    com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "snsId is equals!");
                    lVar = new jz5.l(7, java.lang.Boolean.FALSE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                } else {
                    com.tencent.mm.plugin.sns.model.u uVar = com.tencent.mm.plugin.sns.model.u.f164697a;
                    java.util.LinkedList linkedList3 = n76Var != null ? n76Var.f381141d : null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
                    r45.f76 f76Var4 = h17.f374885d;
                    if (f76Var4 == null || (snsObject3 = f76Var4.f374076d) == null) {
                        pVar = pVar3;
                        j18 = 0;
                    } else {
                        pVar = pVar3;
                        j18 = snsObject3.Id;
                    }
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j18);
                    java.lang.Integer valueOf2 = y07 != null ? java.lang.Integer.valueOf(y07.field_createTime) : null;
                    if (valueOf2 == null) {
                        com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "createTime is null ??!! orgAdId=" + j18);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
                    } else {
                        uVar.a(linkedList3, valueOf2.intValue());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAdByPull", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
                    }
                    r45.f76 f76Var5 = h17.f374885d;
                    if (f76Var5 == null || (snsObject2 = f76Var5.f374076d) == null) {
                        pVar2 = pVar;
                        j19 = 0;
                    } else {
                        j19 = snsObject2.Id;
                        pVar2 = pVar;
                    }
                    if (pVar2.i(str3)) {
                        com.tencent.mars.xlog.Log.w("AdPullRequestHelper", "adPull inserted in subThread but ad is exposed in mainThread! ");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1920, 21);
                        java.lang.Long valueOf3 = (n76Var == null || (linkedList = n76Var.f381141d) == null || (g5Var = (r45.g5) linkedList.get(0)) == null || (f76Var = g5Var.f374885d) == null || (snsObject = f76Var.f374076d) == null) ? null : java.lang.Long.valueOf(snsObject.Id);
                        if (valueOf3 != null) {
                            com.tencent.mm.plugin.sns.model.x.f(valueOf3.longValue(), -1);
                        }
                        lVar = z17 ? new jz5.l(4, java.lang.Boolean.TRUE) : new jz5.l(3, java.lang.Boolean.TRUE);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    } else {
                        if (j19 == 0) {
                            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "delId is null! ");
                        } else {
                            com.tencent.mm.plugin.sns.model.x.f(j19, -1);
                        }
                        lVar = new jz5.l(2, java.lang.Boolean.TRUE);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                long elapsedRealtime22 = android.os.SystemClock.elapsedRealtime() - j17;
                kotlin.jvm.internal.g0 g0Var2 = this.f424991g;
                g0Var2.f310121d = elapsedRealtime22;
                com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "end process! cost = " + g0Var2.f310121d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return lVar;
            }
            com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "uuid is already exposed!  uuid = " + str3);
            lVar = z17 ? new jz5.l(4, java.lang.Boolean.FALSE) : new jz5.l(3, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        }
        str = "invokeSuspend";
        str2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$1";
        j17 = elapsedRealtime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processAdPull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        long elapsedRealtime222 = android.os.SystemClock.elapsedRealtime() - j17;
        kotlin.jvm.internal.g0 g0Var22 = this.f424991g;
        g0Var22.f310121d = elapsedRealtime222;
        com.tencent.mars.xlog.Log.i("AdPullRequestHelper", "end process! cost = " + g0Var22.f310121d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return lVar;
    }
}
