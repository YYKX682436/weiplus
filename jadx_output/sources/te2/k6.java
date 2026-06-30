package te2;

/* loaded from: classes3.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418169e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.k6 k6Var = new te2.k6(this.f418169e, continuation);
        k6Var.f418168d = obj;
        return k6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.k6 k6Var = (te2.k6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f418168d;
        te2.p8 p8Var = this.f418169e;
        p8Var.w7(true, new te2.i6(kotlinx.coroutines.l.d(y0Var, null, null, new te2.j6(p8Var, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
