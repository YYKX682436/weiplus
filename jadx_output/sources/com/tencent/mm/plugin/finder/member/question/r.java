package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.s f121343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.member.question.s sVar) {
        super(1);
        this.f121343d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.plugin.finder.member.question.w wVar;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse response = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        if (response.getErrCode() == 0) {
            com.tencent.mm.plugin.finder.member.question.s sVar = this.f121343d;
            com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader2 = sVar.f121346f;
            if (finderMemberQAFeedLoader2.f107515g != 0) {
                java.util.Iterator it = finderMemberQAFeedLoader2.getDataList().iterator();
                int i17 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    finderMemberQAFeedLoader = sVar.f121346f;
                    if (!hasNext) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject().getId() == finderMemberQAFeedLoader.f107515g) {
                        break;
                    }
                    i17++;
                }
                if (i17 != -1) {
                    so2.j5 j5Var2 = (so2.j5) finderMemberQAFeedLoader.getDataList().get(i17);
                    kotlin.jvm.internal.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                    baseFinderFeed.Y0(true);
                    baseFinderFeed.m1(false);
                    baseFinderFeed.Z0(false);
                    if (sVar.f121349i != 0 && (wVar = sVar.f121347g) != null) {
                        java.lang.Object obj2 = finderMemberQAFeedLoader.getDataList().get(i17);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        com.tencent.mm.ui.MMActivity mMActivity = wVar.f121375i;
                        com.tencent.mm.plugin.finder.member.question.s sVar2 = wVar.f121371e;
                        sVar2.f(mMActivity, sVar2.j2(), (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2, wVar.f121372f, sVar2.f121349i, null, 11);
                    }
                    com.tencent.mm.plugin.finder.member.question.w wVar2 = sVar.f121347g;
                    if (wVar2 != null && (recyclerView2 = wVar2.a().getRecyclerView()) != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAPresenter$onAttach$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAPresenter$onAttach$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    com.tencent.mm.plugin.finder.member.question.w wVar3 = sVar.f121347g;
                    if (wVar3 != null && (recyclerView = wVar3.a().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                        adapter.notifyItemRangeChanged(i17, 1);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
