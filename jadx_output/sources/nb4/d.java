package nb4;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f336067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nb4.m mVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f336066d = mVar;
        this.f336067e = j17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        nb4.d dVar = new nb4.d(this.f336066d, this.f336067e, (kotlin.coroutines.Continuation) obj3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nb4.m mVar = this.f336066d;
        java.lang.String N6 = nb4.m.N6(mVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion:");
        long j17 = this.f336067e;
        sb6.append(ca4.z0.t0(j17));
        com.tencent.mars.xlog.Log.i(N6, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        java.util.HashSet hashSet = mVar.f336088f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        hashSet.remove(new java.lang.Long(j17));
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        return f0Var;
    }
}
