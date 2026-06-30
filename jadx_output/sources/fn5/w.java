package fn5;

/* loaded from: classes3.dex */
public final class w extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f264768d = n0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        fn5.w wVar = new fn5.w(this.f264768d, (kotlin.coroutines.Continuation) obj3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq on completion: " + java.lang.Thread.currentThread().getName());
        pm0.v.X(new fn5.v(this.f264768d));
        return jz5.f0.f302826a;
    }
}
