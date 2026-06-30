package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u00029\u0003B\u001b\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u00102\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%¨\u0006:"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderColumnFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/z;", "Lcom/tencent/mm/plugin/finder/view/h4;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnItemClickListener", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "i", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;)V", "recyclerView", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "m", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "getLoadingView", "()Lcom/tencent/mm/ui/widget/MMProcessBar;", "setLoadingView", "(Lcom/tencent/mm/ui/widget/MMProcessBar;)V", "loadingView", "Ldw2/b;", "q", "Ldw2/b;", "getColumnFeedSelectorAdapter", "()Ldw2/b;", "setColumnFeedSelectorAdapter", "(Ldw2/b;)V", "columnFeedSelectorAdapter", "", "w", "I", "getCurrentStats", "()I", "setCurrentStats", "(I)V", "currentStats", "x", "getLastState", "setLastState", "lastState", "y", "getDraggingDistance", "setDraggingDistance", "draggingDistance", "B", "getLastSnappedPosition", "setLastSnappedPosition", "lastSnappedPosition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/view/g4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderColumnFrameLayout extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.view.z {
    public static final /* synthetic */ int H = 0;
    public final com.tencent.mm.plugin.finder.view.g4 A;

    /* renamed from: B, reason: from kotlin metadata */
    public int lastSnappedPosition;
    public final com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUpdatePostionEvent$1 C;
    public final com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUIFinishBySwipeEvent$1 D;
    public final com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUIFinishEvent$1 E;
    public final com.tencent.mm.plugin.finder.view.r4 F;
    public final com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$feedChangeListener$1 G;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f130903d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f130904e;

    /* renamed from: f, reason: collision with root package name */
    public cw2.z9 f130905f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.y1 f130906g;

    /* renamed from: h, reason: collision with root package name */
    public r45.en2 f130907h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView recyclerView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.ui.widget.MMProcessBar loadingView;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f130910n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.PageIndicatorView f130911o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f130912p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public dw2.b columnFeedSelectorAdapter;

    /* renamed from: r, reason: collision with root package name */
    public ey2.u f130914r;

    /* renamed from: s, reason: collision with root package name */
    public int f130915s;

    /* renamed from: t, reason: collision with root package name */
    public int f130916t;

    /* renamed from: u, reason: collision with root package name */
    public final int f130917u;

    /* renamed from: v, reason: collision with root package name */
    public final int f130918v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int currentStats;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int lastState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int draggingDistance;

    /* renamed from: z, reason: collision with root package name */
    public android.util.Size f130922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUIFinishEvent$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUpdatePostionEvent$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUIFinishBySwipeEvent$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$feedChangeListener$1] */
    public FinderColumnFrameLayout(final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f130903d = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127682ef).getValue()).r()).booleanValue();
        cq.k1.a();
        this.f130904e = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127720gf).getValue()).r()).booleanValue();
        this.f130906g = new androidx.recyclerview.widget.y1();
        this.columnFeedSelectorAdapter = new dw2.b();
        this.f130915s = -1;
        this.f130917u = pm0.v.S(20);
        this.f130918v = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().widthPixels;
        this.f130922z = new android.util.Size(0, 0);
        this.A = new com.tencent.mm.plugin.finder.view.g4();
        this.lastSnappedPosition = -1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderColumnUpdatePostionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUpdatePostionEvent$1
            {
                this.__eventId = -1000932889;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderColumnUpdatePostionEvent finderColumnUpdatePostionEvent) {
                ey2.u uVar;
                androidx.lifecycle.j0 j0Var;
                jz5.l lVar;
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
                com.tencent.mm.autogen.events.FinderColumnUpdatePostionEvent event = finderColumnUpdatePostionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.sa saVar = event.f54262g;
                int i17 = saVar.f7889a;
                if (i17 != -1) {
                    com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.this;
                    if (i17 != finderColumnFrameLayout.getLastSnappedPosition() && (uVar = finderColumnFrameLayout.f130914r) != null && (j0Var = uVar.f257542x) != null && (lVar = (jz5.l) j0Var.getValue()) != null && (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) != null) {
                        java.util.Iterator<T> it = dataBuffer.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i18 = -1;
                                break;
                            }
                            so2.j5 j5Var = (so2.j5) it.next();
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                            if (baseFinderFeed != null && baseFinderFeed.getItemId() == saVar.f7890b) {
                                break;
                            }
                            i18++;
                        }
                        if (i18 != -1) {
                            finderColumnFrameLayout.setLastSnappedPosition(saVar.f7889a);
                            ey2.u uVar2 = finderColumnFrameLayout.f130914r;
                            if (uVar2 != null) {
                                uVar2.N6(finderColumnFrameLayout.getLastSnappedPosition());
                            }
                            finderColumnFrameLayout.d(i18);
                        }
                    }
                }
                return false;
            }
        };
        final androidx.lifecycle.y a17 = tm3.a.a(context);
        a17 = a17 == null ? a0Var : a17;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderColumnUIFinishBySwipeEvent>(a17) { // from class: com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUIFinishBySwipeEvent$1
            {
                this.__eventId = 2068861034;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderColumnUIFinishBySwipeEvent finderColumnUIFinishBySwipeEvent) {
                com.tencent.mm.autogen.events.FinderColumnUIFinishBySwipeEvent event = finderColumnUIFinishBySwipeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.njo);
                e4Var.c();
                return true;
            }
        };
        final androidx.lifecycle.y a18 = tm3.a.a(context);
        a18 = a18 == null ? a0Var : a18;
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderColumnUIFinishEvent>(a18) { // from class: com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$finderColumnUIFinishEvent$1
            {
                this.__eventId = -552983353;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderColumnUIFinishEvent finderColumnUIFinishEvent) {
                androidx.lifecycle.j0 j0Var;
                jz5.l lVar;
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
                in5.s0 s0Var;
                com.tencent.mm.autogen.events.FinderColumnUIFinishEvent event = finderColumnUIFinishEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderColumnUIFinishEvent feedId=");
                am.ra raVar = event.f54261g;
                sb6.append(raVar.f7803a);
                sb6.append(" isPause=");
                sb6.append(raVar.f7804b);
                com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", sb6.toString());
                com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.this;
                ey2.u uVar = finderColumnFrameLayout.f130914r;
                if (uVar != null && (j0Var = uVar.f257542x) != null && (lVar = (jz5.l) j0Var.getValue()) != null && (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) != null) {
                    if (finderColumnFrameLayout.getLastSnappedPosition() == -1 || finderColumnFrameLayout.getLastSnappedPosition() >= dataBuffer.size()) {
                        baseFinderFeed = null;
                        s0Var = null;
                    } else {
                        java.lang.Object obj = dataBuffer.get(finderColumnFrameLayout.getLastSnappedPosition());
                        baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
                        androidx.recyclerview.widget.k3 q07 = finderColumnFrameLayout.getRecyclerView().q0(finderColumnFrameLayout.getLastSnappedPosition(), false);
                        s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                    }
                    if (baseFinderFeed != null && baseFinderFeed.getItemId() == raVar.f7803a) {
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = s0Var != null ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k) : null;
                        if (finderColumnFrameLayout.f130903d && finderColumnFrameLayout.f130904e && finderVideoLayout != null) {
                            if (raVar.f7804b) {
                                ey2.q2 R6 = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).R6(raVar.f7803a, false, ey2.t2.f257522o);
                                if (R6 != null) {
                                    ey2.q2 q2Var = R6.f257486i ? R6 : null;
                                    if (q2Var != null) {
                                        com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, q2Var.f257481d, q2Var.f257485h, 0.0f, !finderVideoLayout.G(), null, 20, null);
                                    }
                                }
                                cw2.da videoView = finderVideoLayout.getVideoView();
                                if (videoView != null) {
                                    videoView.setIsShouldPlayResume(false);
                                }
                                finderVideoLayout.L(true, true);
                            } else {
                                cw2.da videoView2 = finderVideoLayout.getVideoView();
                                if (videoView2 != null) {
                                    videoView2.setIsShouldPlayResume(true);
                                }
                                finderVideoLayout.M();
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.F = new com.tencent.mm.plugin.finder.view.r4(this);
        this.G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.view.s4(event, com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.this));
                return true;
            }
        };
    }

    public static final void a(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout, int i17, android.view.View view) {
        androidx.lifecycle.j0 j0Var;
        jz5.l lVar;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        r45.qt2 qt2Var;
        r45.ey0 ey0Var;
        ey2.u uVar = finderColumnFrameLayout.f130914r;
        if (uVar == null || (j0Var = uVar.f257542x) == null || (lVar = (jz5.l) j0Var.getValue()) == null || (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) == null) {
            com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "feedList is null or not DataBuffer<RVFeed> type");
            return;
        }
        if (i17 < 0 || i17 >= dataBuffer.size()) {
            com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "Invalid position: " + i17 + ", feedList size: " + dataBuffer.size());
            return;
        }
        java.lang.Object obj = dataBuffer.get(i17);
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "feed at position " + i17 + " is null or not BaseFinderFeed type");
            return;
        }
        com.tencent.mm.plugin.finder.report.s sVar = com.tencent.mm.plugin.finder.report.s.f125337a;
        int i18 = finderColumnFrameLayout.f130915s;
        r45.en2 en2Var = finderColumnFrameLayout.f130907h;
        r45.ey0 ey0Var2 = en2Var != null ? (r45.ey0) en2Var.getCustom(11) : null;
        r45.en2 en2Var2 = finderColumnFrameLayout.f130907h;
        ey2.u uVar2 = finderColumnFrameLayout.f130914r;
        android.content.Context context = finderColumnFrameLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        sVar.b(view, baseFinderFeed, i17, i18, ey0Var2, en2Var2, uVar2, context, finderColumnFrameLayout.f130916t, 8);
        com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "onClick " + i17 + " id:" + baseFinderFeed2.getFeedObject().getId() + ", pos:" + i17);
        if (!baseFinderFeed2.getFeedObject().isLive() && finderColumnFrameLayout.f130904e) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view.findViewById(com.tencent.mm.R.id.e_k);
            if (finderVideoLayout == null) {
                com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "videoLayout is null");
                return;
            }
            finderVideoLayout.setRequestNotPlay(false);
            if (finderVideoLayout.J()) {
                finderVideoLayout.L(true, true);
                return;
            } else {
                finderVideoLayout.M();
                return;
            }
        }
        android.content.Context context2 = finderColumnFrameLayout.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 W6 = nyVar != null ? nyVar.W6(finderColumnFrameLayout.f130916t) : new r45.qt2();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view.findViewById(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout2 != null) {
            finderVideoLayout2.W(baseFinderFeed2.getItemId(), false, true, 3);
        }
        r45.en2 en2Var3 = finderColumnFrameLayout.f130907h;
        int integer = (en2Var3 == null || (ey0Var = (r45.ey0) en2Var3.getCustom(11)) == null) ? 0 : ey0Var.getInteger(0);
        ey2.u uVar3 = finderColumnFrameLayout.f130914r;
        if (uVar3 != null) {
            java.lang.String O6 = uVar3.O6();
            if (baseFinderFeed2.getFeedObject().isLive()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(integer);
                sb6.append('-');
                ey2.u uVar4 = finderColumnFrameLayout.f130914r;
                sb6.append(pm0.v.u(uVar4 != null ? uVar4.f257538t : 0L));
                java.lang.String sb7 = sb6.toString();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt("feed_columnid", java.lang.Integer.valueOf(integer));
                jSONObject.putOpt("column_trace_id", sb7);
                jSONObject.putOpt("column_exp_index", java.lang.Integer.valueOf(finderColumnFrameLayout.f130915s + 1));
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.x1 x1Var = ml2.x1.f328207n;
                java.lang.String valueOf = java.lang.String.valueOf(W6.getInteger(5));
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                ((ml2.j0) ((zy2.zb) c17)).qj(baseFinderFeed2, i17, x1Var, valueOf, jSONObject2, baseFinderFeed2.g0());
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) c18;
                android.content.Context context3 = finderColumnFrameLayout.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                int i19 = c61.dc.f38947a;
                boolean wh6 = ((pg2.j0) i95.n0.c(pg2.j0.class)).wh();
                com.tencent.mars.xlog.Log.i("ILiveEnterAnimStrategy", "createLiveEnterAnimImpl isSupport=" + wh6);
                c61.dc c8Var = wh6 ? new c61.c8() : c61.y7.f39429b;
                ez2.a aVar = ez2.a.f257857f;
                com.tencent.mm.plugin.finder.assist.c cVar = new com.tencent.mm.plugin.finder.assist.c(i0Var, context3, baseFinderFeed2, dataBuffer, W6, O6, jSONObject);
                qt2Var = W6;
                c8Var.a(view, (androidx.appcompat.app.AppCompatActivity) context3, baseFinderFeed2, aVar, cVar);
            } else {
                qt2Var = W6;
                i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                com.tencent.mm.plugin.finder.assist.i0 i0Var2 = (com.tencent.mm.plugin.finder.assist.i0) c19;
                android.content.Context context4 = finderColumnFrameLayout.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                r45.en2 en2Var4 = finderColumnFrameLayout.f130907h;
                i0Var2.vj(context4, null, dataBuffer, O6, i17, en2Var4 != null ? en2Var4.getString(0) : null, integer);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            qt2Var = W6;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("FinderColumnFrameLayout", "Shared key is null, cannot navigate to detail page");
        }
        baseFinderFeed2.l1(qt2Var.getInteger(5));
        baseFinderFeed2.a2(355);
        baseFinderFeed2.h1(true);
    }

    public static final void b(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout, androidx.recyclerview.widget.RecyclerView recyclerView) {
        android.view.View f17;
        finderColumnFrameLayout.getClass();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (f17 = finderColumnFrameLayout.f130906g.f(linearLayoutManager)) == null) {
            return;
        }
        int position = linearLayoutManager.getPosition(f17);
        com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "handlePageSnapped position:" + finderColumnFrameLayout.f130915s + ", curPosition:" + position + ", lastPosition:" + finderColumnFrameLayout.lastSnappedPosition);
        if (position != finderColumnFrameLayout.lastSnappedPosition) {
            finderColumnFrameLayout.lastSnappedPosition = position;
            ey2.u uVar = finderColumnFrameLayout.f130914r;
            if (uVar != null) {
                uVar.N6(position);
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null) {
                int itemViewType = wxRecyclerAdapter.getItemViewType(position);
                if (itemViewType == 4 || itemViewType == 9) {
                    finderColumnFrameLayout.post(new com.tencent.mm.plugin.finder.view.y4(finderColumnFrameLayout));
                }
            }
        }
    }

    public final android.util.Size c() {
        int height = (this.f130922z.getHeight() - getPaddingTop()) - getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i17 = height - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i18 = i17 - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        android.view.View view = this.f130912p;
        int height2 = i18 - (view != null ? view.getHeight() : 0);
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = this.f130911o;
        int height3 = height2 - (pageIndicatorView != null ? pageIndicatorView.getHeight() : 0);
        int width = this.f130922z.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        int c17 = width - (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams3) : 0);
        android.view.ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i19 = c17 - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0);
        if (i19 < 0) {
            i19 = 0;
        }
        return new android.util.Size(i19, height3 >= 0 ? height3 : 0);
    }

    @Override // com.tencent.mm.plugin.finder.view.z
    public boolean canScrollHorizontally(int i17, android.view.ViewGroup parent, float f17, float f18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return this.lastSnappedPosition != 0 || i17 >= 0;
    }

    public final void d(int i17) {
        androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
        if (adapter != null && i17 >= 0 && i17 < adapter.getItemCount()) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView recyclerView = getRecyclerView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout", "scrollToPostion", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout", "scrollToPostion", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    public final boolean e(so2.n1 n1Var) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        if (!this.f130903d) {
            return false;
        }
        r45.en2 place_holder_info = n1Var.getFeedObject().getFinderObject().getPlace_holder_info();
        return place_holder_info != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) place_holder_info.getCustom(7)) != null && !hc2.o0.F(finderObject);
    }

    public final dw2.b getColumnFeedSelectorAdapter() {
        return this.columnFeedSelectorAdapter;
    }

    public final int getCurrentStats() {
        return this.currentStats;
    }

    public final int getDraggingDistance() {
        return this.draggingDistance;
    }

    public final int getLastSnappedPosition() {
        return this.lastSnappedPosition;
    }

    public final int getLastState() {
        return this.lastState;
    }

    public final com.tencent.mm.ui.widget.MMProcessBar getLoadingView() {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.loadingView;
        if (mMProcessBar != null) {
            return mMProcessBar;
        }
        kotlin.jvm.internal.o.o("loadingView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView getRecyclerView() {
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = this.recyclerView;
        if (finderRecyclerView != null) {
            return finderRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView;
        super.onAttachedToWindow();
        alive();
        alive();
        alive();
        alive();
        androidx.lifecycle.m event = androidx.lifecycle.m.ON_START;
        com.tencent.mm.plugin.finder.view.g4 g4Var = this.A;
        g4Var.getClass();
        kotlin.jvm.internal.o.g(event, "event");
        g4Var.f132146d.f(event);
        if (this.recyclerView != null && (pageIndicatorView = this.f130911o) != null) {
            pageIndicatorView.c(getRecyclerView(), this.f130906g);
        }
        com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "onAttachedToWindow position:" + this.f130915s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView;
        androidx.recyclerview.widget.h2 h2Var;
        com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "onDetachedFromWindow position:" + this.f130915s);
        super.onDetachedFromWindow();
        if (this.recyclerView != null && (pageIndicatorView = this.f130911o) != null) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView recyclerView = getRecyclerView();
            kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
            androidx.recyclerview.widget.w2 w2Var = pageIndicatorView.onScrollListener;
            if (w2Var != null) {
                recyclerView.V0(w2Var);
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null && (h2Var = pageIndicatorView.adapterDataObserver) != null) {
                adapter.unregisterAdapterDataObserver(h2Var);
            }
            pageIndicatorView.onScrollListener = null;
            pageIndicatorView.adapterDataObserver = null;
            pageIndicatorView.f131563t = false;
        }
        dead();
        dead();
        dead();
        dead();
        androidx.lifecycle.m event = androidx.lifecycle.m.ON_STOP;
        com.tencent.mm.plugin.finder.view.g4 g4Var = this.A;
        g4Var.getClass();
        kotlin.jvm.internal.o.g(event, "event");
        g4Var.f132146d.f(event);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        androidx.lifecycle.o mo133getLifecycle;
        super.onFinishInflate();
        java.lang.Object context = getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null || (mo133getLifecycle = yVar.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout$onFinishInflate$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                com.tencent.mm.plugin.finder.view.g4 g4Var = com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.this.A;
                androidx.lifecycle.m event = androidx.lifecycle.m.ON_DESTROY;
                g4Var.getClass();
                kotlin.jvm.internal.o.g(event, "event");
                g4Var.f132146d.f(event);
            }
        });
    }

    public final void setColumnFeedSelectorAdapter(dw2.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        this.columnFeedSelectorAdapter = bVar;
    }

    public final void setCurrentStats(int i17) {
        this.currentStats = i17;
    }

    public final void setDraggingDistance(int i17) {
        this.draggingDistance = i17;
    }

    public final void setLastSnappedPosition(int i17) {
        this.lastSnappedPosition = i17;
    }

    public final void setLastState(int i17) {
        this.lastState = i17;
    }

    public final void setLoadingView(com.tencent.mm.ui.widget.MMProcessBar mMProcessBar) {
        kotlin.jvm.internal.o.g(mMProcessBar, "<set-?>");
        this.loadingView = mMProcessBar;
    }

    public final void setOnItemClickListener(com.tencent.mm.plugin.finder.view.h4 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    public final void setRecyclerView(com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView) {
        kotlin.jvm.internal.o.g(finderRecyclerView, "<set-?>");
        this.recyclerView = finderRecyclerView;
    }
}
