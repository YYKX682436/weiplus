package te2;

/* loaded from: classes3.dex */
public final class b8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f417903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(te2.p8 p8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417902e = p8Var;
        this.f417903f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.b8 b8Var = new te2.b8(this.f417902e, this.f417903f, continuation);
        b8Var.f417901d = obj;
        return b8Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.b8 b8Var = (te2.b8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f417901d;
        boolean z17 = this.f417903f;
        te2.p8 p8Var = this.f417902e;
        p8Var.w7(true, new te2.z7(kotlinx.coroutines.l.d(y0Var, null, null, new te2.a8(p8Var, z17, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
