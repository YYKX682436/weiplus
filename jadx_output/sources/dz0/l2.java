package dz0;

/* loaded from: classes5.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f244930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(boolean z17, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244930e = z17;
        this.f244931f = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.l2(this.f244930e, this.f244931f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        az0.n7 n7Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244929d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.f244930e && (n7Var = this.f244931f.f69783d) != null) {
                this.f244929d = 1;
                obj = n7Var.q(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
