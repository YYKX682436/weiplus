package e0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.u1 f245661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.k0 f245662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e0.u1 u1Var, z.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245661e = u1Var;
        this.f245662f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e0.p(this.f245661e, this.f245662f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245660d;
        e0.u1 u1Var = this.f245661e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                boolean e17 = u1Var.f245707b.e();
                z.p pVar = this.f245662f;
                if (e17) {
                    pVar = pVar instanceof z.p1 ? (z.p1) pVar : e0.r.f245693a;
                }
                z.p pVar2 = pVar;
                z.e eVar = u1Var.f245707b;
                p2.m mVar = new p2.m(u1Var.f245708c);
                this.f245660d = 1;
                if (z.e.c(eVar, mVar, pVar2, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((n0.q4) u1Var.f245709d).setValue(java.lang.Boolean.FALSE);
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return jz5.f0.f302826a;
    }
}
