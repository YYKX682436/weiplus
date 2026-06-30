package ni2;

/* loaded from: classes3.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f337398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView f337399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f337400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f337401h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fj2.k f337402i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f337403m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f337404n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ km2.q f337405o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f337406p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView, dk2.u4 u4Var, boolean z17, fj2.k kVar, boolean z18, boolean z19, km2.q qVar, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        super(2, continuation);
        this.f337398e = hVar;
        this.f337399f = finderLiveMicGiftMemberPanelTabView;
        this.f337400g = u4Var;
        this.f337401h = z17;
        this.f337402i = kVar;
        this.f337403m = z18;
        this.f337404n = z19;
        this.f337405o = qVar;
        this.f337406p = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.p(this.f337398e, continuation, this.f337399f, this.f337400g, this.f337401h, this.f337402i, this.f337403m, this.f337404n, this.f337405o, this.f337406p);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337397d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.x71 x71Var = (r45.x71) ((xg2.i) this.f337398e).f454393b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMicMemberList success, isShowing: ");
            com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView = this.f337399f;
            ni2.v2 v2Var = finderLiveMicGiftMemberPanelTabView.f111710p;
            if (v2Var == null) {
                kotlin.jvm.internal.o.o("panel");
                throw null;
            }
            sb6.append(((ni2.w) v2Var).q());
            com.tencent.mars.xlog.Log.i("FinderLiveMicGiftMemberPanelTabView", sb6.toString());
            ni2.v2 v2Var2 = finderLiveMicGiftMemberPanelTabView.f111710p;
            if (v2Var2 == null) {
                kotlin.jvm.internal.o.o("panel");
                throw null;
            }
            if (((ni2.w) v2Var2).q()) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                ni2.m mVar = new ni2.m(this.f337399f, x71Var, this.f337400g, this.f337401h, this.f337402i, this.f337403m, this.f337404n, this.f337405o, this.f337406p, null);
                this.f337397d = 1;
                if (kotlinx.coroutines.l.g(g3Var, mVar, this) == aVar) {
                    return aVar;
                }
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
