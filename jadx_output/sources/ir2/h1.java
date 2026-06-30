package ir2;

/* loaded from: classes2.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(ir2.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294149e = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.h1(this.f294149e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294148d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.p1 p1Var = this.f294149e;
            kotlinx.coroutines.flow.l0 l0Var = new kotlinx.coroutines.flow.l0(p1Var.f294206a.f294100p, new ir2.f1(null));
            ir2.g1 g1Var = new ir2.g1(p1Var);
            this.f294148d = 1;
            if (l0Var.a(g1Var, this) == aVar) {
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
