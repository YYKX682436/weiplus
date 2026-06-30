package dz0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244939d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244940e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f244941f;

    /* renamed from: g, reason: collision with root package name */
    public int f244942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.d f244944i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dz0.v f244945m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244946n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.d dVar, dz0.v vVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244943h = maasSdkUIC;
        this.f244944i = dVar;
        this.f244945m = vVar;
        this.f244946n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.n(this.f244943h, this.f244944i, this.f244945m, this.f244946n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        az0.n7 n7Var;
        dz0.v vVar;
        yz5.l lVar;
        az0.n7 n7Var2;
        yz5.l lVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244942g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n7Var = this.f244943h.f69783d;
            if (n7Var != null) {
                az0.d dVar = this.f244944i;
                vVar = this.f244945m;
                lVar = this.f244946n;
                if (dVar != null) {
                    this.f244939d = vVar;
                    this.f244940e = lVar;
                    this.f244941f = n7Var;
                    this.f244942g = 1;
                    java.lang.Object c17 = ((dz0.k0) dVar).c(this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                    n7Var2 = n7Var;
                    obj = c17;
                    lVar2 = lVar;
                }
                vVar.f245032d = kotlinx.coroutines.b0.a(null, 1, null);
                dz0.m mVar = new dz0.m(vVar, lVar);
                n7Var.getClass();
                n7Var.f15742a.beginClipping(new az0.n5(mVar));
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n7Var2 = (az0.n7) this.f244941f;
        lVar2 = (yz5.l) this.f244940e;
        vVar = (dz0.v) this.f244939d;
        kotlin.ResultKt.throwOnFailure(obj);
        n7Var = n7Var2;
        lVar = lVar2;
        vVar.f245032d = kotlinx.coroutines.b0.a(null, 1, null);
        dz0.m mVar2 = new dz0.m(vVar, lVar);
        n7Var.getClass();
        n7Var.f15742a.beginClipping(new az0.n5(mVar2));
        return jz5.f0.f302826a;
    }
}
