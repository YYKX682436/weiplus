package dz0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f244899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244900e = maasSdkUIC;
        this.f244901f = n7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new dz0.j2(this.f244900e, this.f244901f, (kotlin.coroutines.Continuation) obj3).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244899d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dz0.i2 i2Var = new dz0.i2(this.f244901f, null);
            this.f244899d = 1;
            if (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.P6(this.f244900e, i2Var, this) == aVar) {
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
