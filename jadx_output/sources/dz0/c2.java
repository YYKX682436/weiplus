package dz0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f244799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244801f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244800e = maasSdkUIC;
        this.f244801f = n7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return new dz0.c2(this.f244800e, this.f244801f, (kotlin.coroutines.Continuation) obj3).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244799d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dz0.b2 b2Var = new dz0.b2(this.f244801f, null);
            this.f244799d = 1;
            if (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.P6(this.f244800e, b2Var, this) == aVar) {
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
