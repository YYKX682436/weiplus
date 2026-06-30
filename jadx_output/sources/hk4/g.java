package hk4;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f281942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk4.n f281943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f281944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlinx.coroutines.r2 r2Var, hk4.n nVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281942e = r2Var;
        this.f281943f = nVar;
        this.f281944g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk4.g(this.f281942e, this.f281943f, this.f281944g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk4.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281941d;
        yz5.a aVar2 = this.f281944g;
        hk4.n nVar = this.f281943f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f281942e;
            if (r2Var.A()) {
                com.tencent.mars.xlog.Log.i(nVar.f281956k, "bitmap loading job has been already finished");
                aVar2.invoke();
                return jz5.f0.f302826a;
            }
            com.tencent.mars.xlog.Log.i(nVar.f281956k, "joins the bitmap loading job");
            this.f281941d = 1;
            if (r2Var.C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(nVar.f281956k, "bitmap loading job has been finished");
        aVar2.invoke();
        return jz5.f0.f302826a;
    }
}
