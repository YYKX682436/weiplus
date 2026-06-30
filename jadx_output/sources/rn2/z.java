package rn2;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f397930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f397931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f397930d = hVar;
        this.f397931e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.z(this.f397930d, continuation, this.f397931e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rn2.z zVar = (rn2.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.oz1 oz1Var = (r45.oz1) ((xg2.i) this.f397930d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderLiveMakeLotteryOrderRequest] sucess, pb = ");
        kotlin.jvm.internal.o.d(oz1Var);
        sb6.append(pm0.b0.g(oz1Var));
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryGiftCreate", sb6.toString());
        this.f397931e.f310123d = oz1Var;
        return jz5.f0.f302826a;
    }
}
