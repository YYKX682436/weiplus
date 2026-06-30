package gc0;

/* loaded from: classes5.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f270344i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270345m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, com.tencent.mm.ui.base.FlowLayout flowLayout, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270340e = p2Var;
        this.f270341f = b0Var;
        this.f270342g = aVar;
        this.f270343h = flowLayout;
        this.f270344i = z17;
        this.f270345m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.w1(this.f270340e, this.f270341f, this.f270342g, this.f270343h, this.f270344i, this.f270345m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270339d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            gc0.v1 v1Var = new gc0.v1(this.f270340e, this.f270341f, this.f270342g, this.f270343h, this.f270344i, this.f270345m, null);
            this.f270339d = 1;
            if (kotlinx.coroutines.l.g(p0Var, v1Var, this) == aVar) {
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
