package dz0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f244954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(az0.n7 n7Var, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244955e = n7Var;
        this.f244956f = maasSdkUIC;
        this.f244957g = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = this.f244957g;
        return new dz0.o0(this.f244955e, this.f244956f, str, (kotlin.coroutines.Continuation) obj3).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244954d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.n7 n7Var = this.f244955e;
            if (n7Var.i() && !n7Var.g()) {
                dz0.n0 n0Var = new dz0.n0(this.f244957g, n7Var, null);
                this.f244954d = 1;
                if (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.P6(this.f244956f, n0Var, this) == aVar) {
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
