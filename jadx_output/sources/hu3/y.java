package hu3;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285220e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.y(this.f285220e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285219d;
        hu3.n0 n0Var = this.f285220e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.p0 p0Var = n0Var.f285162f;
            if (p0Var != null) {
                this.f285219d = 1;
                obj = pp0.p0.w(p0Var, false, this, 1, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            n0Var.f285179z = true;
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        n0Var.f285179z = true;
        return jz5.f0.f302826a;
    }
}
