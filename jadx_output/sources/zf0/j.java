package zf0;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f472448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf0.l0 f472450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zf0.v0 v0Var, yf0.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472449e = v0Var;
        this.f472450f = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zf0.j(this.f472449e, this.f472450f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472448d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = this.f472449e.f363678g;
            if (i2Var != null) {
                this.f472448d = 1;
                if (i2Var.emit(this.f472450f, this) == aVar) {
                    return aVar;
                }
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
