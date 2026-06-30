package gx0;

/* loaded from: classes5.dex */
public final class v6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(gx0.w8 w8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277061e = w8Var;
        this.f277062f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.v6(this.f277061e, this.f277062f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.v6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277060d;
        gx0.w8 w8Var = this.f277061e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            w8Var.getClass();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(this.f277062f));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "reportMaasExportCanceled");
            w8Var.L("MCExport", "MJMovieComposing", "", 1);
            w8Var.L("CompressVideo", "", "", 1);
            w8Var.G7();
            jx0.k kVar = w8Var.V.f285615b;
            if (kVar.isShowing()) {
                kVar.dismiss();
            }
            w8Var.J7(gx0.y4.f277202f);
            this.f277060d = 1;
            if (w8Var.I7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                hx0.e eVar = w8Var.V;
                eVar.getClass();
                eVar.a(hx0.c.f285610m);
                hx0.f.b(w8Var);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        gx0.u6 u6Var = new gx0.u6(w8Var, null);
        this.f277060d = 2;
        if (kotlinx.coroutines.l.g(g3Var, u6Var, this) == aVar) {
            return aVar;
        }
        hx0.e eVar2 = w8Var.V;
        eVar2.getClass();
        eVar2.a(hx0.c.f285610m);
        hx0.f.b(w8Var);
        return jz5.f0.f302826a;
    }
}
