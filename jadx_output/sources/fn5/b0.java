package fn5;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f264643d = n0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        fn5.b0 b0Var = new fn5.b0(this.f264643d, (kotlin.coroutines.Continuation) obj3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyPersonReq on completion: " + java.lang.Thread.currentThread().getName());
        pm0.v.X(new fn5.a0(this.f264643d));
        return jz5.f0.f302826a;
    }
}
