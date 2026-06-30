package xx0;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457954d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xx0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457956f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xx0.y yVar = new xx0.y(this.f457956f, continuation);
        yVar.f457955e = obj;
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.y0 y0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457954d;
        xx0.d0 d0Var = this.f457956f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f457955e;
            xx0.i iVar = d0Var.f457878f;
            vt3.r rVar = d0Var.f457877e;
            this.f457955e = y0Var;
            this.f457954d = 1;
            if (iVar.c(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f457955e;
                kotlin.ResultKt.throwOnFailure(obj);
                y0Var2 = y0Var3;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(y0Var2, kotlinx.coroutines.internal.b0.f310484a, null, new xx0.x(d0Var, (java.util.List) obj, null), 2, null);
                return jz5.f0.f302826a;
            }
            kotlinx.coroutines.y0 y0Var4 = (kotlinx.coroutines.y0) this.f457955e;
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = y0Var4;
        }
        xx0.i iVar2 = d0Var.f457878f;
        vt3.r rVar2 = d0Var.f457877e;
        this.f457955e = y0Var;
        this.f457954d = 2;
        java.lang.Object a17 = iVar2.a(rVar2, this);
        if (a17 == aVar) {
            return aVar;
        }
        y0Var2 = y0Var;
        obj = a17;
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var2, kotlinx.coroutines.internal.b0.f310484a, null, new xx0.x(d0Var, (java.util.List) obj, null), 2, null);
        return jz5.f0.f302826a;
    }
}
