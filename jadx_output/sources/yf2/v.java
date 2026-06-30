package yf2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f461797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf2.z f461799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mm2.n0 n0Var, java.lang.String str, yf2.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461797e = n0Var;
        this.f461798f = str;
        this.f461799g = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.v(this.f461797e, this.f461798f, this.f461799g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461796d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.n0 n0Var = this.f461797e;
            kotlinx.coroutines.flow.f3 f3Var = n0Var.f329265g;
            yf2.u uVar = new yf2.u(n0Var, this.f461798f, this.f461799g);
            this.f461796d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(uVar, this) == aVar) {
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
