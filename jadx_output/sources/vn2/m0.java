package vn2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f438324d;

    /* renamed from: e, reason: collision with root package name */
    public int f438325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f438327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438328h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f438329i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438330m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438331n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, r45.qt2 qt2Var, boolean z17, android.content.Context context, ym5.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438326f = baseFinderFeed;
        this.f438327g = megaVideoFlowLoader;
        this.f438328h = qt2Var;
        this.f438329i = z17;
        this.f438330m = context;
        this.f438331n = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.m0(this.f438326f, this.f438327g, this.f438328h, this.f438329i, this.f438330m, this.f438331n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.m0) create((r45.av2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        kotlin.jvm.internal.h0 h0Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438325e;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = this.f438327g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ey2.g1 g1Var = (ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f438326f;
            g1Var.P6(baseFinderFeed.getItemId());
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 c17 = megaVideoFlowLoader.c();
            c17.getClass();
            java.util.List d17 = c17.d();
            kotlin.jvm.internal.o.f(d17, "<get-seeLaterDetailList>(...)");
            pm0.v.I(d17, new com.tencent.mm.plugin.finder.megavideo.topstory.flow.d0(baseFinderFeed));
            c17.e(4);
            kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
            java.util.List d18 = megaVideoFlowLoader.c().d();
            kotlin.jvm.internal.o.f(d18, "<get-seeLaterDetailList>(...)");
            bo2.c cVar = (bo2.c) kz5.n0.Z(d18);
            h0Var3.f310123d = cVar;
            if (cVar != null) {
                h0Var = h0Var3;
                pm0.v.X(new vn2.l0(this.f438329i, this.f438330m, this.f438327g, this.f438331n, h0Var, this.f438326f));
                return jz5.f0.f302826a;
            }
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.g0 c18 = megaVideoFlowLoader.c();
            this.f438324d = h0Var3;
            this.f438325e = 1;
            if (c18.f(this.f438328h, 50L, this) == aVar) {
                return aVar;
            }
            h0Var2 = h0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var2 = (kotlin.jvm.internal.h0) this.f438324d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List d19 = megaVideoFlowLoader.c().d();
        kotlin.jvm.internal.o.f(d19, "<get-seeLaterDetailList>(...)");
        h0Var2.f310123d = (bo2.c) kz5.n0.Z(d19);
        h0Var = h0Var2;
        pm0.v.X(new vn2.l0(this.f438329i, this.f438330m, this.f438327g, this.f438331n, h0Var, this.f438326f));
        return jz5.f0.f302826a;
    }
}
