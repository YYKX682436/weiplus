package nu0;

/* loaded from: classes5.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340130d;

    /* renamed from: e, reason: collision with root package name */
    public int f340131e;

    public w3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.w3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new nu0.w3((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340131e;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i95.m mVar = (i95.m) this.f340130d;
            kotlin.ResultKt.throwOnFailure(obj);
            return mVar;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(pp0.q0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pp0.q0.od((pp0.q0) c17, false, 1, null);
        this.f340130d = c17;
        this.f340131e = 1;
        java.lang.Object g17 = az0.i5.f15557a.g(this);
        if (g17 != aVar) {
            g17 = jz5.f0.f302826a;
        }
        return g17 == aVar ? aVar : c17;
    }
}
