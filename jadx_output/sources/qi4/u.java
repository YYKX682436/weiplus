package qi4;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {
    public u(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi4.u(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qi4.u uVar = new qi4.u((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qi4.v.f363792e.await();
        com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[waitForDbCacheReady] end");
        return jz5.f0.f302826a;
    }
}
