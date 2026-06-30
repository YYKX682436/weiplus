package dz0;

/* loaded from: classes5.dex */
public final class p1 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f244970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f244971e = maasSdkUIC;
        this.f244972f = n7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new dz0.p1(this.f244971e, this.f244972f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((dz0.p1) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244970d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f244970d = 1;
            if (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.d7(this.f244971e, this.f244972f, this) == aVar) {
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
