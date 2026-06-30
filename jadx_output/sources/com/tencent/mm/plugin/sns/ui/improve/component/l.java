package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168930d;

    /* renamed from: e, reason: collision with root package name */
    public int f168931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.m f168932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.sns.ui.improve.component.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168932f = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        com.tencent.mm.plugin.sns.ui.improve.component.l lVar = new com.tencent.mm.plugin.sns.ui.improve.component.l(this.f168932f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f168931e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.f168932f.O6().iterator();
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
                throw illegalStateException;
            }
            it = (java.util.Iterator) this.f168930d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            tc4.s0 s0Var = (tc4.s0) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", "release: " + s0Var.hashCode());
            s0Var.d();
            this.f168930d = it;
            this.f168931e = 1;
            if (s0Var.g(this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
                return aVar;
            }
        }
        this.f168932f.O6().clear();
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC$onDestroy$1");
        return f0Var;
    }
}
