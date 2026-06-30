package ek2;

/* loaded from: classes3.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f253411d;

    public a2(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ek2.a2(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new ek2.a2((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f253411d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ko0.l0 l0Var = ko0.l0.f309878a;
            ko0.e0 e0Var = ko0.e0.f309848e;
            this.f253411d = 1;
            if (l0Var.a(e0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ko0.l0 l0Var2 = ko0.l0.f309878a;
        dk2.ug ugVar = dk2.ug.f234218a;
        l0Var2.c(dk2.ug.f234219b);
        ugVar.c(l0Var2.b());
        return jz5.f0.f302826a;
    }
}
