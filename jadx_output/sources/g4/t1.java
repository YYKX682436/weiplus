package g4;

/* loaded from: classes5.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268564d;

    /* renamed from: e, reason: collision with root package name */
    public int f268565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.x1 f268566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(g4.x1 x1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268566f = x1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.t1 t1Var = new g4.t1(this.f268566f, completion);
        t1Var.f268564d = obj;
        return t1Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.t1) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268565e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.m4 m4Var = (g4.m4) this.f268564d;
            g4.x1 x1Var = this.f268566f;
            x1Var.getClass();
            kotlinx.coroutines.flow.i0 i0Var = new kotlinx.coroutines.flow.i0(new g4.o1(null, null), x1Var.f268606a.f268260b);
            g4.q1 q1Var = new g4.q1(this, null, null);
            java.lang.Object obj2 = g4.s0.f268545a;
            kotlinx.coroutines.flow.j a17 = g4.l4.a(new g4.r0(new kotlinx.coroutines.flow.v1(new kotlinx.coroutines.flow.m2(new g4.p0(i0Var, null, q1Var, null))), new g4.s1(null, this, null), null));
            g4.r1 r1Var = new g4.r1(m4Var);
            this.f268565e = 1;
            if (a17.a(r1Var, this) == aVar) {
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
