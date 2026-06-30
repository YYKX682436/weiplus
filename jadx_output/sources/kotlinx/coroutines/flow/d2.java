package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class d2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f310229d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310230e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.t f310232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(kotlin.coroutines.Continuation continuation, yz5.t tVar) {
        super(3, continuation);
        this.f310232g = tVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.d2 d2Var = new kotlinx.coroutines.flow.d2((kotlin.coroutines.Continuation) obj3, this.f310232g);
        d2Var.f310230e = (kotlinx.coroutines.flow.k) obj;
        d2Var.f310231f = (java.lang.Object[]) obj2;
        return d2Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310229d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f310230e;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f310231f;
            yz5.t tVar = this.f310232g;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            java.lang.Object obj4 = objArr[2];
            java.lang.Object obj5 = objArr[3];
            java.lang.Object obj6 = objArr[4];
            this.f310230e = kVar;
            this.f310229d = 1;
            obj = tVar.J(obj2, obj3, obj4, obj5, obj6, this);
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
            kVar = (kotlinx.coroutines.flow.k) this.f310230e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f310230e = null;
        this.f310229d = 2;
        if (kVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
