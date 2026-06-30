package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class r5 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f124174e;

    public r5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC) {
        this.f124173d = finderProfileFeedUIC;
        this.f124174e = finderProfileDrawerUIC;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        int fromFeedType;
        long fromFeedId;
        int fromCommentScene;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader feedLoader;
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2;
        int fromFeedType2;
        long fromFeedId2;
        int fromCommentScene2;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124173d;
        if (z17) {
            feedLoader = finderProfileFeedUIC.getFeedLoader();
            if (feedLoader.getState() == com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED) {
                zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                recyclerView2 = finderProfileFeedUIC.getRecyclerView();
                ml2.x1 x1Var = ml2.x1.f328202f;
                ml2.q1 q1Var = ml2.q1.f327812e;
                ml2.y yVar = ml2.y.f328240e;
                fromFeedType2 = finderProfileFeedUIC.getFromFeedType();
                fromFeedId2 = finderProfileFeedUIC.getFromFeedId();
                fromCommentScene2 = finderProfileFeedUIC.getFromCommentScene();
                ((ml2.j0) zbVar).oj(recyclerView2, x1Var, "temp_5", yVar, fromFeedType2, fromFeedId2, fromCommentScene2);
                return;
            }
            return;
        }
        zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
        recyclerView = finderProfileFeedUIC.getRecyclerView();
        ml2.x1 x1Var2 = ml2.x1.f328202f;
        ml2.q1 q1Var2 = ml2.q1.f327812e;
        ml2.y yVar2 = ml2.y.f328241f;
        fromFeedType = finderProfileFeedUIC.getFromFeedType();
        fromFeedId = finderProfileFeedUIC.getFromFeedId();
        fromCommentScene = finderProfileFeedUIC.getFromCommentScene();
        ((ml2.j0) zbVar2).oj(recyclerView, x1Var2, "temp_5", yVar2, fromFeedType, fromFeedId, fromCommentScene);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = this.f124174e;
        if (finderProfileDrawerUIC != null) {
            finderProfileDrawerUIC.f133629q.remove(this);
        }
    }
}
