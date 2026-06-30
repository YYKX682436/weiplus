package hr5;

/* loaded from: classes15.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f284304d;

    /* renamed from: e, reason: collision with root package name */
    public int f284305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f284307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284308h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hr5.a1 a1Var, long j17, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284306f = a1Var;
        this.f284307g = j17;
        this.f284308h = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr5.b0(this.f284306f, this.f284307g, this.f284308h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zq5.n nVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284305e;
        hr5.a1 a1Var = this.f284306f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j17 = a1Var.f284281e;
                zq5.g gVar = new zq5.g(j17);
                if (!zq5.h.c(j17)) {
                    gVar = null;
                }
                if (gVar == null) {
                    return java.lang.Boolean.FALSE;
                }
                long j18 = a1Var.f284282f;
                if ((zq5.h.c(j18) ? new zq5.g(j18) : null) == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f284305e = 1;
                if (a1Var.g("fling", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = (zq5.n) this.f284304d;
                    kotlin.ResultKt.throwOnFailure(obj);
                    a1Var.f284277a.a(new hr5.a0(a1Var, nVar, this.f284307g));
                    a1Var.f(0);
                    return java.lang.Boolean.TRUE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            a1Var.f(16);
            hr5.a1 a1Var2 = this.f284306f;
            long j19 = a1Var2.f284296t.f475096b;
            zq5.n nVar2 = a1Var2.F;
            a1Var2.f284277a.a(new hr5.w(a1Var2, j19, nVar2, this.f284307g));
            hr5.a1 a1Var3 = this.f284306f;
            hr5.a aVar2 = a1Var3.f284279c;
            long j27 = this.f284307g;
            java.util.Map map = this.f284308h;
            hr5.y yVar = new hr5.y(a1Var3, j27, j19);
            hr5.z zVar = hr5.z.f284502d;
            this.f284304d = nVar2;
            this.f284305e = 2;
            if (((fr5.p0) aVar2).b(j19, nVar2, j27, map, yVar, zVar, this) == aVar) {
                return aVar;
            }
            nVar = nVar2;
            a1Var.f284277a.a(new hr5.a0(a1Var, nVar, this.f284307g));
            a1Var.f(0);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Throwable th6) {
            a1Var.f(0);
            throw th6;
        }
    }
}
