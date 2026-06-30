package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class qm extends com.tencent.mm.plugin.finder.feed.t8 {
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public final com.tencent.mm.plugin.finder.ui.ShareRelPresenter$feedProgressListener$1 D1;
    public final com.tencent.mm.plugin.finder.ui.ShareRelPresenter$shareBackupListReadyListener$1 E1;
    public final com.tencent.mm.plugin.finder.ui.em F1;
    public final com.tencent.mm.plugin.finder.ui.ShareRelPresenter$finderPersonalizedUpdateEventListener$1 G1;
    public boolean H1;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.LinkedList f129746l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f129747p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.Long f129748p1;

    /* renamed from: x0, reason: collision with root package name */
    public final java.lang.String f129749x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f129750x1;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ContactUninterestEventListener f129751y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f129752y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f129753z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.tencent.mm.plugin.finder.ui.ShareRelPresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.tencent.mm.plugin.finder.ui.ShareRelPresenter$shareBackupListReadyListener$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.ui.ShareRelPresenter$finderPersonalizedUpdateEventListener$1] */
    public qm(int i17, final com.tencent.mm.ui.MMActivity context, boolean z17, int i18, boolean z18, com.tencent.mm.protobuf.g gVar) {
        super(i17, context, z17, false, i18, gVar, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f129747p0 = z18;
        this.f129749x0 = "Finder.FinderShareFeedDetailUI";
        this.f129746l1 = new java.util.LinkedList();
        this.f129748p1 = 0L;
        this.f129750x1 = -1;
        this.D1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(context) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.ui.qm qmVar = this;
                java.lang.String str = qmVar.f129749x0;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = qmVar.f106570t;
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader : null;
                if (baseFinderFeedLoader == null) {
                    return true;
                }
                baseFinderFeedLoader.updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.E1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderShareBackupListReadyEvent>(context) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$shareBackupListReadyListener$1
            {
                this.__eventId = 103122208;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderShareBackupListReadyEvent finderShareBackupListReadyEvent) {
                com.tencent.mm.autogen.events.FinderShareBackupListReadyEvent event = finderShareBackupListReadyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.ui.om(this));
                return true;
            }
        };
        this.F1 = new com.tencent.mm.plugin.finder.ui.em(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.G1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$finderPersonalizedUpdateEventListener$1
            {
                this.__eventId = -270597589;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent finderPersonalizedUpdateEvent) {
                com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent event = finderPersonalizedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.ui.im(com.tencent.mm.plugin.finder.ui.qm.this));
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8, types: [java.lang.Object] */
    public static final void w0(com.tencent.mm.plugin.finder.ui.qm qmVar, java.lang.String str) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        java.util.ArrayList dataListJustForAdapter;
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.view.RefreshLoadMoreLayout o18;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        java.util.AbstractCollection dataListJustForAdapter2;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        boolean z17;
        boolean z18 = qmVar.C1;
        java.lang.String str3 = qmVar.f129749x0;
        if (z18) {
            com.tencent.mars.xlog.Log.w(str3, "checkAutoRemoveBackupFeed return for enterPullRequestDone");
            return;
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = qmVar.f106424g;
        if (i0Var2 == null || (recyclerView = i0Var2.getRecyclerView()) == null) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null || (baseFeedLoader = qmVar.f106570t) == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == null || (i0Var = qmVar.f106424g) == null || (o17 = i0Var.o()) == null) {
            return;
        }
        int w17 = finderLinearLayoutManager.w();
        int y17 = finderLinearLayoutManager.y();
        if (w17 < 0 || w17 != y17) {
            com.tencent.mars.xlog.Log.i(str3, "checkAutoInsertBackupFeed " + str + " return [" + w17 + ' ' + y17 + ']');
            return;
        }
        com.tencent.mars.xlog.Log.i(str3, "checkAutoInsertBackupFeed " + str);
        androidx.recyclerview.widget.k3 q07 = recyclerView.q0(w17, false);
        in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        if (s0Var == null) {
            return;
        }
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed3 == null) {
            return;
        }
        int itemCount = wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.a0();
        boolean z19 = itemCount > 0 && w17 + 1 == itemCount;
        java.util.Iterator it = dataListJustForAdapter.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.j5) it.next()).getItemId() == baseFinderFeed3.getItemId()) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (z19) {
            com.tencent.mm.ui.MMActivity activity = qmVar.f106421d;
            kotlin.jvm.internal.o.g(activity, "activity");
            as2.g gVar = (as2.g) pf5.z.f353948a.a(activity).e(as2.g.class);
            if (gVar != null) {
                java.util.Iterator it6 = gVar.f13463d.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        baseFinderFeed2 = 0;
                        break;
                    }
                    baseFinderFeed2 = it6.next();
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) baseFinderFeed2;
                    if (!dataListJustForAdapter.isEmpty()) {
                        java.util.Iterator it7 = dataListJustForAdapter.iterator();
                        while (it7.hasNext()) {
                            if (baseFinderFeed4.getItemId() == ((so2.j5) it7.next()).getItemId()) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (!z17 && baseFinderFeed4.getFeedObject().isUrlValid() && baseFinderFeed4.getIsUnReadBackupFeed()) {
                        break;
                    }
                }
                baseFinderFeed = baseFinderFeed2;
                str2 = str3;
                com.tencent.mars.xlog.Log.i("FinderSharePageBackupUIC", "getBackupFeed feed:" + hc2.b0.h(baseFinderFeed, false, 1, null));
            } else {
                str2 = str3;
                baseFinderFeed = null;
            }
            if (baseFinderFeed != null) {
                baseFinderFeed.X0(true);
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = qmVar.f106570t;
                if (baseFeedLoader2 != null && (dataListJustForAdapter2 = baseFeedLoader2.getDataListJustForAdapter()) != null) {
                    dataListJustForAdapter2.add(baseFinderFeed);
                }
                o17.onItemRangeInserted(i17 + 1, 1);
                com.tencent.mm.plugin.finder.feed.i0 i0Var3 = qmVar.f106424g;
                if (i0Var3 != null && (o18 = i0Var3.o()) != null && o18.G()) {
                    com.tencent.mm.view.RefreshLoadMoreLayout.r(o18, false, null, null, 7, null);
                    com.tencent.mm.plugin.finder.feed.i0 i0Var4 = qmVar.f106424g;
                    if (i0Var4 != null && (recyclerView2 = i0Var4.getRecyclerView()) != null) {
                        qmVar.C0(recyclerView2);
                    }
                }
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader3 = qmVar.f106570t;
            as2.g gVar2 = (as2.g) pf5.z.f353948a.a(activity).e(as2.g.class);
            java.util.List list = gVar2 != null ? gVar2.f13464e : null;
            if (!(list == null || list.isEmpty()) && (baseFeedLoader3 instanceof com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader)) {
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = (com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader3;
                java.util.List list2 = finderFeedShareRelativeListLoader.R;
                if (list2 == null || list2.isEmpty()) {
                    finderFeedShareRelativeListLoader.R = list;
                }
            }
        } else {
            str2 = str3;
            baseFinderFeed = null;
        }
        com.tencent.mars.xlog.Log.i(str2, "checkAutoInsertBackupFeed " + hc2.b0.d(baseFinderFeed3, i17) + " isAutoInsert:" + z19 + " index:" + i17 + " firstVisible:" + w17 + " itemCount:" + itemCount + " backupFeed:" + hc2.b0.h(baseFinderFeed, false, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    @Override // com.tencent.mm.plugin.finder.feed.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.finder.model.BaseFinderFeed r16, int r17, in5.s0 r18) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.qm.A(com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, in5.s0):void");
    }

    public final void C0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
        com.tencent.mars.xlog.Log.i(this.f129749x0, "[smoothScrollToNextPosition] nextPosition=" + w17);
        recyclerView.post(new com.tencent.mm.plugin.finder.ui.pm(recyclerView, w17));
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void G(ym5.s3 reason) {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        int i17;
        com.tencent.mm.view.RefreshLoadMoreLayout o18;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        java.util.ArrayList dataListJustForAdapter2;
        java.util.List dataListJustForAdapter3;
        com.tencent.mm.plugin.finder.feed.i0 i0Var2;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.String str = this.f129749x0;
        com.tencent.mars.xlog.Log.i(str, "onLoadMoreEnd:");
        this.Z = true;
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, this.f106427m, false, null, false, 0L, false, 60, null);
        if (reason.f463524i && reason.f463521f && (i0Var2 = this.f106424g) != null && (recyclerView = i0Var2.getRecyclerView()) != null) {
            C0(recyclerView);
        }
        boolean z17 = reason.f463521f;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        if (z17) {
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.th thVar = (com.tencent.mm.plugin.finder.viewmodel.component.th) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.th.class);
            com.tencent.mm.plugin.finder.feed.i0 i0Var3 = this.f106424g;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = i0Var3 != null ? i0Var3.getRecyclerView() : null;
            thVar.f136025d = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.i(new com.tencent.mm.plugin.finder.viewmodel.component.sh(thVar));
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
            thVar.P6((baseFeedLoader == null || (dataListJustForAdapter3 = baseFeedLoader.getDataListJustForAdapter()) == null) ? null : (so2.j5) kz5.n0.a0(dataListJustForAdapter3, 1));
            thVar.O6(false);
        } else if (reason.f463516a == 1 && (i0Var = this.f106424g) != null && (o17 = i0Var.o()) != null) {
            o17.post(new com.tencent.mm.plugin.finder.ui.mm(this));
        }
        x0();
        if (this.H1) {
            this.H1 = false;
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = this.f106570t;
            if (baseFeedLoader2 != null && (dataListJustForAdapter2 = baseFeedLoader2.getDataListJustForAdapter()) != null) {
                java.util.ListIterator listIterator = dataListJustForAdapter2.listIterator(dataListJustForAdapter2.size());
                while (listIterator.hasPrevious()) {
                    so2.j5 j5Var = (so2.j5) listIterator.previous();
                    if (j5Var.h() == 15 && (j5Var instanceof so2.n1) && so2.n1.h2((so2.n1) j5Var, null, 1, null)) {
                        i17 = listIterator.nextIndex();
                        break;
                    }
                }
            }
            i17 = -1;
            if (i17 >= 0) {
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader3 = this.f106570t;
                if (baseFeedLoader3 != null && (dataListJustForAdapter = baseFeedLoader3.getDataListJustForAdapter()) != 0) {
                }
                com.tencent.mm.plugin.finder.feed.i0 i0Var4 = this.f106424g;
                if (i0Var4 != null && (o18 = i0Var4.o()) != null) {
                    o18.onItemRangeRemoved(i17, 1);
                }
                if (activity.mo133getLifecycle().b().a(androidx.lifecycle.n.RESUMED) && hc2.e.a()) {
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                    e4Var.f211776c = activity.getString(com.tencent.mm.R.string.ikb);
                    e4Var.b(com.tencent.mm.R.raw.toast_ok);
                    e4Var.c();
                }
            }
            com.tencent.mars.xlog.Log.i(str, "delete placeholder item index=" + i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (((r2 == null || (r2 = r2.getFeedObject()) == null || !r2.isMemberFeed()) ? false : true) != false) goto L20;
     */
    @Override // com.tencent.mm.plugin.finder.feed.dj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r18, com.tencent.mm.plugin.finder.feed.gj r19) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.qm.X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.gj):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void i(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        super.i(feed, menu, sheet, i17);
        if (this.f129747p0) {
            menu.removeItem(103);
            menu.removeItem(114);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f106427m == 1001 && feed.N0() && !zl2.q4.f473933a.C(feed)) {
            menu.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
            com.tencent.mm.ui.MMActivity context = this.f106421d;
            kotlin.jvm.internal.o.g(context, "context");
            if (feed.getFeedObject().isCommentClose() || !com.tencent.mm.plugin.finder.assist.y4.f102714a.c0(context)) {
                menu.g(107, context.getString(com.tencent.mm.R.string.cwf), com.tencent.mm.R.raw.icons_outlined_comment);
            } else {
                menu.g(106, context.getString(com.tencent.mm.R.string.f491363cv4), com.tencent.mm.R.raw.icons_outlined_comment_close);
            }
        }
        super.m(feed, menu, sheet, holder);
        if (this.f129747p0) {
            menu.removeItem(305);
            menu.removeItem(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET);
            if (feed.N0()) {
                return;
            }
            menu.removeItem(101);
            menu.removeItem(99);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        int i18 = 0;
        boolean booleanExtra = activity.getIntent().getBooleanExtra("is_from_ad", false);
        if (qt2Var == null) {
            kotlin.jvm.internal.o.g(activity, "activity");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        r45.qt2 qt2Var2 = qt2Var;
        so2.z1 z1Var = so2.z1.f410730a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        int i19 = z17 ? 1 : 2;
        if (booleanExtra) {
            i17 = 22;
        }
        z1Var.a(mMActivity, qt2Var2, feed, i19, true, i17);
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        if (z17) {
            l75.e0 e0Var = ya2.b2.O2;
            i18 = ya2.b2.Q2;
        } else {
            l75.e0 e0Var2 = ya2.b2.O2;
        }
        gVar.i(D0, i18);
    }

    @Override // com.tencent.mm.plugin.finder.feed.t8, com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        so2.j5 j5Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        super.onDetach();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        java.util.List dataListJustForAdapter = baseFeedLoader != null ? baseFeedLoader.getDataListJustForAdapter() : null;
        if (dataListJustForAdapter != null && (j5Var = (so2.j5) kz5.n0.Z(dataListJustForAdapter)) != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed != null) {
                cq.k kVar = (cq.k) i95.n0.c(cq.k.class);
                long itemId = baseFinderFeed.getItemId();
                kVar.getClass();
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(itemId);
                if (h17 != null && (feedObject = h17.getFeedObject()) != null && (object_extend = feedObject.getObject_extend()) != null) {
                    object_extend.set(49, null);
                }
            }
        }
        com.tencent.mm.plugin.finder.view.ContactUninterestEventListener contactUninterestEventListener = this.f129751y0;
        if (contactUninterestEventListener != null) {
            contactUninterestEventListener.dead();
        }
        dead();
        java.util.Iterator it = this.f129746l1.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.event.IListener) it.next()).dead();
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var != null && (o17 = i0Var.o()) != null && (recyclerView = o17.getRecyclerView()) != null) {
            recyclerView.V0(this.F1);
        }
        dead();
        dead();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i(this.f129749x0, "onRefreshEnd:");
        this.Z = true;
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int i17 = this.f106427m;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, i17, false, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, 0L, false, 56, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public java.lang.String v() {
        return this.f129749x0;
    }

    public final void x0() {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        com.tencent.mm.view.RefreshLoadMoreLayout o18;
        if (this.B1) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        boolean z17 = false;
        if (i0Var2 != null && (o18 = i0Var2.o()) != null && o18.getEnableLoadMore()) {
            z17 = true;
        }
        if (z17) {
            this.B1 = true;
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_SHARE_PREFETCH_LAST_FEED_OUNT_INT_SYNC, 3);
            java.lang.String str = this.f129749x0;
            com.tencent.mars.xlog.Log.i(str, "addLoadMorePreload: add load more preload, loadMoreThreshold=" + r17);
            if (r17 <= 0 || (i0Var = this.f106424g) == null || (o17 = i0Var.o()) == null) {
                return;
            }
            o17.getRecyclerView().i(new sc2.r8(str, o17, r17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184  */
    @Override // com.tencent.mm.plugin.finder.feed.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(long r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.qm.z(long):boolean");
    }
}
