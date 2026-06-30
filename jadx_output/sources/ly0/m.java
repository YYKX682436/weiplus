package ly0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ly0.n f322214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ly0.o f322215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ly0.n nVar, ly0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322214d = nVar;
        this.f322215e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ly0.m(this.f322214d, this.f322215e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ly0.m mVar = (ly0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ky0.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ky0.b bVar = ky0.b.f313452a;
        int ordinal = this.f322214d.f322216a.ordinal();
        if (ordinal == 0) {
            aVar = ky0.a.f313449d;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            aVar = ky0.a.f313450e;
        }
        bVar.a(aVar, this.f322214d.f322224i);
        this.f322214d.f322219d = ly0.e.f322192e;
        ly0.d dVar = (ly0.d) kotlinx.coroutines.l.f(null, new ly0.l(this.f322214d, null), 1, null);
        this.f322214d.f322221f = dVar;
        if (dVar.f322189c <= 0 || dVar.f322190d <= 0) {
            this.f322214d.f322219d = ly0.e.f322193f;
        } else {
            this.f322214d.f322219d = ly0.e.f322194g;
            ly0.n nVar = this.f322214d;
            nVar.getClass();
            nVar.f322222g = kotlinx.coroutines.l.d(nVar.f322220e, nVar.f322227l, null, new ly0.j(new ly0.h(dVar, nVar, null), null), 2, null);
            ly0.o oVar = this.f322215e;
            if (oVar != null) {
                oVar.b();
            }
        }
        this.f322214d.getClass();
        return jz5.f0.f302826a;
    }
}
