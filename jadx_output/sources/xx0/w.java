package xx0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457949d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(xx0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457951f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xx0.w wVar = new xx0.w(this.f457951f, continuation);
        wVar.f457950e = obj;
        return wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457949d;
        xx0.d0 d0Var = this.f457951f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f457950e;
            xx0.i iVar = d0Var.f457878f;
            vt3.r rVar = d0Var.f457877e;
            this.f457950e = y0Var2;
            this.f457949d = 1;
            java.lang.Object a17 = iVar.a(rVar, this);
            if (a17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f457950e;
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = y0Var3;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new xx0.v(d0Var, (java.util.List) obj, null), 2, null);
        return jz5.f0.f302826a;
    }
}
