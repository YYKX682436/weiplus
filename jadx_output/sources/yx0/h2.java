package yx0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467355d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467357f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yx0.h2 h2Var = new yx0.h2(this.f467357f, continuation);
        h2Var.f467356e = obj;
        return h2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467355d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f467356e;
            pp0.q0 q0Var = (pp0.q0) i95.n0.c(pp0.q0.class);
            this.f467356e = y0Var;
            this.f467355d = 1;
            ((yy0.k8) q0Var).getClass();
            obj = az0.i5.f15557a.y("doCreateSafeCamSession", new az0.q3(null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pp0.p0 p0Var = (pp0.p0) this.f467356e;
                kotlin.ResultKt.throwOnFailure(obj);
                return p0Var;
            }
            y0Var = (kotlinx.coroutines.y0) this.f467356e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pp0.p0 p0Var2 = (pp0.p0) obj;
        if (p0Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "createImproveCamManager error");
            kotlinx.coroutines.z0.d(y0Var, "createImproveCamManager error", null, 2, null);
            return null;
        }
        this.f467357f.K = p0Var2;
        yx0.b8 b8Var = this.f467357f;
        pp0.p0 p0Var3 = b8Var.K;
        if (p0Var3 != null && (p0Var3 instanceof az0.xb)) {
            b8Var.f467177d.setCameraUsage((bs0.j) p0Var3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "finished create createImproveCamManager");
        yx0.b8 b8Var2 = this.f467357f;
        this.f467356e = p0Var2;
        this.f467355d = 2;
        b8Var2.getClass();
        kotlinx.coroutines.p0 p0Var4 = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new yx0.o4(b8Var2, p0Var2, null), this);
        if (g17 != aVar) {
            g17 = jz5.f0.f302826a;
        }
        return g17 == aVar ? aVar : p0Var2;
    }
}
