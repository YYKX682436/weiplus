package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f115679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115680b;

    /* renamed from: c, reason: collision with root package name */
    public final long f115681c;

    /* renamed from: d, reason: collision with root package name */
    public final long f115682d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.finder.live.util.n f115683e;

    /* renamed from: f, reason: collision with root package name */
    public volatile dk2.g f115684f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f115685g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f115686h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f115687i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f115688j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f115689k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.util.m f115690l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115691m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.view.View f115692n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.r2 f115693o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnTouchListener f115694p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.o f115695q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f115696r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f115697s;

    public t() {
        int i17 = dk2.ef.P;
        this.f115679a = i17 <= 0 ? 5 : i17;
        int i18 = dk2.ef.Q;
        this.f115680b = i18 <= 0 ? 1000 : i18;
        this.f115681c = 500L;
        this.f115682d = 100L;
        this.f115683e = com.tencent.mm.plugin.finder.live.util.n.f115631d;
        this.f115684f = new dk2.g(0L);
        this.f115688j = true;
        this.f115691m = true;
        this.f115693o = new com.tencent.mm.plugin.finder.live.util.r2();
        this.f115694p = new com.tencent.mm.plugin.finder.live.util.s(this);
        this.f115695q = new com.tencent.mm.plugin.finder.live.util.o(this);
        this.f115696r = new com.tencent.mm.sdk.platformtools.b4("ContinuousClickManager::Timer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.util.r(this), true);
        this.f115697s = new com.tencent.mm.sdk.platformtools.b4("ContinuousClickManager::longClickTimer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.util.q(this), true);
    }

    public static final /* synthetic */ java.lang.String a(com.tencent.mm.plugin.finder.live.util.t tVar) {
        tVar.getClass();
        return "Finder.ContinuousClickManager";
    }

    public final void b() {
        pm0.v.C(this.f115695q);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f115697s;
        b4Var.d();
        com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "cancelLongClickState: longClickTimer.stopped = " + b4Var.e());
    }

    public final void c() {
        int i17 = this.f115685g - this.f115686h;
        if (i17 >= this.f115679a) {
            com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "checkComboBatchSize: clickCnt = " + this.f115685g + ", lastClickCnt = " + this.f115686h);
            this.f115686h = this.f115685g;
            com.tencent.mm.plugin.finder.live.util.m mVar = this.f115690l;
            if (mVar != null) {
                com.tencent.mm.plugin.finder.live.util.m.b(mVar, this.f115692n, this.f115685g, i17, this.f115683e, this.f115684f, false, false, 96, null);
            }
            com.tencent.mm.plugin.finder.live.util.r2 r2Var = this.f115693o;
            r2Var.a("checkComboBatchSize", i17, r2Var.b(true));
            if (this.f115696r.e()) {
                return;
            }
            this.f115696r.d();
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f115696r;
            long j17 = this.f115680b;
            b4Var.c(j17, j17);
        }
    }

    public final void d(android.view.View view) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        if (this.f115692n == null) {
            com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "unRegisterView view null");
            return;
        }
        if (!kotlin.jvm.internal.o.b(this.f115692n, view)) {
            com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "unRegisterView view not eqauls");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "unRegisterView view: " + view);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null && (liveMutableData = ((je2.t) eVar.a(je2.t.class)).f299270p) != null) {
            android.view.View view2 = this.f115692n;
            liveMutableData.postValue(java.lang.Integer.valueOf(view2 != null ? view2.hashCode() : 0));
        }
        android.view.View view3 = this.f115692n;
        if (view3 != null) {
            view3.setOnTouchListener(null);
        }
        this.f115692n = null;
        this.f115696r.d();
        b();
        int i17 = this.f115685g - this.f115686h;
        if (i17 > 0) {
            com.tencent.mm.plugin.finder.live.util.m mVar = this.f115690l;
            if (mVar != null) {
                ((com.tencent.mm.plugin.finder.live.plugin.ep) mVar).c(this.f115692n, this.f115685g, i17, this.f115683e, this.f115684f, true, this.f115689k);
            }
            com.tencent.mm.plugin.finder.live.util.r2 r2Var = this.f115693o;
            r2Var.a("unRegisterView", i17, r2Var.b(false));
        }
        this.f115689k = false;
        this.f115690l = null;
        e(com.tencent.mm.plugin.finder.live.util.n.f115631d);
        this.f115688j = true;
    }

    public final void e(com.tencent.mm.plugin.finder.live.util.n nVar) {
        com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "updateState: newState = " + nVar);
        this.f115683e = nVar;
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            this.f115685g = 0;
            this.f115686h = 0;
            com.tencent.mm.plugin.finder.live.util.r2 r2Var = this.f115693o;
            synchronized (r2Var.f115668a) {
                r2Var.f115668a.clear();
            }
            this.f115684f = new dk2.g(0L);
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            this.f115685g++;
            this.f115693o.c(this.f115684f, 1);
            int i17 = this.f115685g - this.f115686h;
            com.tencent.mm.plugin.finder.live.util.m mVar = this.f115690l;
            if (mVar != null) {
                com.tencent.mm.plugin.finder.live.util.m.a(mVar, this.f115692n, this.f115685g, nVar, this.f115684f, i17, false, 32, null);
            }
            this.f115693o.a(java.lang.String.valueOf(nVar), i17, this.f115693o.b(false));
            c();
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.f115685g++;
        this.f115693o.c(this.f115684f, 1);
        int i18 = this.f115685g - this.f115686h;
        com.tencent.mm.plugin.finder.live.util.m mVar2 = this.f115690l;
        if (mVar2 != null) {
            com.tencent.mm.plugin.finder.live.util.m.a(mVar2, this.f115692n, this.f115685g, nVar, this.f115684f, i18, false, 32, null);
        }
        this.f115693o.a(java.lang.String.valueOf(nVar), i18, this.f115693o.b(false));
        c();
    }
}
