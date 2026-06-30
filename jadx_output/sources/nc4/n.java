package nc4;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nc4.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336167e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        nc4.n nVar = new nc4.n(this.f336167e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        java.lang.Object invokeSuspend = ((nc4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        nc4.g0 g0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336166d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Iterator it = nc4.d0.P6(this.f336167e).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    g0Var = null;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (entry.getValue() instanceof nc4.g0) {
                    java.lang.Object value = entry.getValue();
                    if (value == null) {
                        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
                        throw nullPointerException;
                    }
                    g0Var = (nc4.g0) value;
                }
            }
            if (g0Var != null) {
                nc4.m mVar = nc4.m.f336165d;
                this.f336166d = 1;
                if (g0Var.b(mVar, this) == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
        return f0Var;
    }
}
