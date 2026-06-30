package cr2;

/* loaded from: classes2.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f221881d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f221882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f221885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221886i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221887m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(cr2.x xVar, int i17, boolean z17, yz5.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221883f = xVar;
        this.f221884g = i17;
        this.f221885h = z17;
        this.f221886i = lVar;
        this.f221887m = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        cr2.r rVar = new cr2.r(this.f221883f, this.f221884g, this.f221885h, this.f221886i, this.f221887m, continuation);
        rVar.f221882e = obj;
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cr2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f221881d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f221882e;
            int i18 = this.f221884g;
            boolean z17 = this.f221885h;
            cr2.x xVar = this.f221883f;
            cr2.q qVar = new cr2.q(i18, xVar, z17);
            oz5.l f11582e = y0Var.getF11582e();
            int i19 = kotlinx.coroutines.r2.O0;
            aq2.g gVar = new aq2.g(qVar, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), xVar.f221895a, xVar.f221899e);
            this.f221881d = 1;
            obj = ay1.l.j(gVar, false, this, 1, null);
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
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        cr2.x xVar2 = this.f221883f;
        oz5.l lVar = ((kotlinx.coroutines.internal.h) xVar2.f221905k).f310496d;
        cr2.p pVar = new cr2.p(xVar2, fVar, this.f221886i, this.f221885h, this.f221887m, null);
        this.f221881d = 2;
        if (kotlinx.coroutines.l.g(lVar, pVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
