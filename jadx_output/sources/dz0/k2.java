package dz0;

/* loaded from: classes5.dex */
public final class k2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, java.lang.String str, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244915e = maasSdkUIC;
        this.f244916f = str;
        this.f244917g = n7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        az0.n7 n7Var = this.f244917g;
        dz0.k2 k2Var = new dz0.k2(this.f244915e, this.f244916f, n7Var, (kotlin.coroutines.Continuation) obj3);
        k2Var.f244914d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        k2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Throwable) this.f244914d) == null) {
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244915e;
            maasSdkUIC.t7();
            maasSdkUIC.f69789m.b(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.O6(maasSdkUIC));
            dz0.x xVar = maasSdkUIC.f69789m;
            com.tencent.maas.model.MJMusicInfo currentMusicInfo = this.f244917g.f15742a.getCurrentMusicInfo();
            if (currentMusicInfo == null) {
                currentMusicInfo = new com.tencent.maas.model.MJMusicInfo("", "", "", com.tencent.maas.model.time.MJTime.InvalidTime, new java.lang.Object[0]);
            }
            xVar.a(currentMusicInfo);
        }
        return jz5.f0.f302826a;
    }
}
