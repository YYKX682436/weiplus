package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class s1 implements com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f122421a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.e2 f122422b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.d2 f122423c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f122424d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.l0 f122425e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122426f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f122427g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f122428h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f122429i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f122430j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f122431k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f122432l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f122433m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f122434n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f122435o;

    /* renamed from: p, reason: collision with root package name */
    public long f122436p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f122437q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f122438r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f122439s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f122440t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f122441u;

    /* renamed from: v, reason: collision with root package name */
    public int f122442v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f122443w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.p0 f122444x;

    public s1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f122421a = context;
        this.f122422b = new com.tencent.mm.plugin.finder.playlist.e2();
        this.f122427g = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f122428h = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.w0(this));
        this.f122429i = i().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        this.f122430j = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.o1(this));
        this.f122431k = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.q1(this));
        this.f122432l = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.s0(this));
        this.f122433m = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.r1(this));
        this.f122434n = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.p1(this));
        this.f122435o = jz5.h.b(new com.tencent.mm.plugin.finder.playlist.r0(this));
        this.f122438r = true;
        this.f122440t = true;
        this.f122441u = true;
        this.f122442v = -1;
        this.f122443w = true;
        this.f122444x = new com.tencent.mm.plugin.finder.playlist.p0(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.finder.playlist.s1 r8, so2.q6 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.tencent.mm.plugin.finder.playlist.q0
            if (r0 == 0) goto L16
            r0 = r10
            com.tencent.mm.plugin.finder.playlist.q0 r0 = (com.tencent.mm.plugin.finder.playlist.q0) r0
            int r1 = r0.f122407f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f122407f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.playlist.q0 r0 = new com.tencent.mm.plugin.finder.playlist.q0
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f122405d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f122407f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L77
            goto L70
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L77
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L77
            android.content.Context r8 = r8.f122421a     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)     // Catch: java.lang.Throwable -> L77
            boolean r10 = r8 instanceof com.tencent.mm.ui.MMFragmentActivity     // Catch: java.lang.Throwable -> L77
            r3 = 0
            if (r10 == 0) goto L57
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8     // Catch: java.lang.Throwable -> L77
            pf5.z r10 = pf5.z.f353948a     // Catch: java.lang.Throwable -> L77
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r8     // Catch: java.lang.Throwable -> L77
            goto L58
        L57:
            r8 = r3
        L58:
            if (r8 == 0) goto L5e
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L77
        L5e:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L77
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f122407f = r2     // Catch: java.lang.Throwable -> L77
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L77
            if (r10 != r0) goto L70
            goto L83
        L70:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> L77
            goto L82
        L77:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L82:
            r0 = r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.s1.a(com.tencent.mm.plugin.finder.playlist.s1, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(com.tencent.mm.plugin.finder.playlist.s1 s1Var, boolean z17) {
        android.content.Context context = s1Var.f122421a;
        boolean z18 = context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI;
        if (z18) {
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = z18 ? (com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) context : null;
            if (finderTopicTimelineUI != null) {
                if (!z17) {
                    com.tencent.mm.plugin.finder.feed.j20 j20Var = finderTopicTimelineUI.D;
                    if (j20Var != null) {
                        j20Var.Z();
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("presenter");
                        throw null;
                    }
                }
                com.tencent.mm.plugin.finder.feed.j20 j20Var2 = finderTopicTimelineUI.D;
                if (j20Var2 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = j20Var2.f106570t;
                if (baseFeedLoader != null) {
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
                }
                j20Var2.H = true;
                return;
            }
            return;
        }
        if (!s1Var.j()) {
            pq5.g l17 = new db2.t0(s1Var.h().f122281a, s1Var.h().f122283c, ((java.lang.Number) ((jz5.n) s1Var.f122431k).getValue()).intValue(), s1Var.f122437q, null, ((java.lang.Number) ((jz5.n) s1Var.f122430j).getValue()).intValue(), (java.lang.String) ((jz5.n) s1Var.f122432l).getValue(), (java.lang.String) ((jz5.n) s1Var.f122433m).getValue(), (java.lang.String) ((jz5.n) s1Var.f122434n).getValue(), null, (r45.qt2) ((jz5.n) s1Var.f122435o).getValue(), 0.0f, 0.0f, 0, 0, java.lang.Integer.valueOf(z17 ? 2 : 19), null, null, s1Var.h().f122285e, 0, null, null, null, null, null, null, null, null, null, s1Var.h().f122282b, 536574464, null).l();
            android.content.Context context2 = s1Var.f122421a;
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context2);
            l17.h(new com.tencent.mm.plugin.finder.playlist.n1(s1Var, z17));
            return;
        }
        android.content.Context context3 = s1Var.f122421a;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = context3 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI ? (com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) context3 : null;
        if (finderShareFeedRelUI != null) {
            if (z17) {
                com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
                if (qmVar != null) {
                    qmVar.C();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
            }
            com.tencent.mm.plugin.finder.ui.qm qmVar2 = finderShareFeedRelUI.D;
            if (qmVar2 != null) {
                qmVar2.p0(false);
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }

    public final void c() {
        if (!this.f122440t) {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122425e;
            if (l0Var == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.I(l0Var.u(), null, 1, null);
            com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = this.f122425e;
            if (l0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            android.view.View f213435x = l0Var2.u().getF213435x();
            android.view.View findViewById = f213435x != null ? f213435x.findViewById(com.tencent.mm.R.id.ilh) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter", "checkLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter", "checkLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f122439s) {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var3 = this.f122425e;
            if (l0Var3 != null) {
                l0Var3.k(true);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
        }
        com.tencent.mm.plugin.finder.playlist.l0 l0Var4 = this.f122425e;
        if (l0Var4 != null) {
            l0Var4.k(false);
        } else {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
    }

    public final so2.q6 d(com.tencent.mm.protobuf.g gVar, int i17, java.lang.Long l17) {
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f410555a = gVar;
        q6Var.f410556b = 16;
        q6Var.f410557c = l17 != null ? l17.longValue() : h().f122281a;
        q6Var.f410558d = h().f122282b;
        r45.vx0 vx0Var = h().f122285e;
        if (vx0Var != null) {
            q6Var.f410559e = vx0Var.getLong(0);
            if (vx0Var.getInteger(21) != 0) {
                q6Var.f410556b = vx0Var.getInteger(21);
            }
            q6Var.f410561g = vx0Var.getByteString(22);
            if (q6Var.f410559e == 0) {
                java.lang.String str = h().f122288h;
                if (!(str == null || str.length() == 0)) {
                    q6Var.f410562h = h().f122288h;
                }
            }
        }
        q6Var.f410560f = i17;
        return q6Var;
    }

    public final boolean e() {
        return h().f122286f == null && h().f122285e != null && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D0().r()).intValue() == 1;
    }

    public final boolean f() {
        if (h().f122286f != null) {
            return true;
        }
        r45.vx0 vx0Var = h().f122285e;
        long j17 = vx0Var != null ? vx0Var.getLong(0) : 0L;
        r45.vx0 vx0Var2 = h().f122285e;
        int integer = vx0Var2 != null ? vx0Var2.getInteger(21) : 0;
        if (j17 != 0 && integer != 0) {
            return true;
        }
        java.lang.String str = h().f122288h;
        return !(str == null || str.length() == 0);
    }

    public final void g(boolean z17, int i17) {
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463521f = z17 ? this.f122440t : this.f122439s;
        s3Var.f463523h = i17;
        if (i17 > 0) {
            s3Var.f463522g = false;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122425e;
            if (l0Var == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            l0Var.u().onPreFinishLoadMoreSmooth(s3Var);
        } else {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = this.f122425e;
            if (l0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            l0Var2.u().Q(s3Var);
        }
        com.tencent.mm.plugin.finder.playlist.l0 l0Var3 = this.f122425e;
        if (l0Var3 != null) {
            pm0.v.V(500L, new com.tencent.mm.plugin.finder.playlist.k0(l0Var3));
        } else {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
    }

    public final com.tencent.mm.plugin.finder.playlist.d2 h() {
        com.tencent.mm.plugin.finder.playlist.d2 d2Var = this.f122423c;
        if (d2Var != null) {
            return d2Var;
        }
        kotlin.jvm.internal.o.o("initParam");
        throw null;
    }

    public final android.content.Intent i() {
        return (android.content.Intent) this.f122428h.getValue();
    }

    public final boolean j() {
        r45.vx0 vx0Var = h().f122285e;
        return vx0Var != null && vx0Var.getInteger(10) == 1;
    }

    public final boolean k() {
        r45.vx0 vx0Var = h().f122285e;
        return (vx0Var != null ? vx0Var.getInteger(10) : 0) != 0;
    }

    public final void l() {
        java.util.Map map;
        if (this.f122438r) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerPresenter", "onDetach: can not detach, because it is not attached");
            return;
        }
        if (j() || (this.f122421a instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI)) {
            android.content.Context context = this.f122421a;
            com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI finderLoaderFeedSupportSlideUI = context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI) context : null;
            if (finderLoaderFeedSupportSlideUI != null) {
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = finderLoaderFeedSupportSlideUI.n7().f106570t;
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader : null;
                if (finderFeedShareRelativeListLoader != null) {
                    finderFeedShareRelativeListLoader.unregisterFetchDoneListener(this);
                }
            }
        }
        m("page_out");
        com.tencent.mm.plugin.finder.playlist.e2 e2Var = this.f122422b;
        com.tencent.mm.protobuf.g gVar = this.f122437q;
        boolean z17 = this.f122439s;
        boolean z18 = this.f122440t;
        r45.vx0 vx0Var = e2Var.f122298c;
        long j17 = vx0Var != null ? vx0Var.getLong(0) : 0L;
        r45.vx0 vx0Var2 = e2Var.f122298c;
        int integer = vx0Var2 != null ? vx0Var2.getInteger(10) : 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListLoader", "onDetach id: " + j17 + ", size:" + e2Var.f122296a.size());
        if (e2Var.f122296a.size() > 0 && j17 != 0) {
            com.tencent.mm.plugin.finder.playlist.c cVar = com.tencent.mm.plugin.finder.playlist.c.f122265a;
            java.util.ArrayList arrayList = e2Var.f122296a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof com.tencent.mm.plugin.finder.playlist.z1) {
                    arrayList2.add(next);
                }
            }
            java.util.List S0 = kz5.n0.S0(arrayList2);
            synchronized (cVar) {
                synchronized (com.tencent.mm.plugin.finder.playlist.c.f122265a) {
                    map = com.tencent.mm.plugin.finder.playlist.c.f122266b;
                    map.remove(new com.tencent.mm.plugin.finder.playlist.a(j17, integer));
                }
            }
        }
        if (j17 != 0) {
            synchronized (com.tencent.mm.plugin.finder.playlist.c.f122265a) {
            }
        }
        e2Var.f122296a.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122426f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        this.f122437q = null;
        this.f122438r = true;
        q(false);
        p(true);
    }

    public final void m(java.lang.String str) {
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f122424d;
        if (finderPlayListDrawer == null) {
            kotlin.jvm.internal.o.o("drawer");
            throw null;
        }
        if (finderPlayListDrawer.getInitParam().f122285e != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            jz5.l[] lVarArr = new jz5.l[11];
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer2 = this.f122424d;
            if (finderPlayListDrawer2 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(finderPlayListDrawer2.getInitParam().f122281a));
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer3 = this.f122424d;
            if (finderPlayListDrawer3 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            long j17 = finderPlayListDrawer3.getInitParam().f122281a;
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer4 = this.f122424d;
            if (finderPlayListDrawer4 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            java.lang.String str2 = finderPlayListDrawer4.getInitParam().f122282b;
            jz5.g gVar = this.f122435o;
            r45.qt2 qt2Var = (r45.qt2) ((jz5.n) gVar).getValue();
            lVarArr[1] = new jz5.l("session_buffer", o3Var.ek(j17, str2, qt2Var != null ? qt2Var.getInteger(5) : 0));
            r45.qt2 qt2Var2 = (r45.qt2) ((jz5.n) gVar).getValue();
            lVarArr[2] = new jz5.l("finder_tab_context_id", qt2Var2 != null ? qt2Var2.getString(2) : null);
            r45.qt2 qt2Var3 = (r45.qt2) ((jz5.n) gVar).getValue();
            lVarArr[3] = new jz5.l("finder_context_id", qt2Var3 != null ? qt2Var3.getString(1) : null);
            lVarArr[4] = new jz5.l("comment_scene", java.lang.Integer.valueOf(yc1.p.CTRL_INDEX));
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer5 = this.f122424d;
            if (finderPlayListDrawer5 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            r45.vx0 vx0Var = finderPlayListDrawer5.getInitParam().f122285e;
            lVarArr[5] = new jz5.l("collection_id", pm0.v.u(vx0Var != null ? vx0Var.getLong(0) : 0L));
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer6 = this.f122424d;
            if (finderPlayListDrawer6 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            r45.vx0 vx0Var2 = finderPlayListDrawer6.getInitParam().f122285e;
            lVarArr[6] = new jz5.l("collection_feed_num", java.lang.Integer.valueOf(vx0Var2 != null ? vx0Var2.getInteger(4) : 0));
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer7 = this.f122424d;
            if (finderPlayListDrawer7 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            lVarArr[7] = new jz5.l("author_finder_username", finderPlayListDrawer7.getInitParam().f122287g);
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer8 = this.f122424d;
            if (finderPlayListDrawer8 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            lVarArr[8] = new jz5.l("is_intelligent_collection", java.lang.Integer.valueOf(hc2.q.b(finderPlayListDrawer8.getInitParam().f122285e) ? 1 : 0));
            lVarArr[9] = new jz5.l("stay_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f122436p));
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer9 = this.f122424d;
            if (finderPlayListDrawer9 == null) {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
            r45.vx0 vx0Var3 = finderPlayListDrawer9.getInitParam().f122285e;
            lVarArr[10] = new jz5.l("collection_update_time", vx0Var3 != null ? java.lang.Integer.valueOf(vx0Var3.getInteger(7)) : null);
            ((cy1.a) rVar).Aj(50144, str, kz5.c1.k(lVarArr), 1, false);
        }
    }

    public final void n(java.lang.Long l17, yz5.l lVar) {
        if (lVar == null) {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122425e;
            if (l0Var == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            l0Var.z();
        }
        kotlinx.coroutines.l.d(this.f122427g, null, null, new com.tencent.mm.plugin.finder.playlist.c1(this, d(null, -1, l17), lVar, l17, null), 3, null);
    }

    public final void o(long j17, yz5.l lVar) {
        if (this.f122421a instanceof com.tencent.mm.ui.MMActivity) {
            pq5.g l17 = new db2.t0(j17, h().f122283c, ((java.lang.Number) ((jz5.n) this.f122431k).getValue()).intValue(), this.f122437q, null, ((java.lang.Number) ((jz5.n) this.f122430j).getValue()).intValue(), (java.lang.String) ((jz5.n) this.f122432l).getValue(), (java.lang.String) ((jz5.n) this.f122433m).getValue(), (java.lang.String) ((jz5.n) this.f122434n).getValue(), null, (r45.qt2) ((jz5.n) this.f122435o).getValue(), 0.0f, 0.0f, 0, 0, null, null, null, h().f122285e, 0, null, null, null, null, null, null, null, null, null, h().f122282b, 536607232, null).l();
            l17.f((im5.b) this.f122421a);
            l17.h(new com.tencent.mm.plugin.finder.playlist.i1(this, lVar, j17));
            return;
        }
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122425e;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var.v();
        com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = this.f122425e;
        if (l0Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var2.A();
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002d A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.s1.onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse):void");
    }

    public final void p(boolean z17) {
        this.f122440t = z17;
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerPresenter", "set downContinue " + z17);
    }

    public final void q(boolean z17) {
        this.f122439s = z17;
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerPresenter", "set upContinue " + z17);
    }

    public final void r(boolean z17) {
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122425e;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        android.view.View p17 = l0Var.p();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View t17 = l0Var.t();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l0Var.o().setVisibility(8);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122426f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        if (z17) {
            com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = this.f122425e;
            if (l0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            pm0.v.V(200L, new com.tencent.mm.plugin.finder.playlist.n(l0Var2));
            pm0.v.V(500L, new com.tencent.mm.plugin.finder.playlist.k0(l0Var2));
        }
        c();
    }
}
