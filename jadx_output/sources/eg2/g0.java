package eg2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg2.i0 f252568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(eg2.i0 i0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252568e = i0Var;
        this.f252569f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg2.g0(this.f252568e, this.f252569f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        eg2.i0 i0Var = this.f252568e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252567d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                eg2.o0 o0Var = eg2.o0.f252605a;
                java.lang.String b17 = i0Var.b();
                java.lang.String str = this.f252569f;
                int c17 = i0Var.c();
                this.f252567d = 1;
                if (o0Var.a(b17, null, str, c17, 4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDBaseTask", "endTask sent for taskId=" + this.f252569f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderLiveHDBaseTask", e17, "endTask error", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
