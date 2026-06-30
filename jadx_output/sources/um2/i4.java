package um2;

/* loaded from: classes3.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f428832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(um2.x5 x5Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428831e = x5Var;
        this.f428832f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.i4(this.f428831e, this.f428832f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.i4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428830d;
        um2.x5 x5Var = this.f428831e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i(x5Var.f429032f, "start delayExitTrtcJob");
            this.f428830d = 1;
            if (kotlinx.coroutines.k1.b(40000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "delayExitTrtcJob do it");
        this.f428832f.invoke();
        return jz5.f0.f302826a;
    }
}
