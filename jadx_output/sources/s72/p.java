package s72;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f404121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f404122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s72.j0 j0Var, long j17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404120e = j0Var;
        this.f404121f = j17;
        this.f404122g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.p(this.f404120e, this.f404121f, this.f404122g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404119d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s72.j0 j0Var = this.f404120e;
            if (j0Var.f404071g) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavSyncService", "[handleBatchGetCgiWithCallback] is doing batch get");
                return f0Var;
            }
            this.f404119d = 1;
            if (j0Var.Y6(this.f404121f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f404122g.invoke();
        return f0Var;
    }
}
