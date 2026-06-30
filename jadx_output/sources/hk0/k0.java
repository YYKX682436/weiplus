package hk0;

/* loaded from: classes3.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.u0 f281760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f281761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hk0.k f281762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(hk0.u0 u0Var, java.util.ArrayList arrayList, hk0.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281760e = u0Var;
        this.f281761f = arrayList;
        this.f281762g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk0.k0(this.f281760e, this.f281761f, this.f281762g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk0.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281759d;
        hk0.u0 u0Var = this.f281760e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f281759d = 1;
            hk0.u0.O6(u0Var, this.f281761f, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        hk0.k kVar = this.f281762g;
        if (kVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new hk0.i(hk0.d1.f281721e, kVar));
            this.f281759d = 2;
            hk0.u0.N6(u0Var, arrayList, this);
            if (f0Var == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
