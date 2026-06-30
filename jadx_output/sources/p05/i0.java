package p05;

/* loaded from: classes3.dex */
public final class i0 implements p05.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final p05.z0 f350540a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350541b;

    /* renamed from: c, reason: collision with root package name */
    public rh0.d0 f350542c;

    /* renamed from: d, reason: collision with root package name */
    public long f350543d;

    /* renamed from: e, reason: collision with root package name */
    public qu5.a f350544e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f350545f;

    /* renamed from: g, reason: collision with root package name */
    public p05.n0 f350546g;

    /* renamed from: h, reason: collision with root package name */
    public final p05.h0 f350547h;

    public i0(p05.z0 weVisionJsonCallbackBucket) {
        kotlin.jvm.internal.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.f350540a = weVisionJsonCallbackBucket;
        this.f350545f = new java.util.ArrayList();
        this.f350547h = new p05.h0(this);
    }

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f350541b && d0Var != null && ((p05.l4) d0Var).f350593f != this.f350543d) {
            com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "Cannot attach twice!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        sb6.append(tq5.i.f421269a);
        com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", sb6.toString());
        rh0.d0 d0Var2 = this.f350542c;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f350542c = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        p05.h0 c17 = this.f350547h;
        p05.z0 z0Var = this.f350540a;
        if (d0Var != null) {
            long j17 = ((p05.l4) d0Var).f350593f;
            this.f350543d = j17;
            if (j17 == 0) {
                return;
            }
            z0Var.getClass();
            kotlin.jvm.internal.o.g(c17, "c");
            z0Var.f350739a.add(c17);
            this.f350541b = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#destroy");
        z0Var.getClass();
        kotlin.jvm.internal.o.g(c17, "c");
        z0Var.f350739a.remove(c17);
        this.f350546g = null;
        this.f350544e = null;
        this.f350543d = 0L;
        this.f350541b = false;
    }

    public void c(p05.m0 m0Var, qu5.a aVar, p05.n0 n0Var) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        if (!this.f350541b) {
            com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "This effect is not attached!");
        }
        if (this.f350541b) {
            java.lang.String str3 = "";
            java.lang.String str4 = (m0Var == null || (str2 = m0Var.f350617c) == null) ? "" : str2;
            this.f350544e = aVar;
            com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#change path=".concat(str4));
            java.util.ArrayList arrayList = this.f350545f;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                p05.d0 d0Var = (p05.d0) it.next();
                rh0.d0 d0Var2 = this.f350542c;
                if (d0Var2 != null) {
                    ((p05.l4) d0Var2).t(d0Var.f350477a);
                }
                rh0.d0 d0Var3 = this.f350542c;
                if (d0Var3 != null) {
                    ((p05.l4) d0Var3).z(d0Var.f350477a, null);
                }
            }
            arrayList.clear();
            if (m0Var != null && (str = m0Var.f350616b) != null) {
                str3 = str;
            }
            boolean j17 = com.tencent.mm.vfs.w6.j(str3);
            if (m0Var != null) {
                if (!(str4.length() == 0)) {
                    if (!(m0Var.f350616b.length() == 0) && j17 && m0Var.f350615a > 0) {
                        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str4, false);
                        if (s17 != null) {
                            java.util.Iterator it6 = s17.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it6.next();
                                com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) next;
                                if (x1Var.f213236f && kotlin.jvm.internal.o.b(x1Var.f213232b, "Lua")) {
                                    obj = next;
                                    break;
                                }
                            }
                            obj = (com.tencent.mm.vfs.x1) obj;
                        }
                        if (obj != null) {
                            com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#change new way, data = " + m0Var);
                            rh0.d0 d0Var4 = this.f350542c;
                            long d17 = d0Var4 != null ? ((p05.l4) d0Var4).d(str4.concat("/Lua")) : -1L;
                            final p05.f0 f0Var = new p05.f0(java.lang.System.currentTimeMillis(), 100L, new p05.e0(this, d17, n0Var, str4, m0Var));
                            qu5.a aVar2 = this.f350544e;
                            if (aVar2 != null) {
                                aVar2.postDelayed(new java.lang.Runnable(f0Var) { // from class: p05.g0

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ yz5.a f350523d;

                                    {
                                        kotlin.jvm.internal.o.g(f0Var, "function");
                                        this.f350523d = f0Var;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f350523d.invoke();
                                    }
                                }, 100L);
                            } else {
                                com.tencent.mars.xlog.Log.e("FinderLive.FallingGiftEffect", "#glThread holy.. where is your threadHandler");
                            }
                            com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "#change ptr=" + d17);
                            return;
                        }
                        return;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "[change] return. " + m0Var);
        }
    }
}
