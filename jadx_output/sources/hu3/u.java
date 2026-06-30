package hu3;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285204d;

    /* renamed from: e, reason: collision with root package name */
    public int f285205e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285207g = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hu3.u uVar = new hu3.u(this.f285207g, continuation);
        uVar.f285206f = obj;
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        hu3.n0 n0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285205e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        hu3.n0 n0Var2 = this.f285207g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f285206f;
            pp0.q0 q0Var = (pp0.q0) i95.n0.c(pp0.q0.class);
            this.f285206f = y0Var2;
            this.f285204d = n0Var2;
            this.f285205e = 1;
            ((yy0.k8) q0Var).getClass();
            az0.i5 i5Var = az0.i5.f15557a;
            az0.i5.s(i5Var, true, null, false, 6, null);
            java.lang.Object g17 = kotlinx.coroutines.l.g(i5Var.r().getF11582e(), new az0.f3(null), this);
            if (g17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = g17;
            n0Var = n0Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (hu3.n0) this.f285204d;
            y0Var = (kotlinx.coroutines.y0) this.f285206f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pp0.p0 p0Var = (pp0.p0) obj;
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfessionalTemplateCorePlugin", "createImproveCamManager error");
            kotlinx.coroutines.z0.d(y0Var, "createImproveCamManager error", null, 2, null);
            return f0Var;
        }
        n0Var.f285162f = p0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "finished create createImproveCamManager");
        n0Var2.f285170q.start();
        this.f285206f = null;
        this.f285204d = null;
        this.f285205e = 2;
        n0Var2.getClass();
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g18 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new hu3.a0(n0Var2, null), this);
        if (g18 != aVar) {
            g18 = f0Var;
        }
        return g18 == aVar ? aVar : f0Var;
    }
}
