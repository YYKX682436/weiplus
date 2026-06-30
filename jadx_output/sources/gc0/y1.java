package gc0;

/* loaded from: classes5.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270375i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270376m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270377n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270378o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270379p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270380q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(gc0.b0 b0Var, gc0.p2 p2Var, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, com.tencent.mm.ui.base.FlowLayout flowLayout2, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270371e = b0Var;
        this.f270372f = p2Var;
        this.f270373g = flowLayout;
        this.f270374h = aVar;
        this.f270375i = aVar2;
        this.f270376m = aVar3;
        this.f270377n = aVar4;
        this.f270378o = flowLayout2;
        this.f270379p = lVar;
        this.f270380q = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.y1(this.f270371e, this.f270372f, this.f270373g, this.f270374h, this.f270375i, this.f270376m, this.f270377n, this.f270378o, this.f270379p, this.f270380q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270370d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gc0.y0 y0Var = gc0.y0.f270365a;
            int i18 = this.f270372f.f270247i ? 1 : 2;
            this.f270370d = 1;
            a17 = y0Var.a(this.f270371e, i18, this);
            if (a17 == aVar) {
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
            a17 = obj;
        }
        uc0.u uVar = (uc0.u) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRecommendRemark() called getRecommendList result remark:");
        sb6.append(uVar.f426278a.size());
        sb6.append(" phone:");
        sb6.append(uVar.f426279b.size());
        sb6.append(" img:");
        r45.kl5 kl5Var = uVar.f426280c;
        sb6.append(kl5Var != null ? new java.lang.Long(kl5Var.getLong(4)) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", sb6.toString());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        gc0.x1 x1Var = new gc0.x1(this.f270372f, this.f270371e, this.f270373g, this.f270374h, this.f270375i, this.f270376m, this.f270377n, this.f270378o, this.f270379p, uVar, this.f270380q, null);
        this.f270370d = 2;
        if (kotlinx.coroutines.l.g(g3Var, x1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
