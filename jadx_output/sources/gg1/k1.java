package gg1;

/* loaded from: classes7.dex */
public final class k1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f271587k = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(gg1.k1.class, "currentSelectedDevice", "getCurrentSelectedDevice()Lcom/tencent/mm/plugin/appbrand/dlna/device/MRDevice;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public r56.e f271589b;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f271593f;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f271595h;

    /* renamed from: a, reason: collision with root package name */
    public final ku5.f f271588a = ((ku5.t0) ku5.t0.f312615d).p("MicroMsg.VideoCast.VideoCastDeviceManager");

    /* renamed from: c, reason: collision with root package name */
    public final b06.d f271590c = new gg1.h1(new x91.h(null), this);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f271591d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f271592e = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final a66.c f271594g = new a66.c();

    /* renamed from: i, reason: collision with root package name */
    public final gg1.e1 f271596i = new gg1.e1(this);

    /* renamed from: j, reason: collision with root package name */
    public final gg1.d1 f271597j = new gg1.d1(this);

    public final void a() {
        try {
            this.f271594g.d();
            this.f271592e.clear();
            this.f271591d.clear();
            x91.b b17 = x91.b.b();
            b17.f452630a = true;
            for (x91.h hVar : ((java.util.HashMap) b17.f452631b).values()) {
                hVar.h();
                hVar.i();
                hVar.f452654h = null;
            }
            b17.e(this.f271597j);
            b17.e(this.f271596i);
            if (kotlin.jvm.internal.o.b(x56.m.f452133f, this.f271589b)) {
                x56.m.f452133f = null;
                this.f271589b = null;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.VideoCast.VideoCastDeviceManager", "clearRxIOScheduler fail: scheduler instance is changed");
            }
            b17.a();
            try {
                int i17 = y91.i0.f460281h;
                y91.h0.f460277a.a();
            } catch (ba1.a unused) {
            }
            y91.n.f460302a.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "Error happen while cleaning up " + e17.getMessage());
        }
    }

    public final x91.h b() {
        return (x91.h) ((b06.b) this.f271590c).b(this, f271587k[0]);
    }

    public final void c() {
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        boolean z17 = com.tencent.mm.sdk.platformtools.a2.b(a17) && com.tencent.mm.sdk.platformtools.a2.b(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "searchDevice: selfIp = [%s], wifiIp = [%s], ipv6 = [%b]", a17, b17, java.lang.Boolean.valueOf(z17));
        this.f271594g.a(p56.l.b(new s56.k(p56.l.b(new s56.q(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, rx.schedulers.Schedulers.computation())).f352094d, new s56.g0(10))).c(ca1.a.a()).f(new gg1.f1(z17)));
    }

    public final boolean d() {
        if (x56.m.f452133f == null) {
            gg1.i1 i1Var = new gg1.i1(this);
            this.f271589b = i1Var;
            x56.m.f452133f = i1Var;
        }
        try {
            gg1.j1 j1Var = new gg1.j1();
            v91.b.f434151b = "MicroMsg.VideoCast.";
            v91.b.f434150a = j1Var;
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.b();
            y91.n.f460302a.b();
            return true;
        } catch (ba1.a e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "prepareAndSearchDevice: RouterException = " + e17.getMessage());
            return false;
        }
    }
}
