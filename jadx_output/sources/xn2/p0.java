package xn2;

/* loaded from: classes2.dex */
public final class p0 implements xn2.a, com.tencent.mm.plugin.finder.megavideo.topstory.flow.e {
    public gp1.a0 A;
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.f B;
    public java.lang.Boolean C;
    public final java.util.HashSet D;
    public final java.util.HashMap E;
    public final android.graphics.Rect F;
    public final jz5.g G;

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f455543a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f455544b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f455545c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f455546d;

    /* renamed from: e, reason: collision with root package name */
    public xn2.b f455547e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f455548f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f455549g;

    /* renamed from: h, reason: collision with root package name */
    public final cw2.f8 f455550h;

    /* renamed from: i, reason: collision with root package name */
    public long f455551i;

    /* renamed from: j, reason: collision with root package name */
    public int f455552j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f455553k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f455554l;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f455555m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$autoRefreshEventListener$1 f455556n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$seeLaterDeleteEventListener$1 f455557o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f455558p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDeleteListener$1 f455559q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f455560r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.y0 f455561s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.y0 f455562t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f455563u;

    /* renamed from: v, reason: collision with root package name */
    public long f455564v;

    /* renamed from: w, reason: collision with root package name */
    public int f455565w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f455566x;

    /* renamed from: y, reason: collision with root package name */
    public do2.b f455567y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$showLastExitFeedHintEventListener$1 f455568z;

    /* JADX WARN: Type inference failed for: r3v10, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$showLastExitFeedHintEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$autoRefreshEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$seeLaterDeleteEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDeleteListener$1] */
    public p0(android.app.Activity activity, java.lang.String contextId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        this.f455543a = activity;
        this.f455544b = contextId;
        this.f455545c = "Finder.MegaVideoPresenter";
        this.f455546d = jz5.h.b(xn2.q.f455569d);
        this.f455548f = jz5.h.b(new xn2.g0(this));
        this.f455549g = jz5.h.b(new xn2.s(this));
        this.f455550h = new cw2.f8(9);
        this.f455552j = 1;
        this.f455554l = jz5.h.b(xn2.f0.f455491d);
        this.f455555m = kotlinx.coroutines.z0.b();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f455556n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTimelineRefreshEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$autoRefreshEventListener$1
            {
                this.__eventId = 999423702;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent) {
                com.tencent.mm.autogen.events.FinderTimelineRefreshEvent event = finderTimelineRefreshEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new xn2.c(event, xn2.p0.this));
                return false;
            }
        };
        this.f455557o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$seeLaterDeleteEventListener$1
            {
                this.__eventId = -1264681165;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent megaVideoSeeLaterDeletedEvent) {
                com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent event = megaVideoSeeLaterDeletedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new xn2.h0(xn2.p0.this, event));
                return false;
            }
        };
        this.f455558p = jz5.h.b(new xn2.i0(this));
        this.f455559q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new xn2.n(xn2.p0.this, event));
                return false;
            }
        };
        this.f455566x = jz5.h.b(xn2.f.f455490d);
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedDislikeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDislikeListener$1
            {
                this.__eventId = -633386071;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[EDGE_INSN: B:17:0x0055->B:18:0x0055 BREAK  A[LOOP:0: B:4:0x0022->B:64:?], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:0: B:4:0x0022->B:64:?, LOOP_END, SYNTHETIC] */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedDislikeEvent r14) {
                /*
                    Method dump skipped, instructions count: 327
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDislikeListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f455568z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$showLastExitFeedHintEventListener$1
            {
                this.__eventId = 1499630395;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent finderLongVideoShowLastExitFeedHintEvent) {
                com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent event = finderLongVideoShowLastExitFeedHintEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new xn2.l0(xn2.p0.this, event));
                return false;
            }
        };
        this.D = new java.util.HashSet();
        this.E = new java.util.HashMap();
        this.F = new android.graphics.Rect();
        this.G = jz5.h.b(xn2.l.f455524d);
    }

    public static final void b(xn2.p0 p0Var, so2.j5 j5Var, boolean z17) {
        int i17;
        if (p0Var.i()) {
            return;
        }
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        long itemId = j5Var.getItemId();
        g0Var.f310121d = itemId;
        com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify try delete %s, isLV: %b", java.lang.Long.valueOf(itemId), java.lang.Boolean.valueOf(z17));
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        java.util.ArrayList dataListJustForAdapter = p0Var.j().getDataListJustForAdapter();
        synchronized (dataListJustForAdapter) {
            java.util.Iterator it = dataListJustForAdapter.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((so2.j5) it.next()).getItemId() == g0Var.f310121d) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        f0Var.f310116d = i17;
        if (i17 <= p0Var.f455565w) {
            com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify skip, index: %d, maxLVExposeIndex: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(p0Var.f455565w));
        } else {
            com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify delete, index: %d, maxLVExposeIndex: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(p0Var.f455565w));
            pm0.v.X(new xn2.h(z17, p0Var, f0Var, j5Var, g0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(xn2.p0 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn2.p0.c(xn2.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        if (this.f455567y == null) {
            return;
        }
        pm0.v.X(new xn2.d(this));
    }

    public int e() {
        return j().getDataListJustForAdapter().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(zn2.a aVar, int i17, int i18, long j17) {
        r45.vx0 vx0Var;
        java.util.HashMap hashMap = this.E;
        if (hashMap.containsKey(java.lang.Long.valueOf(aVar.getItemId()))) {
            return;
        }
        boolean rj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(aVar.getFeedObject().getUserName());
        aVar.getFeedObject().getDescription();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("view_id", "long_video_card");
        lVarArr[1] = new jz5.l("finder_context_id", this.f455544b);
        lVarArr[2] = new jz5.l("comment_scene", 281);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(aVar.getItemId()));
        lVarArr[4] = new jz5.l("card_idex", java.lang.Integer.valueOf((i17 - i18) + 1));
        lVarArr[5] = new jz5.l("refresh_num", java.lang.Integer.valueOf(this.f455552j));
        r45.ru2 flow_card_recommand_reason = aVar.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
        lVarArr[6] = new jz5.l("recommend_reason", flow_card_recommand_reason != null ? flow_card_recommand_reason.getString(0) : null);
        r45.dm2 object_extend = aVar.getFeedObject().getFeedObject().getObject_extend();
        lVarArr[7] = new jz5.l("collection_id", pm0.v.u((object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? 0L : vx0Var.getLong(0)));
        lVarArr[8] = new jz5.l("follow_type", java.lang.Integer.valueOf(rj6 ? 1 : 0));
        lVarArr[9] = new jz5.l("session_buffer", aVar.getFeedObject().getFeedObject().getSessionBuffer());
        ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVarArr), 1, true);
        java.util.HashSet hashSet = this.D;
        java.util.Iterator it = hashSet.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                i19 = -1;
                break;
            }
            java.lang.Object next = it.next();
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            if ((((java.lang.Number) ((jz5.o) next).f302841d).longValue() == aVar.getItemId()) == true) {
                break;
            } else {
                i19++;
            }
        }
        if (i19 == -1) {
            hashSet.add(new jz5.o(java.lang.Long.valueOf(aVar.getItemId()), java.lang.Integer.valueOf(i17), aVar));
            hashMap.put(java.lang.Long.valueOf(aVar.getItemId()), java.lang.Long.valueOf(j17));
        }
    }

    public final void g() {
        xn2.b bVar = this.f455547e;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = bVar != null ? ((xn2.f1) bVar).getRecyclerView().getLayoutManager() : null;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper linearLayoutManagerWrapper = layoutManager instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper ? (com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper) layoutManager : null;
        int i17 = -1;
        int w17 = linearLayoutManagerWrapper != null ? linearLayoutManagerWrapper.w() : -1;
        xn2.b bVar2 = this.f455547e;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = bVar2 != null ? ((xn2.f1) bVar2).getRecyclerView().getLayoutManager() : null;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper linearLayoutManagerWrapper2 = layoutManager2 instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper ? (com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper) layoutManager2 : null;
        int y17 = linearLayoutManagerWrapper2 != null ? linearLayoutManagerWrapper2.y() : -1;
        this.f455565w = java.lang.Math.max(this.f455565w, y17);
        if (w17 < 0 || y17 < 0 || y17 >= j().getDataListJustForAdapter().size()) {
            return;
        }
        k().c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = j().getDataListJustForAdapter().iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((so2.j5) it.next()) instanceof zn2.a) {
                i17 = i18;
                break;
            }
            i18++;
        }
        k().f("ViewIdMainFeed", y17 - i17);
        int i19 = y17 + 1;
        while (w17 < i19) {
            so2.j5 j5Var = (so2.j5) j().getDataListJustForAdapter().get(w17);
            if (j5Var instanceof zn2.a) {
                xn2.b bVar3 = this.f455547e;
                androidx.recyclerview.widget.k3 p07 = bVar3 != null ? ((xn2.f1) bVar3).getRecyclerView().p0(w17) : null;
                if (p07 != null && (p07 instanceof in5.s0)) {
                    in5.s0 s0Var = (in5.s0) p07;
                    boolean globalVisibleRect = s0Var.itemView.getGlobalVisibleRect(this.F);
                    float width = (s0Var.itemView.getMeasuredWidth() <= 0 || s0Var.itemView.getMeasuredHeight() <= 0) ? 0.0f : (r7.width() * r7.height()) / (s0Var.itemView.getMeasuredWidth() * s0Var.itemView.getMeasuredHeight());
                    if (globalVisibleRect && width >= ((java.lang.Number) ((jz5.n) this.G).getValue()).floatValue()) {
                        f((zn2.a) j5Var, w17, i17, currentTimeMillis);
                    }
                }
            }
            w17++;
        }
    }

    public boolean h() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I7).getValue()).r()).intValue() == 3;
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) this.f455566x).getValue()).booleanValue();
    }

    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader j() {
        return (com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader) ((jz5.n) this.f455549g).getValue();
    }

    public final ao2.a k() {
        return (ao2.a) ((jz5.n) this.f455554l).getValue();
    }

    public final r45.qt2 l() {
        return (r45.qt2) ((jz5.n) this.f455548f).getValue();
    }

    public void m(in5.s0 holder, int i17, java.lang.String playSessionId, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(playSessionId, "playSessionId");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (!(j5Var instanceof zn2.a)) {
            com.tencent.mars.xlog.Log.e(this.f455545c, "jumpLongVideoShare fail, feed=" + j5Var);
            return;
        }
        zn2.a aVar = (zn2.a) j5Var;
        o(aVar, i17);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        n(2, context, holder, aVar.getFeedObject(), i17, playSessionId, z17);
    }

    public final void n(int i17, android.content.Context context, in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i18, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        cw2.da videoView;
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347324u);
        ao2.a k17 = k();
        k17.getClass();
        qg3.w wVar = k17.f12543l;
        if (wVar != null) {
            urgen.ur_54A4.UR_720C.UR_A58C(((qg3.x) wVar).getCppPointer(), 6, "ViewIdMainFeed");
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) this.f455550h.f223700h).c7(this.f455543a);
        long currentPlayMs = (s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null || (videoView = finderVideoLayout.getVideoView()) == null || this.f455551i != finderItem.getId()) ? 0L : videoView.getCurrentPlayMs();
        if (currentPlayMs <= 0) {
            currentPlayMs = vn2.u0.f438387a.j(finderItem);
            if (currentPlayMs <= 0) {
                r45.no2 playhistory_info = finderItem.getFeedObject().getPlayhistory_info();
                currentPlayMs = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
            }
        }
        long j17 = currentPlayMs;
        c03.k.b(context, this.f455544b, finderItem, j17, z17, str);
        ((wn2.f) i95.n0.c(wn2.f.class)).Ai(context, null);
        com.tencent.mars.xlog.Log.i(this.f455545c, "source " + i17 + " jumpToFinderLongVideoShareUI position=" + i18 + " MegaVideoCardFeed:" + finderItem + ",playTime=" + j17);
    }

    public final void o(zn2.a aVar, int i17) {
        r45.vx0 vx0Var;
        java.util.Iterator it = j().getDataListJustForAdapter().iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else if (((so2.j5) it.next()) instanceof zn2.a) {
                break;
            } else {
                i18++;
            }
        }
        boolean rj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(aVar.getFeedObject().getUserName());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("view_id", "long_video_card");
        lVarArr[1] = new jz5.l("finder_context_id", this.f455544b);
        lVarArr[2] = new jz5.l("comment_scene", 281);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(aVar.getItemId()));
        lVarArr[4] = new jz5.l("card_idex", java.lang.Integer.valueOf((i17 - i18) + 1));
        lVarArr[5] = new jz5.l("refresh_num", java.lang.Integer.valueOf(this.f455552j));
        r45.ru2 flow_card_recommand_reason = aVar.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
        lVarArr[6] = new jz5.l("recommend_reason", flow_card_recommand_reason != null ? flow_card_recommand_reason.getString(0) : null);
        r45.dm2 object_extend = aVar.getFeedObject().getFeedObject().getObject_extend();
        lVarArr[7] = new jz5.l("collection_id", pm0.v.u((object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? 0L : vx0Var.getLong(0)));
        lVarArr[8] = new jz5.l("follow_type", java.lang.Integer.valueOf(rj6 ? 1 : 0));
        lVarArr[9] = new jz5.l("session_buffer", aVar.getFeedObject().getFeedObject().getSessionBuffer());
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, false);
    }

    public final void p() {
        kotlinx.coroutines.y0 y0Var;
        boolean i17 = i();
        java.lang.String str = this.f455545c;
        if (i17) {
            com.tencent.mars.xlog.Log.i(str, "mega_verify start fail as closeDetectionValidity");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "mega_verify start");
        kotlinx.coroutines.r2 r2Var = this.f455560r;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "mega_verify start fail as job active");
            return;
        }
        kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
        this.f455560r = a17;
        this.f455561s = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(a17));
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        kotlinx.coroutines.r2 r2Var2 = this.f455560r;
        kotlin.jvm.internal.o.e(r2Var2, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        this.f455562t = kotlinx.coroutines.z0.a(g3Var.plus((kotlinx.coroutines.c0) r2Var2));
        if (this.f455560r == null || (y0Var = this.f455561s) == null || this.f455562t == null) {
            com.tencent.mars.xlog.Log.i(str, "mega_verify start fail as coroutine");
        } else {
            kotlin.jvm.internal.o.d(y0Var);
            kotlinx.coroutines.l.d(y0Var, null, null, new xn2.n0(this, null), 3, null);
        }
    }
}
