package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class SnsWsFoldInputUIC extends com.tencent.mm.plugin.sns.ui.wsfold.a implements bd4.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168722d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f168723e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f168724f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f168725g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168726h;

    /* renamed from: i, reason: collision with root package name */
    public int f168727i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1 f168728m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1 f168729n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1 f168730o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1 f168731p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f168732q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f168733r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f168734s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1] */
    public SnsWsFoldInputUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168722d = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.l2(activity, this));
        this.f168723e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.k2(this));
        this.f168724f = jz5.h.b(com.tencent.mm.plugin.sns.ui.improve.component.t2.f168999d);
        this.f168725g = new java.util.LinkedList();
        this.f168726h = "";
        this.f168727i = -1;
        this.f168728m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsInputEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1
            {
                this.__eventId = 1757953112;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsInputEvent snsInputEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1");
                com.tencent.mm.autogen.events.SnsInputEvent event = snsInputEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isActive$p", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC = this;
                boolean z17 = snsWsFoldInputUIC.f168734s;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isActive$p", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                boolean z18 = false;
                if (z17) {
                    am.zv zvVar = event.f54817g;
                    xc4.p info = zvVar.f8609a;
                    kotlin.jvm.internal.o.f(info, "info");
                    int i17 = zvVar.f8610b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    java.lang.String a17 = info.a1();
                    snsWsFoldInputUIC.f168726h = a17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "onCommentClick commentkey:" + info.a1() + " position:" + i17);
                    snsWsFoldInputUIC.S6(info);
                    snsWsFoldInputUIC.V6().setTag(info.c1());
                    snsWsFoldInputUIC.V6().setCommentInfo(new r45.e86());
                    snsWsFoldInputUIC.V6().setVisibility(0);
                    snsWsFoldInputUIC.V6().H(snsWsFoldInputUIC.U6(a17, 0));
                    snsWsFoldInputUIC.V6().setSnsInfo(info.c1());
                    java.lang.String string = snsWsFoldInputUIC.getContext().getString(com.tencent.mm.R.string.jgp);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    snsWsFoldInputUIC.V6().setCommentHint(string);
                    snsWsFoldInputUIC.V6().N(com.tencent.mm.plugin.sns.ui.l1.A, a17);
                    snsWsFoldInputUIC.V6().post(new com.tencent.mm.plugin.sns.ui.improve.component.r2(snsWsFoldInputUIC));
                    snsWsFoldInputUIC.V6().O(false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    androidx.recyclerview.widget.k3 p07 = snsWsFoldInputUIC.X6().p0(i17);
                    if (p07 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    } else {
                        snsWsFoldInputUIC.V6().setOutsideScrollView(p07.itemView);
                        android.view.View itemView = p07.itemView;
                        kotlin.jvm.internal.o.f(itemView, "itemView");
                        snsWsFoldInputUIC.a7(itemView, snsWsFoldInputUIC.V6());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    }
                    snsWsFoldInputUIC.V6().setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.improve.component.s2(snsWsFoldInputUIC));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showInputView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1");
                    z18 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputListener$1");
                return z18;
            }
        };
        this.f168729n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsReplyEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1
            {
                this.__eventId = -177900232;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsReplyEvent snsReplyEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1");
                com.tencent.mm.autogen.events.SnsReplyEvent event = snsReplyEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.sw swVar = event.f54836g;
                android.view.View view = swVar.f7943c;
                if (view == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1");
                } else {
                    android.view.ViewParent parent = view.getParent();
                    kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int childCount = viewGroup.getChildCount() - 1;
                    com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC = this;
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
                        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.R6(snsWsFoldInputUIC, viewGroup, info, comment);
                    } else {
                        xc4.p info2 = swVar.f7941a;
                        kotlin.jvm.internal.o.f(info2, "info");
                        r45.e86 comment2 = swVar.f7942b;
                        kotlin.jvm.internal.o.f(comment2, "comment");
                        com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.R6(snsWsFoldInputUIC, view, info2, comment2);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$replyListener$1");
                return true;
            }
        };
        this.f168730o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsInputScrollEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1
            {
                this.__eventId = -548022517;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsInputScrollEvent snsInputScrollEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1");
                com.tencent.mm.autogen.events.SnsInputScrollEvent event = snsInputScrollEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.aw awVar = event.f54818g;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = awVar.f6192b;
                android.view.View view = awVar.f6191a;
                if (snsCommentFooter != null && view != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                    this.a7(view, snsCommentFooter);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$inputScrollListener$1");
                return true;
            }
        };
        this.f168731p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFeedRelocateEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1
            {
                this.__eventId = -56406801;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFeedRelocateEvent snsFeedRelocateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1");
                com.tencent.mm.autogen.events.SnsFeedRelocateEvent event = snsFeedRelocateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.pv pvVar = event.f54807g;
                android.view.View view = pvVar.f7661a;
                int i17 = pvVar.f7662b;
                int i18 = pvVar.f7663c;
                int i19 = pvVar.f7664d;
                java.lang.Runnable runnable = pvVar.f7665e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC = this;
                snsWsFoldInputUIC.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                int a17 = com.tencent.mm.ui.bl.a(snsWsFoldInputUIC.getContext()) + com.tencent.mm.ui.bl.h(snsWsFoldInputUIC.getContext());
                int i27 = com.tencent.mm.ui.bl.b(snsWsFoldInputUIC.getContext()).y;
                int g17 = com.tencent.mm.ui.bl.g(snsWsFoldInputUIC.getContext());
                int i28 = i27 - g17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFeedRelocate: content changeAreaTop:" + i17 + ", changeAreaBottom:" + i18 + ", extraOffsetY:" + i19 + ", bottomRawY:" + i27 + ", bottomHeight:" + g17 + ", actionBarBottom:" + a17);
                if (i17 > a17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFeedRelocate: top visible, do nothing");
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    if (a17 + 1 <= i18 && i18 < i28) {
                        int i29 = i18 - i17;
                        if (runnable != null) {
                            runnable.run();
                            snsWsFoldInputUIC.X6().scrollBy(0, -i29);
                            if (view != null) {
                                view.post(new com.tencent.mm.plugin.sns.ui.improve.component.i2(snsWsFoldInputUIC, view, i18));
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFeedRelocate: only top invisible, move " + (-i29));
                    } else {
                        int i37 = -((a17 - i17) + i19);
                        snsWsFoldInputUIC.X6().scrollBy(0, i37);
                        if (runnable != null) {
                            snsWsFoldInputUIC.X6().postDelayed(runnable, 0L);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFeedRelocate: top bottom invisible, move " + i37);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkFeedRelocate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$feedRelocateListener$1");
                return true;
            }
        };
        this.f168732q = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.n2(this));
        this.f168733r = "";
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter P6(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter V6 = snsWsFoldInputUIC.V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return V6;
    }

    public static final void Q6(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC, zb4.a aVar) {
        r45.e86 r17;
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        snsWsFoldInputUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        java.lang.Object tag = snsWsFoldInputUIC.V6().getTag();
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
            int commentFlag = snsWsFoldInputUIC.V6().getCommentFlag();
            com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "onCommentSend click %s", java.lang.Integer.valueOf(commentFlag));
            if (com.tencent.mm.plugin.sns.ui.widget.t2.i(commentFlag, 8)) {
                kotlin.jvm.internal.o.d(d17);
                java.lang.String substring = d17.substring(snsWsFoldInputUIC.V6().getCommentAtPrefix().length());
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                aVar.i(substring);
                com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "send atFriend ad timeline comment");
                r17 = com.tencent.mm.plugin.sns.model.d6.r(snsInfo, 16, aVar, snsWsFoldInputUIC.V6().getCommentInfo(), true, commentFlag, 0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "send timeline comment");
                r17 = com.tencent.mm.plugin.sns.model.d6.r(snsInfo, snsInfo.isAd() ? 8 : 2, aVar, snsWsFoldInputUIC.V6().getCommentInfo(), true, commentFlag, 0);
            }
            snsWsFoldInputUIC.Z6();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).k7(snsInfo.field_snsId, r17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(snsWsFoldInputUIC.f168726h)) {
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.l1.A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
                    if (kotlin.jvm.internal.o.b(snsWsFoldInputUIC.f168726h, t1Var.f170493a)) {
                        ((java.util.LinkedList) com.tencent.mm.plugin.sns.ui.l1.A).remove(t1Var);
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WS.InputUIC", "onCommentSend content data is Valid");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
            zy1.e.f477325a.e(12076, "CommentOrLikeFeedCount", snsWsFoldInputUIC.f168733r);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    public static final void R6(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC, android.view.View view, xc4.p pVar, r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        snsWsFoldInputUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "replayComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        java.lang.Object value = ((jz5.n) snsWsFoldInputUIC.f168724f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        java.lang.String str = snsWsFoldInputUIC.getContext().getString(com.tencent.mm.R.string.f493233je0) + ca4.z0.y(e86Var, (com.tencent.mm.storage.e8) value);
        java.lang.String str2 = pVar.a1() + str;
        snsWsFoldInputUIC.f168726h = str2;
        snsWsFoldInputUIC.V6().setTag(pVar.c1());
        snsWsFoldInputUIC.V6().setVisibility(0);
        snsWsFoldInputUIC.V6().H(snsWsFoldInputUIC.U6(str2, 0));
        snsWsFoldInputUIC.V6().setCommentHint(str + snsWsFoldInputUIC.getContext().getString(com.tencent.mm.R.string.j8z));
        snsWsFoldInputUIC.V6().setSnsInfo(pVar.c1());
        snsWsFoldInputUIC.S6(pVar);
        snsWsFoldInputUIC.V6().setCommentInfo(e86Var);
        snsWsFoldInputUIC.V6().N(com.tencent.mm.plugin.sns.ui.l1.A, str2);
        snsWsFoldInputUIC.V6().post(new com.tencent.mm.plugin.sns.ui.improve.component.o2(snsWsFoldInputUIC));
        snsWsFoldInputUIC.V6().O(false);
        snsWsFoldInputUIC.V6().setOutsideScrollView(view);
        snsWsFoldInputUIC.a7(view, snsWsFoldInputUIC.V6());
        snsWsFoldInputUIC.V6().setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.improve.component.p2(snsWsFoldInputUIC));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    @Override // bd4.v0
    public boolean K1(android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f3206d;
        boolean z17 = popupWindow != null && popupWindow.isShowing();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.improve.component.a aVar = com.tencent.mm.plugin.sns.ui.improve.component.j.Companion;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            android.widget.PopupWindow popupWindow2 = ad4.w.f3206d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (!aVar.a(popupWindow2 != null ? popupWindow2.getContentView() : null, ev6)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                pm0.v.X(new ad4.n(true));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        boolean z18 = V6().getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        if (z18 && !com.tencent.mm.plugin.sns.ui.improve.component.j.Companion.a(V6(), ev6)) {
            Z6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return false;
    }

    public final void S6(xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        if ((pVar.h1().ContentObj.f369841i & 128) != 0) {
            V6().setFeedEmojiCommentEnable(false);
        } else {
            V6().setFeedEmojiCommentEnable(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    public final void T6(android.view.View view, int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
            return;
        }
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFixScrollUtilMatchViewBottom: left count=0, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
            return;
        }
        int Y6 = Y6(view);
        int i19 = this.f168727i;
        if (i19 == -1) {
            this.f168727i = Y6;
        } else if (i19 == Y6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFixScrollUtilMatchViewBottom: skip");
            this.f168727i = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
            return;
        }
        int i27 = i17 - Y6;
        com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "checkFixScrollUtilMatchViewBottom: targetY:" + i17 + ", viewBottomRawY:" + Y6 + ", needScrollY:" + i27);
        X6().scrollBy(0, -i27);
        if (i27 != 0 || z17) {
            X6().postDelayed(new com.tencent.mm.plugin.sns.ui.improve.component.j2(this, view, i17, i18), 50L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        } else {
            this.f168727i = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        }
    }

    public final int U6(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        java.util.Iterator it = this.f168725g.iterator();
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return i17;
    }

    public final com.tencent.mm.plugin.sns.ui.SnsCommentFooter V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        java.lang.Object value = ((jz5.n) this.f168723e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return snsCommentFooter;
    }

    public final gc4.b W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        gc4.b bVar = (gc4.b) ((jz5.n) this.f168722d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return bVar;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecycleView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        java.lang.Object value = ((jz5.n) this.f168732q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecycleView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return wxRecyclerView;
    }

    public final int Y6(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.WS.InputUIC", "getViewBottomRawY: rawTopY=" + iArr[1] + ", viewHeight:" + view.getHeight());
        int height = iArr[1] + view.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return height;
    }

    public final void Z6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        pm0.v.X(new com.tencent.mm.plugin.sns.ui.improve.component.m2(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    public final void a7(android.view.View view, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollRecyclerViewToInputView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = 10;
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.improve.component.q2(this, f0Var2, f0Var, snsCommentFooter, view), 90L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollRecyclerViewToInputView", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        super.onActivityResult(i17, i18, intent);
        if (i17 != 26) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        } else {
            V6().K(i18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        Z6();
        boolean onBackPressed = super.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        return onBackPressed;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        alive();
        alive();
        alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        dead();
        dead();
        dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        super.onPause();
        this.f168734s = false;
        W6().a();
        dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        this.f168734s = true;
        W6().c();
        V6().B();
        alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        super.onWindowFocusChanged(z17);
        if (z17) {
            W6().c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
    }
}
