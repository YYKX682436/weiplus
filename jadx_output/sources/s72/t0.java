package s72;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.v0 f404154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f404156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s72.v0 v0Var, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404154e = v0Var;
        this.f404155f = i17;
        this.f404156g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.t0(this.f404154e, this.f404155f, this.f404156g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404153d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f404153d = 1;
            if (this.f404154e.T6(this.f404155f, this.f404156g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
