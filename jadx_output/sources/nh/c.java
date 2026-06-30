package nh;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f337067d = jz5.h.a(jz5.i.f302829d, nh.a.f337065d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f337069b;

    /* renamed from: c, reason: collision with root package name */
    public rh.c1 f337070c;

    public c(java.lang.String module) {
        kotlin.jvm.internal.o.g(module, "module");
        this.f337068a = module;
        int andIncrement = ((java.util.concurrent.atomic.AtomicInteger) f337067d.getValue()).getAndIncrement();
        this.f337069b = andIncrement;
        com.tencent.mars.xlog.Log.i("FinderPowerProfiler", "new: " + module + '@' + andIncrement);
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel: ");
        sb6.append(this.f337068a);
        sb6.append('@');
        sb6.append(this.f337069b);
        sb6.append(", hashcode=");
        rh.c1 c1Var = this.f337070c;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderPowerProfiler", sb6.toString());
        if (gi.d.e() != null) {
            synchronized (this) {
                rh.c1 c1Var2 = this.f337070c;
                if (c1Var2 != null) {
                    c1Var2.a();
                }
            }
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear: ");
        sb6.append(this.f337068a);
        sb6.append('@');
        sb6.append(this.f337069b);
        sb6.append(", hashcode=");
        rh.c1 c1Var = this.f337070c;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderPowerProfiler", sb6.toString());
        if (gi.d.e() != null) {
            synchronized (this) {
                rh.c1 c1Var2 = this.f337070c;
                if (c1Var2 != null) {
                    c1Var2.b();
                }
            }
        }
    }

    public final rh.c1 c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish: ");
        sb6.append(this.f337068a);
        sb6.append('@');
        sb6.append(this.f337069b);
        sb6.append(", hashcode=");
        rh.c1 c1Var = this.f337070c;
        rh.c1 c1Var2 = null;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderPowerProfiler", sb6.toString());
        if (gi.d.e() == null) {
            return null;
        }
        synchronized (this) {
            rh.c1 c1Var3 = this.f337070c;
            if (c1Var3 != null) {
                c1Var3.l();
                c1Var2 = c1Var3;
            }
        }
        return c1Var2;
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("FinderPowerProfiler", "start: " + this.f337068a + '@' + this.f337069b);
        if (gi.d.e() != null) {
            synchronized (this) {
                ph.u e17 = gi.d.e();
                rh.c1 c1Var = e17 != null ? new nh.b(this, e17.f354296h).f272021a : null;
                this.f337070c = c1Var;
                if (c1Var != null) {
                    c1Var.I();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCompositors: ");
                sb6.append(this.f337068a);
                sb6.append('@');
                sb6.append(this.f337069b);
                sb6.append(", hashcode=");
                rh.c1 c1Var2 = this.f337070c;
                sb6.append(c1Var2 != null ? java.lang.Integer.valueOf(c1Var2.hashCode()) : null);
                com.tencent.mars.xlog.Log.i("FinderPowerProfiler", sb6.toString());
            }
        }
    }
}
