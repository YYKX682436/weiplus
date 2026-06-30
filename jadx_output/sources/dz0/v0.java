package dz0;

/* loaded from: classes5.dex */
public final class v0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f245036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f245037e = maasSdkUIC;
        this.f245038f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new dz0.v0(this.f245037e, this.f245038f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((dz0.v0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245036d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dz0.e0 e0Var = this.f245037e.D;
            java.lang.String str = this.f245038f;
            this.f245036d = 1;
            obj = dz0.g.a(e0Var, str, null, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
