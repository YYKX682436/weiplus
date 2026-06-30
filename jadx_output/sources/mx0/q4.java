package mx0;

/* loaded from: classes5.dex */
public final class q4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332258e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.q4(this.f332258e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332257d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yx0.b8 b8Var = this.f332258e.f69557v;
            this.f332257d = 1;
            b8Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "pauseMusic");
            java.lang.Object C = ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.d4(b8Var, null), 3, null)).C(this);
            if (C != aVar) {
                C = f0Var;
            }
            if (C == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
