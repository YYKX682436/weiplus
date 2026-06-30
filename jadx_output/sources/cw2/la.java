package cw2;

/* loaded from: classes10.dex */
public final class la extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f223849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f223850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f223851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f223852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(r45.nw1 nw1Var, com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView, java.lang.Long l17, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f223850e = nw1Var;
        this.f223851f = liveFeedPlayerView;
        this.f223852g = l17;
        this.f223853h = str;
        this.f223854i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cw2.la(this.f223850e, this.f223851f, this.f223852g, this.f223853h, this.f223854i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.la) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ne2.k liveFreeTimeManager;
        ne2.k liveFreeTimeManager2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f223849d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            cw2.ka kaVar = new cw2.ka(this.f223852g, this.f223853h, this.f223850e, this.f223854i, this.f223851f, null);
            this.f223849d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, kaVar, this);
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
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj().L0(this.f223850e.getLong(0));
            com.tencent.mars.xlog.Log.i("LiveFeedPlayerView", "charge live invalid!");
            com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f223851f;
            mn0.b0 player = liveFeedPlayerView.getPlayer();
            if (player != null) {
                mn0.b0.C(player, false, false, false, 6, null);
            }
            liveFeedPlayerView.Y();
            if (liveFeedPlayerView.N) {
                liveFreeTimeManager = liveFeedPlayerView.getLiveFreeTimeManager();
                if (liveFreeTimeManager.e()) {
                    liveFreeTimeManager2 = liveFeedPlayerView.getLiveFreeTimeManager();
                    cw2.wa waVar = liveFeedPlayerView.f130756y;
                    ne2.e.a(liveFreeTimeManager2, (waVar == null || (feedData = waVar.f224099f) == null) ? 0L : feedData.getLiveId(), true, false, 4, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
