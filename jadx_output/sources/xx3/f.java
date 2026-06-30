package xx3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f458011d;

    /* renamed from: e, reason: collision with root package name */
    public int f458012e;

    public f(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx3.f(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new xx3.f((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vx3.i d17;
        t45.n0 n0Var;
        t45.f0 f0Var;
        t45.g gVar;
        t45.f fVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458012e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (xx3.h.a()) {
                java.lang.String r17 = c01.z1.r();
                kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
                d17 = mx3.i0.d(r17);
                if (d17 == null) {
                    return null;
                }
                t45.n0 n0Var2 = d17.f441289f;
                java.lang.Integer num = n0Var2 != null ? new java.lang.Integer(n0Var2.f415615d) : null;
                if (num != null && num.intValue() == 2) {
                    t45.n0 n0Var3 = d17.f441289f;
                    if (n0Var3 == null || (gVar = n0Var3.f415617f) == null || (fVar = gVar.f415560d) == null) {
                        return null;
                    }
                    long j17 = fVar.f415549d;
                    if (n0Var3 == null || gVar == null || fVar == null || (str = fVar.f415550e) == null) {
                        return null;
                    }
                    this.f458011d = d17;
                    this.f458012e = 1;
                    obj = xx3.h.b(j17, str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (num != null && num.intValue() == 1 && (n0Var = d17.f441289f) != null && (f0Var = n0Var.f415616e) != null && f0Var.f415551d != null) {
                    return new nx3.b(1, (int) d17.f441285b, (int) d17.f441286c, false, d17);
                }
            }
            return null;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vx3.i iVar = (vx3.i) this.f458011d;
        kotlin.ResultKt.throwOnFailure(obj);
        d17 = iVar;
        xx3.a aVar2 = (xx3.a) obj;
        if (aVar2 == null) {
            return null;
        }
        d17.f441287d = aVar2.f457993a;
        boolean z17 = aVar2.f457994b;
        if (z17) {
            return null;
        }
        return new nx3.b(2, (int) d17.f441285b, (int) d17.f441286c, z17, d17);
    }
}
