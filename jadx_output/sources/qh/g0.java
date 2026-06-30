package qh;

/* loaded from: classes12.dex */
public final class g0 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f363350b;

    /* renamed from: c, reason: collision with root package name */
    public long f363351c;

    /* renamed from: d, reason: collision with root package name */
    public long f363352d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f363353e;

    public g0() {
        super(true);
        this.f363353e = "Matrix.battery.ChargeStats#" + hashCode();
    }

    @Override // ph.f, ph.g
    public boolean g(ph.c batteryState, boolean z17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        boolean z18 = this.f363350b;
        java.lang.String str = this.f363353e;
        if (z17 != z18) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (z17) {
                oj.j.c(str, "onChargingChanged: " + z17 + ", start collect", new java.lang.Object[0]);
                this.f363351c = currentTimeMillis;
            } else {
                long j17 = this.f363351c;
                if (1 <= j17 && currentTimeMillis > j17) {
                    long j18 = currentTimeMillis - j17;
                    oj.j.c(str, "onChargingChanged: " + z17 + " +" + j18 + "ms", new java.lang.Object[0]);
                    this.f363352d = this.f363352d + j18;
                } else {
                    oj.j.c(str, "onChargingChanged: " + z17 + " +$0ms, last=" + wh.m.c(this.f363351c, null, 2, null) + ", curr=" + wh.m.c(currentTimeMillis, null, 2, null), new java.lang.Object[0]);
                }
                this.f363351c = 0L;
            }
            this.f363350b = z17;
        } else {
            oj.j.f(str, "repeat status: " + z17, new java.lang.Object[0]);
        }
        return !this.f354263a;
    }

    public final void h() {
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                r2 = ph.t.f354283k != null;
            }
        }
        if (!r2) {
            throw new java.lang.RuntimeException("BatteryEventDelegate is not initialized");
        }
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        tVar.p(this);
        oj.j.c(this.f363353e, "finish", new java.lang.Object[0]);
    }

    public final void i() {
        ph.e eVar = ph.t.f354285m;
        if (!eVar.b()) {
            throw new java.lang.RuntimeException("BatteryEventDelegate is not initialized");
        }
        boolean d17 = eVar.a().c().d();
        this.f363350b = d17;
        this.f363351c = d17 ? java.lang.System.currentTimeMillis() : 0L;
        eVar.a().b(this);
        oj.j.c(this.f363353e, "start: sticky=" + this.f363350b, new java.lang.Object[0]);
    }

    public final int j(long j17, int i17) {
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("durationMs must > 0");
        }
        int b17 = a06.d.b((((float) this.f363352d) * 100.0f) / ((float) j17));
        java.lang.String str = this.f363353e;
        oj.j.c(str, "correctify charging ratio: " + i17 + ">>" + b17, new java.lang.Object[0]);
        if (b17 < i17 || b17 < 0 || 100 < b17) {
            oj.j.f(str, "collectedMs=" + this.f363352d + ", durationMs=" + j17, new java.lang.Object[0]);
        }
        return b17 < i17 ? i17 : b17;
    }
}
