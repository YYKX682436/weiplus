package n74;

/* loaded from: classes4.dex */
public final class f0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f335352d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f335353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f335354f = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        n74.f0 f0Var = new n74.f0(this.f335354f, (kotlin.coroutines.Continuation) obj3);
        f0Var.f335353e = (kotlinx.coroutines.flow.k) obj;
        java.lang.Object invokeSuspend = f0Var.invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f335352d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f335353e;
            java.lang.String cacheName = this.f335354f;
            kotlin.jvm.internal.o.f(cacheName, "$cacheName");
            kotlinx.coroutines.flow.j2 b17 = n74.h0.b(cacheName);
            this.f335352d = 1;
            if (kVar instanceof kotlinx.coroutines.flow.k3) {
                throw ((kotlinx.coroutines.flow.k3) kVar).f310311d;
            }
            java.lang.Object a17 = ((kotlinx.coroutines.flow.h3) b17).a(new kotlinx.coroutines.flow.u1(kVar), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        return f0Var;
    }
}
