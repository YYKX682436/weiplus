package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class rm extends com.tencent.mm.plugin.finder.feed.dj {

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.SingleFeedDetailPresenter$feedProgressListener$1 f129785y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.finder.ui.SingleFeedDetailPresenter$feedProgressListener$1] */
    public rm(com.tencent.mm.ui.MMActivity context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f129785y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.SingleFeedDetailPresenter$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = com.tencent.mm.plugin.finder.ui.rm.this.f106570t;
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader : null;
                if (baseFinderFeedLoader == null) {
                    return true;
                }
                baseFinderFeedLoader.updateProgressByLocalId(event.f54250g.f6749a);
                return true;
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        alive();
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        super.onDetach();
        dead();
    }
}
