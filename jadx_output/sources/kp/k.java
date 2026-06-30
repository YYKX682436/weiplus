package kp;

/* loaded from: classes13.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp.n f310785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kp.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310785d = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.k(this.f310785d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kp.k kVar = (kp.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            ((kp.i1) this.f310785d.a()).mj();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NearConnectionProviderImpl", "removeGroup: " + e17);
        }
        return jz5.f0.f302826a;
    }
}
