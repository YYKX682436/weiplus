package dz0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f244947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.String str, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f244948e = str;
        this.f244949f = n7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new dz0.n0(this.f244948e, this.f244949f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((dz0.n0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244947d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "buildTemplate: start play " + this.f244948e);
            az0.n7 n7Var = this.f244949f;
            this.f244947d = 1;
            if (az0.n7.p(n7Var, null, null, this, 3, null) == aVar) {
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
