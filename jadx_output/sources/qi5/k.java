package qi5;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f363825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.d f363826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.flow.i2 i2Var, ym3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363825e = i2Var;
        this.f363826f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi5.k(this.f363825e, this.f363826f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363824d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f363824d = 1;
            if (this.f363825e.emit(this.f363826f, this) == aVar) {
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
