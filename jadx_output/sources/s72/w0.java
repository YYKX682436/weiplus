package s72;

/* loaded from: classes.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f404165d;

    /* renamed from: e, reason: collision with root package name */
    public int f404166e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f404168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404168g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        s72.w0 w0Var = new s72.w0(this.f404168g, continuation);
        w0Var.f404167f = obj;
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404166e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f404167f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f404165d = currentTimeMillis;
            this.f404166e = 1;
            obj = this.f404168g.invoke(y0Var, this);
            if (obj == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f404165d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncDBCoreCoroutines", "[launchAsync] total cost = " + (java.lang.System.currentTimeMillis() - j17));
        return obj;
    }
}
