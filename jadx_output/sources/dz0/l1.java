package dz0;

/* loaded from: classes5.dex */
public final class l1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244928e = maasSdkUIC;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.l1 l1Var = new dz0.l1(this.f244928e, (kotlin.coroutines.Continuation) obj3);
        l1Var.f244927d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        l1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MaasMultiTemplate.MaasSdkUIC", (java.lang.Throwable) this.f244927d, "creation error", new java.lang.Object[0]);
        dz0.k kVar = this.f244928e.f69785f;
        if (kVar != null) {
            kVar.t("creation error");
        }
        return jz5.f0.f302826a;
    }
}
