package fj1;

/* loaded from: classes7.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f263123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f263124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fj1.y f263125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fj1.n f263126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f263127h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, fj1.y yVar, fj1.n nVar, lc3.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263124e = k0Var;
        this.f263125f = yVar;
        this.f263126g = nVar;
        this.f263127h = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fj1.m(this.f263124e, this.f263125f, this.f263126g, this.f263127h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fj1.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f263123d;
        java.lang.Object obj2 = this.f263124e;
        fj1.y yVar = this.f263125f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
            com.tencent.mm.plugin.appbrand.jsapi.f fVar = (com.tencent.mm.plugin.appbrand.jsapi.f) obj2;
            fj1.b0 b0Var = yVar.f263151k;
            if (b0Var == null) {
                kotlin.jvm.internal.o.o("jsapiInvokePermissionController");
                throw null;
            }
            this.f263123d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            si1.j b17 = b0Var.f263106b.b(b0Var.f263105a.d(), fVar, "", "", 0, new fj1.a0(rVar));
            if (b17.f408270a != -2 && rVar.n()) {
                rVar.resumeWith(kotlin.Result.m521constructorimpl(b17));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        si1.j jVar = (si1.j) obj;
        int i18 = jVar.f408270a;
        fj1.n nVar = this.f263126g;
        if (i18 == 0) {
            int b07 = yVar.d().b0(nVar.s());
            if (obj2 instanceof com.tencent.mm.plugin.appbrand.jsapi.g) {
                com.tencent.mm.plugin.appbrand.jsapi.ff ffVar = new com.tencent.mm.plugin.appbrand.jsapi.ff(null, yVar.d(), this.f263127h, null, b07);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApiEx<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
                ((com.tencent.mm.plugin.appbrand.jsapi.g) obj2).h(ffVar);
            } else {
                boolean z17 = obj2 instanceof yc1.c;
                lc3.a0 a0Var = this.f263127h;
                if (z17) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.f) obj2).B(yVar.d(), a0Var, b07, yVar.d().getF147808e());
                } else {
                    ((com.tencent.mm.plugin.appbrand.jsapi.f) obj2).A(yVar.d(), a0Var, b07);
                }
            }
        } else {
            yz5.l s17 = nVar.s();
            lc3.a0 c17 = fj1.q.c(jVar.f408272c);
            kotlin.jvm.internal.o.f(c17, "errorsInfoToJson(...)");
            s17.invoke(c17);
        }
        return jz5.f0.f302826a;
    }
}
