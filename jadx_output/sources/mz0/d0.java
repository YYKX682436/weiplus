package mz0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f332919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n0.v2 v2Var, mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332919d = v2Var;
        this.f332920e = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.d0(this.f332919d, this.f332920e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mz0.d0 d0Var = (mz0.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((java.lang.Boolean) this.f332919d.getValue()).booleanValue();
        mz0.b2 b2Var = this.f332920e;
        if (booleanValue) {
            mz0.b2.Q6(b2Var);
        } else {
            b2Var.z7();
        }
        return jz5.f0.f302826a;
    }
}
