package ir2;

/* loaded from: classes2.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ir2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294128e = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.e0(this.f294128e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294127d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.a1 a1Var = this.f294128e;
            kotlinx.coroutines.flow.l0 l0Var = new kotlinx.coroutines.flow.l0(((ir2.p1) ((jz5.n) a1Var.f294101q).getValue()).f294208c, new ir2.c0(null));
            ir2.d0 d0Var = new ir2.d0(a1Var);
            this.f294127d = 1;
            if (l0Var.a(d0Var, this) == aVar) {
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
