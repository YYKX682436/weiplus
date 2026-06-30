package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310384d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f310387g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f310388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(kotlinx.coroutines.flow.j jVar, kotlinx.coroutines.flow.i2 i2Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310386f = jVar;
        this.f310387g = i2Var;
        this.f310388h = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.r1 r1Var = new kotlinx.coroutines.flow.r1(this.f310386f, this.f310387g, this.f310388h, continuation);
        r1Var.f310385e = obj;
        return r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.flow.r1) create((kotlinx.coroutines.flow.t2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310384d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int ordinal = ((kotlinx.coroutines.flow.t2) this.f310385e).ordinal();
            kotlinx.coroutines.flow.i2 i2Var = this.f310387g;
            if (ordinal == 0) {
                this.f310384d = 1;
                if (this.f310386f.a(i2Var, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 2) {
                kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.flow.r2.f310389a;
                java.lang.Object obj2 = this.f310388h;
                if (obj2 == l0Var) {
                    i2Var.d();
                } else {
                    i2Var.e(obj2);
                }
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
