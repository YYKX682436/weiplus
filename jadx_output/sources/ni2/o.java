package ni2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f337392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView f337393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView) {
        super(2, continuation);
        this.f337392e = hVar;
        this.f337393f = finderLiveMicGiftMemberPanelTabView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.o(this.f337392e, continuation, this.f337393f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337391d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f337392e).f454381b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMicMemberList fail, isShowing: ");
            com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView = this.f337393f;
            ni2.v2 v2Var = finderLiveMicGiftMemberPanelTabView.f111710p;
            if (v2Var == null) {
                kotlin.jvm.internal.o.o("panel");
                throw null;
            }
            sb6.append(((ni2.w) v2Var).q());
            sb6.append(" error: ");
            sb6.append(aVar2);
            com.tencent.mars.xlog.Log.i("FinderLiveMicGiftMemberPanelTabView", sb6.toString());
            ni2.v2 v2Var2 = finderLiveMicGiftMemberPanelTabView.f111710p;
            if (v2Var2 == null) {
                kotlin.jvm.internal.o.o("panel");
                throw null;
            }
            if (((ni2.w) v2Var2).q()) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                ni2.n nVar = new ni2.n(finderLiveMicGiftMemberPanelTabView, null);
                this.f337391d = 1;
                if (kotlinx.coroutines.l.g(g3Var, nVar, this) == aVar) {
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
