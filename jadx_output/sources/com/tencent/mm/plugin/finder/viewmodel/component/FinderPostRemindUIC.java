package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderPostRemindUIC extends com.tencent.mm.ui.component.UIComponent implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public int f133607d;

    /* renamed from: e, reason: collision with root package name */
    public so2.a2 f133608e;

    /* renamed from: f, reason: collision with root package name */
    public long f133609f;

    /* renamed from: g, reason: collision with root package name */
    public long f133610g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f133611h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f133612i;

    /* renamed from: m, reason: collision with root package name */
    public so2.r4 f133613m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.wu f133614n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1 f133615o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1 f133616p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1] */
    public FinderPostRemindUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133611h = new java.util.concurrent.ConcurrentHashMap();
        this.f133612i = new java.util.concurrent.ConcurrentHashMap();
        this.f133613m = so2.r4.f410575e;
        this.f133614n = new com.tencent.mm.plugin.finder.viewmodel.component.wu(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133615o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.this;
                long j17 = finderPostRemindUIC.f133609f;
                if (j17 <= 0) {
                    return true;
                }
                am.ga gaVar = event.f54250g;
                if (gaVar.f6749a != j17 || gaVar.f6750b <= 0) {
                    return true;
                }
                finderPostRemindUIC.f133612i.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(gaVar.f6750b));
                xm5.d.b(new com.tencent.mm.plugin.finder.viewmodel.component.vu(finderPostRemindUIC, event));
                return true;
            }
        };
        this.f133616p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.da daVar = event.f54247g;
                long j17 = daVar.f6438b;
                long j18 = daVar.f6437a;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.this;
                if (j17 == finderPostRemindUIC.f133609f || j18 == finderPostRemindUIC.f133610g) {
                    xm5.d.b(new com.tencent.mm.plugin.finder.viewmodel.component.uu(finderPostRemindUIC));
                }
                return true;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC, androidx.recyclerview.widget.RecyclerView recyclerView, sr2.u uVar) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        long j17 = 0;
        if (finderPostRemindUIC.f133609f <= 0) {
            com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[checkShowRemind] localId is zero, source:" + uVar);
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int w17 = linearLayoutManager.w();
        androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        if (s0Var != null && (baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i) != null) {
            j17 = baseFinderFeed.getItemId();
        }
        boolean z17 = j17 == finderPostRemindUIC.f133609f || j17 == finderPostRemindUIC.f133610g;
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[checkShowRemind] curPosition:" + w17 + " curShowState:" + finderPostRemindUIC.f133613m + " curFeedId:" + pm0.v.u(j17) + " localId:" + finderPostRemindUIC.f133609f + " source:" + uVar);
        if (z17 && finderPostRemindUIC.f133613m == so2.r4.f410574d) {
            finderPostRemindUIC.f133613m = so2.r4.f410575e;
            finderPostRemindUIC.R6(uVar);
        } else {
            if (z17 || finderPostRemindUIC.f133613m != so2.r4.f410575e) {
                return;
            }
            finderPostRemindUIC.f133613m = so2.r4.f410574d;
            finderPostRemindUIC.R6(uVar);
        }
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC) {
        so2.a2 a2Var = finderPostRemindUIC.f133608e;
        so2.u4 u4Var = a2Var != null ? a2Var.f410252i : null;
        if (u4Var != null) {
            u4Var.f410636a = so2.r4.f410575e;
        }
        finderPostRemindUIC.S6();
        finderPostRemindUIC.f133609f = 0L;
        finderPostRemindUIC.f133610g = 0L;
        finderPostRemindUIC.f133611h.remove(0L);
        finderPostRemindUIC.f133613m = so2.r4.f410575e;
    }

    public final void Q6(long j17, so2.v4 v4Var, long j18) {
        so2.u4 u4Var;
        so2.a2 a2Var = this.f133608e;
        if (a2Var != null && (u4Var = a2Var.f410252i) != null) {
            u4Var.f410637b = j17;
            kotlin.jvm.internal.o.g(v4Var, "<set-?>");
            u4Var.f410638c = v4Var;
            u4Var.f410640e = j18;
            java.lang.Integer num = (java.lang.Integer) this.f133612i.get(java.lang.Long.valueOf(j17));
            u4Var.f410639d = num == null ? 0 : num.intValue();
        }
        S6();
    }

    public final void R6(sr2.u uVar) {
        so2.u4 u4Var;
        so2.v4 v4Var = (so2.v4) this.f133611h.get(java.lang.Long.valueOf(this.f133609f));
        if (v4Var == null) {
            v4Var = so2.v4.f410671d;
        }
        so2.a2 a2Var = this.f133608e;
        if (a2Var != null && (u4Var = a2Var.f410252i) != null) {
            so2.r4 r4Var = this.f133613m;
            kotlin.jvm.internal.o.g(r4Var, "<set-?>");
            u4Var.f410636a = r4Var;
            long j17 = this.f133609f;
            u4Var.f410637b = j17;
            u4Var.f410638c = v4Var;
            java.lang.Integer num = (java.lang.Integer) this.f133612i.get(java.lang.Long.valueOf(j17));
            u4Var.f410639d = num == null ? 0 : num.intValue();
            kotlin.jvm.internal.o.g(uVar, "<set-?>");
            u4Var.f410641f = uVar;
        }
        S6();
    }

    public final void S6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(this.f133607d);
        if (U6 == null) {
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[notifyUpdate] result:" + ((com.tencent.mm.plugin.finder.viewmodel.component.d1) a17).Q6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.a(this);
        alive();
        alive();
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[onCreate]");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.t(this);
        dead();
        dead();
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[onDestroy]");
    }

    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
        so2.v4 v4Var = so2.v4.f410675h;
        this.f133611h.put(java.lang.Long.valueOf(j17), v4Var);
        Q6(j17, v4Var, 0L);
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[onPostEnd] localId:" + j17);
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
        this.f133610g = j18;
        so2.v4 v4Var = so2.v4.f410674g;
        this.f133611h.put(java.lang.Long.valueOf(j17), v4Var);
        Q6(j17, v4Var, j18);
        sr2.t tVar = sr2.t.f411718d;
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        pm0.v.V(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.L).getValue()).r()).longValue() * 1000, new com.tencent.mm.plugin.finder.viewmodel.component.tu(this));
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[onPostOk] localId:" + j17 + " svrId:" + pm0.v.u(this.f133610g));
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f133611h;
        so2.v4 v4Var = (so2.v4) concurrentHashMap.get(valueOf);
        if (v4Var == null) {
            v4Var = so2.v4.f410671d;
        }
        if (v4Var == so2.v4.f410671d) {
            this.f133609f = j17;
            concurrentHashMap.put(java.lang.Long.valueOf(j17), so2.v4.f410672e);
        }
        com.tencent.mars.xlog.Log.i("FinderPostRemindUIC", "[onPostStart] localId:" + j17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1] */
    public FinderPostRemindUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f133611h = new java.util.concurrent.ConcurrentHashMap();
        this.f133612i = new java.util.concurrent.ConcurrentHashMap();
        this.f133613m = so2.r4.f410575e;
        this.f133614n = new com.tencent.mm.plugin.finder.viewmodel.component.wu(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133615o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.this;
                long j17 = finderPostRemindUIC.f133609f;
                if (j17 <= 0) {
                    return true;
                }
                am.ga gaVar = event.f54250g;
                if (gaVar.f6749a != j17 || gaVar.f6750b <= 0) {
                    return true;
                }
                finderPostRemindUIC.f133612i.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(gaVar.f6750b));
                xm5.d.b(new com.tencent.mm.plugin.finder.viewmodel.component.vu(finderPostRemindUIC, event));
                return true;
            }
        };
        this.f133616p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.da daVar = event.f54247g;
                long j17 = daVar.f6438b;
                long j18 = daVar.f6437a;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.this;
                if (j17 == finderPostRemindUIC.f133609f || j18 == finderPostRemindUIC.f133610g) {
                    xm5.d.b(new com.tencent.mm.plugin.finder.viewmodel.component.uu(finderPostRemindUIC));
                }
                return true;
            }
        };
    }
}
