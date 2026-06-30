package nf2;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.w f336791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(nf2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336791e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nf2.q qVar = new nf2.q(this.f336791e, continuation);
        qVar.f336790d = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nf2.q qVar = (nf2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f336790d;
        nf2.w wVar = this.f336791e;
        kotlinx.coroutines.l.d(y0Var, null, null, new nf2.k(wVar, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new nf2.m(wVar, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new nf2.p(wVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
