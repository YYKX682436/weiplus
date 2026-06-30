package nb4;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f336085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nb4.m mVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336084e = mVar;
        this.f336085f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        nb4.l lVar = new nb4.l(this.f336084e, this.f336085f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        java.lang.Object invokeSuspend = ((nb4.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336083d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nb4.m mVar = this.f336084e;
            java.lang.String N6 = nb4.m.N6(mVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateUserCoverFromDetail ");
            long j17 = this.f336085f;
            sb6.append(ca4.z0.t0(j17));
            com.tencent.mars.xlog.Log.i(N6, sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            java.util.HashSet hashSet = mVar.f336088f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            if (hashSet.contains(new java.lang.Long(j17)) || j17 == 0) {
                com.tencent.mars.xlog.Log.i(nb4.m.N6(mVar), "request is doing!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                return f0Var;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            hashSet.add(new java.lang.Long(j17));
            kotlinx.coroutines.flow.j n17 = kotlinx.coroutines.flow.l.n(new kotlinx.coroutines.flow.g0(new nb4.k(new nb4.h(new kotlinx.coroutines.flow.l0(new kotlinx.coroutines.flow.m2(new nb4.b(j17, mVar, null)), new nb4.c(j17, mVar, null)), mVar), mVar), new nb4.d(mVar, j17, null)), kotlinx.coroutines.q1.f310570c);
            nb4.e eVar = nb4.e.f336068d;
            this.f336083d = 1;
            if (n17.a(eVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        return f0Var;
    }
}
