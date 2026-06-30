package yf2;

/* loaded from: classes3.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f461813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(mm2.n0 n0Var, yf2.i2 i2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461813e = n0Var;
        this.f461814f = i2Var;
        this.f461815g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.x1(this.f461813e, this.f461814f, this.f461815g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461812d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.n0 n0Var = this.f461813e;
            kotlinx.coroutines.flow.f3 f3Var = n0Var.f329265g;
            yf2.w1 w1Var = new yf2.w1(this.f461814f, n0Var, this.f461815g);
            this.f461812d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(w1Var, this) == aVar) {
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
