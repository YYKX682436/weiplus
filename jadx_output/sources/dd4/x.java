package dd4;

/* loaded from: classes3.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229067d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f229069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fk4.k f229070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.l lVar, fk4.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229069f = lVar;
        this.f229070g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        dd4.x xVar = new dd4.x(this.f229069f, this.f229070g, continuation);
        xVar.f229068e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        java.lang.Object invokeSuspend = ((dd4.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229067d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f229068e;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
                throw illegalStateException;
            }
            y0Var = (kotlinx.coroutines.y0) this.f229068e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.z0.h(y0Var)) {
            this.f229069f.invoke(new java.lang.Float(this.f229070g.f263622j));
            this.f229068e = y0Var;
            this.f229067d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
                return aVar;
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        return f0Var;
    }
}
