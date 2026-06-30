package id2;

/* loaded from: classes.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(id2.v1 v1Var, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290831e = v1Var;
        this.f290832f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.v0(this.f290831e, this.f290832f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290830d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f290830d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        id2.v1 v1Var = this.f290831e;
        boolean isFinishing = v1Var.getActivity().isFinishing();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!isFinishing && !v1Var.getActivity().isDestroyed()) {
            pm0.v.X(new id2.u0(this.f290832f, v1Var));
        }
        return f0Var;
    }
}
