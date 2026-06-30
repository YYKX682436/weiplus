package dh2;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f232454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dh2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f232455e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dh2.o(this.f232455e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dh2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f232454d;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return jz5.f0.f302826a;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        dh2.x xVar = this.f232455e;
        int ordinal = xVar.f232472i.ordinal();
        if (ordinal == 0) {
            kotlinx.coroutines.flow.j2 j2Var = ((om2.e) xVar.f232468e.a(om2.e.class)).f346290f;
            dh2.l lVar = new dh2.l(xVar);
            this.f232454d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(lVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        if (ordinal == 1) {
            mm2.m6 m6Var = (mm2.m6) xVar.f232468e.a(mm2.m6.class);
            kotlinx.coroutines.flow.f2 f2Var = new kotlinx.coroutines.flow.f2(m6Var.f329256x, m6Var.f329251s, new dh2.m(null));
            dh2.n nVar = new dh2.n(xVar);
            this.f232454d = 2;
            if (f2Var.a(nVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
