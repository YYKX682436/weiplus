package hu3;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(hu3.n0 n0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285118e = n0Var;
        this.f285119f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.e0(this.f285118e, this.f285119f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285117d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        hu3.n0 n0Var = this.f285118e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f285117d = 1;
            n0Var.getClass();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new hu3.m0(false, n0Var, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        db5.t7.g(n0Var.f285160d.getContext(), this.f285119f);
        return f0Var;
    }
}
