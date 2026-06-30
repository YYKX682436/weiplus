package gc0;

/* loaded from: classes5.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270389h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270390i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270391m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270392n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270393o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270394p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270395q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(gc0.b0 b0Var, gc0.p2 p2Var, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, com.tencent.mm.ui.base.FlowLayout flowLayout2, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270386e = b0Var;
        this.f270387f = p2Var;
        this.f270388g = flowLayout;
        this.f270389h = aVar;
        this.f270390i = aVar2;
        this.f270391m = aVar3;
        this.f270392n = aVar4;
        this.f270393o = flowLayout2;
        this.f270394p = lVar;
        this.f270395q = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.z1(this.f270386e, this.f270387f, this.f270388g, this.f270389h, this.f270390i, this.f270391m, this.f270392n, this.f270393o, this.f270394p, this.f270395q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270385d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            gc0.y1 y1Var = new gc0.y1(this.f270386e, this.f270387f, this.f270388g, this.f270389h, this.f270390i, this.f270391m, this.f270392n, this.f270393o, this.f270394p, this.f270395q, null);
            this.f270385d = 1;
            if (kotlinx.coroutines.l.g(p0Var, y1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
