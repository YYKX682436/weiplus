package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/ContactUninterestEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderUninterestEvent;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "feedLoader", "<init>", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ContactUninterestEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderUninterestEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f130830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUninterestEventListener(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> feedLoader) {
        super(com.tencent.mm.app.a0.f53288d);
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f130830d = feedLoader;
        this.__eventId = -429918623;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FinderUninterestEvent finderUninterestEvent) {
        am.pd pdVar;
        com.tencent.mm.autogen.events.FinderUninterestEvent event = finderUninterestEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f130830d.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next();
            java.util.LinkedList h17 = nv2.n1.f340551h.h(baseFinderFeed.getFeedObject().getFeedObject());
            java.util.Iterator it6 = h17.iterator();
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = null;
            while (true) {
                boolean hasNext = it6.hasNext();
                pdVar = event.f54336g;
                if (!hasNext) {
                    break;
                }
                com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it6.next();
                if (kotlin.jvm.internal.o.b(finderCommentInfo2.getUsername(), pdVar.f7613a)) {
                    finderCommentInfo = finderCommentInfo2;
                }
            }
            if (finderCommentInfo != null) {
                h17.remove(finderCommentInfo);
                baseFinderFeed.getFeedObject().setFriendLikeCount(r3.getFriendLikeCount() - 1);
                if (baseFinderFeed.getFeedObject().getFeedObject().getMsgEventFlag() == 1 && finderCommentInfo.getUnreadFlag() == 1 && baseFinderFeed.getFeedObject().getFeedObject().getIncFriendLikeCount() > 0) {
                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
                    feedObject.setIncFriendLikeCount(feedObject.getIncFriendLikeCount() - 1);
                    com.tencent.mars.xlog.Log.i("Finder.ContactUninterestEventListener", "FinderUninterestEvent " + pdVar.f7613a + ", " + baseFinderFeed.getFeedObject().getFeedObject().getIncFriendLikeCount());
                }
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                am.ia iaVar = feedUpdateEvent.f54252g;
                iaVar.f6919b = 4;
                iaVar.f6918a = baseFinderFeed.getItemId();
                feedUpdateEvent.e();
            }
        }
        return true;
    }
}
