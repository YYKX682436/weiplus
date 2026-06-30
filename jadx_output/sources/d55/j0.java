package d55;

/* loaded from: classes12.dex */
public class j0 extends d55.b0 {

    /* renamed from: r, reason: collision with root package name */
    public int f226592r;

    /* renamed from: s, reason: collision with root package name */
    public d55.h0 f226593s;

    /* renamed from: t, reason: collision with root package name */
    public long f226594t;

    /* renamed from: u, reason: collision with root package name */
    public long f226595u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f226596v;

    public j0(android.content.Context context) {
        super(context);
        this.f226592r = 2;
        this.f226594t = 0L;
        this.f226595u = 0L;
        this.f226596v = true;
    }

    @Override // d55.b0
    public boolean f() {
        boolean f17 = super.f();
        if (!f17) {
            return f17;
        }
        d55.w wVar = new d55.w(this.f226564d, "recovery_statistic");
        wVar.e();
        wVar.getInt("crash_count", 0);
        wVar.getBoolean("launch_recovery", false);
        boolean z17 = wVar.getBoolean("launch_recovery_real", false);
        boolean z18 = wVar.getBoolean("recover_from_crash", false);
        int i17 = wVar.getInt("recovery_status", -1);
        wVar.getInt("recovery_from", 0);
        int i18 = wVar.getInt("recover_internal_status", 0);
        int i19 = wVar.getInt("recover_launch_mode", 0);
        wVar.getLong("recover_running_time", 0L);
        wVar.getBoolean("recover_is_discard", false);
        java.lang.String string = wVar.getString("recover_app_ver", "");
        int i27 = this.f226572o.f226591d.f226597a;
        int i28 = this.f226592r;
        long max = java.lang.Math.max(this.f226595u, 0L);
        wVar.g("crash_count", i27);
        wVar.putBoolean("launch_recovery", true);
        wVar.putBoolean("launch_recovery_real", z17);
        wVar.putBoolean("recover_from_crash", z18);
        wVar.putInt("recovery_status", i17);
        wVar.putInt("recovery_from", i28);
        wVar.putInt("recover_internal_status", i18);
        wVar.putInt("recover_launch_mode", i19);
        wVar.putLong("recover_running_time", max);
        wVar.putBoolean("recover_is_discard", false);
        wVar.putString("recover_app_ver", string);
        wVar.c();
        return f17;
    }

    public void j(int i17) {
        int i18;
        boolean z17;
        this.f226570m = java.lang.System.currentTimeMillis();
        c();
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "#begin");
        this.f226592r = i17;
        long j17 = this.f226594t;
        if (j17 > 0) {
            this.f226595u = this.f226570m - j17;
        }
        long j18 = this.f226595u;
        if (j18 <= 0) {
            j18 = this.f226570m - this.f226573p.f226588a;
        }
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "recovery interval = " + j18);
        long j19 = this.f226574q.f226559e;
        boolean z18 = this.f226596v;
        if (j19 > 0 && j18 < j19) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "too fast, skip and do nothing, min = " + j19);
            if (z18) {
                d55.o0.a(4, "MicroMsg.recovery.signalHandler", "try fallback trigger");
                d55.i0 i0Var = new d55.i0(this);
                i0Var.f226594t = this.f226594t;
                i0Var.j(this.f226592r);
                return;
            }
            return;
        }
        d55.b0 b0Var = this.f226568h;
        if (b0Var instanceof d55.g0) {
            ((d55.g0) b0Var).f226584s.set(true);
        }
        if (!android.text.TextUtils.isEmpty(this.f226573p.f226589b) && !this.f226573p.f226589b.equals(this.f226571n)) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "version code mismatch, skip");
            b();
        }
        d55.a0 a0Var = this.f226574q;
        if (j18 < a0Var.f226557c) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "within interval, inc");
            e();
        } else {
            long j27 = a0Var.f226558d;
            if (j18 >= j27 || this.f226593s == null) {
                d55.o0.a(4, "MicroMsg.recovery.signalHandler", "over signal interval, clear point");
                b();
                e();
            } else {
                d55.o0.a(4, "MicroMsg.recovery.signalHandler", "within signal interval");
                if (j18 >= j27) {
                    i18 = 0;
                } else {
                    float f17 = (float) j18;
                    float f18 = (float) j27;
                    i18 = f17 >= 0.75f * f18 ? 25 : f17 >= 0.5f * f18 ? 50 : f17 >= f18 * 0.25f ? 75 : 100;
                }
                d55.h0 h0Var = this.f226593s;
                int i19 = h0Var.f226586a + i18;
                h0Var.f226586a = i19;
                if (i19 >= 100) {
                    h0Var.f226586a = 0;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    d55.o0.a(4, "MicroMsg.recovery.signalHandler", "acc meet, inc");
                    e();
                }
                d55.w wVar = (d55.w) this.f226593s.f226587b;
                wVar.g("acc_total", r1.f226586a);
                wVar.h();
            }
        }
        int i27 = this.f226572o.f226591d.f226597a;
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "recovery crashCount = " + i27);
        if (i27 >= this.f226574q.f226555a) {
            if (!f()) {
                d55.o0.a(5, "MicroMsg.recovery.signalHandler", "launch recovery fail");
                i(true);
                return;
            }
            if (i27 < this.f226574q.f226556b) {
                g(1);
            } else {
                g(2);
                a();
            }
            i(true);
            h();
            return;
        }
        i(true);
        if (z18) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandler", "try fallback trigger");
            d55.i0 i0Var2 = new d55.i0(this);
            i0Var2.f226594t = this.f226594t;
            i0Var2.j(this.f226592r);
        }
        d55.o0.a(4, "MicroMsg.recovery.signalHandler", "onLaunchNormal");
        if (this.f226572o.f226591d.f226597a >= 1) {
            d55.w wVar2 = new d55.w(this.f226564d, "recovery_statistic");
            wVar2.e();
            wVar2.getInt("crash_count", 0);
            wVar2.getBoolean("launch_recovery", false);
            boolean z19 = wVar2.getBoolean("launch_recovery_real", false);
            boolean z27 = wVar2.getBoolean("recover_from_crash", false);
            int i28 = wVar2.getInt("recovery_status", -1);
            wVar2.getInt("recovery_from", 0);
            int i29 = wVar2.getInt("recover_internal_status", 0);
            int i37 = wVar2.getInt("recover_launch_mode", 0);
            wVar2.getLong("recover_running_time", 0L);
            wVar2.getBoolean("recover_is_discard", false);
            java.lang.String string = wVar2.getString("recover_app_ver", "");
            int i38 = this.f226572o.f226591d.f226597a;
            int i39 = this.f226592r;
            long max = java.lang.Math.max(this.f226595u, 0L);
            wVar2.g("crash_count", i38);
            wVar2.putBoolean("launch_recovery", false);
            wVar2.putBoolean("launch_recovery_real", z19);
            wVar2.putBoolean("recover_from_crash", z27);
            wVar2.g("recovery_status", i28);
            wVar2.g("recovery_from", i39);
            wVar2.g("recover_internal_status", i29);
            wVar2.g("recover_launch_mode", i37);
            wVar2.g("recover_running_time", max);
            wVar2.putBoolean("recover_is_discard", false);
            wVar2.putString("recover_app_ver", string);
            wVar2.h();
        }
    }

    public j0(d55.b0 b0Var) {
        super(b0Var);
        this.f226592r = 2;
        this.f226594t = 0L;
        this.f226595u = 0L;
        this.f226596v = true;
    }
}
