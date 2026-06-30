package l0;

/* loaded from: classes14.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314404d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f314407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.p f314408h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(l0.a3 a3Var, float f17, z.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314406f = a3Var;
        this.f314407g = f17;
        this.f314408h = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        l0.o2 o2Var = new l0.o2(this.f314406f, this.f314407g, this.f314408h, continuation);
        o2Var.f314405e = obj;
        return o2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.o2) create((b0.u0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f314404d;
        l0.a3 a3Var = this.f314406f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                b0.u0 u0Var = (b0.u0) this.f314405e;
                kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
                e0Var.f310115d = ((java.lang.Number) ((n0.q4) a3Var.f314034g).getValue()).floatValue();
                n0.v2 v2Var = a3Var.f314035h;
                float f17 = this.f314407g;
                ((n0.q4) v2Var).setValue(new java.lang.Float(f17));
                ((n0.q4) a3Var.f314031d).setValue(java.lang.Boolean.TRUE);
                z.e a17 = z.f.a(e0Var.f310115d, 0.0f, 2, null);
                java.lang.Float f18 = new java.lang.Float(f17);
                z.p pVar = this.f314408h;
                l0.n2 n2Var = new l0.n2(u0Var, e0Var);
                this.f314404d = 1;
                if (z.e.c(a17, f18, pVar, null, n2Var, this, 4, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((n0.q4) a3Var.f314035h).setValue(null);
            ((n0.q4) a3Var.f314031d).setValue(java.lang.Boolean.FALSE);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((n0.q4) a3Var.f314035h).setValue(null);
            ((n0.q4) a3Var.f314031d).setValue(java.lang.Boolean.FALSE);
            throw th6;
        }
    }
}
