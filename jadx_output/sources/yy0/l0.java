package yy0;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468192d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.m0 f468194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yy0.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468194f = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yy0.l0 l0Var = new yy0.l0(this.f468194f, continuation);
        l0Var.f468193e = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yy0.m0 m0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468192d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                yy0.m0 m0Var2 = this.f468194f;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                az0.l2 l2Var = az0.l2.f15656a;
                this.f468193e = m0Var2;
                this.f468192d = 1;
                java.lang.Object a17 = l2Var.a(this);
                if (a17 == aVar) {
                    return aVar;
                }
                m0Var = m0Var2;
                obj = a17;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = (yy0.m0) this.f468193e;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m0Var.f468207d = ((java.lang.Boolean) obj).booleanValue() ? yy0.i0.f468139f : yy0.i0.f468137d;
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return f0Var;
    }
}
