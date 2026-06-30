package cp2;

/* loaded from: classes2.dex */
public abstract class v0 implements cp2.c {
    public final boolean A;
    public final com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyDataUpdateEventListener$1 B;
    public final com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyRefreshEventListener$1 C;
    public final so2.s D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f220927d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f220928e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f220929f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f220930g;

    /* renamed from: h, reason: collision with root package name */
    public int f220931h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f220932i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.fragment.app.Fragment f220933m;

    /* renamed from: n, reason: collision with root package name */
    public r45.dd2 f220934n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f220935o;

    /* renamed from: p, reason: collision with root package name */
    public cp2.d f220936p;

    /* renamed from: q, reason: collision with root package name */
    public final ey2.c3 f220937q;

    /* renamed from: r, reason: collision with root package name */
    public qq2.b f220938r;

    /* renamed from: s, reason: collision with root package name */
    public zo2.e f220939s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f220940t;

    /* renamed from: u, reason: collision with root package name */
    public gp2.l0 f220941u;

    /* renamed from: v, reason: collision with root package name */
    public r45.ha2 f220942v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220943w;

    /* renamed from: x, reason: collision with root package name */
    public final ym5.q1 f220944x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$uninterestEventListener$1 f220945y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f220946z;

    /* JADX WARN: Type inference failed for: r10v4, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyDataUpdateEventListener$1] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyRefreshEventListener$1] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$uninterestEventListener$1] */
    public v0(final com.tencent.mm.ui.MMActivity activity, r45.qt2 contextObj, java.lang.String by_pass, java.lang.String str) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(by_pass, "by_pass");
        this.f220927d = activity;
        this.f220928e = contextObj;
        this.f220929f = by_pass;
        this.f220930g = str;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f220937q = (ey2.c3) a17;
        this.f220944x = new cp2.u0(this);
        this.f220945y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveUninterestedEvent>(activity) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$uninterestEventListener$1
            {
                this.__eventId = -1131845930;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveUninterestedEvent finderLiveUninterestedEvent) {
                com.tencent.mm.autogen.events.FinderLiveUninterestedEvent event = finderLiveUninterestedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                long j17 = event.f54301g.f6670a;
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = cp2.v0.this.f220943w;
                if (nearbyLiveFeedLoader != null) {
                    nearbyLiveFeedLoader.remove(j17, true);
                }
                return true;
            }
        };
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "#init");
        this.A = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyDataUpdateEventListener$1
            {
                this.__eventId = -528472046;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent finderNearbyDataUpdateEvent) {
                com.tencent.mm.plugin.finder.feed.model.internal.a0 merger;
                com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent event = finderNearbyDataUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                cp2.v0 v0Var = cp2.v0.this;
                if (!v0Var.E) {
                    return true;
                }
                am.oc ocVar = event.f54309g;
                if (ocVar.f7522c == null) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", " receive FinderNearbyDataUpdateEvent");
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = v0Var.f220943w;
                if (nearbyLiveFeedLoader == null || (merger = nearbyLiveFeedLoader.getMerger()) == null) {
                    return true;
                }
                java.lang.Object obj = ocVar.f7522c;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.IResponse<com.tencent.mm.plugin.finder.model.RVFeed>");
                merger.mergeInsertSpecifiedLocation((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, new com.tencent.mm.plugin.finder.feed.model.internal.t0(ocVar.f7520a, ocVar.f7521b), new cp2.i0(v0Var));
                return true;
            }
        };
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNearbyRefreshEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyRefreshEventListener$1
            {
                this.__eventId = -1196995180;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNearbyRefreshEvent finderNearbyRefreshEvent) {
                com.tencent.mm.autogen.events.FinderNearbyRefreshEvent event = finderNearbyRefreshEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" receive FinderNearbyRefreshEvent objectId = ");
                am.pc pcVar = event.f54310g;
                sb6.append(pcVar.f7612a);
                sb6.append(" , ");
                cp2.v0 v0Var = cp2.v0.this;
                sb6.append(v0Var.E);
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", sb6.toString());
                if (!v0Var.E) {
                    return true;
                }
                v0Var.P(16, pcVar.f7612a, v0Var.f220940t);
                return true;
            }
        };
        this.D = new so2.s(null, 0, 0, null, 15, null);
        this.F = true;
        this.H = true;
    }

    public final void A() {
        ((cp2.q1) z()).j().postDelayed(new cp2.j0(this), 200L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(boolean r13) {
        /*
            r12 = this;
            cp2.d r0 = r12.z()
            cp2.q1 r0 = (cp2.q1) r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.g()
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            r9 = 0
            if (r2 == 0) goto L22
            r2 = 2
            int[] r2 = new int[r2]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r1.u(r2)
            r1 = r2[r9]
        L20:
            r10 = r1
            goto L2e
        L22:
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L2d
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.w()
            goto L20
        L2d:
            r10 = r9
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[onActionbarClick] position="
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = " isDouble="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.TimelineLbsPresenter"
            com.tencent.mars.xlog.Log.i(r2, r1)
            if (r13 == 0) goto Le1
            r13 = 12
            if (r10 > r13) goto L92
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r4 = "onActionbarClick"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "smoothScrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.c1(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r3 = "onActionbarClick"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "smoothScrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            goto Ld4
        L92:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r4 = "onActionbarClick"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "scrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.a1(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r3 = "onActionbarClick"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "scrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        Ld4:
            if (r10 > r13) goto Ldc
            r0 = 20
            r12.c(r0, r9)
            goto Le1
        Ldc:
            r0 = 100
            r12.c(r0, r9)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.v0.B(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader] */
    public void C(cp2.d callback, boolean z17, com.tencent.mm.protobuf.g gVar) {
        int i17;
        java.util.LinkedList list;
        android.view.View view;
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onAttach targetPageForceRefreshFlag:" + z17 + " targetTabPageLastBuffer:" + gVar);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = this.f220937q.Q6(v());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createFeedLoader canTimelineRefresh=");
        sb6.append(c0Var.f310112d);
        sb6.append(" memoryCacheFlag:");
        sb6.append(v());
        sb6.append(" tabId: ");
        r45.dd2 dd2Var = this.f220934n;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : null);
        sb6.append(" tabName: ");
        r45.dd2 dd2Var2 = this.f220934n;
        sb6.append(dd2Var2 != null ? dd2Var2.getString(1) : null);
        sb6.append("  commentScene: ");
        sb6.append(getCommentScene());
        sb6.append(" contextScene: ");
        r45.qt2 qt2Var = this.f220928e;
        sb6.append(qt2Var.getInteger(5));
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", sb6.toString());
        final r45.qt2 qt2Var2 = this.f220928e;
        final int commentScene = getCommentScene();
        final int y17 = y();
        final int s17 = s();
        final java.lang.String str = this.f220929f;
        final java.lang.String str2 = this.f220930g;
        final cp2.c0 c0Var2 = new cp2.c0(this);
        ?? r142 = new com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader(qt2Var2, commentScene, y17, s17, str, str2, c0Var2) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1
            @Override // com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
            public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
                r45.ha2 ha2Var;
                java.util.LinkedList list2;
                r45.dd2 dd2Var3;
                java.util.LinkedList list3;
                r45.dd2 dd2Var4;
                java.util.LinkedList list4;
                r45.dd2 dd2Var5;
                java.util.LinkedList list5;
                r45.dd2 dd2Var6;
                gp2.l0 l0Var;
                r45.s92 s92Var;
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory;
                kotlin.jvm.internal.o.g(response, "response");
                r45.fd1 fd1Var = cp2.b.f220775x;
                cp2.v0 v0Var = cp2.v0.this;
                if (fd1Var != null && (s92Var = (r45.s92) fd1Var.getCustom(11)) != null) {
                    int integer = s92Var.getInteger(0);
                    v0Var.getClass();
                    com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "adjustSquareStyle styleInfo: " + integer);
                    if (integer == 0) {
                        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory2 = ((cp2.q1) v0Var.z()).f220897v;
                        if (nearbyLiveItemConvertFactory2 != null) {
                            nearbyLiveItemConvertFactory2.setAspectRatio(1.7777778f);
                        }
                    } else if (integer == 1 && (nearbyLiveItemConvertFactory = ((cp2.q1) v0Var.z()).f220897v) != null) {
                        nearbyLiveItemConvertFactory.setAspectRatio(1.3333334f);
                    }
                    cp2.d z18 = v0Var.z();
                    int integer2 = s92Var.getInteger(1);
                    com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "setBottomExtraInfo: bottomExtraInfo=" + integer2);
                    com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory3 = ((cp2.q1) z18).f220897v;
                    if (nearbyLiveItemConvertFactory3 != null) {
                        nearbyLiveItemConvertFactory3.setBottomExtraInfo(integer2);
                    }
                }
                r45.fd1 fd1Var2 = cp2.b.f220775x;
                if (fd1Var2 != null && (l0Var = v0Var.f220941u) != null) {
                    l0Var.H(fd1Var2.getInteger(14));
                }
                java.lang.String f123427d = getF123427d();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onfetchDone tabInfo: ");
                r45.dd2 dd2Var7 = v0Var.f220934n;
                sb7.append(dd2Var7 != null ? java.lang.Integer.valueOf(dd2Var7.getInteger(0)) : null);
                sb7.append(' ');
                r45.dd2 dd2Var8 = v0Var.f220934n;
                sb7.append(dd2Var8 != null ? dd2Var8.getString(1) : null);
                sb7.append(" subTab: ");
                r45.dd2 dd2Var9 = v0Var.f220934n;
                sb7.append((dd2Var9 == null || (list5 = dd2Var9.getList(6)) == null || (dd2Var6 = (r45.dd2) kz5.n0.Z(list5)) == null) ? null : java.lang.Integer.valueOf(dd2Var6.getInteger(0)));
                sb7.append(" : ");
                r45.dd2 dd2Var10 = v0Var.f220934n;
                sb7.append((dd2Var10 == null || (list4 = dd2Var10.getList(6)) == null || (dd2Var5 = (r45.dd2) kz5.n0.Z(list4)) == null) ? null : dd2Var5.getString(1));
                com.tencent.mars.xlog.Log.i(f123427d, sb7.toString());
                boolean z19 = response instanceof cp2.m;
                cp2.m mVar = z19 ? (cp2.m) response : null;
                java.lang.Object request = mVar != null ? mVar.getRequest() : null;
                cp2.l lVar = request instanceof cp2.l ? (cp2.l) request : null;
                if (lVar != null) {
                    java.lang.String f123427d2 = getF123427d();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" response request tabInfo: ");
                    r45.dd2 dd2Var11 = v0Var.f220934n;
                    sb8.append(dd2Var11 != null ? java.lang.Integer.valueOf(dd2Var11.hashCode()) : null);
                    sb8.append(' ');
                    r45.dd2 dd2Var12 = lVar.f220835b;
                    sb8.append(dd2Var12 != null ? java.lang.Integer.valueOf(dd2Var12.hashCode()) : null);
                    sb8.append(" tabInfo: ");
                    sb8.append(dd2Var12 != null ? java.lang.Integer.valueOf(dd2Var12.getInteger(0)) : null);
                    sb8.append(' ');
                    sb8.append(dd2Var12 != null ? dd2Var12.getString(1) : null);
                    sb8.append(" subTab: ");
                    sb8.append((dd2Var12 == null || (list3 = dd2Var12.getList(6)) == null || (dd2Var4 = (r45.dd2) kz5.n0.Z(list3)) == null) ? null : java.lang.Integer.valueOf(dd2Var4.getInteger(0)));
                    sb8.append(' ');
                    sb8.append((dd2Var12 == null || (list2 = dd2Var12.getList(6)) == null || (dd2Var3 = (r45.dd2) kz5.n0.Z(list2)) == null) ? null : dd2Var3.getString(1));
                    com.tencent.mars.xlog.Log.i(f123427d2, sb8.toString());
                }
                super.onFetchDone(response);
                int refreshInterval = response.getRefreshInterval();
                if (refreshInterval > 0) {
                    zl2.r4.f473950a.I0().putInt("finder_live_watch_count_down_refresh_interval", refreshInterval);
                }
                cp2.m mVar2 = z19 ? (cp2.m) response : null;
                if (mVar2 != null && (ha2Var = mVar2.f220848a) != null) {
                    v0Var.f220942v = ha2Var;
                    v0Var.m(ha2Var);
                }
                v0Var.f220940t = response.getLastBuffer();
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = v0Var.f220943w;
                if (nearbyLiveFeedLoader != null && nearbyLiveFeedLoader.isInsertSpecifyOperation(response)) {
                    com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "handleRecomResponse lastResponseBuffer " + v0Var.f220940t);
                    sq2.g gVar2 = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
                    if (gVar2.f411351f) {
                        gVar2.f411349d = response;
                        c92.g gVar3 = c92.g.f39738a;
                        boolean z27 = ((java.lang.Number) kb2.c.f306227b.r()).intValue() == 1;
                        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "saveResponse " + gVar2.f411349d + " isEnableAnimReplace: " + z27);
                        if (!z27) {
                            gVar2.Di();
                        }
                    }
                }
                if (1 == response.getPullType() || response.getPullType() == 0) {
                    com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent finderFluentSwitchInterceptEvent = new com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent();
                    finderFluentSwitchInterceptEvent.f54276g.f6752a = true;
                    com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "handleFluentSwitch intercept exit");
                    finderFluentSwitchInterceptEvent.e();
                }
            }
        };
        r142.setInitDone(new cp2.g0(c0Var, this, r142));
        r142.f121468i = new cp2.h0(this, r142);
        this.f220943w = r142;
        this.f220935o = gVar;
        this.f220932i = z17;
        pf5.u uVar = pf5.u.f353936a;
        if (z17) {
            androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.c3.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            int v17 = v();
            ey2.x2 O6 = ((ey2.c3) uVar.e(c61.l7.class).a(ey2.c3.class)).O6(v17);
            O6.f257573f = ey2.z2.f257599e;
            O6.f257572e = 0L;
            O6.f257576i = 0;
            com.tencent.mars.xlog.Log.i("PreloadCacheManager", "resetFirstPage memoryCacheFlag:" + v17);
        }
        this.f220936p = callback;
        cp2.d z18 = z();
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader);
        java.util.ArrayList data = nearbyLiveFeedLoader.getDataListJustForAdapter();
        cp2.q1 q1Var = (cp2.q1) z18;
        kotlin.jvm.internal.o.g(data, "data");
        cp2.u1 u1Var = q1Var.f220896u;
        u1Var.getClass();
        u1Var.f220925f = data;
        jz5.g gVar2 = q1Var.f220891p;
        jz5.g gVar3 = q1Var.f220892q;
        jz5.g gVar4 = q1Var.f220890o;
        boolean z19 = q1Var.f220886h;
        android.view.View view2 = q1Var.f220885g;
        if (z19) {
            q1Var.l().setBackgroundColor(view2.getResources().getColor(com.tencent.mm.R.color.f478512u));
            ((android.view.View) ((jz5.n) gVar4).getValue()).setBackgroundColor(view2.getResources().getColor(com.tencent.mm.R.color.f478512u));
            q1Var.g().setBackgroundDrawable(view2.getResources().getDrawable(com.tencent.mm.R.drawable.a8w));
            ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setTextColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode));
            on5.c loadMoreFooter = q1Var.l().getLoadMoreFooter();
            if (loadMoreFooter != null && (view = loadMoreFooter.getView()) != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
            i17 = 5;
        } else {
            i17 = 5;
            if (q1Var.a().getInteger(5) == 112) {
                q1Var.l().setBackgroundColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_93));
                ((android.view.View) ((jz5.n) gVar4).getValue()).setBackgroundColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_93));
            } else {
                q1Var.l().setBackgroundColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_100));
                ((android.view.View) ((jz5.n) gVar4).getValue()).setBackgroundColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_100));
                ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setTextColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
                ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setIconColor(view2.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
            }
        }
        q1Var.l().setOnSimpleAction(new cp2.i1(q1Var));
        com.tencent.mm.view.recyclerview.WxRecyclerView g17 = q1Var.g();
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager() { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveViewCallback$initRecyclerView$1
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        boolean z27 = true;
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        g17.setLayoutManager(finderStaggeredGridLayoutManager);
        q1Var.g().N(new cp2.w0(q1Var.a().getInteger(i17)));
        androidx.recyclerview.widget.n2 itemAnimator = q1Var.g().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory = new com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory(q1Var.f220882d, q1Var.f220884f, q1Var.f220886h, q1Var.a().getInteger(i17) == 112, q1Var.a().getInteger(i17));
        q1Var.f220897v = nearbyLiveItemConvertFactory;
        cp2.c1 c1Var = new cp2.c1(data, nearbyLiveItemConvertFactory);
        q1Var.f220895t = c1Var;
        c1Var.f293105o = new cp2.d1(data, q1Var);
        c1Var.f293104n = new cp2.f1(data, q1Var);
        q1Var.g().setAdapter(q1Var.f220895t);
        q1Var.g().setHasFixedSize(true);
        q1Var.g().setItemViewCacheSize(8);
        com.tencent.mm.view.recyclerview.WxRecyclerView g18 = q1Var.g();
        kotlin.jvm.internal.o.e(g18, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        g18.setFlingSpeedFactor(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127816m1).getValue()).r()).intValue());
        com.tencent.mm.view.recyclerview.WxRecyclerView g19 = q1Var.g();
        kotlin.jvm.internal.o.f(g19, "<get-recyclerView>(...)");
        in5.o.b(g19, new cp2.g1(q1Var), cp2.h1.f220816d);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initSubTabView tab:");
        r45.dd2 dd2Var3 = q1Var.f220887i;
        sb7.append(dd2Var3 != null ? dd2Var3.getString(1) : null);
        sb7.append(" subTabCount:");
        sb7.append((dd2Var3 == null || (list = dd2Var3.getList(6)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", sb7.toString());
        if (dd2Var3 != null) {
            q1Var.o().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(q1Var.o().getContext(), 0, false));
            q1Var.o().setAdapter(new cp2.z0(q1Var, dd2Var3));
            if (z19) {
                q1Var.o().setBackgroundColor(q1Var.o().getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            }
            if (dd2Var3.getList(6).isEmpty() || ((java.lang.Number) ae2.in.U3.r()).intValue() != 1) {
                q1Var.o().setVisibility(8);
            } else {
                q1Var.o().setVisibility(0);
            }
        }
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f220943w;
        if (nearbyLiveFeedLoader2 != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(nearbyLiveFeedLoader2, this.f220944x, false, 2, null);
        }
        sq2.g gVar5 = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
        gVar5.getClass();
        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "markEventRegister isRegister: true");
        gVar5.f411351f = true;
        alive();
        alive();
        alive();
        com.tencent.mm.view.recyclerview.WxRecyclerView g27 = ((cp2.q1) z()).g();
        if (g27 != null) {
            g27.i(new cp2.k0(this));
            rq2.p.f398859b = java.lang.String.valueOf(qt2Var.getInteger(i17));
            com.tencent.mm.ui.MMActivity mMActivity = this.f220927d;
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader3 = this.f220943w;
            kotlin.jvm.internal.o.d(nearbyLiveFeedLoader3);
            java.util.List dataListJustForAdapter = nearbyLiveFeedLoader3.getDataListJustForAdapter();
            if (((java.lang.Number) yo2.e.f464142f.r()).intValue() != 1) {
                r45.dd2 dd2Var4 = this.f220934n;
                z27 = dd2Var4 != null ? dd2Var4.getBoolean(i17) : false;
            }
            boolean z28 = z27;
            r45.dd2 dd2Var5 = this.f220934n;
            gp2.l0 l0Var = new gp2.l0(mMActivity, g27, dataListJustForAdapter, z28, dd2Var5 != null ? dd2Var5.getInteger(0) : 0, false, false, false, null, mn0.d0.f329715n, 7, java.lang.String.valueOf(getCommentScene()), 0, false, null, null, 61920, null);
            l0Var.G = new cp2.l0(l0Var, this);
            this.f220941u = l0Var;
            l0Var.e(null);
            ((gp2.v0) uVar.e(wo2.k.class).a(gp2.v0.class)).N6(this.f220927d);
        }
        if (((cp2.q1) z()).g() != null && this.f220943w != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView g28 = ((cp2.q1) z()).g();
            kotlin.jvm.internal.o.d(g28);
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader4 = this.f220943w;
            kotlin.jvm.internal.o.d(nearbyLiveFeedLoader4);
            this.f220938r = new qq2.b(g28, nearbyLiveFeedLoader4, this.f220934n, getCommentScene());
            com.tencent.mm.view.recyclerview.WxRecyclerView g29 = ((cp2.q1) z()).g();
            kotlin.jvm.internal.o.d(g29);
            this.f220939s = new zo2.e(g29, 2);
        }
        h();
    }

    public void D() {
        r45.dd2 dd2Var;
        if (this.f220943w == null) {
            com.tencent.mars.xlog.Log.w("Finder.NearbyLivePresenter", "storeMemoryCache return for feedLoader:" + this.f220943w);
            return;
        }
        this.f220937q.f257336h.clear();
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader);
        com.tencent.mm.plugin.finder.feed.ys ysVar = nearbyLiveFeedLoader.f121481y;
        zo2.e eVar = this.f220939s;
        int i17 = eVar != null ? eVar.f474850b : 0;
        int i18 = eVar != null ? eVar.f474851c : 0;
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader2);
        int size = nearbyLiveFeedLoader2.getDataListJustForAdapter().size();
        int v17 = v();
        androidx.fragment.app.Fragment fragment = this.f220933m;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = fragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment : null;
        int integer = (nearbyLiveSquareTabFragment == null || (dd2Var = nearbyLiveSquareTabFragment.f121520t) == null) ? 0 : dd2Var.getInteger(0);
        java.lang.String str = " lastBuffer:";
        boolean z17 = this.A;
        if (!z17 || ysVar == null) {
            if (size > 0) {
                ey2.c3 c3Var = this.f220937q;
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader3 = this.f220943w;
                kotlin.jvm.internal.o.d(nearbyLiveFeedLoader3);
                ey2.c3.S6(c3Var, v17, i17, i18, nearbyLiveFeedLoader3.getDataListJustForAdapter(), null, this.f220940t, false, integer, this.f220942v, 80, null);
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "[onFinishing] memoryCacheFlag:" + v17 + " enableFoldFollowData:" + z17 + " position:" + i17 + " offset:" + i18 + " size:" + size + " lastBuffer:" + this.f220940t);
                return;
            }
            return;
        }
        int i19 = ysVar.f111196h;
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader4 = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader4);
        java.util.ArrayList arrayList = new java.util.ArrayList(nearbyLiveFeedLoader4.getDataListJustForAdapter());
        java.util.Iterator it = arrayList.iterator();
        int i27 = 0;
        while (true) {
            if (!it.hasNext()) {
                i27 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof so2.h4) && ((so2.h4) j5Var).f410401e > i19) {
                break;
            } else {
                i27++;
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList.subList(0, i19));
        java.util.LinkedList linkedList2 = (i27 == -1 || i27 >= arrayList.size()) ? new java.util.LinkedList() : new java.util.LinkedList(arrayList.subList(i27, arrayList.size()));
        java.util.LinkedList linkedList3 = (i19 == -1 || i27 == -1 || i27 >= arrayList.size() || i27 <= i19) ? (i19 == -1 || i27 != -1 || i19 >= arrayList.size()) ? new java.util.LinkedList() : new java.util.LinkedList(arrayList.subList(i19, arrayList.size())) : new java.util.LinkedList(arrayList.subList(i19, i27));
        ysVar.f111194f = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList3.iterator();
        while (it6.hasNext()) {
            java.util.Iterator it7 = it6;
            so2.j5 j5Var2 = (so2.j5) it6.next();
            java.lang.String str2 = str;
            if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                ysVar.f111194f.add(j5Var2);
            }
            it6 = it7;
            str = str2;
        }
        java.lang.String str3 = str;
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onFinishing moreFollowCardIndex:" + i19 + " moreRecommendDividerIndex:" + i27 + " beforeFollowDataListStr:" + hc2.o0.p(linkedList) + " followDataListStr:" + hc2.o0.p(linkedList3) + " recommendDataListStr:" + hc2.o0.p(linkedList2) + " dataListStr:" + hc2.o0.p(arrayList));
        arrayList.clear();
        arrayList.addAll(linkedList);
        arrayList.add(ysVar);
        arrayList.addAll(linkedList2);
        ey2.c3.S6(this.f220937q, v17, 0, 0, arrayList, null, this.f220940t, false, integer, this.f220942v, 80, null);
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "[onFinishing] memoryCacheFlag:" + v17 + " enableFoldFollowData:" + z17 + " position:0 offset:0 size:" + size + str3 + this.f220940t);
    }

    public void F() {
        this.G = true;
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onStart memoryCacheFlag:" + v());
        if (!this.H) {
            i();
        }
        gp2.l0 l0Var = this.f220941u;
        if (l0Var != null && !l0Var.f274260s) {
            f(this.H, "onStart");
        }
        this.H = false;
    }

    public void G() {
        this.G = false;
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onStop memoryCacheFlag:" + v());
        gp2.l0 l0Var = this.f220941u;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = this.f220941u;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I() {
        boolean Di;
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onUserVisibleFocused memoryCacheFlag:" + v());
        this.E = true;
        tq2.c.f421220i.a(v()).f421223b = java.lang.System.currentTimeMillis();
        if (this.F) {
            if (dp2.a.f242183a.a("requestFirstPage", this.f220934n, getCommentScene())) {
                r45.dd2 dd2Var = this.f220934n;
                if ((dd2Var != null && dd2Var.getInteger(0) == 88889) != false) {
                    if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227164o, new cp2.n0(this))) {
                        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "checkTryRequestFirstPageAgain return for permission:" + this.I);
                    }
                }
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220943w;
                kotlin.jvm.internal.o.d(nearbyLiveFeedLoader);
                nearbyLiveFeedLoader.d(v(), q(), this.f220934n);
            } else {
                ym5.s3 s3Var = new ym5.s3(0);
                s3Var.f463517b = -2;
                g(s3Var);
                r45.dd2 dd2Var2 = this.f220934n;
                if ((dd2Var2 != null && dd2Var2.getInteger(0) == 88889) != false) {
                    java.lang.Object l17 = gm0.j1.u().c().l(274436, "");
                    kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
                    if (u11.c.f((java.lang.String) l17)) {
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        com.tencent.mm.ui.MMActivity mMActivity = this.f220927d;
                        Di = j35.u.d(mMActivity, "android.permission.ACCESS_FINE_LOCATION", true);
                        if (!Di) {
                            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                                j35.u.i(mMActivity, "android.permission.ACCESS_FINE_LOCATION", com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
                            } else {
                                js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                                java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d());
                                ((is.h) s0Var).getClass();
                                c71.b.c(mMActivity, string, 30764, true);
                            }
                        }
                    } else {
                        Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this.f220927d, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, null, null);
                    }
                    com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "requestLocationPermission checkLocation:" + Di);
                }
            }
        }
        if (!this.F) {
            i();
        }
        gp2.l0 l0Var = this.f220941u;
        if (l0Var != null) {
            l0Var.J(true);
        }
        nq2.d dVar = nq2.d.f338980a;
        r45.dd2 dd2Var3 = this.f220934n;
        r45.qt2 contextObj = this.f220928e;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnterLiveSquareTabPage tab:[");
        jz5.f0 f0Var = null;
        r6 = null;
        r45.dd2 dd2Var4 = null;
        sb6.append(dd2Var3 != null ? java.lang.Integer.valueOf(dd2Var3.getInteger(0)) : null);
        sb6.append(", ");
        sb6.append(dd2Var3 != null ? dd2Var3.getString(1) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("NearbyPreloadManager", sb6.toString());
        if (dVar.b()) {
            if (dd2Var3 != null) {
                com.tencent.mars.xlog.Log.i("NearbyPreloadManager", "onEnterLiveSquareTabPage startPreload preTab:" + dd2Var3.getBoolean(4) + " nextTab:" + dd2Var3.getBoolean(3));
                boolean z17 = dd2Var3.getBoolean(3);
                java.util.LinkedList linkedList = nq2.d.f338983d;
                if (z17) {
                    int size = linkedList.size();
                    int i17 = -1;
                    for (int i18 = 0; i18 < size; i18++) {
                        if (dd2Var3.getInteger(0) == ((r45.dd2) linkedList.get(i18)).getInteger(0)) {
                            i17 = i18;
                        }
                    }
                    int i19 = i17 + 1;
                    dVar.i(contextObj, (i19 < 0 || i19 >= linkedList.size()) ? null : (r45.dd2) linkedList.get(i19), 14, "preloadNextTab");
                }
                if (dd2Var3.getBoolean(4)) {
                    int size2 = linkedList.size();
                    int i27 = -1;
                    for (int i28 = 0; i28 < size2; i28++) {
                        if (dd2Var3.getInteger(0) == ((r45.dd2) linkedList.get(i28)).getInteger(0)) {
                            i27 = i28;
                        }
                    }
                    int i29 = i27 - 1;
                    if (i29 >= 0 && i29 < linkedList.size()) {
                        dd2Var4 = (r45.dd2) linkedList.get(i29);
                    }
                    dVar.i(contextObj, dd2Var4, 15, "preloadPreTab");
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "onEnterLiveSquareTabPage return for null");
            }
        } else {
            com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "onEnterLiveSquareTabPage return for enableNearbyLivePagesPreload:" + dVar.b());
        }
        f(this.F, "onUserVisibleFocused");
        this.F = false;
    }

    public void M() {
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onUserVisibleUnFocused memoryCacheFlag:" + v());
        this.E = false;
        gp2.l0 l0Var = this.f220941u;
        if (l0Var != null) {
            l0Var.J(false);
        }
        gp2.l0 l0Var2 = this.f220941u;
        if (l0Var2 != null) {
            l0Var2.m();
        }
        gp2.l0 l0Var3 = this.f220941u;
        if (l0Var3 != null) {
            c50.m0.c(l0Var3, null, 1, null);
        }
    }

    public final void P(int i17, long j17, com.tencent.mm.protobuf.g gVar) {
        java.lang.String str;
        rq2.s sVar = rq2.s.f398879a;
        int y17 = y();
        r45.dd2 dd2Var = this.f220934n;
        if (dd2Var == null || (str = dd2Var.getString(1)) == null) {
            str = "";
        }
        sVar.d(i17, y17, str);
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader);
        nearbyLiveFeedLoader.e(this.f220934n, i17, gVar, this.f220932i, j17);
    }

    public final void Q() {
        r45.dd2 dd2Var = this.f220934n;
        if (dd2Var != null && dd2Var.getInteger(0) == 88889) {
            if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227164o)) {
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "business switch close");
                A();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "requestRefresh");
        P(this.f220931h, 0L, this.f220935o);
        this.f220931h = 1;
        this.f220932i = false;
        this.f220935o = null;
        qq2.b bVar = this.f220938r;
        if (bVar != null) {
            bVar.f365939j = true;
        }
    }

    public final void V() {
        cp2.o0 o0Var = new cp2.o0(this);
        cp2.s0 s0Var = new cp2.s0(this);
        cp2.t0 t0Var = new cp2.t0(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            o0Var.invoke();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            t0Var.invoke();
        } else {
            s0Var.invoke();
        }
    }

    public void c(long j17, boolean z17) {
        tq2.d.f421230a.c("startFetchLives");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout j18 = ((cp2.q1) z()).j();
        j18.postDelayed(new cp2.y(j18), j17);
        androidx.fragment.app.Fragment fragment = this.f220933m;
        if (fragment == null || fragment.getParentFragment() == null) {
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f220933m;
        kotlin.jvm.internal.o.d(fragment2);
        androidx.fragment.app.Fragment parentFragment = fragment2.getParentFragment();
        kotlin.jvm.internal.o.d(parentFragment);
        if (((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).Q6() != 0) {
            rq2.s.f398879a.c(false, false);
        }
    }

    public final void f(boolean z17, java.lang.String str) {
        if (z17 && this.f220937q.Q6(v())) {
            com.tencent.mars.xlog.Log.w("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for checkCache:" + z17 + " memoryCacheFlag:" + v());
            return;
        }
        if (!this.G) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for isOnResume:" + this.G + " memoryCacheFlag:" + v());
            return;
        }
        if (!this.E) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for isOnUserVisibleFocused:" + this.E + " memoryCacheFlag:" + v());
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " memoryCacheFlag:" + v());
        gp2.l0 l0Var = this.f220941u;
        if (l0Var != null) {
            l0Var.g();
        }
    }

    public final void g(ym5.s3 s3Var) {
        pm0.v.X(new cp2.a0(s3Var, this));
    }

    public final void h() {
        boolean z17;
        if (dp2.a.f242183a.a("checkOnPauseDataIsEmpty", this.f220934n, getCommentScene())) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227164o)) {
                z17 = true;
                this.I = z17;
            }
        }
        z17 = false;
        this.I = z17;
    }

    public final void i() {
        if (!this.G) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for isOnResume:" + this.G + " memoryCacheFlag:" + v());
            return;
        }
        if (!this.E) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.E + " memoryCacheFlag:" + v());
            return;
        }
        if (this.I) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.I);
            return;
        }
        if (!dp2.a.f242183a.a("requestFirstPage", this.f220934n, getCommentScene())) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for canLoadNearbyCityFeeds.");
            return;
        }
        r45.dd2 dd2Var = this.f220934n;
        if (dd2Var != null && dd2Var.getInteger(0) == 88889) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227164o, new cp2.b0(this))) {
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "checkTryRequestFirstPageAgain return for permission:" + this.I);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shouldTryRequestFirstPageAgain requestInit tab:");
        r45.dd2 dd2Var2 = this.f220934n;
        sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.getInteger(0)) : null);
        sb6.append('-');
        r45.dd2 dd2Var3 = this.f220934n;
        sb6.append(dd2Var3 != null ? dd2Var3.getString(1) : null);
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", sb6.toString());
        g(null);
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader);
        nearbyLiveFeedLoader.d(v(), q(), this.f220934n);
    }

    public final void m(r45.ha2 ha2Var) {
        if (ha2Var != null) {
            com.tencent.mm.ui.MMActivity activity = this.f220927d;
            kotlin.jvm.internal.o.g(activity, "activity");
            sp2.x3 x3Var = (sp2.x3) pf5.z.f353948a.a(activity).a(sp2.x3.class);
            x3Var.Z6(ha2Var);
            x3Var.X6();
        }
    }

    @Override // fs2.a
    public void onDetach() {
        sq2.g gVar = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "markEventRegister isRegister: false");
        gVar.f411351f = false;
        dead();
        dead();
        dead();
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f220943w;
        if (nearbyLiveFeedLoader != null) {
            nearbyLiveFeedLoader.unregister(this.f220944x);
        }
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader2);
        if (nearbyLiveFeedLoader2.getDataListJustForAdapter().size() > 0) {
            ((ey2.c3) pf5.u.f353936a.e(c61.l7.class).a(ey2.c3.class)).R6(v());
        }
        gp2.l0 l0Var = this.f220941u;
        if (l0Var != null) {
            l0Var.o();
        }
    }

    public void onRefresh() {
        r45.dd2 dd2Var = this.f220934n;
        boolean z17 = false;
        if (dd2Var != null && dd2Var.getInteger(0) == 88889) {
            z17 = true;
        }
        if (!z17) {
            Q();
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227164o, new cp2.m0(this))) {
            return;
        }
        V();
    }

    @Override // cp2.c
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        tq2.d.f421230a.b("onRefreshEnd");
        tq2.c a17 = tq2.c.f421220i.a(v());
        a17.f421229h = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("NearbyTimeConsumingHelper-" + a17.f421222a, "onVisible->onRefreshEnd:" + (a17.f421229h - a17.f421223b) + " \nonAttach->startFetch:" + (a17.f421224c - a17.f421223b) + " \nstartFetch->startCgi:" + (a17.f421225d - a17.f421224c) + " \nstartCgi->onCgiBack:" + (a17.f421226e - a17.f421225d) + " \nonCgiBack->onFetchDone:" + (a17.f421227f - a17.f421226e) + " \nonFetchDone->onViewUpdate:" + (a17.f421228g - a17.f421227f) + " \nonViewUpdate->onRefreshEnd:" + (a17.f421229h - a17.f421228g));
        a17.f421223b = 0L;
        a17.f421224c = 0L;
        a17.f421225d = 0L;
        a17.f421226e = 0L;
        a17.f421227f = 0L;
        a17.f421228g = 0L;
        a17.f421229h = 0L;
        if (reason.f463523h <= 0) {
            ((cp2.q1) z()).j().k();
        }
        if (reason.f463521f) {
            ((cp2.q1) z()).j().E(false);
        }
        g(reason);
        p("onRefreshEnd");
        qq2.b bVar = this.f220938r;
        if (bVar != null) {
            bVar.f365939j = false;
        }
        if (bVar != null) {
            bVar.a(reason.f463521f);
        }
        f(false, "onRefreshEnd");
    }

    public final void p(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "disposeRedDot from " + str);
        boolean z17 = true;
        if (c92.g.f39738a.b()) {
            r45.dd2 dd2Var = this.f220934n;
            if (dd2Var != null && dd2Var.getInteger(0) == 88889) {
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "disposeRedDot from " + str + " return for 同城直播.");
                return;
            }
        }
        int commentScene = getCommentScene();
        if (commentScene != 9500001 && commentScene != 9500002 && commentScene != 9500004 && commentScene != 9500003) {
            z17 = false;
        }
        if (!z17) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("NearbyLiveTab");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().q0("NearbyLiveTab", str);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "disposeRedDot from " + str + " return for in operation game.");
        }
    }

    public int q() {
        r45.dd2 dd2Var = this.f220934n;
        if (dd2Var == null) {
            return getCommentScene() + s() + 1005000;
        }
        return dd2Var.getInteger(0) + 1005000 + getCommentScene();
    }

    public abstract int s();

    public int v() {
        r45.dd2 dd2Var = this.f220934n;
        if (dd2Var == null) {
            return getCommentScene() + s() + 1005000;
        }
        return dd2Var.getInteger(0) + 1005000 + getCommentScene();
    }

    public abstract int y();

    public final cp2.d z() {
        cp2.d dVar = this.f220936p;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
