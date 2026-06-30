package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class g2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f310263d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310264e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f310266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f310266g = qVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.g2 g2Var = new kotlinx.coroutines.flow.g2(this.f310266g, (kotlin.coroutines.Continuation) obj3);
        g2Var.f310264e = (kotlinx.coroutines.flow.k) obj;
        g2Var.f310265f = (java.lang.Object[]) obj2;
        return g2Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310263d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f310264e;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f310265f;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            this.f310264e = kVar;
            this.f310263d = 1;
            obj = this.f310266g.invoke(obj2, obj3, this);
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
            kVar = (kotlinx.coroutines.flow.k) this.f310264e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f310264e = null;
        this.f310263d = 2;
        if (kVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
