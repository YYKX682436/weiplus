package ln0;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f319663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln0.q f319665f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ln0.p pVar, ln0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319664e = pVar;
        this.f319665f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ln0.l(this.f319664e, this.f319665f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ln0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f319663d;
        ln0.p pVar = this.f319664e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ln0.k kVar = new ln0.k(pVar, this.f319665f, null);
            this.f319663d = 1;
            if (kotlinx.coroutines.a4.c(300L, kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ln0.p.a(pVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper startP2pServiceWithParams wait end " + pVar.f319675d.get());
        return jz5.f0.f302826a;
    }
}
