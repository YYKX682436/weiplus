package va2;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f434251d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f434252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va2.n f434253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f434254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f434256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(va2.n nVar, int i17, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f434253f = nVar;
        this.f434254g = i17;
        this.f434255h = str;
        this.f434256i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        va2.m mVar = new va2.m(this.f434253f, this.f434254g, this.f434255h, this.f434256i, continuation);
        mVar.f434252e = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((va2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f434251d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f434252e;
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            va2.l lVar = new va2.l(this.f434254g, this.f434255h, this.f434256i);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            u92.e eVar = new u92.e(lVar, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), this.f434253f.getActivity(), null, 8, null);
            this.f434252e = c0Var2;
            this.f434251d = 1;
            obj = ay1.l.k(eVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f434252e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTopicTabUIC", "[request] cgiBack");
        va2.n nVar = this.f434253f;
        pf5.e.launchUI$default(nVar, null, null, new va2.k((com.tencent.mm.modelbase.f) obj, c0Var, nVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
