package nu0;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(nu0.b4 b4Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340092e = b4Var;
        this.f340093f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.s2(this.f340092e, this.f340093f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340091d;
        nu0.b4 b4Var = this.f340092e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b4Var.getClass();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(this.f340093f));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "reportMaasExportCanceled");
            b4Var.L("MCExport", "MJImageComposing", "", 1);
            b4Var.L("CompressVideo", "", "", 1);
            jx0.k kVar = b4Var.T.f285615b;
            if (kVar.isShowing()) {
                kVar.dismiss();
            }
            b4Var.z7(nu0.c1.f339896f);
            this.f340091d = 1;
            if (b4Var.y7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                hx0.e eVar = b4Var.T;
                eVar.getClass();
                eVar.a(hx0.c.f285610m);
                hx0.f.b(b4Var);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        nu0.r2 r2Var = new nu0.r2(b4Var, null);
        this.f340091d = 2;
        if (kotlinx.coroutines.l.g(g3Var, r2Var, this) == aVar) {
            return aVar;
        }
        hx0.e eVar2 = b4Var.T;
        eVar2.getClass();
        eVar2.a(hx0.c.f285610m);
        hx0.f.b(b4Var);
        return jz5.f0.f302826a;
    }
}
