package fn5;

/* loaded from: classes14.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264774e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.z(this.f264774e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j jVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264773d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + java.lang.Thread.currentThread().getName());
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            aq.n nVar = aq.o.f12922c;
            if ((nVar != null ? nVar.f12906a : null) != aq.b.f12835d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq >> data is ready");
                aq.n nVar2 = aq.o.f12922c;
                if (nVar2 != null) {
                    nVar2.f12907b = fn5.p0.f264747d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "applyQueryNormalReq >> dataType: " + nVar2.f12906a + ", currentIdentifyType: " + aq.r0.f12953n);
                    aq.b bVar = nVar2.f12906a;
                    aq.b bVar2 = aq.b.f12836e;
                    f65.n nVar3 = f65.n.f259909a;
                    if (bVar == bVar2 || aq.r0.f12953n == aq.c.f12845g) {
                        f65.p.f259944k = nVar2.f12906a == bVar2 ? 3 : 1;
                        nVar3.b(true);
                        nVar3.a(true);
                        jVar = kotlinx.coroutines.flow.l.n(new kotlinx.coroutines.flow.m2(new aq.f(null)), kotlinx.coroutines.q1.f310570c);
                    } else {
                        f65.p.f259944k = 2;
                        nVar3.b(false);
                        nVar3.a(false);
                        nVar2.f12908c = 0;
                        nVar2.f12909d = -2;
                        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                        nVar2.f12914i = b17;
                        jVar = b17;
                    }
                    if (jVar != null) {
                        kotlinx.coroutines.flow.g0 g0Var = new kotlinx.coroutines.flow.g0(jVar, new fn5.w(this.f264774e, null));
                        fn5.y yVar = new fn5.y(this.f264774e);
                        this.f264773d = 2;
                        if (g0Var.a(yVar, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return jz5.f0.f302826a;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "when apply normal req >> data is no ready");
            this.f264773d = 1;
        } while (kotlinx.coroutines.k1.b(500L, this) != aVar);
        return aVar;
    }
}
