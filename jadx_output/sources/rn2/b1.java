package rn2;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397653d;

    /* renamed from: e, reason: collision with root package name */
    public int f397654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rn2.c1 c1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397655f = c1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.b1(this.f397655f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rn2.c1 c1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397654e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rn2.c1 c1Var2 = this.f397655f;
            if (c1Var2.B == null) {
                this.f397653d = c1Var2;
                this.f397654e = 1;
                java.lang.Object i18 = c1Var2.i(false, this);
                if (i18 == aVar) {
                    return aVar;
                }
                c1Var = c1Var2;
                obj = i18;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1Var = (rn2.c1) this.f397653d;
        kotlin.ResultKt.throwOnFailure(obj);
        c1Var.B = (r45.qa1) obj;
        return jz5.f0.f302826a;
    }
}
