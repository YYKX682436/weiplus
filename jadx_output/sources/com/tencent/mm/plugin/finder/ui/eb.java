package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class eb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedDeleteEvent f129098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent, com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        super(0);
        this.f129098d = feedDeleteEvent;
        this.f129099e = finderMsgFeedDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = this.f129098d;
        long j17 = feedDeleteEvent.f54247g.f6437a;
        com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f129099e;
        if (j17 == finderMsgFeedDetailUI.f128638x) {
            com.tencent.mars.xlog.Log.i(finderMsgFeedDetailUI.f128635u, feedDeleteEvent.f54247g.f6437a + " delete, finish");
            finderMsgFeedDetailUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
