package xx3;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458006d;

    /* renamed from: e, reason: collision with root package name */
    public int f458007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f458008f;

    /* renamed from: g, reason: collision with root package name */
    public int f458009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t45.q f458010h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t45.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458010h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx3.e(this.f458010h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx3.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        t45.f fVar;
        java.lang.String str;
        java.lang.Object b17;
        int i18;
        t45.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f458009g;
        vx3.k kVar = vx3.l.E;
        if (i19 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            t45.q qVar = this.f458010h;
            t45.n0 n0Var = qVar.f415633e;
            if (n0Var != null) {
                int i27 = n0Var.f415615d;
                t45.l0 l0Var = qVar.f415632d;
                if (l0Var != null) {
                    i17 = l0Var.f415602e;
                    if (l0Var != null) {
                        int i28 = l0Var.f415603f;
                        if (n0Var == null) {
                            return null;
                        }
                        boolean z17 = false;
                        if (n0Var != null && n0Var.f415619h) {
                            z17 = true;
                        }
                        if (z17) {
                            return null;
                        }
                        if (i27 != 2) {
                            vx3.i h17 = vx3.k.h(kVar, i17, i28, n0Var, null, 8, null);
                            if (h17 == null) {
                                return null;
                            }
                            return new nx3.b(1, i17, i28, false, h17);
                        }
                        t45.g gVar2 = n0Var.f415617f;
                        if (gVar2 != null && (fVar = gVar2.f415560d) != null) {
                            long j17 = fVar.f415549d;
                            if (fVar != null && (str = fVar.f415550e) != null) {
                                this.f458008f = gVar2;
                                this.f458006d = i17;
                                this.f458007e = i28;
                                this.f458009g = 1;
                                b17 = xx3.h.b(j17, str, this);
                                if (b17 == aVar) {
                                    return aVar;
                                }
                                i18 = i28;
                                gVar = gVar2;
                            }
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        if (i19 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i18 = this.f458007e;
        int i29 = this.f458006d;
        t45.g gVar3 = (t45.g) this.f458008f;
        kotlin.ResultKt.throwOnFailure(obj);
        i17 = i29;
        gVar = gVar3;
        b17 = obj;
        xx3.a aVar2 = (xx3.a) b17;
        if (aVar2 == null) {
            return null;
        }
        return new nx3.b(2, i17, i18, aVar2.f457994b, kVar.d(i17, i18, gVar, aVar2.f457993a));
    }
}
