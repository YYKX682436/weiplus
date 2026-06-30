package te2;

/* loaded from: classes3.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f418002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f418003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(te2.p8 p8Var, r45.h32 h32Var, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418001e = p8Var;
        this.f418002f = h32Var;
        this.f418003g = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.f6 f6Var = new te2.f6(this.f418001e, this.f418002f, this.f418003g, continuation);
        f6Var.f418000d = obj;
        return f6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.f6 f6Var = (te2.f6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f418000d;
        java.lang.Integer num = this.f418003g;
        te2.p8 p8Var = this.f418001e;
        p8Var.w7(true, new te2.d6(kotlinx.coroutines.l.d(y0Var, null, null, new te2.e6(p8Var, this.f418002f, num, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
