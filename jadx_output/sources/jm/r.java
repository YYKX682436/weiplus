package jm;

/* loaded from: classes9.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm.y f300247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.a0 f300248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jm.y yVar, qi3.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300247d = yVar;
        this.f300248e = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jm.r(this.f300247d, this.f300248e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jm.r rVar = (jm.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((java.util.HashSet) ((jz5.n) this.f300247d.f300259n).getValue()).add(new d75.c(this.f300248e));
        return jz5.f0.f302826a;
    }
}
