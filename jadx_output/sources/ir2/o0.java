package ir2;

/* loaded from: classes2.dex */
public final class o0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f294198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.a0 f294200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ir2.a1 a1Var, ir2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f294199e = a1Var;
        this.f294200f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ir2.o0(this.f294199e, this.f294200f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((ir2.o0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294198d;
        ir2.a1 a1Var = this.f294199e;
        ir2.a0 a0Var = this.f294200f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.n0 n0Var = new ir2.n0(a0Var);
            ir2.g0 g0Var = ir2.a1.f294089r;
            a1Var.getClass();
            ir2.r1 r1Var = new ir2.r1(n0Var, null, null, 2, null);
            this.f294198d = 1;
            obj = ay1.l.j(r1Var, false, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ir2.e1 e1Var = (ir2.e1) obj;
        boolean z17 = e1Var instanceof ir2.a;
        if (z17) {
            ir2.c cVar = a0Var instanceof ir2.c ? (ir2.c) a0Var : null;
            if (cVar != null) {
                ir2.a aVar2 = z17 ? (ir2.a) e1Var : null;
                cVar.f294118d = aVar2 != null ? aVar2.f294083e : null;
            }
        }
        ir2.t tVar = new ir2.t(e1Var, null, 2, null);
        this.f294198d = 2;
        if (a1Var.T6(tVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
