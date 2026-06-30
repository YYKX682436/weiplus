package id2;

/* loaded from: classes.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(xg2.h hVar, kotlin.coroutines.Continuation continuation, id2.v1 v1Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f290751d = hVar;
        this.f290752e = v1Var;
        this.f290753f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.q0(this.f290751d, continuation, this.f290752e, this.f290753f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.q0 q0Var = (id2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.mf2 mf2Var = (r45.mf2) ((xg2.i) this.f290751d).f454393b;
        java.lang.String str = this.f290752e.f290834d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMakePackageOrderRequest] sucess, pb = ");
        kotlin.jvm.internal.o.d(mf2Var);
        sb6.append(pm0.b0.g(mf2Var));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        this.f290753f.f310123d = mf2Var;
        return jz5.f0.f302826a;
    }
}
