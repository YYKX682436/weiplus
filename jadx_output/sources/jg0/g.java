package jg0;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f299569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jg0.x xVar, qi3.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299568d = xVar;
        this.f299569e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.g(this.f299568d, this.f299569e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.g) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jg0.x xVar = this.f299568d;
        cg0.d dVar = xVar.f299638i;
        z15.b bVar = new z15.b();
        cg0.d dVar2 = xVar.f299638i;
        bVar.u(dVar2.f41055h);
        bVar.t(false);
        bVar.q(dVar2.f41056i);
        bVar.r(c01.z1.r());
        dVar.f41052e = bVar;
        java.lang.String str = "newSendVoice_" + dVar2.f41049b;
        w21.w0 w0Var = new w21.w0();
        w0Var.f442485b = dVar2.f41049b;
        w0Var.f442486c = dVar2.f41048a;
        long j17 = 1000;
        w0Var.f442493j = java.lang.System.currentTimeMillis() / j17;
        w0Var.f442487d = str;
        w0Var.f442494k = java.lang.System.currentTimeMillis() / j17;
        w0Var.f442492i = 1;
        w0Var.f442497n = c01.z1.r();
        w0Var.f442484a = -1;
        ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).getClass();
        boolean L0 = w21.p0.Di().L0(w0Var);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!L0) {
            this.f299569e.f363700a = -520014;
        }
        return f0Var;
    }
}
