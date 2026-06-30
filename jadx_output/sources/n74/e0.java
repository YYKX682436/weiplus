package n74;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f335346d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f335347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.jj4 jj4Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f335348f = jj4Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
        n74.e0 e0Var = new n74.e0(this.f335348f, (kotlin.coroutines.Continuation) obj3);
        e0Var.f335347e = (kotlinx.coroutines.flow.k) obj;
        java.lang.Object invokeSuspend = e0Var.invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f335346d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f335347e;
            r45.jj4 jj4Var = this.f335348f;
            java.lang.String Id = jj4Var.f377855d;
            kotlin.jvm.internal.o.f(Id, "Id");
            kotlinx.coroutines.flow.j2 c17 = n74.h0.c(Id);
            this.f335346d = 1;
            if (kVar instanceof kotlinx.coroutines.flow.k3) {
                throw ((kotlinx.coroutines.flow.k3) kVar).f310311d;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1");
            java.lang.Object a17 = ((kotlinx.coroutines.flow.h3) c17).a(new kotlinx.coroutines.flow.u1(new n74.d0(kVar, jj4Var)), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1");
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
        return f0Var;
    }
}
