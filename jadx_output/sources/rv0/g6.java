package rv0;

/* loaded from: classes5.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv0.h f400021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(rv0.z6 z6Var, sv0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400020d = z6Var;
        this.f400021e = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.g6(this.f400020d, this.f400021e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rv0.g6 g6Var = (rv0.g6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dx0.g gVar;
        dx0.g gVar2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rv0.z6 z6Var = this.f400020d;
        ex0.a0 v76 = z6Var.v7();
        sv0.h hVar = this.f400021e;
        if (v76 != null && (gVar2 = v76.H) != null) {
            gVar2.f(hVar.f413223a);
        }
        ex0.a0 v77 = z6Var.v7();
        if (v77 != null && (gVar = v77.H) != null) {
            gVar.b(hVar.f413223a);
        }
        return jz5.f0.f302826a;
    }
}
