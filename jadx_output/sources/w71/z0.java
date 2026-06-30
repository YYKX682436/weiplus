package w71;

/* loaded from: classes11.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.z f443475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(long j17, bw5.z zVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f443474e = j17;
        this.f443475f = zVar;
        this.f443476g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new w71.z0(this.f443474e, this.f443475f, this.f443476g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((w71.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f443473d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        long j17 = this.f443474e;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeCgi", "error " + j17 + ", " + e17.getMessage());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            w71.y0 y0Var = new w71.y0(this.f443476g, this.f443474e, e17, null);
            this.f443473d = 2;
            if (kotlinx.coroutines.l.g(g3Var, y0Var, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request ");
            sb6.append(j17);
            sb6.append(", cmdid ");
            bw5.z zVar = this.f443475f;
            sb6.append(zVar.b().f34882d);
            sb6.append(", data ");
            sb6.append(zVar.getData_().f192156a.length);
            sb6.append(", baseRequest ");
            sb6.append(zVar.f35751o);
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgi", sb6.toString());
            w71.k kVar = new w71.k(zVar);
            this.f443473d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            pq5.g l17 = kVar.l();
            l17.K(new w71.j(kVar, rVar));
            rVar.m(new w71.i(l17));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return f0Var;
                }
                if (i17 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bw5.a0 a0Var = (bw5.a0) obj;
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        w71.x0 x0Var = new w71.x0(this.f443474e, a0Var, this.f443476g, null);
        this.f443473d = 3;
        return kotlinx.coroutines.l.g(g3Var2, x0Var, this) == aVar ? aVar : f0Var;
    }
}
