package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f123585d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.filter.q qVar;
        com.tencent.mm.plugin.finder.profile.filter.q qVar2;
        com.tencent.mm.plugin.finder.profile.filter.q qVar3;
        com.tencent.mm.plugin.finder.profile.filter.q qVar4;
        com.tencent.mm.plugin.finder.profile.filter.q qVar5;
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        com.tencent.mm.plugin.finder.profile.filter.q hVar;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader2;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader3;
        java.util.LinkedList list;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f123585d;
        qVar = finderProfileFeedUIC.f123444y;
        if (qVar == null) {
            feedLoader = finderProfileFeedUIC.getFeedLoader();
            r45.wx0 collectionInfoList = feedLoader.getCollectionInfoList();
            if ((collectionInfoList == null || (list = collectionInfoList.getList(0)) == null || !(list.isEmpty() ^ true)) ? false : true) {
                androidx.appcompat.app.AppCompatActivity activity = finderProfileFeedUIC.getActivity();
                feedLoader3 = finderProfileFeedUIC.getFeedLoader();
                r45.wx0 collectionInfoList2 = feedLoader3.getCollectionInfoList();
                kotlin.jvm.internal.o.d(collectionInfoList2);
                com.tencent.mm.plugin.finder.profile.filter.a aVar = new com.tencent.mm.plugin.finder.profile.filter.a(collectionInfoList2);
                java.lang.String username = finderProfileFeedUIC.getUsername();
                kotlin.jvm.internal.o.d(username);
                hVar = new com.tencent.mm.plugin.finder.profile.filter.b(activity, aVar, username);
            } else {
                androidx.appcompat.app.AppCompatActivity activity2 = finderProfileFeedUIC.getActivity();
                feedLoader2 = finderProfileFeedUIC.getFeedLoader();
                java.util.ArrayList<r45.r03> topicFilterList = feedLoader2.getTopicFilterList();
                java.lang.String username2 = finderProfileFeedUIC.getUsername();
                kotlin.jvm.internal.o.d(username2);
                hVar = new com.tencent.mm.plugin.finder.profile.filter.h(activity2, topicFilterList, username2, 0, 8, null);
            }
            finderProfileFeedUIC.f123444y = hVar;
        }
        qVar2 = finderProfileFeedUIC.f123444y;
        com.tencent.mm.plugin.finder.profile.filter.h hVar2 = qVar2 instanceof com.tencent.mm.plugin.finder.profile.filter.h ? (com.tencent.mm.plugin.finder.profile.filter.h) qVar2 : null;
        if (hVar2 != null) {
            hVar2.f123369f = new com.tencent.mm.plugin.finder.profile.uic.b5(finderProfileFeedUIC);
        }
        qVar3 = finderProfileFeedUIC.f123444y;
        if ((qVar3 != null ? qVar3.getView() : null) == null) {
            qVar5 = finderProfileFeedUIC.f123444y;
            if (qVar5 != null && qVar5.hasData()) {
                recyclerView = finderProfileFeedUIC.getRecyclerView();
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter != null) {
                    finderProfileFeedUIC.initFilterView(wxRecyclerAdapter);
                }
            }
        }
        qVar4 = finderProfileFeedUIC.f123444y;
        if (qVar4 != null) {
            qVar4.l();
        }
        return jz5.f0.f302826a;
    }
}
