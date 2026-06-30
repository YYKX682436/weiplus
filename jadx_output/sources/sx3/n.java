package sx3;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413571d;

    public n(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sx3.n(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new sx3.n((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f413571d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ux3.b bVar = new ux3.b();
                this.f413571d = 1;
                if (rm0.h.a(bVar, 3000L, null, this, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneHistoryManager", "ClearAllHistoryRingBackCgi failed: " + e17.getMessage());
            return f0Var;
        }
    }
}
