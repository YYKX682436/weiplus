package mm2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f329424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.u0 f329425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i17, mm2.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329424e = i17;
        this.f329425f = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.t0(this.f329424e, this.f329425f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329423d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f329424e * 1000;
            this.f329423d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mm2.u0 u0Var = this.f329425f;
        kotlinx.coroutines.r2 r2Var = u0Var.f329450p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        u0Var.f329450p = null;
        pm0.v.X(new mm2.p0(u0Var));
        return jz5.f0.f302826a;
    }
}
