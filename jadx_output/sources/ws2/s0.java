package ws2;

/* loaded from: classes3.dex */
public final class s0 implements ws2.p {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f449133d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f449134e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f449135f;

    /* renamed from: g, reason: collision with root package name */
    public ws2.q f449136g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1 f449137h;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1] */
    public s0(android.app.Activity context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f449133d = context;
        this.f449134e = intent;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f449137h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                ws2.q qVar;
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                int i17 = iaVar.f6919b;
                ws2.s0 s0Var = ws2.s0.this;
                if (i17 != 14) {
                    if (i17 != 24 || (qVar = s0Var.f449136g) == null) {
                        return false;
                    }
                    com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = (com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback) qVar;
                    finderLiveReplayViewCallback.f124882h.post(new ws2.o1(finderLiveReplayViewCallback, iaVar.f6918a));
                    return false;
                }
                long j17 = iaVar.f6918a;
                ws2.q qVar2 = s0Var.f449136g;
                if (qVar2 == null) {
                    return false;
                }
                com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback2 = (com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback) qVar2;
                finderLiveReplayViewCallback2.f124882h.post(new ws2.t1(finderLiveReplayViewCallback2, j17));
                return false;
            }
        };
    }

    @Override // fs2.a
    public void onDetach() {
        ym5.u uVar;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        ws2.q qVar = this.f449136g;
        if (qVar != null && (uVar = (ym5.u) ((jz5.n) ((com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback) qVar).f124884m).getValue()) != null && (baseFeedLoader = this.f449135f) != null) {
            baseFeedLoader.unregister(uVar);
        }
        dead();
    }
}
