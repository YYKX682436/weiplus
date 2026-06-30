package ky;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313348e = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ky.f(this.f313348e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ky.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f313347d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f313347d = 1;
            if (kotlinx.coroutines.k1.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        n0.v2 v2Var = this.f313348e;
        if ((((ky.d0) v2Var.getValue()) instanceof ky.c0) || (((ky.d0) v2Var.getValue()) instanceof ky.y)) {
            v2Var.setValue(ky.a0.f313330a);
        }
        return jz5.f0.f302826a;
    }
}
