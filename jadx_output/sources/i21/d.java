package i21;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public int f287885d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f287886e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f287887f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f287888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i21.g f287889h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i21.g gVar, kotlin.coroutines.Continuation continuation) {
        super(4, continuation);
        this.f287889h = gVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj2).intValue();
        i21.d dVar = new i21.d(this.f287889h, (kotlin.coroutines.Continuation) obj4);
        dVar.f287886e = (java.lang.String) obj;
        dVar.f287887f = intValue;
        dVar.f287888g = (com.tencent.mm.modelcdntran.n1) obj3;
        return dVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f287885d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f287887f;
            com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) this.f287888g;
            this.f287886e = null;
            this.f287885d = 1;
            int i19 = i21.b.f287878a[n1Var.f71103a.ordinal()];
            i21.g gVar = this.f287889h;
            if (i19 == 1) {
                gVar.a(true, i18);
            } else {
                gVar.a(false, i18);
            }
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
