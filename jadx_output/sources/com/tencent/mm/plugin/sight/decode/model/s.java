package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public abstract class s {
    public static final java.util.Map H;
    public int C;
    public com.tencent.mm.plugin.sight.decode.model.SightPlayController$ChattingUIStatusListener E;
    public volatile com.tencent.mm.plugin.sight.decode.model.k F;
    public volatile com.tencent.mm.plugin.sight.decode.model.l G;

    /* renamed from: b, reason: collision with root package name */
    public final int f162446b;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f162452h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f162453i;

    /* renamed from: k, reason: collision with root package name */
    public long f162455k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.ref.WeakReference f162456l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.animation.Animation f162457m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.sight.decode.model.n f162458n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.sight.decode.model.h f162459o;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.sight.decode.model.p f162460p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.sight.decode.model.i f162461q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.decode.model.r f162462r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.decode.model.j f162463s;

    /* renamed from: a, reason: collision with root package name */
    public int f162445a = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f162447c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f162448d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f162449e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Queue f162450f = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    public int f162451g = 41;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.decode.model.l f162464t = new com.tencent.mm.plugin.sight.decode.model.b(this);

    /* renamed from: u, reason: collision with root package name */
    public boolean f162465u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f162466v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f162467w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f162468x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f162469y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f162470z = true;
    public double A = -1.0d;
    public double B = -1.0d;
    public boolean D = false;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f162454j = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    static {
        new java.util.HashMap();
        H = new java.util.concurrent.ConcurrentHashMap();
    }

    public s(int i17, android.view.View view) {
        this.f162446b = 0;
        this.f162446b = i17;
        this.f162456l = new java.lang.ref.WeakReference(view);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", java.lang.Integer.valueOf(i17));
    }

    public static void a(com.tencent.mm.plugin.sight.decode.model.s sVar) {
        java.lang.ref.WeakReference weakReference = sVar.f162456l;
        if (weakReference == null || !sVar.f162465u || sVar.f162468x) {
            return;
        }
        if (sVar.f162457m == null && weakReference.get() != null) {
            sVar.f162457m = android.view.animation.AnimationUtils.loadAnimation(((android.view.View) weakReference.get()).getContext(), com.tencent.mm.R.anim.f477875dz);
        }
        if (sVar.f162463s == null) {
            sVar.f162463s = new com.tencent.mm.plugin.sight.decode.model.j(sVar, null);
        }
        sVar.f162454j.post(sVar.f162463s);
    }

    public static boolean b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) H).get(str);
        return num == null || 2 != num.intValue();
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f162449e), java.lang.Boolean.valueOf(h()));
        j(true);
        this.f162455k = 0L;
        e(this.f162450f);
        this.f162449e = -1;
        this.f162447c = "";
        this.f162448d = "ERROR#PATH";
        this.A = 0.0d;
        com.tencent.mm.memory.u.f68981d.n(this.f162452h);
        this.f162452h = null;
    }

    public void d(android.graphics.Bitmap bitmap) {
        wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.tencent.mm.plugin.sight.decode.model.r rVar = this.f162462r;
        ((vf0.y1) k1Var).getClass();
        t21.o2.bj(rVar);
        if (this.f162462r == null) {
            this.f162462r = new com.tencent.mm.plugin.sight.decode.model.r(this, null);
        }
        this.f162462r.f162443d = new java.lang.ref.WeakReference(bitmap);
        wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.tencent.mm.plugin.sight.decode.model.r rVar2 = this.f162462r;
        ((vf0.y1) k1Var2).getClass();
        t21.o2.aj(rVar2, 0L);
    }

    public final void e(java.util.Queue queue) {
        while (true) {
            java.lang.Integer num = (java.lang.Integer) queue.poll();
            if (num == null) {
                return;
            }
            int intValue = num.intValue();
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.d dVar = new com.tencent.mm.plugin.sight.decode.model.d(this, intValue);
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(dVar, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.sight.decode.model.SightPlayController$ChattingUIStatusListener] */
    public com.tencent.mm.sdk.event.IListener f() {
        if (this.E == null) {
            this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UIStatusChangedEvent>(this) { // from class: com.tencent.mm.plugin.sight.decode.model.SightPlayController$ChattingUIStatusListener

                /* renamed from: d, reason: collision with root package name */
                public int f162417d;

                /* renamed from: e, reason: collision with root package name */
                public int f162418e;

                /* renamed from: f, reason: collision with root package name */
                public int f162419f;

                /* renamed from: g, reason: collision with root package name */
                public final java.lang.ref.WeakReference f162420g;

                {
                    super(com.tencent.mm.app.a0.f53288d);
                    this.f162417d = 0;
                    this.f162418e = 0;
                    this.f162419f = 0;
                    this.f162420g = new java.lang.ref.WeakReference(this);
                    this.__eventId = 2023294236;
                }

                public boolean c() {
                    int i17;
                    java.lang.ref.WeakReference weakReference = this.f162420g;
                    return weakReference.get() != null && (i17 = ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).C + this.f162417d) >= this.f162418e && i17 <= this.f162419f;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent) {
                    com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent2 = uIStatusChangedEvent;
                    java.lang.ref.WeakReference weakReference = this.f162420g;
                    if (weakReference.get() != null) {
                        ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).hashCode();
                        int i17 = uIStatusChangedEvent2.f54907g.f7378a;
                        int i18 = ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).C;
                        am.mz mzVar = uIStatusChangedEvent2.f54907g;
                        int i19 = mzVar.f7379b;
                        boolean z17 = ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).D;
                        int i27 = mzVar.f7378a;
                        if (i27 != 0) {
                            if (i27 != 1) {
                                if (i27 == 3) {
                                    ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).c();
                                } else if (i27 == 5) {
                                    this.f162417d = mzVar.f7381d;
                                    this.f162418e = mzVar.f7379b;
                                    this.f162419f = mzVar.f7380c;
                                    if (!c() || ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).D) {
                                        ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).c();
                                    } else {
                                        if (!"ERROR#PATH".equals(((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162448d) && !((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162447c.equals(((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162448d)) {
                                            java.lang.String str = ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162447c;
                                            java.lang.String str2 = ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162448d;
                                            java.lang.String str3 = ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162448d == null ? "" : ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162448d;
                                            ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).c();
                                            ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162447c = str3;
                                            ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).f162448d = "ERROR#PATH";
                                        }
                                        ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).i();
                                    }
                                } else if (i27 == 6) {
                                    ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).D = true;
                                } else if (i27 == 7 && ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).D) {
                                    ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).D = false;
                                }
                            }
                            ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).j(false);
                        }
                        this.f162417d = mzVar.f7381d;
                        this.f162418e = mzVar.f7379b;
                        this.f162419f = mzVar.f7380c;
                        if (c() && !((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).D) {
                            ((com.tencent.mm.plugin.sight.decode.model.s) weakReference.get()).i();
                        }
                    }
                    return false;
                }
            };
        }
        return this.E;
    }

    public final boolean g() {
        if (!this.f162469y && this.f162445a >= 3) {
            this.f162445a = 0;
        }
        return false;
    }

    public boolean h() {
        return 1 == this.f162446b ? (this.f162459o == null || this.f162459o.f162427d) ? false : true : (this.f162461q == null || this.f162461q.f162430d || this.f162459o == null || this.f162459o.f162427d) ? false : true;
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f162466v), this.f162447c, java.lang.Integer.valueOf(this.f162449e));
        if (!this.f162466v) {
            c();
            return;
        }
        if (h()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", java.lang.Integer.valueOf(hashCode()), this.f162447c);
            return;
        }
        j(this.f162449e < 0);
        this.f162455k = 0L;
        g();
        if (this.f162449e < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", java.lang.Integer.valueOf(hashCode()), this.f162447c);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f162447c)) {
                return;
            }
            if (!b(this.f162447c)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                c();
                return;
            }
            this.f162458n = new com.tencent.mm.plugin.sight.decode.model.n(this, null);
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.n nVar = this.f162458n;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(nVar, 0L);
            return;
        }
        if (1 == this.f162446b) {
            this.f162459o = new com.tencent.mm.plugin.sight.decode.model.h(this, null);
            this.f162461q = null;
            wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.h hVar = this.f162459o;
            ((vf0.y1) k1Var2).getClass();
            t21.o2.aj(hVar, 0L);
            return;
        }
        this.f162459o = new com.tencent.mm.plugin.sight.decode.model.h(this, null);
        this.f162461q = new com.tencent.mm.plugin.sight.decode.model.i(this);
        this.f162459o.f162428e = this.f162461q;
        this.f162461q.f162431e = this.f162459o;
        wf0.k1 k1Var3 = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.tencent.mm.plugin.sight.decode.model.h hVar2 = this.f162459o;
        ((vf0.y1) k1Var3).getClass();
        t21.o2.aj(hVar2, 0L);
    }

    public void j(boolean z17) {
        if (this.f162458n != null) {
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.n nVar = this.f162458n;
            ((vf0.y1) k1Var).getClass();
            t21.o2.bj(nVar);
            this.f162458n.f162434d = true;
        }
        if (this.f162461q != null) {
            this.f162454j.removeCallbacks(this.f162461q);
            this.f162461q.f162430d = true;
        }
        if (this.f162459o != null) {
            wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.h hVar = this.f162459o;
            ((vf0.y1) k1Var2).getClass();
            t21.o2.bj(hVar);
            this.f162459o.f162427d = true;
        }
        if (this.f162460p != null) {
            this.f162460p.f162438e = z17 ? 0 : 2;
            wf0.k1 k1Var3 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.p pVar = this.f162460p;
            ((vf0.y1) k1Var3).getClass();
            t21.o2.aj(pVar, 0L);
        }
    }
}
