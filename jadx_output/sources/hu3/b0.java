package hu3;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285091e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.b0(this.f285091e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r2 release;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285090d;
        hu3.n0 n0Var = this.f285091e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f285090d = 1;
            if (n0Var.g(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                n0Var.f285162f = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "MaasManager release");
                i95.m c17 = i95.n0.c(pp0.q0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pp0.q0.od((pp0.q0) c17, false, 1, null);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pp0.p0 p0Var = n0Var.f285162f;
        if (p0Var != null && (release = p0Var.release()) != null) {
            this.f285090d = 2;
            if (release.C(this) == aVar) {
                return aVar;
            }
        }
        n0Var.f285162f = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "MaasManager release");
        i95.m c172 = i95.n0.c(pp0.q0.class);
        kotlin.jvm.internal.o.f(c172, "getService(...)");
        pp0.q0.od((pp0.q0) c172, false, 1, null);
        return jz5.f0.f302826a;
    }
}
