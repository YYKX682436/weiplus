package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class m extends com.tencent.mm.plugin.finder.member.question.c implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f121088d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121089e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader f121090f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.all.q f121091g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.all.a f121092h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f121093i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.all.FinderMemberAllPresenter$feedProgressListener$1 f121094m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.all.FinderMemberAllPresenter$memberManagerListener$1 f121095n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f121096o;

    /* renamed from: p, reason: collision with root package name */
    public final cw2.f8 f121097p;

    /* JADX WARN: Type inference failed for: r4v1, types: [com.tencent.mm.plugin.finder.member.all.FinderMemberAllPresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.tencent.mm.plugin.finder.member.all.FinderMemberAllPresenter$memberManagerListener$1] */
    public m(com.tencent.mm.ui.MMActivity context, java.lang.String authorFinderUsername, com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader feedLoader) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f121088d = context;
        this.f121089e = authorFinderUsername;
        this.f121090f = feedLoader;
        this.f121093i = true;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121094m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.all.FinderMemberAllPresenter$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberAllPresenter", sb6.toString());
                com.tencent.mm.plugin.finder.member.all.m.this.f121090f.updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.f121095n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMemberActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.all.FinderMemberAllPresenter$memberManagerListener$1
            {
                this.__eventId = -372620460;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderMemberActionEvent finderMemberActionEvent) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                androidx.recyclerview.widget.f2 adapter;
                com.tencent.mm.autogen.events.FinderMemberActionEvent event = finderMemberActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("memberManagerListener username:");
                am.jc jcVar = event.f54304g;
                sb6.append(jcVar.f7024a);
                sb6.append(", operationType:");
                sb6.append(jcVar.f7025b);
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberAllPresenter", sb6.toString());
                if (jcVar.f7025b == 2) {
                    java.lang.String str = jcVar.f7024a;
                    if (!(str == null || str.length() == 0)) {
                        com.tencent.mm.plugin.finder.member.all.m mVar = com.tencent.mm.plugin.finder.member.all.m.this;
                        pm0.v.b0(mVar.f121090f.getDataListJustForAdapter(), new com.tencent.mm.plugin.finder.member.all.k(event));
                        com.tencent.mm.plugin.finder.member.all.q qVar = mVar.f121091g;
                        if (qVar != null && (recyclerView = qVar.a().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
                return true;
            }
        };
        this.f121096o = new androidx.recyclerview.widget.y2();
        this.f121097p = new cw2.f8(0, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.member.all.d.f121073d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.member.all.g.f121077d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getF122653q() {
        return this.f121097p;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.member.all.f.f121076a;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.member.all.e(feed, this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.member.all.j(feed, this, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public androidx.recyclerview.widget.y2 e2() {
        return this.f121096o;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f121088d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        com.tencent.mm.ui.MMActivity activity = this.f121088d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.view.f5 P6 = ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
        return P6 == null ? new com.tencent.mm.plugin.finder.view.f5() : P6;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // fs2.a
    public void onDetach() {
        dead();
        dead();
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader = this.f121090f;
        finderMemberAllFeedLoader.onDead();
        com.tencent.mm.plugin.finder.member.all.a aVar = this.f121092h;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("actionCallback");
            throw null;
        }
        finderMemberAllFeedLoader.unregister(aVar);
        java.util.ArrayList arrayList = com.tencent.mm.plugin.finder.member.convert.e.f121135a;
        com.tencent.mm.plugin.finder.member.convert.e.f121135a.clear();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return com.tencent.mm.plugin.finder.member.all.c.f121072d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (s0Var == null) {
            return;
        }
        so2.v0.f410644a.c(this.f121088d, feed, z17, 2, i17, this.f121089e, bc1Var);
        if ((!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) && z17) {
            java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_FinderNoFinderUserFavToast");
            com.tencent.mm.ui.MMActivity mMActivity = this.f121088d;
            if (d17 == null) {
                d17 = mMActivity.getString(com.tencent.mm.R.string.er_);
                kotlin.jvm.internal.o.f(d17, "getString(...)");
            }
            db5.t7.makeText(mMActivity, d17, 0).show();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_fav_click", s0Var.p(com.tencent.mm.R.id.f487088ng5), kz5.b1.e(new jz5.l("is_action_fav", java.lang.Integer.valueOf(z17 ? 1 : 0))), 24617);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return com.tencent.mm.plugin.finder.member.all.b.f121071d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return com.tencent.mm.plugin.finder.member.all.h.f121078a;
    }
}
