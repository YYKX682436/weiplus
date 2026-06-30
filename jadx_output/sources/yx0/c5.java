package yx0;

/* loaded from: classes5.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467225d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467227f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yx0.c5 c5Var = new yx0.c5(this.f467227f, continuation);
        c5Var.f467226e = obj;
        return c5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.c5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467225d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f467226e;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new yx0.b5(this.f467227f, null), 2, null);
            ux0.d dVar = this.f467227f.f467183l1;
            if (dVar != null) {
                dVar.onResume();
            }
            pp0.p0 p0Var2 = this.f467227f.K;
            if (p0Var2 != null) {
                this.f467225d = 1;
                obj = p0Var2.E0(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            yx0.b8 b8Var = this.f467227f;
            yx0.v vVar = yx0.v.f467695f;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            b8Var.q0(vVar);
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.b8 b8Var2 = this.f467227f;
        yx0.v vVar2 = yx0.v.f467695f;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = yx0.b8.f467171c2;
        b8Var2.q0(vVar2);
        return jz5.f0.f302826a;
    }
}
