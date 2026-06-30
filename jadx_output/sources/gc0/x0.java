package gc0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {
    public x0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.x0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gc0.x0 x0Var = new gc0.x0((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gc0.d3 d3Var = gc0.d3.f270131a;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkDebugModel()) == 1 && (!r26.n0.N(gc0.d3.f270135e))) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.n("不再显示");
            u1Var.g(gc0.d3.f270135e);
            u1Var.a(true);
            u1Var.b(gc0.z2.f270396a);
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
