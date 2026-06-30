package ro2;

/* loaded from: classes2.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f398076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f398079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398080i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398082n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.graphics.Bitmap bitmap, android.content.Context context, int i17, int i18, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398076e = bitmap;
        this.f398077f = context;
        this.f398078g = i17;
        this.f398079h = i18;
        this.f398080i = baseFinderFeed;
        this.f398081m = qeVar;
        this.f398082n = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro2.o(this.f398076e, this.f398077f, this.f398078g, this.f398079h, this.f398080i, this.f398081m, this.f398082n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398075d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            ro2.n nVar = new ro2.n(this.f398076e, this.f398077f, this.f398078g, this.f398079h, this.f398080i, this.f398081m, this.f398082n, null);
            this.f398075d = 1;
            if (kotlinx.coroutines.l.g(p0Var, nVar, this) == aVar) {
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
