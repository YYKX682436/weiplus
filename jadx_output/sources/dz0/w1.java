package dz0;

/* loaded from: classes5.dex */
public final class w1 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f245048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f245049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f245049e = n7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new dz0.w1(this.f245049e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((dz0.w1) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245048d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.n7 n7Var = this.f245049e;
            this.f245048d = 1;
            if (az0.n7.p(n7Var, null, null, this, 3, null) == aVar) {
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
