package lc4;

/* loaded from: classes4.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f317999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f318000e;

    /* renamed from: f, reason: collision with root package name */
    public int f318001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f318002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f318003h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318002g = improveDataUIC;
        this.f318003h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        lc4.y yVar = new lc4.y(this.f318002g, this.f318003h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        java.lang.Object invokeSuspend = ((lc4.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.f0 f0Var;
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f318001f;
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = this.f318002g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            lc4.d dVar = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSessionId$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            improveDataUIC.f168772m = currentTimeMillis2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSessionId$p", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            lc4.x xVar = new lc4.x(improveDataUIC, f0Var2, null);
            this.f318000e = f0Var2;
            this.f317999d = currentTimeMillis;
            this.f318001f = 1;
            if (kotlinx.coroutines.l.g(p0Var, xVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
                return aVar;
            }
            f0Var = f0Var2;
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
                throw illegalStateException;
            }
            j17 = this.f317999d;
            f0Var = (kotlin.jvm.internal.f0) this.f318000e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lc4.d dVar2 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView overScrollView = improveDataUIC.getOverScrollView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        overScrollView.b();
        i64.u1.c(210, (int) (java.lang.System.currentTimeMillis() - j17), f0Var.f310116d, java.lang.String.valueOf(this.f318003h));
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "refreshJob finish");
        int i18 = f0Var.f310116d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkWhenDataNotEnough", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        improveDataUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkWhenDataNotEnough", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        if (i18 < 5) {
            pf5.e.launch$default(improveDataUIC, kotlinx.coroutines.q1.f310568a, null, new lc4.h(improveDataUIC, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWhenDataNotEnough", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkWhenDataNotEnough", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$refresh$1");
        return f0Var3;
    }
}
