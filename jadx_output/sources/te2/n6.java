package te2;

/* loaded from: classes3.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418252e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.n6 n6Var = new te2.n6(this.f418252e, continuation);
        n6Var.f418251d = obj;
        return n6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.n6 n6Var = (te2.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f418251d;
        te2.p8 p8Var = this.f418252e;
        p8Var.w7(true, new te2.l6(kotlinx.coroutines.l.d(y0Var, null, null, new te2.m6(p8Var, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
