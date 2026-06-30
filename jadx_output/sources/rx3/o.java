package rx3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401045d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f401047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ox3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401047f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rx3.o oVar = new rx3.o(this.f401047f, continuation);
        oVar.f401046e = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.o) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401045d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f401046e;
            rx3.n nVar = new rx3.n(this.f401047f, null);
            this.f401046e = kVar;
            this.f401045d = 1;
            obj = kotlinx.coroutines.a4.c(5000L, nVar, this);
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
            kVar = (kotlinx.coroutines.flow.k) this.f401046e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f401046e = null;
        this.f401045d = 2;
        if (kVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
