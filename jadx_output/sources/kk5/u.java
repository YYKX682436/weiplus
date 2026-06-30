package kk5;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.w f308689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f308690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kk5.w wVar, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308689d = wVar;
        this.f308690e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.u(this.f308689d, this.f308690e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.u uVar = (kk5.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean a17 = g95.e.f269801a.a();
        java.util.ArrayList i17 = b93.r.wi().i1();
        boolean z17 = !(i17 == null || i17.isEmpty());
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = this.f308689d.O6();
        if (O6 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new kk5.t(a17, this.f308689d, this.f308690e, z17, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
