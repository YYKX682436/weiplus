package te2;

/* loaded from: classes3.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f418404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f418405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(te2.p8 p8Var, r45.h32 h32Var, java.lang.Integer num, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418403e = p8Var;
        this.f418404f = h32Var;
        this.f418405g = num;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        te2.s5 s5Var = new te2.s5(this.f418403e, this.f418404f, this.f418405g, continuation);
        s5Var.f418402d = obj;
        return s5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        te2.s5 s5Var = (te2.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f418402d;
        java.lang.Integer num = this.f418405g;
        te2.p8 p8Var = this.f418403e;
        p8Var.w7(true, new te2.q5(kotlinx.coroutines.l.d(y0Var, null, null, new te2.r5(p8Var, this.f418404f, num, null), 3, null)));
        return jz5.f0.f302826a;
    }
}
