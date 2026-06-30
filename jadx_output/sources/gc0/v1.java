package gc0;

/* loaded from: classes5.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270321h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f270322i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270323m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, com.tencent.mm.ui.base.FlowLayout flowLayout, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270318e = p2Var;
        this.f270319f = b0Var;
        this.f270320g = aVar;
        this.f270321h = flowLayout;
        this.f270322i = z17;
        this.f270323m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.v1(this.f270318e, this.f270319f, this.f270320g, this.f270321h, this.f270322i, this.f270323m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270317d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list = (java.util.List) this.f270320g.invoke();
            this.f270317d = 1;
            obj = this.f270318e.Q6(this.f270319f, list, this);
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
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list2 = (java.util.List) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "initRecommendPhone called getRecommendList result phone:" + list2.size());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        gc0.u1 u1Var = new gc0.u1(this.f270321h, list2, this.f270318e, this.f270322i, this.f270319f, this.f270323m, null);
        this.f270317d = 2;
        if (kotlinx.coroutines.l.g(g3Var, u1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
