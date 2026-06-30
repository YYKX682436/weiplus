package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public final class h1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f310284d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310285e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f310287g = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.h1 h1Var = new kotlinx.coroutines.flow.h1(this.f310287g, (kotlin.coroutines.Continuation) obj3);
        h1Var.f310285e = (kotlinx.coroutines.flow.k) obj;
        h1Var.f310286f = obj2;
        return h1Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310284d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f310285e;
            java.lang.Object obj2 = this.f310286f;
            this.f310285e = kVar;
            this.f310284d = 1;
            obj = this.f310287g.invoke(obj2, this);
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
            kVar = (kotlinx.coroutines.flow.k) this.f310285e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f310285e = null;
        this.f310284d = 2;
        if (kVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
