package yx;

/* loaded from: classes3.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467041e = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx.j0(this.f467041e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467040d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f467040d = 1;
            if (kotlinx.coroutines.k1.b(60000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f467041e.setValue(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
