package p05;

/* loaded from: classes10.dex */
public final class d2 implements p05.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final p05.z0 f350486a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350487b;

    /* renamed from: c, reason: collision with root package name */
    public rh0.d0 f350488c;

    /* renamed from: d, reason: collision with root package name */
    public long f350489d;

    /* renamed from: e, reason: collision with root package name */
    public qu5.a f350490e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f350491f;

    /* renamed from: g, reason: collision with root package name */
    public p05.x0 f350492g;

    /* renamed from: h, reason: collision with root package name */
    public int f350493h;

    /* renamed from: i, reason: collision with root package name */
    public final p05.c2 f350494i;

    public d2(p05.z0 weVisionJsonCallbackBucket) {
        kotlin.jvm.internal.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.f350486a = weVisionJsonCallbackBucket;
        this.f350491f = new java.util.ArrayList();
        this.f350493h = 1;
        this.f350494i = new p05.c2(this);
    }

    public static final void c(p05.d2 d2Var, p05.s1 s1Var) {
        java.util.ArrayList arrayList = d2Var.f350491f;
        arrayList.add(s1Var);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#addToWorkingSet size=" + arrayList.size() + ' ' + s1Var);
    }

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f350487b && d0Var != null && ((p05.l4) d0Var).f350593f != this.f350489d) {
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "Cannot attach twice!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        sb6.append(tq5.i.f421269a);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", sb6.toString());
        rh0.d0 d0Var2 = this.f350488c;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f350488c = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        p05.c2 c17 = this.f350494i;
        p05.z0 z0Var = this.f350486a;
        if (d0Var != null) {
            long j17 = ((p05.l4) d0Var).f350593f;
            this.f350489d = j17;
            if (j17 == 0) {
                return;
            }
            z0Var.getClass();
            kotlin.jvm.internal.o.g(c17, "c");
            z0Var.f350739a.add(c17);
            this.f350487b = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#destroy");
        z0Var.getClass();
        kotlin.jvm.internal.o.g(c17, "c");
        z0Var.f350739a.remove(c17);
        this.f350490e = null;
        this.f350492g = null;
        this.f350489d = 0L;
        this.f350487b = false;
    }

    public void d(p05.w0 res, qu5.a threadHandler, p05.x0 x0Var) {
        kotlin.jvm.internal.o.g(res, "res");
        kotlin.jvm.internal.o.g(threadHandler, "threadHandler");
        this.f350490e = threadHandler;
        if (x0Var != null) {
            ((tf2.g) x0Var).f418920a = new p05.t1(this);
        } else {
            x0Var = null;
        }
        this.f350492g = x0Var;
        if (res.f350720e.length == 4 && res.f350719d.length == 2) {
            if (!(res.f350717b.length() == 0)) {
                if (!(res.f350716a.length() == 0)) {
                    if (res.f350718c >= 0) {
                        e(100L, new p05.x1(res, this));
                        return;
                    } else {
                        e(100L, new p05.z1(res, this));
                        return;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#append bad data");
    }

    public final void e(long j17, yz5.a aVar) {
        final p05.u1 u1Var = new p05.u1(java.lang.System.currentTimeMillis(), j17, aVar);
        qu5.a aVar2 = this.f350490e;
        if (aVar2 != null) {
            aVar2.postDelayed(new java.lang.Runnable(u1Var) { // from class: p05.a2

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f350438d;

                {
                    kotlin.jvm.internal.o.g(u1Var, "function");
                    this.f350438d = u1Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f350438d.invoke();
                }
            }, j17);
        } else {
            com.tencent.mars.xlog.Log.e("FinderLivePkGiftEffect", "#glThread holy.. where is your threadHandler");
        }
    }
}
