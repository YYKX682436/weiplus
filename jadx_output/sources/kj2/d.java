package kj2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f308392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kj2.o oVar, r45.xn1 xn1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308391d = oVar;
        this.f308392e = xn1Var;
        this.f308393f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kj2.d(this.f308391d, this.f308392e, this.f308393f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kj2.d dVar = (kj2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kj2.o oVar = this.f308391d;
        int b17 = oVar.f308424c.b();
        int i17 = b17 == 0 ? 1 : 2;
        dk2.xf k17 = dk2.ef.f233372a.k(oVar.f308423b);
        if (k17 != null) {
            ((dk2.r4) k17).k(this.f308392e, b17, i17, new kj2.c(oVar, this.f308393f));
        }
        return jz5.f0.f302826a;
    }
}
