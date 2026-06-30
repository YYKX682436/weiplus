package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class ImproveInputUIC extends com.tencent.mm.plugin.sns.ui.improve.component.j implements bd4.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168677d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f168678e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f168679f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f168680g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168681h;

    /* renamed from: i, reason: collision with root package name */
    public int f168682i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1 f168683m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1 f168684n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1 f168685o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1 f168686p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1 f168687q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f168688r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1] */
    public ImproveInputUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168677d = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.d0(activity, this));
        this.f168678e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.c0(this));
        this.f168679f = jz5.h.b(com.tencent.mm.plugin.sns.ui.improve.component.m0.f168940d);
        jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.f0(this));
        this.f168680g = new java.util.LinkedList();
        this.f168681h = "";
        this.f168682i = -1;
        this.f168683m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsInputEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1
            {
                this.__eventId = 1757953112;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsInputEvent snsInputEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
                com.tencent.mm.autogen.events.SnsInputEvent event = snsInputEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this;
                boolean z17 = false;
                if (improveInputUIC.isActive()) {
                    am.zv zvVar = event.f54817g;
                    xc4.p info = zvVar.f8609a;
                    kotlin.jvm.internal.o.f(info, "info");
                    int i17 = zvVar.f8610b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    java.lang.String a17 = info.a1();
                    improveInputUIC.f168681h = a17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "onCommentClick commentkey:" + info.a1() + " position:" + i17);
                    improveInputUIC.R6(info);
                    improveInputUIC.U6().setTag(info.c1());
                    improveInputUIC.U6().setCommentInfo(new r45.e86());
                    improveInputUIC.U6().setVisibility(0);
                    improveInputUIC.U6().H(improveInputUIC.T6(a17, 0));
                    improveInputUIC.U6().setSnsInfo(info.c1());
                    java.lang.String string = improveInputUIC.getContext().getString(com.tencent.mm.R.string.jgp);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    improveInputUIC.U6().setCommentHint(string);
                    improveInputUIC.U6().N(com.tencent.mm.plugin.sns.ui.l1.A, a17);
                    improveInputUIC.U6().post(new com.tencent.mm.plugin.sns.ui.improve.component.k0(improveInputUIC));
                    improveInputUIC.U6().O(false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    androidx.recyclerview.widget.k3 p07 = improveInputUIC.getRecycleView().p0(i17);
                    if (p07 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    } else {
                        improveInputUIC.U6().setOutsideScrollView(p07.itemView);
                        android.view.View itemView = p07.itemView;
                        kotlin.jvm.internal.o.f(itemView, "itemView");
                        improveInputUIC.Z6(itemView, improveInputUIC.U6());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    }
                    improveInputUIC.U6().setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.improve.component.l0(improveInputUIC));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputListener$1");
                return z17;
            }
        };
        this.f168684n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsReplyEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1
            {
                this.__eventId = -177900232;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsReplyEvent snsReplyEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1");
                com.tencent.mm.autogen.events.SnsReplyEvent event = snsReplyEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.sw swVar = event.f54836g;
                android.view.View view = swVar.f7943c;
                if (view == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1");
                } else {
                    android.view.ViewParent parent = view.getParent();
                    kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int childCount = viewGroup.getChildCount() - 1;
                    com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this;
                    if (indexOfChild == childCount) {
                        while (!(viewGroup instanceof tc4.x1)) {
                            android.view.ViewParent parent2 = viewGroup.getParent();
                            kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                            viewGroup = (android.view.ViewGroup) parent2;
                        }
                        xc4.p info = swVar.f7941a;
                        kotlin.jvm.internal.o.f(info, "info");
                        r45.e86 comment = swVar.f7942b;
                        kotlin.jvm.internal.o.f(comment, "comment");
                        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.Q6(improveInputUIC, viewGroup, info, comment);
                    } else {
                        xc4.p info2 = swVar.f7941a;
                        kotlin.jvm.internal.o.f(info2, "info");
                        r45.e86 comment2 = swVar.f7942b;
                        kotlin.jvm.internal.o.f(comment2, "comment");
                        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.Q6(improveInputUIC, view, info2, comment2);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$replyListener$1");
                return true;
            }
        };
        this.f168685o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsInputScrollEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1
            {
                this.__eventId = -548022517;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsInputScrollEvent snsInputScrollEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
                com.tencent.mm.autogen.events.SnsInputScrollEvent event = snsInputScrollEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.aw awVar = event.f54818g;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = awVar.f6192b;
                android.view.View view = awVar.f6191a;
                if (snsCommentFooter != null && view != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                    this.Z6(view, snsCommentFooter);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$inputScrollListener$1");
                return true;
            }
        };
        this.f168686p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsScrollEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1
            {
                this.__eventId = 1408793957;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsScrollEvent snsScrollEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
                com.tencent.mm.autogen.events.SnsScrollEvent event = snsScrollEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unreadScrollListener pos:");
                am.uw uwVar = event.f54838g;
                sb6.append(uwVar.f8140a);
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", sb6.toString());
                pc4.d dVar = pc4.d.f353410a;
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this;
                com.tencent.mm.plugin.sns.ui.improve.component.n0 n0Var = new com.tencent.mm.plugin.sns.ui.improve.component.n0(dVar.n(improveInputUIC.getContext()), improveInputUIC.getContext());
                n0Var.f12049a = uwVar.f8140a;
                improveInputUIC.getLayoutManager().startSmoothScroll(n0Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1");
                return true;
            }
        };
        this.f168687q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFeedRelocateEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1
            {
                this.__eventId = -56406801;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFeedRelocateEvent snsFeedRelocateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
                com.tencent.mm.autogen.events.SnsFeedRelocateEvent event = snsFeedRelocateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.pv pvVar = event.f54807g;
                android.view.View view = pvVar.f7661a;
                int i17 = pvVar.f7662b;
                int i18 = pvVar.f7663c;
                int i19 = pvVar.f7664d;
                java.lang.Runnable runnable = pvVar.f7665e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this;
                improveInputUIC.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                int a17 = com.tencent.mm.ui.bl.a(improveInputUIC.getContext()) + com.tencent.mm.ui.bl.h(improveInputUIC.getContext());
                int i27 = com.tencent.mm.ui.bl.b(improveInputUIC.getContext()).y;
                int g17 = com.tencent.mm.ui.bl.g(improveInputUIC.getContext());
                int i28 = i27 - g17;
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: content changeAreaTop:" + i17 + ", changeAreaBottom:" + i18 + ", extraOffsetY:" + i19 + ", bottomRawY:" + i27 + ", bottomHeight:" + g17 + ", actionBarBottom:" + a17);
                if (i17 > a17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: top visible, do nothing");
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    if (a17 + 1 <= i18 && i18 < i28) {
                        int i29 = i18 - i17;
                        if (runnable != null) {
                            runnable.run();
                            improveInputUIC.getRecycleView().scrollBy(0, -i29);
                            if (view != null) {
                                view.post(new com.tencent.mm.plugin.sns.ui.improve.component.a0(improveInputUIC, view, i18));
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: only top invisible, move " + (-i29));
                    } else {
                        int i37 = -((a17 - i17) + i19);
                        improveInputUIC.getRecycleView().scrollBy(0, i37);
                        if (runnable != null) {
                            improveInputUIC.getRecycleView().postDelayed(runnable, 0L);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFeedRelocate: top bottom invisible, move " + i37);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$feedRelocateListener$1");
                return true;
            }
        };
        this.f168688r = "";
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter U6 = improveInputUIC.U6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return U6;
    }

    public static final void P6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, zb4.a aVar) {
        r45.e86 r17;
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        java.lang.Object tag = improveInputUIC.U6().getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) tag;
        if (aVar.f()) {
            java.lang.String d17 = aVar.d();
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.k(ca4.z0.t0(snsInfo.field_snsId));
            dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
            kotlin.jvm.internal.o.f(t07, "longToString(...)");
            ((zy1.f) sVar).Di(12076, "CommentOrLikeFeedCount", t07);
            dy1.s sVar2 = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t08 = ca4.z0.t0(snsInfo.field_snsId);
            kotlin.jvm.internal.o.f(t08, "longToString(...)");
            ((zy1.f) sVar2).Di(12076, "comment_feed_count", t08);
            int commentFlag = improveInputUIC.U6().getCommentFlag();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "onCommentSend click %s", java.lang.Integer.valueOf(commentFlag));
            if (com.tencent.mm.plugin.sns.ui.widget.t2.i(commentFlag, 8)) {
                kotlin.jvm.internal.o.d(d17);
                java.lang.String substring = d17.substring(improveInputUIC.U6().getCommentAtPrefix().length());
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                aVar.i(substring);
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "send atFriend ad timeline comment");
                r17 = com.tencent.mm.plugin.sns.model.d6.r(snsInfo, 16, aVar, improveInputUIC.U6().getCommentInfo(), true, commentFlag, 0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "send timeline comment");
                r17 = com.tencent.mm.plugin.sns.model.d6.r(snsInfo, snsInfo.isAd() ? 8 : 2, aVar, improveInputUIC.U6().getCommentInfo(), true, commentFlag, 0);
            }
            improveInputUIC.X6();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).k7(snsInfo.field_snsId, r17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(improveInputUIC.f168681h)) {
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.l1.A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
                    if (kotlin.jvm.internal.o.b(improveInputUIC.f168681h, t1Var.f170493a)) {
                        ((java.util.LinkedList) com.tencent.mm.plugin.sns.ui.l1.A).remove(t1Var);
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.InputUIC", "onCommentSend contentData is Invalid");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            zy1.e.f477325a.e(12076, "CommentOrLikeFeedCount", improveInputUIC.f168688r);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public static final void Q6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, android.view.View view, xc4.p pVar, r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "replayComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        java.lang.Object value = ((jz5.n) improveInputUIC.f168679f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        java.lang.String str = improveInputUIC.getContext().getString(com.tencent.mm.R.string.f493233je0) + ca4.z0.y(e86Var, (com.tencent.mm.storage.e8) value);
        java.lang.String str2 = pVar.a1() + str;
        improveInputUIC.f168681h = str2;
        improveInputUIC.U6().setTag(pVar.c1());
        improveInputUIC.U6().setVisibility(0);
        improveInputUIC.U6().H(improveInputUIC.T6(str2, 0));
        improveInputUIC.U6().setCommentHint(str + improveInputUIC.getContext().getString(com.tencent.mm.R.string.j8z));
        improveInputUIC.U6().setSnsInfo(pVar.c1());
        improveInputUIC.R6(pVar);
        improveInputUIC.U6().setCommentInfo(e86Var);
        improveInputUIC.U6().N(com.tencent.mm.plugin.sns.ui.l1.A, str2);
        improveInputUIC.U6().post(new com.tencent.mm.plugin.sns.ui.improve.component.g0(improveInputUIC));
        improveInputUIC.U6().O(false);
        improveInputUIC.U6().setOutsideScrollView(view);
        improveInputUIC.Z6(view, improveInputUIC.U6());
        improveInputUIC.U6().setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.improve.component.h0(improveInputUIC));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public static void Y6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, android.view.View view, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        improveInputUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (i18 >= 10) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            int[] iArr = new int[2];
            snsCommentFooter.getLocationInWindow(iArr);
            int i27 = i17 - iArr[1];
            if (i27 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            } else {
                improveInputUIC.getRecycleView().scrollBy(0, i27);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    @Override // bd4.v0
    public boolean K1(android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        boolean z17 = U6().getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (!z17 || com.tencent.mm.plugin.sns.ui.improve.component.j.Companion.a(U6(), ev6)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            return false;
        }
        X6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return true;
    }

    public final void R6(xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if ((pVar.h1().ContentObj.f369841i & 128) != 0) {
            U6().setFeedEmojiCommentEnable(false);
        } else {
            U6().setFeedEmojiCommentEnable(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public final void S6(android.view.View view, int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            return;
        }
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFixScrollUtilMatchViewBottom: left count=0, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            return;
        }
        int W6 = W6(view);
        int i19 = this.f168682i;
        if (i19 == -1) {
            this.f168682i = W6;
        } else if (i19 == W6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFixScrollUtilMatchViewBottom: skip");
            this.f168682i = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            return;
        }
        int i27 = i17 - W6;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "checkFixScrollUtilMatchViewBottom: targetY:" + i17 + ", viewBottomRawY:" + W6 + ", needScrollY:" + i27);
        getRecycleView().scrollBy(0, -i27);
        if (i27 != 0 || z17) {
            getRecycleView().postDelayed(new com.tencent.mm.plugin.sns.ui.improve.component.b0(this, view, i17, i18), 50L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            this.f168682i = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        }
    }

    public final int T6(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        java.util.Iterator it = this.f168680g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.D0(t1Var.f170493a, str)) {
                i17 = t1Var.f170495c;
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return i17;
    }

    public final com.tencent.mm.plugin.sns.ui.SnsCommentFooter U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        java.lang.Object value = ((jz5.n) this.f168678e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return snsCommentFooter;
    }

    public final gc4.b V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        gc4.b bVar = (gc4.b) ((jz5.n) this.f168677d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return bVar;
    }

    public final int W6(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.InputUIC", "getViewBottomRawY: rawTopY=" + iArr[1] + ", viewHeight:" + view.getHeight());
        int height = iArr[1] + view.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return height;
    }

    public final void X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        pm0.v.X(new com.tencent.mm.plugin.sns.ui.improve.component.e0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public final void Z6(android.view.View view, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollRecyclerViewToInputView_R", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            snsCommentFooter.setWindowInsetsAnimationCallback(new com.tencent.mm.plugin.sns.ui.improve.component.j0(this, view, snsCommentFooter, W6(view)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerViewToInputView_R", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollRecyclerViewToInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            f0Var2.f310116d = 10;
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.improve.component.i0(this, f0Var2, f0Var, snsCommentFooter, view), 90L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerViewToInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onActivityResult(i17, i18, intent);
        if (i17 != 26) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            U6().K(i18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        X6();
        boolean onBackPressed = super.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return onBackPressed;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        alive();
        alive();
        alive();
        alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        dead();
        dead();
        dead();
        dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onPause();
        V6().a();
        dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onResume();
        V6().c();
        U6().B();
        alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onWindowFocusChanged(z17);
        if (z17) {
            V6().c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }
}
