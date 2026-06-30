package hr5;

/* loaded from: classes15.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f284358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.l f284360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hr5.a1 a1Var, zq5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284359e = a1Var;
        this.f284360f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr5.i0(this.f284359e, this.f284360f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zq5.v a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284358d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hr5.a1 a1Var = this.f284359e;
            long j17 = a1Var.f284281e;
            zq5.g gVar = new zq5.g(j17);
            if (!zq5.h.c(j17)) {
                gVar = null;
            }
            if (gVar == null) {
                return java.lang.Boolean.FALSE;
            }
            long j18 = gVar.f475067a;
            long j19 = a1Var.f284282f;
            zq5.g gVar2 = zq5.h.c(j19) ? new zq5.g(j19) : null;
            if (gVar2 == null) {
                return java.lang.Boolean.FALSE;
            }
            long j27 = gVar2.f475067a;
            float c17 = a1Var.f284297u.c();
            zq5.v vVar = a1Var.f284295s;
            zq5.v vVar2 = a1Var.f284296t;
            long j28 = vVar2.f475096b;
            float b17 = zq5.q.b(vVar2.f475095a);
            zq5.n containsWithDelta = a1Var.F;
            float f17 = a1Var.f284298v;
            float f18 = a1Var.f284300x;
            float c18 = zq5.b.c(c17, new java.lang.Integer(2).intValue());
            boolean z17 = c18 >= zq5.b.c(f17, 2) && c18 <= zq5.b.c(f18, 2);
            kotlin.jvm.internal.o.g(containsWithDelta, "$this$containsWithDelta");
            boolean z18 = zq5.l.b(j28) - containsWithDelta.f475082a >= -1.0f && zq5.l.b(j28) - containsWithDelta.f475084c < 1.0f && zq5.l.c(j28) - containsWithDelta.f475083b >= -1.0f && zq5.l.c(j28) - containsWithDelta.f475085d < 1.0f;
            if (z17 && z18) {
                return java.lang.Boolean.FALSE;
            }
            zq5.l lVar = this.f284360f;
            long i18 = a1Var.i(lVar != null ? lVar.f475080a : zq5.u.b(zq5.h.g(j18)));
            float d17 = a1Var.d(e06.p.e(c17, f17, f18) / vVar.c(), false);
            a17 = vVar2.a((r20 & 1) != 0 ? vVar2.f475095a : zq5.s.a(d17, d17), (r20 & 2) != 0 ? vVar2.f475096b : a1Var.c(hr5.b1.e(vVar2.c(), vVar2.f475096b, d17, hr5.b1.g(j18, j27, a1Var.f284284h, a1Var.f284285i, a1Var.f284286j, 0, b17, j28, i18), zq5.l.f475077b, 0.0f), d17), (r20 & 4) != 0 ? vVar2.f475097c : 0.0f, (r20 & 8) != 0 ? vVar2.f475098d : 0L, (r20 & 16) != 0 ? vVar2.f475099e : 0L);
            a1Var.f284277a.a(new hr5.h0(a1Var, this.f284360f, c17, f17, f18, containsWithDelta, j28, vVar2, a17));
            hr5.a1 a1Var2 = this.f284359e;
            java.lang.Integer num = new java.lang.Integer(32);
            gr5.d dVar = a1Var.f284292p;
            this.f284358d = 1;
            if (hr5.a1.a(a1Var2, a17, num, dVar, "rollback", this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return java.lang.Boolean.TRUE;
    }
}
