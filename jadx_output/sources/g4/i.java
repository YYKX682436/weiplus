package g4;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268361d;

    /* renamed from: e, reason: collision with root package name */
    public int f268362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.l f268363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g4.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268363f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.i iVar = new g4.i(this.f268363f, completion);
        iVar.f268361d = obj;
        return iVar;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.i) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        g4.m4 m4Var;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268362e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            m4Var = (g4.m4) this.f268361d;
            g4.i0 i0Var = this.f268363f.f268410a;
            this.f268361d = m4Var;
            this.f268362e = 1;
            a17 = i0Var.a(this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            m4Var = (g4.m4) this.f268361d;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        g4.m4 m4Var2 = m4Var;
        g4.w4 w4Var = (g4.w4) a17;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = Integer.MIN_VALUE;
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(m4Var2, null, null, new g4.h(m4Var2, w4Var, f0Var, null), 3, null);
        kotlinx.coroutines.r2[] r2VarArr = {kotlinx.coroutines.l.d(m4Var2, null, null, new g4.f(this, m4Var2, w4Var, d17, f0Var, null), 3, null), d17};
        this.f268361d = null;
        this.f268362e = 2;
        if (kotlinx.coroutines.h.d(r2VarArr, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
