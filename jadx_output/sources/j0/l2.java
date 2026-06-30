package j0;

/* loaded from: classes14.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f296428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.l3 f296429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p1.a0 a0Var, j0.l3 l3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296428e = a0Var;
        this.f296429f = l3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j0.l2(this.f296428e, this.f296429f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296427d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f296427d = 1;
            j0.l3 l3Var = this.f296429f;
            j0.r2 r2Var = new j0.r2(l3Var);
            j0.s2 s2Var = new j0.s2(l3Var);
            j0.t2 t2Var = new j0.t2(l3Var);
            j0.u2 u2Var = new j0.u2(l3Var);
            float f17 = b0.p0.f16470a;
            java.lang.Object b17 = b0.u1.b(this.f296428e, new b0.h0(r2Var, u2Var, t2Var, s2Var, null), this);
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
