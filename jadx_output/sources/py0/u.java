package py0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.y f359017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f359018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(py0.y yVar, dz0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359017e = yVar;
        this.f359018f = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.u uVar = new py0.u(this.f359017e, this.f359018f, (kotlin.coroutines.Continuation) obj3);
        uVar.f359016d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MaasBaseUILogicUIC", (java.lang.Throwable) this.f359016d, "maas error", new java.lang.Object[0]);
        this.f359017e.P6().dismiss();
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) this.f359018f).r7(com.tencent.mm.R.string.m6j);
        return jz5.f0.f302826a;
    }
}
