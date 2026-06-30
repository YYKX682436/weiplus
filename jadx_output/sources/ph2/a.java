package ph2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f354371d;

    /* renamed from: e, reason: collision with root package name */
    public int f354372e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ph2.b f354374g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354374g = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ph2.a aVar = new ph2.a(this.f354374g, continuation);
        aVar.f354373f = obj;
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ph2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long intValue;
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354372e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f354373f;
            ae2.in inVar = ae2.in.f3688a;
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3808m).getValue()).r()).intValue();
            y0Var = y0Var2;
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intValue = this.f354371d;
            y0Var = (kotlinx.coroutines.y0) this.f354373f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.z0.h(y0Var)) {
            ph2.b bVar = this.f354374g;
            if (!bVar.f354376e) {
                break;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                ph2.d dVar = bVar.f354375d;
                if (dVar != null) {
                    dVar.b();
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < intValue) {
                    this.f354373f = y0Var;
                    this.f354371d = intValue;
                    this.f354372e = 1;
                    if (kotlinx.coroutines.k1.b(intValue - currentTimeMillis2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f354373f = y0Var;
                    this.f354371d = intValue;
                    this.f354372e = 2;
                    if (kotlinx.coroutines.k1.b(intValue, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (java.lang.Throwable th6) {
                java.lang.System.currentTimeMillis();
                throw th6;
            }
        }
        return jz5.f0.f302826a;
    }
}
