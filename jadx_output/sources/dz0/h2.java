package dz0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f244870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(az0.n7 n7Var, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244871e = n7Var;
        this.f244872f = maasSdkUIC;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new dz0.h2(this.f244871e, this.f244872f, (kotlin.coroutines.Continuation) obj3).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244870d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.n7 n7Var = this.f244871e;
            if (n7Var.i() && !n7Var.g()) {
                com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "recreateWithTemplateID: start play");
                dz0.g2 g2Var = new dz0.g2(n7Var, null);
                this.f244870d = 1;
                if (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.P6(this.f244872f, g2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
