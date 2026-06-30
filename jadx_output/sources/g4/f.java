package g4;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.i f268274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.m4 f268275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.w4 f268276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f268277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f268278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g4.i iVar, g4.m4 m4Var, g4.w4 w4Var, kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268274e = iVar;
        this.f268275f = m4Var;
        this.f268276g = w4Var;
        this.f268277h = r2Var;
        this.f268278i = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.f(this.f268274e, this.f268275f, this.f268276g, this.f268277h, this.f268278i, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.f) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268273d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.g0 g0Var = new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.l0(this.f268274e.f268363f.f268412c.f278713b, new g4.b(null)), new g4.c(this, null));
            g4.e eVar = new g4.e(this);
            this.f268273d = 1;
            if (g0Var.a(eVar, this) == aVar) {
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
