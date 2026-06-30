package te2;

/* loaded from: classes3.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418438e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.t6 t6Var = new te2.t6(this.f418438e, continuation);
        t6Var.f418437d = obj;
        return t6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.t6 t6Var = (te2.t6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f418437d;
        te2.p8 p8Var = this.f418438e;
        p8Var.w7(true, new te2.r6(kotlinx.coroutines.l.d(y0Var, null, null, new te2.s6(p8Var, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
