package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public final class b2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f310208d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310209e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f310211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(kotlin.coroutines.Continuation continuation, yz5.r rVar) {
        super(3, continuation);
        this.f310211g = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.b2 b2Var = new kotlinx.coroutines.flow.b2((kotlin.coroutines.Continuation) obj3, this.f310211g);
        b2Var.f310209e = (kotlinx.coroutines.flow.k) obj;
        b2Var.f310210f = (java.lang.Object[]) obj2;
        return b2Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310208d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f310209e;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f310210f;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            java.lang.Object obj4 = objArr[2];
            this.f310209e = kVar;
            this.f310208d = 1;
            obj = this.f310211g.C(obj2, obj3, obj4, this);
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
            kVar = (kotlinx.coroutines.flow.k) this.f310209e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f310209e = null;
        this.f310208d = 2;
        if (kVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
