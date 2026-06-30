package gc0;

/* loaded from: classes5.dex */
public final class d2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270128h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270129i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.a aVar2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270125e = p2Var;
        this.f270126f = b0Var;
        this.f270127g = aVar;
        this.f270128h = flowLayout;
        this.f270129i = aVar2;
        this.f270130m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.d2(this.f270125e, this.f270126f, this.f270127g, this.f270128h, this.f270129i, this.f270130m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.d2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270124d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            gc0.c2 c2Var = new gc0.c2(this.f270125e, this.f270126f, this.f270127g, this.f270128h, this.f270129i, this.f270130m, null);
            this.f270124d = 1;
            if (kotlinx.coroutines.l.g(p0Var, c2Var, this) == aVar) {
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
