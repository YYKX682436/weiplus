package j0;

/* loaded from: classes14.dex */
public final class l4 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f296430d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f296431e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f296432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f296433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296434h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0.o f296435i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(kotlinx.coroutines.y0 y0Var, n0.v2 v2Var, c0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f296433g = y0Var;
        this.f296434h = v2Var;
        this.f296435i = oVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f225627a;
        c0.o oVar = this.f296435i;
        j0.l4 l4Var = new j0.l4(this.f296433g, this.f296434h, oVar, (kotlin.coroutines.Continuation) obj3);
        l4Var.f296431e = (b0.f2) obj;
        l4Var.f296432f = j17;
        return l4Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296430d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.f2 f2Var = (b0.f2) this.f296431e;
            kotlinx.coroutines.l.d(this.f296433g, null, null, new j0.j4(this.f296434h, this.f296432f, this.f296435i, null), 3, null);
            this.f296430d = 1;
            obj = ((b0.h2) f2Var).b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlinx.coroutines.l.d(this.f296433g, null, null, new j0.k4(this.f296434h, booleanValue, this.f296435i, null), 3, null);
        return jz5.f0.f302826a;
    }
}
