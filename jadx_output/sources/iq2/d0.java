package iq2;

/* loaded from: classes2.dex */
public final class d0 {
    public boolean A;
    public final sp2.c4 B;
    public final eq2.b C;
    public zo2.e D;
    public gp2.l0 E;
    public r45.dk2 F;
    public final jz5.g G;
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$finderNearbyInsertEventListener$1 H;
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$finderNearbyRefreshEventListener$1 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$feedUpdateEventListener$1 f293716J;
    public boolean K;
    public final iq2.b0 L;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f293717a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f293718b;

    /* renamed from: c, reason: collision with root package name */
    public final jq2.a f293719c;

    /* renamed from: d, reason: collision with root package name */
    public final int f293720d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f293721e;

    /* renamed from: f, reason: collision with root package name */
    public final int f293722f;

    /* renamed from: g, reason: collision with root package name */
    public final fq2.a f293723g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f293724h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f293725i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView f293726j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f293727k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f293728l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f293729m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qt2 f293730n;

    /* renamed from: o, reason: collision with root package name */
    public kq2.c f293731o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f293732p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f293733q;

    /* renamed from: r, reason: collision with root package name */
    public up2.h f293734r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory f293735s;

    /* renamed from: t, reason: collision with root package name */
    public r45.dk2 f293736t;

    /* renamed from: u, reason: collision with root package name */
    public final ml2.d f293737u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f293738v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f293739w;

    /* renamed from: x, reason: collision with root package name */
    public final tp2.f f293740x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f293741y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f293742z;

    /* JADX WARN: Type inference failed for: r12v10, types: [com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$finderNearbyRefreshEventListener$1] */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$feedUpdateEventListener$1] */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$finderNearbyInsertEventListener$1] */
    public d0(final com.tencent.mm.ui.MMActivity context, android.view.View rootView, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment fragment, jq2.a params) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(params, "params");
        this.f293717a = context;
        this.f293718b = rootView;
        this.f293719c = params;
        int i17 = params.f301096b;
        this.f293720d = i17;
        java.lang.String str = "LiveStreamTabFragmentViewCallback_" + i17 + '_' + params.f301095a;
        this.f293721e = str;
        this.f293722f = params.f301099e;
        this.f293723g = params.f301101g;
        this.f293724h = kotlinx.coroutines.z0.b();
        this.f293725i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        pf5.u uVar = pf5.u.f353936a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        this.f293730n = V6;
        this.f293732p = new java.util.ArrayList();
        this.f293733q = new java.util.ArrayList();
        this.f293737u = new ml2.d();
        this.f293739w = jz5.h.b(new iq2.f(this));
        this.f293740x = new tp2.f(V6, context, fragment, 0, null, 16, null);
        this.f293742z = true;
        this.B = new sp2.c4();
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(eq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.C = (eq2.b) a17;
        this.G = jz5.h.b(new iq2.d(this));
        this.H = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent>(context) { // from class: com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$finderNearbyInsertEventListener$1
            {
                this.__eventId = -893920992;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent finderNewSquareDataUpdateEvent) {
                java.util.LinkedList<r45.fa2> list;
                com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent event = finderNewSquareDataUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                iq2.d0 d0Var = iq2.d0.this;
                java.lang.String str2 = d0Var.f293721e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" receive FinderNewEntranceNotifyInsertEvent objectId = ");
                am.rc rcVar = event.f54312g;
                sb6.append(rcVar.f7805a);
                sb6.append(" recomRsp: ");
                sb6.append(d0Var.F);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                long j17 = rcVar.f7805a;
                boolean z17 = false;
                int i18 = 0;
                z17 = false;
                if (j17 != 0 && d0Var.F != null) {
                    boolean z18 = rcVar.f7806b;
                    java.util.ArrayList arrayList = d0Var.f293732p;
                    java.util.Iterator it = arrayList.iterator();
                    int i19 = -1;
                    int i27 = -1;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i28 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        so2.j5 j5Var = (so2.j5) next;
                        if (j5Var instanceof wp2.b) {
                            wp2.b bVar = (wp2.b) j5Var;
                            if (bVar.f448384p.f374126e == 13) {
                                if (i27 == -1) {
                                    i27 = i18;
                                }
                                if (bVar.getFeedObject().getFeedObject().getId() == j17) {
                                    i19 = i18;
                                }
                            }
                        }
                        i18 = i28;
                    }
                    int i29 = (i19 == -1 || z18) ? i27 : (i19 - i27) % 2 == 0 ? i19 + 2 : i19 + 1;
                    java.lang.String str3 = d0Var.f293721e;
                    com.tencent.mars.xlog.Log.i(str3, "withInsertAfterWatchLive curObjectIndex: " + i19 + " firstRecomIndex: " + i27 + " isFromRedRecom: " + z18 + " targetInsertPosition: " + i29);
                    z17 = true;
                    z17 = true;
                    if (i29 != -1) {
                        r45.dk2 dk2Var = d0Var.F;
                        boolean z19 = dk2Var != null ? dk2Var.getBoolean(8) : true;
                        r45.dk2 dk2Var2 = d0Var.F;
                        if (dk2Var2 != null && (list = dk2Var2.getList(1)) != null) {
                            for (r45.fa2 fa2Var : list) {
                                com.tencent.mars.xlog.Log.i(str3, "#transResponseToListData container.type=" + fa2Var.f374126e + " container.container_id=" + fa2Var.f374125d + " container.card_list.size=" + fa2Var.f374129h.size());
                                if (fa2Var.f374126e == 13) {
                                    java.util.Iterator it6 = sp2.z3.f411300a.a(fa2Var, z19, d0Var.f293730n).iterator();
                                    while (it6.hasNext()) {
                                        arrayList.add((so2.j5) it6.next());
                                        up2.h hVar = d0Var.f293734r;
                                        if (hVar != null) {
                                            hVar.notifyItemInserted(arrayList.size() - 1);
                                        }
                                    }
                                }
                            }
                        }
                        d0Var.F = null;
                    }
                }
                return z17;
            }
        };
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent>(context) { // from class: com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$finderNearbyRefreshEventListener$1
            {
                this.__eventId = -94191624;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent finderNewEntranceNotifyInsertEvent) {
                com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent event = finderNewEntranceNotifyInsertEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str2 = iq2.d0.this.f293721e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" receive FinderNewEntranceNotifyInsertEvent objectId = ");
                am.qc qcVar = event.f54311g;
                sb6.append(qcVar.f7705a);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                long j17 = qcVar.f7705a;
                if (j17 == 0) {
                    return true;
                }
                iq2.d0.h(iq2.d0.this, false, 16, j17, null, null, 24, null);
                return true;
            }
        };
        this.f293716J = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(context) { // from class: com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragmentViewCallback$feedUpdateEventListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                this.__eventId = 439877283;
            }

            public final so2.h1 c(long j17) {
                java.lang.Object obj;
                java.util.Iterator it = kz5.j0.I(iq2.d0.this.f293732p, so2.h1.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    r45.nw1 liveInfo = ((so2.h1) obj).getFeedObject().getLiveInfo();
                    boolean z17 = false;
                    if (liveInfo != null && liveInfo.getLong(0) == j17) {
                        z17 = true;
                    }
                    if (z17) {
                        break;
                    }
                }
                return (so2.h1) obj;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                int i18 = iaVar.f6919b;
                iq2.d0 d0Var = iq2.d0.this;
                if (i18 != 8) {
                    if (i18 == 28) {
                        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "TYPE_CHARGE_LIVE_PAY_SUCCESS charge_live id=" + iaVar.f6918a);
                        long j17 = iaVar.f6918a;
                        if (j17 != 0) {
                            try {
                                so2.h1 c17 = c(j17);
                                if (c17 != null) {
                                    r45.nw1 liveInfo = c17.getFeedObject().getLiveInfo();
                                    r45.o52 o52Var = liveInfo != null ? (r45.o52) liveInfo.getCustom(28) : null;
                                    if (o52Var != null) {
                                        o52Var.set(1, java.lang.Boolean.TRUE);
                                    }
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e(d0Var.f293721e, e17.getMessage());
                            }
                        }
                    }
                } else if (dp2.a.f242184b) {
                    long j18 = iaVar.f6918a;
                    if (j18 != 0 && iaVar.f6921d == 1) {
                        try {
                            so2.h1 c18 = c(j18);
                            if (c18 != null) {
                                d("普通feed", c18);
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e(d0Var.f293721e, e18.getMessage());
                        }
                    }
                }
                return true;
            }

            public final void d(java.lang.String prefixTag, so2.h1 feed) {
                kotlin.jvm.internal.o.g(prefixTag, "prefixTag");
                kotlin.jvm.internal.o.g(feed, "feed");
                iq2.d0 d0Var = iq2.d0.this;
                java.lang.String str2 = d0Var.f293721e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(prefixTag);
                sb6.append("-refreshLiveStatus ");
                sb6.append(feed.getFeedObject().getNickName());
                sb6.append('(');
                r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
                sb6.append(')');
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                long j17 = liveInfo2 != null ? liveInfo2.getLong(0) : 0L;
                com.tencent.mm.ui.MMActivity mMActivity = d0Var.f293717a;
                kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                iq2.e eVar = new iq2.e(feed, d0Var);
                qs5.d dVar = qs5.d.f366426e;
                ((com.tencent.mm.feature.finder.live.v4) w0Var).Yj(j17, 2, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, mMActivity, eVar, 7);
            }
        };
        com.tencent.mars.xlog.Log.i(str, "#init");
        this.L = new iq2.b0(this);
    }

    public static final void a(iq2.d0 d0Var) {
        d0Var.getClass();
        iq2.b bVar = new iq2.b(d0Var);
        ((java.util.ArrayList) d0Var.f293733q).add(bVar);
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = d0Var.f293726j;
        if (finderChildRecyclerView != null) {
            finderChildRecyclerView.postDelayed(bVar, 100L);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    public static void h(iq2.d0 d0Var, boolean z17, int i17, long j17, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        long j18 = (i18 & 4) != 0 ? 0L : j17;
        yz5.l lVar3 = (i18 & 8) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 16) != 0 ? null : lVar2;
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "#loadData fromHead=" + z17 + " containerId=" + d0Var.f293722f + " pullType:" + i17 + " tabId: " + d0Var.f293720d + " relatedObjectId: " + j18);
        kotlinx.coroutines.l.d(d0Var.f293725i, null, null, new iq2.x(d0Var, z17, i17, j18, lVar3, lVar4, null), 3, null);
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory;
        com.tencent.mars.xlog.Log.i(this.f293721e, "adjustSquareStyle styleInfo: " + i17);
        if (i17 != 0) {
            if (i17 == 1 && (newEntranceItemConvertFactory = this.f293735s) != null) {
                newEntranceItemConvertFactory.setAspectRatio(1.3333334f);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory2 = this.f293735s;
        if (newEntranceItemConvertFactory2 == null) {
            return;
        }
        newEntranceItemConvertFactory2.setAspectRatio(1.7777778f);
    }

    public final void c(int i17) {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f293738v;
        if (mMProcessBar == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        boolean isShown = mMProcessBar.isShown();
        rq2.o.f398847a.d(5, isShown);
        h(this, true, i17, 0L, null, new iq2.a(this, java.lang.System.currentTimeMillis(), isShown), 12, null);
    }

    public final void d(java.lang.String source) {
        gp2.l0 l0Var;
        kotlin.jvm.internal.o.g(source, "source");
        boolean z17 = ((gq2.j) this.f293723g).f274566i == 0;
        com.tencent.mars.xlog.Log.i(this.f293721e, "checkTabAutoPlay: source=" + source + ", isUserVisibleFocused=" + this.f293741y + ", isViewPagerIdle=" + z17);
        if (this.f293741y && z17 && (l0Var = this.E) != null) {
            l0Var.g();
        }
    }

    public final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var : this.f293732p) {
            if ((j5Var instanceof wp2.a) && !(j5Var instanceof vp2.o)) {
                arrayList.addAll(((wp2.a) j5Var).g());
            }
        }
        return arrayList;
    }

    public final int f() {
        r45.dd2 dd2Var;
        kq2.c cVar = this.f293731o;
        if (cVar == null || (dd2Var = (r45.dd2) kz5.n0.a0(cVar.f311266f, cVar.f311265e)) == null) {
            return 0;
        }
        return dd2Var.getInteger(0);
    }

    public final boolean g(int i17) {
        java.lang.Object obj;
        eq2.a N6 = this.C.N6(this.f293720d, i17);
        if (N6.f255877a.isEmpty()) {
            return false;
        }
        java.util.ArrayList arrayList = this.f293732p;
        arrayList.clear();
        arrayList.addAll(N6.f255877a);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((so2.j5) obj) instanceof vp2.j) {
                break;
            }
        }
        if (obj != null) {
            com.tencent.mm.ui.MMActivity activity = this.f293717a;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((sp2.m3) pf5.z.f353948a.a(activity).a(sp2.m3.class)).O6();
        }
        int i18 = N6.f255879c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(N6.f255880d);
        if (!(valueOf.intValue() < 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : -1;
        this.f293736t = N6.f255882f;
        zo2.e eVar = this.D;
        if (eVar != null) {
            eVar.f474850b = i18;
            eVar.f474851c = intValue;
        }
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = this.f293726j;
        if (finderChildRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderChildRecyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            com.tencent.mars.xlog.Log.i(this.f293721e, "scrollToPositionWithOffset lastPos: " + i18 + " fromTopPixel: " + intValue);
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(staggeredGridLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragmentViewCallback", "loadCacheData", "(I)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragmentViewCallback", "loadCacheData", "(I)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        return true;
    }

    public final void i() {
        r45.s92 s92Var;
        java.util.ArrayList arrayList = this.f293732p;
        if (!arrayList.isEmpty()) {
            r45.dk2 dk2Var = this.f293736t;
            if (dk2Var != null && (s92Var = (r45.s92) dk2Var.getCustom(12)) != null) {
                b(s92Var.getInteger(0));
            }
            up2.h hVar = this.f293734r;
            if (hVar != null) {
                hVar.notifyItemInserted(arrayList.size() - 1);
            }
            com.tencent.mars.xlog.Log.i(this.f293721e, "notifyCacheUse isUserVisibleFocused: " + this.f293741y);
            if (this.f293741y) {
                kotlinx.coroutines.l.d(this.f293724h, null, null, new iq2.z(this, null), 3, null);
            }
        }
    }

    public final void j(boolean z17, java.lang.String str, boolean z18) {
        java.lang.String str2 = this.f293721e;
        com.tencent.mars.xlog.Log.i(str2, "#onRvRefreshOrLoadMoreCall isRefresh=" + z17 + " source=" + str);
        if (this.K) {
            com.tencent.mars.xlog.Log.i(str2, "#onRvRefreshOrLoadMoreCall isRefresh=" + z17 + " but is running! Get out.");
            return;
        }
        this.K = true;
        if (z18) {
            c(0);
            return;
        }
        if (z17) {
            h(this, true, 1, 0L, null, new iq2.c0(this), 12, null);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rq2.o oVar = rq2.o.f398847a;
        android.view.View view = this.f293727k;
        if (view == null) {
            kotlin.jvm.internal.o.o("bottomLayout");
            throw null;
        }
        boolean b17 = oVar.b(view);
        oVar.d(4, b17);
        if (b17) {
            rq2.o.f398856j = true;
        }
        h(this, false, 2, 0L, null, new iq2.y(this, currentTimeMillis, b17), 12, null);
    }

    public final void k(java.lang.String source, boolean z17) {
        kotlin.jvm.internal.o.g(source, "source");
        boolean z18 = ((gq2.j) this.f293723g).f274566i == 0;
        com.tencent.mars.xlog.Log.i(this.f293721e, "stopTabCurrentView: source=" + source + ", force=" + z17 + ", isUserVisibleFocused=" + this.f293741y + ", isViewPagerIdle=" + z18);
        if (z17 || (z18 && !this.f293741y)) {
            gp2.l0 l0Var = this.E;
            if (l0Var != null) {
                l0Var.m();
            }
            gp2.l0 l0Var2 = this.E;
            if (l0Var2 != null) {
                c50.m0.c(l0Var2, null, 1, null);
            }
        }
    }

    public final void l() {
        java.util.ArrayList arrayList = this.f293732p;
        if (arrayList.size() == 0) {
            return;
        }
        zo2.e eVar = this.D;
        int i17 = eVar != null ? eVar.f474850b : 0;
        int i18 = eVar != null ? eVar.f474851c : 0;
        com.tencent.mars.xlog.Log.i(this.f293721e, "onDestroy storeCacheData position: " + i17 + " offset: " + i18);
        eq2.b bVar = this.C;
        int i19 = this.f293720d;
        int f17 = f();
        kq2.c cVar = this.f293731o;
        int i27 = cVar != null ? cVar.f311265e : 0;
        r45.dk2 dk2Var = this.f293736t;
        bVar.O6(i19, f17, i27, i17, i18, arrayList, dk2Var != null ? dk2Var.getByteString(6) : null, this.f293736t);
    }
}
