package yf2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.o f461681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yf2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461681e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.e(this.f461681e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461680d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yf2.o oVar = this.f461681e;
            mm2.n0 n0Var = (mm2.n0) oVar.business(mm2.n0.class);
            if (re2.j1.f394437a.a() != null) {
                yf2.o.a7(oVar);
            }
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = n0Var.O6();
            kotlinx.coroutines.flow.f3 f3Var = n0Var.f329265g;
            yf2.d dVar = new yf2.d(n0Var, c0Var, oVar);
            this.f461680d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
