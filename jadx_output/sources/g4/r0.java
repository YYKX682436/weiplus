package g4;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268530d;

    /* renamed from: e, reason: collision with root package name */
    public int f268531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f268532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f268533g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kotlinx.coroutines.flow.j jVar, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268532f = jVar;
        this.f268533g = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.r0 r0Var = new g4.r0(this.f268532f, this.f268533g, completion);
        r0Var.f268530d = obj;
        return r0Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.r0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268531e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.q0 q0Var = new g4.q0(this, new g4.z((g4.m4) this.f268530d), null);
            this.f268531e = 1;
            if (kotlinx.coroutines.flow.l.f(this.f268532f, q0Var, this) == aVar) {
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
