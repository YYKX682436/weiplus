package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract;", "", "()V", "LikedTimelinePresenter", "LikedTimelineViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinderLikedFeedContract {

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback;", "Lcom/tencent/mm/plugin/finder/feed/k8;", "Lim5/b;", "Lim5/a;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class LikedTimelinePresenter implements fs2.a, com.tencent.mm.plugin.finder.feed.k8, im5.b {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122643d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.concurrent.CopyOnWriteArraySet f122644e;

        /* renamed from: f, reason: collision with root package name */
        public final o25.y1 f122645f;

        /* renamed from: g, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f122646g;

        /* renamed from: h, reason: collision with root package name */
        public final jz5.g f122647h;

        /* renamed from: i, reason: collision with root package name */
        public fc2.d f122648i;

        /* renamed from: m, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.feed.model.l0 f122649m;

        /* renamed from: n, reason: collision with root package name */
        public final zy2.h8 f122650n;

        /* renamed from: o, reason: collision with root package name */
        public final java.lang.String f122651o;

        /* renamed from: p, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback f122652p;

        /* renamed from: q, reason: collision with root package name */
        public final cw2.f8 f122653q;

        /* renamed from: r, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$feedExposeInfoChangeListener$1 f122654r;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v8, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$feedExposeInfoChangeListener$1] */
        public LikedTimelinePresenter(com.tencent.mm.ui.MMActivity context, java.lang.String query, java.lang.String requestId, java.util.LinkedList tags) {
            com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(query, "query");
            kotlin.jvm.internal.o.g(requestId, "requestId");
            kotlin.jvm.internal.o.g(tags, "tags");
            this.f122643d = context;
            this.f122644e = new java.util.concurrent.CopyOnWriteArraySet();
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            this.f122645f = new com.tencent.mm.pluginsdk.forward.m();
            pf5.z zVar = pf5.z.f353948a;
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            int i17 = 1;
            if (com.tencent.mm.sdk.platformtools.t8.K0(query) && com.tencent.mm.sdk.platformtools.t8.L0(tags)) {
                final com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader(true, com.tencent.mm.plugin.finder.feed.model.internal.m0.f108026s, V6);
                android.content.Intent intent = context.getIntent();
                kotlin.jvm.internal.o.f(intent, "getIntent(...)");
                finderLikedFeedLoader.initFromCache(intent);
                finderLikedFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.model.internal.q0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$1
                    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
                    public void call(int i18) {
                        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122652p;
                        if (likedTimelineViewCallback == null || (layoutManager = likedTimelineViewCallback.getRecyclerView().getLayoutManager()) == null) {
                            return;
                        }
                        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
                        int initPos = finderLikedFeedLoader.getInitPos();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        arrayList.add(java.lang.Integer.valueOf(initPos));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    }
                });
                finderLikedFeedLoader.f107475g = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2(this);
                finderInteractionSearchFeedLoader = finderLikedFeedLoader;
            } else {
                final com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader2 = new com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader(V6, true, query, requestId, tags, 1);
                android.content.Intent intent2 = context.getIntent();
                kotlin.jvm.internal.o.f(intent2, "getIntent(...)");
                finderInteractionSearchFeedLoader2.initFromCache(intent2);
                finderInteractionSearchFeedLoader2.setInitDone(new com.tencent.mm.plugin.finder.feed.model.internal.q0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1
                    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
                    public void call(int i18) {
                        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter.f122652p;
                        if (likedTimelineViewCallback != null && (layoutManager = likedTimelineViewCallback.getRecyclerView().getLayoutManager()) != null) {
                            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
                            int initPos = finderInteractionSearchFeedLoader2.getInitPos();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            arrayList.add(java.lang.Integer.valueOf(initPos));
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = likedTimelinePresenter.f122652p;
                        if (likedTimelineViewCallback2 != null) {
                            androidx.recyclerview.widget.RecyclerView recyclerView = likedTimelineViewCallback2.getRecyclerView();
                            com.tencent.mm.ui.MMActivity activity = likedTimelinePresenter.f122643d;
                            kotlin.jvm.internal.o.g(activity, "activity");
                            ((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).Q6(recyclerView);
                        }
                    }
                });
                finderInteractionSearchFeedLoader2.f107465i = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$2(this);
                finderInteractionSearchFeedLoader = finderInteractionSearchFeedLoader2;
            }
            this.f122646g = finderInteractionSearchFeedLoader;
            this.f122647h = jz5.h.b(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$mediaBannerViewPool$2.f122698d);
            this.f122649m = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
            this.f122650n = ((te2.e4) ((zy2.g8) zVar.a(context).c(zy2.g8.class))).f417974d;
            this.f122651o = "Finder.FinderLikedFeedContract.LikedTimelinePresenter";
            this.f122653q = new cw2.f8(0, i17, null);
            this.f122654r = new com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$feedExposeInfoChangeListener$1

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.String f122661d;

                {
                    this.f122661d = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122651o;
                }

                @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
                public com.tencent.mm.plugin.finder.storage.FinderItem c(long j17) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this;
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter.f122652p;
                    if (likedTimelineViewCallback == null) {
                        return null;
                    }
                    androidx.recyclerview.widget.f2 adapter = likedTimelineViewCallback.getRecyclerView().getAdapter();
                    kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                    androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                    if (Y == null) {
                        return null;
                    }
                    so2.j5 j5Var = (so2.j5) likedTimelinePresenter.f122646g.safeGet(Y.getAdapterPosition());
                    if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        return ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
                    }
                    return null;
                }

                @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
                /* renamed from: d, reason: from getter */
                public java.lang.String getF122661d() {
                    return this.f122661d;
                }

                @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
                public void e(long j17, r45.yl2 yl2Var) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122652p;
                    if (likedTimelineViewCallback != null) {
                        androidx.recyclerview.widget.RecyclerView recyclerView = likedTimelineViewCallback.getRecyclerView();
                        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                        androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j17, false, 2, null);
                        if (Y != null) {
                            int adapterPosition = Y.getAdapterPosition();
                            androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyItemChanged(adapterPosition, new jz5.l(1, yl2Var));
                            }
                        }
                    }
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.o4 A0(final com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, final com.tencent.mm.ui.widget.dialog.k0 sheet, final in5.s0 holder) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(sheet, "sheet");
            kotlin.jvm.internal.o.g(holder, "holder");
            return new db5.o4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateSecondMoreMenuListener$1
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    java.lang.String string;
                    com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this;
                    com.tencent.mm.ui.MMActivity mMActivity = likedTimelinePresenter.f122643d;
                    kotlin.jvm.internal.o.d(g4Var);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = feed;
                    y4Var.k(mMActivity, g4Var, baseFinderFeed);
                    com.tencent.mm.ui.MMActivity mMActivity2 = likedTimelinePresenter.f122643d;
                    y4Var.s(mMActivity2, g4Var, baseFinderFeed);
                    ya2.b2 contact = baseFinderFeed.getContact();
                    if (r26.i0.q(contact != null ? contact.field_username : null, xy2.c.e(mMActivity2), false, 2, null)) {
                        y4Var.t(mMActivity2, g4Var, baseFinderFeed);
                        y4Var.g(mMActivity2, g4Var, baseFinderFeed);
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter.f122652p;
                    if (likedTimelineViewCallback != null) {
                        string = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x.a(likedTimelineViewCallback.getRecyclerView());
                    } else {
                        string = mMActivity2.getString(com.tencent.mm.R.string.gue);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                    }
                    y4Var.G(g4Var, baseFinderFeed, string);
                    ya2.b2 contact2 = baseFinderFeed.getContact();
                    if (!r26.i0.q(contact2 != null ? contact2.field_username : null, xy2.c.e(mMActivity2), false, 2, null)) {
                        g4Var.g(101, mMActivity2.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
                    }
                    y4Var.q(mMActivity2, g4Var, baseFinderFeed);
                    y4Var.m(mMActivity2, g4Var, baseFinderFeed);
                    y4Var.y(likedTimelinePresenter.f122643d, feed, g4Var, sheet, 200);
                    y4Var.c(mMActivity2, g4Var, baseFinderFeed, holder);
                    y4Var.z(mMActivity2, baseFinderFeed, g4Var);
                    y4Var.b(mMActivity2, baseFinderFeed, g4Var);
                    y4Var.r(mMActivity2, baseFinderFeed, g4Var);
                    y4Var.p(mMActivity2, baseFinderFeed, g4Var);
                    y4Var.e(mMActivity2, baseFinderFeed, g4Var);
                    y4Var.j(mMActivity2, baseFinderFeed, g4Var);
                    com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.t4 D1(final com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, final int i17, final in5.s0 holder, final yz5.a aVar) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(holder, "holder");
            return new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1
                @Override // db5.t4
                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    cw2.da videoView;
                    java.lang.String string;
                    r45.tz0 tz0Var;
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
                    kotlin.jvm.internal.o.g(menuItem, "menuItem");
                    yz5.a aVar2 = yz5.a.this;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    int itemId = menuItem.getItemId();
                    cu2.m mVar = cu2.m.f222420a;
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed feed2 = feed;
                    final com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this;
                    if (itemId == 106) {
                        mVar.b(likedTimelinePresenter.f122643d, feed2, false, new zy2.gc() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$3
                            @Override // zy2.gc
                            public void r5(java.lang.Object obj, r45.ix0 ret) {
                                r45.wh2 req = (r45.wh2) obj;
                                kotlin.jvm.internal.o.g(req, "req");
                                kotlin.jvm.internal.o.g(ret, "ret");
                                if (ret.getInteger(1) == 0) {
                                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.cv6, 0).show();
                                    return;
                                }
                                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f491364cv5, 0).show();
                                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122651o, "finder_feed_close_comment_ok " + ret.getInteger(1));
                            }
                        });
                        return;
                    }
                    if (itemId == 107) {
                        mVar.b(likedTimelinePresenter.f122643d, feed2, true, new zy2.gc() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$2
                            @Override // zy2.gc
                            public void r5(java.lang.Object obj, r45.ix0 ret) {
                                r45.wh2 req = (r45.wh2) obj;
                                kotlin.jvm.internal.o.g(req, "req");
                                kotlin.jvm.internal.o.g(ret, "ret");
                                if (ret.getInteger(1) == 0) {
                                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.cwh, 0).show();
                                    return;
                                }
                                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.cwg, 0).show();
                                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122651o, "finder_feed_open_comment_no_ok " + ret.getInteger(1));
                            }
                        });
                        return;
                    }
                    com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
                    if (itemId == 109) {
                        com.tencent.mm.plugin.finder.assist.y4.T(y4Var, likedTimelinePresenter.f122643d, feed, holder, i17, 0, 16, null);
                        return;
                    }
                    com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
                    in5.s0 s0Var = holder;
                    if (itemId == 116) {
                        if (likedTimelinePresenter.f122652p != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
                            if (p17 != null) {
                                arrayList.add(p17);
                            }
                            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                            zy2.g5 videoView2 = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                            if (finderThumbPlayerProxy != null) {
                                com.tencent.mm.ui.MMActivity activity = likedTimelinePresenter.f122643d;
                                kotlin.jvm.internal.o.g(activity, "activity");
                                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                                kotlin.jvm.internal.o.f(a17, "get(...)");
                                com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17, s0Var, arrayList, finderThumbPlayerProxy, null, null, null, 56, null);
                            }
                        }
                        x3Var.c(likedTimelinePresenter.f122643d, "button_speedplay", feed2.getItemId(), i17);
                        return;
                    }
                    if (itemId == 120) {
                        com.tencent.mm.ui.MMActivity activity2 = likedTimelinePresenter.f122643d;
                        kotlin.jvm.internal.o.g(activity2, "activity");
                        kotlin.jvm.internal.o.g(feed2, "feed");
                        fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                        byte[] byteArray = feed2.getFeedObject().getFeedObject().toByteArray();
                        ((ee0.n4) k4Var).getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                        if (byteArray == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                            return;
                        } else {
                            je4.a.f299315a.a(activity2, 2, byteArray, 0, 9);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                            return;
                        }
                    }
                    if (itemId == 213) {
                        com.tencent.mm.plugin.finder.assist.k2 k2Var = com.tencent.mm.plugin.finder.assist.k2.f102306a;
                        k2Var.a(feed2.getFeedObject());
                        k2Var.b(likedTimelinePresenter.f122643d);
                        return;
                    }
                    if (itemId == 305) {
                        y4Var.L(holder, true, feed, i17, likedTimelinePresenter.f122646g.getDataListJustForAdapter());
                        return;
                    }
                    if (itemId == 306) {
                        y4Var.L(holder, false, feed, i17, likedTimelinePresenter.f122646g.getDataListJustForAdapter());
                        return;
                    }
                    if (itemId == 307) {
                        com.tencent.mm.ui.MMActivity activity3 = likedTimelinePresenter.f122643d;
                        kotlin.jvm.internal.o.g(activity3, "activity");
                        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
                        kotlin.jvm.internal.o.f(a18, "get(...)");
                        ((com.tencent.mm.plugin.finder.viewmodel.component.f2) a18).Q6(s0Var, false);
                        x3Var.c(likedTimelinePresenter.f122643d, "button_minimize", feed2.getItemId(), i17);
                        return;
                    }
                    if (itemId == 308) {
                        y4Var.I(likedTimelinePresenter.f122643d, feed2);
                        return;
                    }
                    if (itemId == 309) {
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                        vn2.u0.f438387a.a(likedTimelinePresenter.f122651o, "", likedTimelinePresenter.f122643d, feed, true, true, (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) ? 0.0f : ((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs()));
                        return;
                    }
                    com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
                    if (itemId == 113) {
                        com.tencent.mm.plugin.finder.assist.n7.H(n7Var, likedTimelinePresenter.f122643d, feed, null, 0, 12, null);
                        x3Var.c(likedTimelinePresenter.f122643d, "textstatus_in_menu", feed2.getItemId(), i17);
                        return;
                    }
                    if (itemId == 114) {
                        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
                        kotlin.jvm.internal.o.d(finderFullSeekBarLayout);
                        cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
                        com.tencent.mm.plugin.finder.assist.y5.f102716a.d(likedTimelinePresenter.f122643d, feed, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : holder, new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$5(finderFullSeekBarLayout, likedTimelinePresenter));
                        x3Var.c(likedTimelinePresenter.f122643d, "button_set_bell", feed2.getItemId(), i17);
                        return;
                    }
                    if (itemId == 200) {
                        y4Var.Y(feed2, likedTimelinePresenter.f122643d, cu2.f0.f222391a.f(feed2.getFeedObject().getFromAppId()));
                        return;
                    }
                    if (itemId == 201) {
                        y4Var.h0(likedTimelinePresenter.f122643d, feed2);
                        return;
                    }
                    if (itemId == 215) {
                        y4Var.e0(likedTimelinePresenter.f122643d, feed2);
                        return;
                    }
                    if (itemId == 216) {
                        com.tencent.mm.ui.MMActivity context = likedTimelinePresenter.f122643d;
                        kotlin.jvm.internal.o.g(context, "context");
                        kotlin.jvm.internal.o.g(feed2, "feed");
                        r45.dm2 object_extend = feed2.getFeedObject().getFeedObject().getObject_extend();
                        if (object_extend == null || (string = object_extend.getString(46)) == null) {
                            return;
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", string);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                        return;
                    }
                    if (itemId == 218) {
                        y4Var.g0(likedTimelinePresenter.f122643d, feed2);
                        return;
                    }
                    if (itemId == 219) {
                        y4Var.d0(likedTimelinePresenter.f122643d, feed2, s0Var);
                        return;
                    }
                    if (itemId == 301 || itemId == 302) {
                        com.tencent.mm.ui.MMActivity activity4 = likedTimelinePresenter.f122643d;
                        kotlin.jvm.internal.o.g(activity4, "activity");
                        androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(activity4).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
                        kotlin.jvm.internal.o.f(a19, "get(...)");
                        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a19, holder, false, true, false, 8, null);
                        return;
                    }
                    if (itemId == 312) {
                        y4Var.M(likedTimelinePresenter.f122643d, s0Var, feed2, likedTimelinePresenter.f122653q);
                        return;
                    }
                    if (itemId == 313) {
                        y4Var.K(likedTimelinePresenter.f122643d, feed2, s0Var, menuItem);
                        return;
                    }
                    switch (itemId) {
                        case 101:
                            boolean C = zl2.q4.f473933a.C(feed2);
                            bd2.b bVar = bd2.b.f19244a;
                            if (C) {
                                r45.nw1 liveInfo = feed2.getFeedObject().getLiveInfo();
                                if (liveInfo != null) {
                                    long j17 = liveInfo.getLong(0);
                                    com.tencent.mm.ui.MMActivity activity5 = likedTimelinePresenter.f122643d;
                                    kotlin.jvm.internal.o.g(activity5, "activity");
                                    bVar.j(activity5, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, feed2.getFeedObject().getUserName(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : null);
                                }
                            } else {
                                bd2.b.c(bVar, likedTimelinePresenter.f122643d, feed, 0L, 0, 12, null);
                            }
                            x3Var.c(likedTimelinePresenter.f122643d, "button_complaint", feed2.getItemId(), i17);
                            return;
                        case 102:
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter.f122652p;
                            kotlin.jvm.internal.o.d(likedTimelineViewCallback);
                            com.tencent.mm.plugin.finder.assist.n7.C(n7Var, likedTimelineViewCallback.f122704f, feed2.getFeedObject(), null, 3, null, 20, null);
                            return;
                        case 103:
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = likedTimelinePresenter.f122652p;
                            kotlin.jvm.internal.o.d(likedTimelineViewCallback2);
                            com.tencent.mm.plugin.finder.assist.n7.F(n7Var, likedTimelineViewCallback2.f122704f, feed, null, 0, 0, 28, null);
                            x3Var.c(likedTimelinePresenter.f122643d, "button_forward_friendcircle", feed2.getItemId(), i17);
                            return;
                        case 104:
                            so2.v0 v0Var = so2.v0.f410644a;
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = feed;
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback3 = likedTimelinePresenter.f122652p;
                            kotlin.jvm.internal.o.d(likedTimelineViewCallback3);
                            so2.v0.b(v0Var, baseFinderFeed, likedTimelineViewCallback3.f122704f, null, null, 12, null);
                            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c17, likedTimelinePresenter.f122643d, true, feed2.getItemId(), false, 8, null);
                            return;
                        default:
                            int i19 = i17;
                            switch (itemId) {
                                case 207:
                                    y4Var.f0(likedTimelinePresenter.f122643d, feed2, i19);
                                    return;
                                case 208:
                                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback4 = likedTimelinePresenter.f122652p;
                                    kotlin.jvm.internal.o.d(likedTimelineViewCallback4);
                                    n7Var.I(likedTimelineViewCallback4.f122704f, feed2.getFeedObject());
                                    return;
                                case 209:
                                    com.tencent.mm.ui.MMActivity context2 = likedTimelinePresenter.f122643d;
                                    kotlin.jvm.internal.o.g(context2, "context");
                                    kotlin.jvm.internal.o.g(feed2, "feed");
                                    r45.dm2 object_extend2 = feed2.getFeedObject().getFeedObject().getObject_extend();
                                    if (object_extend2 == null || (tz0Var = (r45.tz0) object_extend2.getCustom(11)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tz0Var.getCustom(0)) == null) {
                                        return;
                                    }
                                    xc2.y2.i(xc2.y2.f453343a, context2, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                                    return;
                                case 210:
                                    y4Var.j0(likedTimelinePresenter.f122643d, feed2, s0Var);
                                    return;
                                default:
                                    ((com.tencent.mm.pluginsdk.forward.m) likedTimelinePresenter.f122645f).aj((db5.h4) menuItem, new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$6(likedTimelinePresenter, menuItem, feed2, i19));
                                    return;
                            }
                    }
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        /* renamed from: H1, reason: from getter */
        public cw2.f8 getF122653q() {
            return this.f122653q;
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.s4 K0(final com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
            kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(holder, "holder");
            return new db5.s4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemLongSelectedListener$1
                @Override // db5.s4
                public final void a(android.view.MenuItem menuItem, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this;
                    o25.y1 y1Var = likedTimelinePresenter.f122645f;
                    kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                    boolean bj6 = ((com.tencent.mm.pluginsdk.forward.m) y1Var).bj(bottomSheet, (db5.h4) menuItem);
                    com.tencent.mars.xlog.Log.i(likedTimelinePresenter.f122651o, "getMoreMenuItemLongSelectedListener :" + bj6);
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.ui.MMActivity activity = this.f122643d;
            kotlin.jvm.internal.o.g(activity, "activity");
            so2.e2.f410328a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17, feed.getFeedObject(), z17, z18, 2, feed.getShowLikeTips(), z19, hc2.s.f(feed.getContact()), bc1Var);
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(sheet, "sheet");
            return new db5.o4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateSimpleMoreMenuListener$1
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback r14) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.c(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback):void");
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(holder, "holder");
            return new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getSimpleMoreMenuItemSelectedListener$1
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public boolean d0() {
            return false;
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public androidx.recyclerview.widget.y2 e2() {
            return (androidx.recyclerview.widget.y2) ((jz5.n) this.f122647h).getValue();
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        /* renamed from: getActivity, reason: from getter */
        public com.tencent.mm.ui.MMActivity getF122643d() {
            return this.f122643d;
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public com.tencent.mm.plugin.finder.view.f5 j2() {
            com.tencent.mm.ui.MMActivity activity = this.f122643d;
            kotlin.jvm.internal.o.g(activity, "activity");
            return ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
        }

        @Override // im5.b
        public void keep(im5.a p07) {
            kotlin.jvm.internal.o.g(p07, "p0");
            this.f122644e.add(p07);
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
            int i18;
            kotlin.jvm.internal.o.g(feed, "feed");
            if (qt2Var == null) {
                com.tencent.mm.ui.MMActivity activity = this.f122643d;
                kotlin.jvm.internal.o.g(activity, "activity");
                qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            }
            so2.z1.f410730a.a(this.f122643d, qt2Var, feed, z17 ? 1 : 2, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : i17);
            ya2.g gVar = ya2.h.f460484a;
            ya2.b2 contact = feed.getContact();
            java.lang.String D0 = contact != null ? contact.D0() : "";
            if (z17) {
                l75.e0 e0Var = ya2.b2.O2;
                i18 = ya2.b2.Q2;
            } else {
                l75.e0 e0Var2 = ya2.b2.O2;
                i18 = 0;
            }
            gVar.i(D0, i18);
        }

        @Override // fs2.a
        public void onDetach() {
            fc2.c n17;
            fc2.c n18;
            fc2.c n19;
            com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f122649m;
            l0Var.onDetach();
            com.tencent.mm.ui.MMActivity context = this.f122643d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (n19 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
                n19.d(l0Var);
            }
            zy2.h8 h8Var = this.f122650n;
            ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar2 != null && (n18 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
                com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
                s3Var.getClass();
                n18.d(s3Var);
            }
            bu2.n.f24550a.c();
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f122644e;
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((im5.a) it.next()).dead();
            }
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar3 != null && (n17 = zy2.ra.n1(nyVar3, 0, 1, null)) != null) {
                fc2.d dVar = this.f122648i;
                if (dVar == null) {
                    kotlin.jvm.internal.o.o("observerForExposeReport");
                    throw null;
                }
                n17.d(dVar);
            }
            copyOnWriteArraySet.clear();
            this.f122652p = null;
            dead();
            this.f122645f.getClass();
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.o4 p1(final com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, final com.tencent.mm.ui.widget.dialog.k0 sheet) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(sheet, "sheet");
            return new db5.o4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateQuickMoreMenuListener$1
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = com.tencent.mm.plugin.finder.model.BaseFinderFeed.this;
                    if (!baseFinderFeed.getFeedObject().checkIsEnableShare(102) || hc2.o0.A(baseFinderFeed.getFeedObject().getFeedObject())) {
                        return;
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this;
                    o25.y1 y1Var = likedTimelinePresenter.f122645f;
                    com.tencent.mm.ui.MMActivity mMActivity = likedTimelinePresenter.f122643d;
                    kotlin.jvm.internal.o.d(g4Var);
                    ((com.tencent.mm.pluginsdk.forward.m) y1Var).wi(mMActivity, g4Var, sheet);
                    com.tencent.mm.plugin.finder.assist.n7.f102407b = ((com.tencent.mm.pluginsdk.forward.m) likedTimelinePresenter.f122645f).f188722e;
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
            androidx.recyclerview.widget.f2 adapter;
            kotlin.jvm.internal.o.g(feed, "feed");
            java.util.Collection listOfType = this.f122646g.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
            synchronized (listOfType) {
                int i17 = 0;
                for (java.lang.Object obj : listOfType) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                    if ((baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && baseFinderFeed.getFeedObject().getId() == feed.getFeedObject().getId()) {
                        linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), baseFinderFeed));
                    }
                    i17 = i18;
                }
            }
            for (jz5.l lVar : linkedList) {
                this.f122646g.getDataListJustForAdapter().remove(lVar.f302834e);
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f122652p;
                if (likedTimelineViewCallback != null && (adapter = likedTimelineViewCallback.getRecyclerView().getAdapter()) != null) {
                    adapter.notifyItemRangeRemoved(((java.lang.Number) lVar.f302833d).intValue(), 1);
                }
            }
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
            kotlin.jvm.internal.o.g(feed, "feed");
            so2.v0.d(so2.v0.f410644a, this.f122643d, feed, z17, 2, i17, null, bc1Var, 32, null);
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.o4 w4(final com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, final com.tencent.mm.ui.widget.dialog.k0 sheet, final int i17) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(sheet, "sheet");
            return new db5.o4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    ec2.d e27;
                    if (g4Var.z()) {
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this;
                        com.tencent.mm.ui.MMActivity mMActivity = likedTimelinePresenter.f122643d;
                        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
                        com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, mMActivity, feed, 0, com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$1.f122667d, new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2(g4Var, sheet, mMActivity), 4, null);
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = feed;
                        y4Var.B(mMActivity, g4Var, baseFinderFeed, N);
                        y4Var.C(mMActivity, g4Var, baseFinderFeed, N);
                        y4Var.E(g4Var, N);
                        y4Var.l(mMActivity, g4Var, baseFinderFeed);
                        y4Var.i(mMActivity, g4Var, baseFinderFeed, N);
                        y4Var.o(mMActivity, g4Var, baseFinderFeed);
                        y4Var.A(mMActivity, g4Var, baseFinderFeed);
                        y4Var.D(mMActivity, g4Var, baseFinderFeed);
                        y4Var.w(mMActivity, g4Var, baseFinderFeed);
                        y4Var.v(mMActivity, baseFinderFeed, g4Var);
                        y4Var.F(mMActivity, baseFinderFeed, g4Var);
                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bj(baseFinderFeed.getItemId(), 2);
                        com.tencent.mm.ui.MMActivity context = likedTimelinePresenter.f122643d;
                        kotlin.jvm.internal.o.g(context, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
                            e27.a(new ec2.a(16, baseFinderFeed.getItemId(), baseFinderFeed.w()));
                        }
                        com.tencent.mm.ui.MMActivity activity = likedTimelinePresenter.f122643d;
                        kotlin.jvm.internal.o.g(activity, "activity");
                        com.tencent.mm.plugin.finder.report.b6.f124969a.c(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17 == 1 ? "forward" : "tridot", true, new cl0.g());
                        com.tencent.mm.plugin.finder.report.x3.f125432a.a(g4Var);
                    }
                }
            };
        }

        @Override // com.tencent.mm.plugin.finder.feed.k8
        public db5.r4 z6(final com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(sheet, "sheet");
            return new db5.r4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getOnMenuItemGetViewListener$1
                @Override // db5.r4
                public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
                    com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
                    com.tencent.mm.ui.MMActivity mMActivity = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122643d;
                    kotlin.jvm.internal.o.d(view);
                    kotlin.jvm.internal.o.d(menuItem);
                    y4Var.W(mMActivity, view, i17, menuItem, feed);
                }
            };
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class LikedTimelineViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f122702d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter f122703e;

        /* renamed from: f, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122704f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.view.RefreshLoadMoreLayout f122705g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122706h;

        /* renamed from: i, reason: collision with root package name */
        public android.view.View f122707i;

        public LikedTimelineViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter presenter) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122702d = "Finder.FinderProfileContract.LikedTimelineViewCallback";
            this.f122703e = presenter;
            this.f122704f = activity;
        }

        public final com.tencent.mm.view.RefreshLoadMoreLayout a() {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f122705g;
            if (refreshLoadMoreLayout != null) {
                return refreshLoadMoreLayout;
            }
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }

        public final void b() {
            com.tencent.mm.ui.MMActivity mMActivity = this.f122704f;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.f484229dg3);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f122707i = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f122705g = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
            androidx.recyclerview.widget.RecyclerView recyclerView = a().getRecyclerView();
            this.f122706h = recyclerView;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(mMActivity);
            finderLinearLayoutManager.f132639x = 25.0f;
            ((cq.k) i95.n0.c(cq.k.class)).getClass();
            finderLinearLayoutManager.f132640y = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R1().r()).intValue();
            finderLinearLayoutManager.f132641z = 100;
            recyclerView.setLayoutManager(finderLinearLayoutManager);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f122706h;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            final com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f122703e;
            likedTimelinePresenter.getClass();
            recyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$buildItemCoverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (type != 2) {
                        if (type != 4) {
                            if (type != 3001) {
                                if (type != 3002) {
                                    hc2.l.a(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this.f122651o, type);
                                    return new com.tencent.mm.plugin.finder.convert.z2();
                                }
                            }
                        }
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this;
                        return new com.tencent.mm.plugin.finder.convert.bh(likedTimelinePresenter2.f122653q, likedTimelinePresenter2, false, 0, false, 28, null);
                    }
                    return new com.tencent.mm.plugin.finder.convert.df(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.this, false, 0, false, 14, null);
                }
            }, likedTimelinePresenter.f122646g.getDataList(), false));
            final android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.ci6);
            a().setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$2

                /* renamed from: a, reason: collision with root package name */
                public boolean f122708a = true;

                @Override // ym5.q3
                public void a(int i17) {
                    if (!this.f122708a || i17 <= 0) {
                        return;
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this;
                    com.tencent.mm.ui.MMActivity activity = likedTimelineViewCallback.f122704f;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
                    if (Z6 != null) {
                        fc2.i iVar = new fc2.i(Z6);
                        androidx.recyclerview.widget.RecyclerView recyclerView3 = likedTimelineViewCallback.f122706h;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.o.o("recyclerView");
                            throw null;
                        }
                        iVar.onScrollStateChanged(recyclerView3, 5);
                    }
                    this.f122708a = false;
                }

                @Override // ym5.q3
                public void b(int i17) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this.f122702d, "onRequestLoadMore");
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    final com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this;
                    ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$2$onLoadMoreBegin$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this;
                            so2.j5 j5Var = (so2.j5) likedTimelineViewCallback2.f122703e.f122646g.getLast();
                            if (likedTimelineViewCallback2.f122703e.f122646g.getDataList().isEmpty() || j5Var == null) {
                                return;
                            }
                            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(likedTimelineViewCallback2.f122703e.f122646g, false, 1, null);
                        }
                    });
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this.f122702d, "onRequestRefresh");
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    final com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this;
                    ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$2$onRefreshBegin$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this.f122703e.f122646g.requestRefresh();
                        }
                    });
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelineViewCallback.this;
                    android.view.View view = likedTimelineViewCallback.f122707i;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("mEmptyView");
                        throw null;
                    }
                    androidx.recyclerview.widget.f2 adapter = likedTimelineViewCallback.getRecyclerView().getAdapter();
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                    int x17 = wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0;
                    android.view.View view2 = findViewById3;
                    if (x17 <= 0) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (view2 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (view2 != null) {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(0);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    if (reason.f463523h > 0) {
                        final androidx.recyclerview.widget.RecyclerView recyclerView3 = likedTimelineViewCallback.f122706h;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.o.o("recyclerView");
                            throw null;
                        }
                        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                        final int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
                        com.tencent.mars.xlog.Log.i(likedTimelineViewCallback.f122702d, "[smoothScrollToNextPosition] nextPosition=" + w17);
                        recyclerView3.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$smoothScrollToNextPosition$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.recyclerview.widget.RecyclerView recyclerView4 = androidx.recyclerview.widget.RecyclerView.this;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                                arrayList6.add(java.lang.Integer.valueOf(w17));
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(recyclerView4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                recyclerView4.c1(((java.lang.Integer) arrayList6.get(0)).intValue());
                                yj0.a.f(recyclerView4, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                            }
                        });
                    }
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.Kh((zy2.zb) c17, likedTimelineViewCallback.getRecyclerView(), ml2.x1.f328203g, "2", ml2.y.f328242g, 0, 0L, 0, 112, null);
                }
            });
            com.tencent.mm.plugin.finder.ui.o6 o6Var = new com.tencent.mm.plugin.finder.ui.o6();
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f122706h;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            o6Var.b(recyclerView3);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$3(this));
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
            if (Z6 != null) {
                androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f122706h;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                Z6.d(recyclerView4);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f122706h;
            if (recyclerView5 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            if ((recyclerView5 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) && (recyclerView5.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f122706h;
                if (recyclerView6 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView6;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView6.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, null, 2, null);
            }
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122704f;
        }

        public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f122706h;
            if (recyclerView != null) {
                return recyclerView;
            }
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract();
    }

    private FinderLikedFeedContract() {
    }
}
