package g4;

/* loaded from: classes5.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268426d;

    /* renamed from: e, reason: collision with root package name */
    public int f268427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f268428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f268429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlinx.coroutines.flow.j jVar, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268428f = jVar;
        this.f268429g = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.m0 m0Var = new g4.m0(this.f268428f, this.f268429g, completion);
        m0Var.f268426d = obj;
        return m0Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.m0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268427e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f268426d;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = g4.s0.f268545a;
            g4.l0 l0Var = new g4.l0(this, kVar, h0Var);
            this.f268427e = 1;
            if (this.f268428f.a(l0Var, this) == aVar) {
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
