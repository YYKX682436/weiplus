package xx0;

/* loaded from: classes5.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xx0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457870e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx0.c0(this.f457870e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457869d;
        xx0.d0 d0Var = this.f457870e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xx0.i iVar = d0Var.f457878f;
            vt3.r rVar = d0Var.f457877e;
            this.f457869d = 1;
            obj = iVar.a(rVar, this);
            if (obj == aVar) {
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
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        xx0.b0 b0Var = new xx0.b0(d0Var, (java.util.List) obj, null);
        this.f457869d = 2;
        if (kotlinx.coroutines.l.g(g3Var, b0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
