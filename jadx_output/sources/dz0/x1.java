package dz0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f245060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f245062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f245061e = maasSdkUIC;
        this.f245062f = n7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new dz0.x1(this.f245061e, this.f245062f, (kotlin.coroutines.Continuation) obj3).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245060d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dz0.w1 w1Var = new dz0.w1(this.f245062f, null);
            this.f245060d = 1;
            if (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.P6(this.f245061e, w1Var, this) == aVar) {
                return aVar;
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
