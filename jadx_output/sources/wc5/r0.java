package wc5;

/* loaded from: classes10.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444634d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(wc5.y0 y0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444636f = y0Var;
        this.f444637g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wc5.r0 r0Var = new wc5.r0(this.f444636f, this.f444637g, continuation);
        r0Var.f444635e = obj;
        return r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f444634d;
        wc5.y0 y0Var2 = this.f444636f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f444635e;
            long j17 = y0Var2.f444661i;
            this.f444635e = y0Var;
            this.f444634d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
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
            y0Var = (kotlinx.coroutines.y0) this.f444635e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.z0.g(y0Var);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        wc5.q0 q0Var = new wc5.q0(y0Var2, this.f444637g, null);
        this.f444635e = null;
        this.f444634d = 2;
        if (kotlinx.coroutines.l.g(g3Var, q0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
