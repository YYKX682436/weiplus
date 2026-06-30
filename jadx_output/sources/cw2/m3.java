package cw2;

/* loaded from: classes10.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f223860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f223861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f223862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f223863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223865i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(r45.nw1 nw1Var, com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView, java.lang.Long l17, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f223861e = nw1Var;
        this.f223862f = finderLivePlayView;
        this.f223863g = l17;
        this.f223864h = str;
        this.f223865i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw2.m3(this.f223861e, this.f223862f, this.f223863g, this.f223864h, this.f223865i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ne2.k liveFreeTimeManager;
        ne2.k liveFreeTimeManager2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f223860d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            cw2.l3 l3Var = new cw2.l3(this.f223863g, this.f223864h, this.f223861e, this.f223865i, this.f223862f, null);
            this.f223860d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, l3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj().L0(this.f223861e.getLong(0));
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePlayView", "charge live invalid!");
            com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f223862f;
            mn0.b0 txLivePlayer = finderLivePlayView.getTxLivePlayer();
            if (txLivePlayer != null) {
                mn0.b0.C(txLivePlayer, false, false, false, 6, null);
            }
            finderLivePlayView.X();
            if (finderLivePlayView.isLiveFreeTimerInit) {
                liveFreeTimeManager = finderLivePlayView.getLiveFreeTimeManager();
                if (liveFreeTimeManager.e()) {
                    liveFreeTimeManager2 = finderLivePlayView.getLiveFreeTimeManager();
                    cw2.wa waVar = finderLivePlayView.f130607n;
                    ne2.e.a(liveFreeTimeManager2, (waVar == null || (feedData = waVar.f224099f) == null) ? 0L : feedData.getLiveId(), true, false, 4, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
