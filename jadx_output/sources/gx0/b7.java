package gx0;

/* loaded from: classes5.dex */
public final class b7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276232e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.b7(this.f276232e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.b7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276231d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        gx0.w8 w8Var = this.f276232e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.x4 x4Var = (gx0.x4) ((jz5.n) w8Var.f348901o).getValue();
            this.f276231d = 1;
            if (!x4Var.q() || (obj2 = x4Var.X6().q(false, this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jx0.k kVar = w8Var.V.f285615b;
        if (!kVar.isShowing()) {
            kVar.show();
        }
        return f0Var;
    }
}
