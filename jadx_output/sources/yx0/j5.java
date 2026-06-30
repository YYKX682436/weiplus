package yx0;

/* loaded from: classes5.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jg.d f467399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(yx0.b8 b8Var, jg.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467398e = b8Var;
        this.f467399f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.j5(this.f467398e, this.f467399f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.j5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467397d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.p0 p0Var = this.f467398e.K;
            if (p0Var == null) {
                return null;
            }
            jg.d dVar = this.f467399f;
            this.f467397d = 1;
            obj = p0Var.N0(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.lang.Boolean) obj;
    }
}
