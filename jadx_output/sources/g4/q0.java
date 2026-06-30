package g4;

/* loaded from: classes5.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268498d;

    /* renamed from: e, reason: collision with root package name */
    public int f268499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.r0 f268500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.z f268501g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(g4.r0 r0Var, g4.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268500f = r0Var;
        this.f268501g = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.q0 q0Var = new g4.q0(this.f268500f, this.f268501g, completion);
        q0Var.f268498d = obj;
        return q0Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.q0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268499e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f268498d;
            yz5.q qVar = this.f268500f.f268533g;
            this.f268499e = 1;
            if (qVar.invoke(this.f268501g, obj2, this) == aVar) {
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
