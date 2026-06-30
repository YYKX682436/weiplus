package ir2;

/* loaded from: classes2.dex */
public abstract class o implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir2.a1 f294188d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.y f294189e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f294190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f294191g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1 f294192h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1 f294193i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1 f294194m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1 f294195n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f294196o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$createLiveListener$1 f294197p;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$createLiveListener$1] */
    public o(ir2.a1 loader, androidx.lifecycle.y lifeCycleOwner, r45.qt2 qt2Var, int i17, int i18, kotlin.jvm.internal.i iVar) {
        qt2Var = (i18 & 4) != 0 ? null : qt2Var;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(loader, "loader");
        kotlin.jvm.internal.o.g(lifeCycleOwner, "lifeCycleOwner");
        this.f294188d = loader;
        this.f294189e = lifeCycleOwner;
        this.f294190f = qt2Var;
        this.f294191g = i17;
        androidx.lifecycle.o mo133getLifecycle = lifeCycleOwner.mo133getLifecycle();
        androidx.lifecycle.o oVar = mo133getLifecycle.b() != androidx.lifecycle.n.DESTROYED ? mo133getLifecycle : null;
        if (oVar != null) {
            oVar.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    ir2.o oVar2 = ir2.o.this;
                    oVar2.getClass();
                    ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                    mv2.f0.f331561a.t(oVar2);
                    oVar2.f294192h.dead();
                    oVar2.f294194m.dead();
                    oVar2.f294195n.dead();
                    oVar2.f294193i.dead();
                    oVar2.f294197p.dead();
                }
            });
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f294192h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new ir2.h(event, ir2.o.this));
                return false;
            }
        };
        this.f294193i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1
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
                com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", sb6.toString());
                long j17 = gaVar.f6749a;
                ir2.o oVar2 = ir2.o.this;
                oVar2.getClass();
                if (j17 <= 0) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "updateProgressByLocalId localId:" + j17);
                pm0.v.X(new ir2.n(oVar2, j17));
                return true;
            }
        };
        this.f294194m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveUninterestedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1
            {
                this.__eventId = -1131845930;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveUninterestedEvent finderLiveUninterestedEvent) {
                com.tencent.mm.autogen.events.FinderLiveUninterestedEvent event = finderLiveUninterestedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new ir2.j(ir2.o.this, event.f54301g.f6670a));
                return true;
            }
        };
        this.f294195n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new ir2.g(event, ir2.o.this));
                return false;
            }
        };
        this.f294196o = new java.util.ArrayList();
        this.f294197p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CreateLiveEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$createLiveListener$1
            {
                this.__eventId = -1194767550;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CreateLiveEvent createLiveEvent) {
                java.lang.Object obj;
                com.tencent.mm.autogen.events.CreateLiveEvent event = createLiveEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLiveListener localId:");
                am.o3 o3Var = event.f54076g;
                sb6.append(o3Var.f7509a);
                sb6.append(", progress:");
                sb6.append(o3Var.f7510b);
                com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", sb6.toString());
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = o3Var.f7509a;
                if (finderObject != null) {
                    ir2.o oVar2 = ir2.o.this;
                    java.util.Iterator it = ((java.util.ArrayList) oVar2.f294196o).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((java.lang.Number) obj).longValue() == finderObject.getId()) {
                            break;
                        }
                    }
                    if (obj == null) {
                        ((java.util.ArrayList) oVar2.f294196o).add(java.lang.Long.valueOf(finderObject.getId()));
                        oVar2.f294188d.Q6(oVar2.e(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0)), 0, true);
                    }
                }
                return true;
            }
        };
    }

    public static final void c(ir2.o oVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        oVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(-1);
        arrayList.addAll(new java.util.ArrayList());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue >= 0) {
                bu2.e0.f24498a.m(baseFinderFeed.getItemId(), intValue, baseFinderFeed.getFeedObject().getFeedObject());
            }
        }
    }

    public static /* synthetic */ void g(ir2.o oVar, int i17, int i18, java.lang.Object obj, so2.j5 j5Var, int i19, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i19 & 4) != 0) {
            obj = null;
        }
        if ((i19 & 8) != 0) {
            j5Var = null;
        }
        oVar.f(i17, i18, obj, j5Var);
    }

    public static void i(ir2.o oVar, long j17, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateItem");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        oVar.getClass();
        com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(j17);
        if (f17 != null) {
            com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "updateItem localId:" + j17 + " itemLoadId:" + f17.getLocalId() + " itemId:" + f17.getId());
            com.tencent.mm.plugin.finder.model.BaseFinderFeed e17 = oVar.e(f17);
            if (lVar != null) {
                lVar.invoke(e17);
            }
            oVar.h(e17, true);
        }
    }

    public abstract void d(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent);

    public com.tencent.mm.plugin.finder.model.BaseFinderFeed e(com.tencent.mm.plugin.finder.storage.FinderItem feedObj) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        return cu2.u.f222441a.p(feedObj);
    }

    public final void f(int i17, int i18, java.lang.Object obj, so2.j5 j5Var) {
        ir2.a1 a1Var = this.f294188d;
        a1Var.getClass();
        pf5.e.launch$default(a1Var, null, null, new ir2.y0(i17, j5Var, obj, false, a1Var, null), 3, null);
    }

    public final void h(com.tencent.mm.plugin.finder.model.BaseFinderFeed newFeed, boolean z17) {
        kotlin.jvm.internal.o.g(newFeed, "newFeed");
        if (newFeed.getFeedObject().getLocalId() <= 0) {
            return;
        }
        this.f294188d.S6(new ir2.i(new ir2.m(newFeed, z17, this)));
    }

    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "onPostEnd :" + j17);
        i(this, j17, null, 2, null);
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
        i(this, j17, null, 2, null);
    }

    @Override // mv2.w0
    public void onPostNotify(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "onPostNotify :" + j17);
        i(this, j17, null, 2, null);
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "onPostOk :" + j17);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j18);
        if (h17 != null) {
            h17.setLocalId(j17);
        }
        if (h17 != null) {
            com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "updateItem localId:" + j17 + " itemLoadId:" + h17.getLocalId() + " itemId:" + h17.getId());
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(xc2.k0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            xc2.k0 k0Var = (xc2.k0) a17;
            java.util.List c17 = kz5.b0.c(h17);
            r45.qt2 qt2Var = this.f294190f;
            xc2.k0.f7(k0Var, c17, qt2Var != null ? qt2Var.getInteger(5) : 0, null, 0, null, null, 60, null);
            baseFinderFeed = e(h17);
            h(baseFinderFeed, true);
        } else {
            baseFinderFeed = null;
        }
        if (baseFinderFeed != null) {
            baseFinderFeed.j1(true);
        }
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
        com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "onPostStart :" + j17);
        com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(j17);
        ir2.a1 a1Var = this.f294188d;
        java.util.List list = a1Var.f294091d;
        if (f17 != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed e17 = e(f17);
            if (e17.getFeedObject().isMvFeed()) {
                return;
            }
            if (this.f294191g == 1 && e17.h() == 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "onPostStart localId " + j17 + " feed " + e17);
            e17.V1(hc2.s.b() ^ true);
            e17.X1(false);
            if (kz5.n0.Z(list) instanceof so2.i1) {
                pm0.v.X(new ir2.k(this, e17));
            } else {
                a1Var.Q6(e17, 0, true);
            }
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            xc2.k0 k0Var = (xc2.k0) a17;
            java.util.List c17 = kz5.b0.c(f17);
            r45.qt2 qt2Var = this.f294190f;
            xc2.k0.f7(k0Var, c17, qt2Var != null ? qt2Var.getInteger(5) : 0, null, 0, null, null, 60, null);
        }
    }
}
