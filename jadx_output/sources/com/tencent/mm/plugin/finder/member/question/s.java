package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class s extends com.tencent.mm.plugin.finder.member.question.c implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f121344d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121345e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader f121346f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.question.w f121347g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.question.d f121348h;

    /* renamed from: i, reason: collision with root package name */
    public long f121349i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f121350m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$feedProgressListener$1 f121351n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$memberManagerListener$1 f121352o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f121353p;

    /* renamed from: q, reason: collision with root package name */
    public final cw2.f8 f121354q;

    /* JADX WARN: Type inference failed for: r4v1, types: [com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$memberManagerListener$1] */
    public s(com.tencent.mm.ui.MMActivity context, java.lang.String authorFinderUsername, com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader feedLoader) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f121344d = context;
        this.f121345e = authorFinderUsername;
        this.f121346f = feedLoader;
        this.f121350m = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121351n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$feedProgressListener$1
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
                com.tencent.mars.xlog.Log.i("Finder.FinderQAPresenter", sb6.toString());
                com.tencent.mm.plugin.finder.member.question.s.this.f121346f.updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.f121352o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderMemberActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$memberManagerListener$1
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
                com.tencent.mars.xlog.Log.i("Finder.FinderQAPresenter", sb6.toString());
                if (jcVar.f7025b == 2) {
                    java.lang.String str = jcVar.f7024a;
                    if (!(str == null || str.length() == 0)) {
                        com.tencent.mm.plugin.finder.member.question.s sVar = com.tencent.mm.plugin.finder.member.question.s.this;
                        pm0.v.b0(sVar.f121346f.getDataListJustForAdapter(), new com.tencent.mm.plugin.finder.member.question.p(event));
                        com.tencent.mm.plugin.finder.member.question.w wVar = sVar.f121347g;
                        if (wVar != null && (recyclerView = wVar.a().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
                return true;
            }
        };
        this.f121353p = new androidx.recyclerview.widget.y2();
        this.f121354q = new cw2.f8(0, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.member.question.g.f121325d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.member.question.j.f121329d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getF122653q() {
        return this.f121354q;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.member.question.i.f121328a;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.member.question.h(this, feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.member.question.o(this, feed, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public androidx.recyclerview.widget.y2 e2() {
        return this.f121353p;
    }

    public final boolean g() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f121344d;
        return kotlin.jvm.internal.o.b(this.f121345e, mMActivity != null ? xy2.c.e(mMActivity) : null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f121344d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        com.tencent.mm.ui.MMActivity activity = this.f121344d;
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
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f121346f;
        finderMemberQAFeedLoader.onDead();
        com.tencent.mm.plugin.finder.member.question.d dVar = this.f121348h;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("actionCallback");
            throw null;
        }
        finderMemberQAFeedLoader.unregister(dVar);
        java.util.ArrayList arrayList = com.tencent.mm.plugin.finder.member.convert.e.f121135a;
        com.tencent.mm.plugin.finder.member.convert.e.f121135a.clear();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return com.tencent.mm.plugin.finder.member.question.f.f121324d;
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
        so2.v0.f410644a.c(this.f121344d, feed, z17, 2, i17, this.f121345e, bc1Var);
        if ((!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) && z17) {
            java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_FinderNoFinderUserFavToast");
            com.tencent.mm.ui.MMActivity mMActivity = this.f121344d;
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
        return com.tencent.mm.plugin.finder.member.question.e.f121323d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return com.tencent.mm.plugin.finder.member.question.k.f121330a;
    }
}
