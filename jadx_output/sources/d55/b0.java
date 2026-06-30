package d55;

/* loaded from: classes12.dex */
public abstract class b0 implements d55.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226564d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f226565e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f226566f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f226567g;

    /* renamed from: h, reason: collision with root package name */
    public final d55.b0 f226568h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f226569i;

    /* renamed from: m, reason: collision with root package name */
    public long f226570m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f226571n;

    /* renamed from: o, reason: collision with root package name */
    public d55.j f226572o;

    /* renamed from: p, reason: collision with root package name */
    public d55.j f226573p;

    /* renamed from: q, reason: collision with root package name */
    public d55.a0 f226574q;

    public b0(android.content.Context context) {
        java.lang.String str;
        android.content.pm.PackageInfo packageInfo;
        this.f226564d = context;
        this.f226565e = new android.os.Handler(android.os.Looper.getMainLooper());
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.RuntimeException e17) {
            d55.q0.a("MicroMsg.recovery.utils", "get version name fail", e17);
        }
        if (packageInfo != null) {
            str = packageInfo.versionName;
            this.f226571n = str;
            this.f226574q = null;
            d55.e eVar = new d55.e();
            eVar.f226553a = null;
            this.f226566f = new java.util.concurrent.atomic.AtomicReference(eVar);
            android.util.SparseArray sparseArray = new android.util.SparseArray(2);
            this.f226567g = sparseArray;
            sparseArray.put(1, new java.util.ArrayList());
            sparseArray.put(2, new java.util.ArrayList());
            android.content.Context context2 = this.f226564d;
            d55.v vVar = new d55.v(context2, "recovery_crash_count");
            vVar.a();
            d55.k kVar = new d55.k(vVar);
            d55.j jVar = new d55.j(kVar, new d55.v(context2, "recovery_crash"));
            kVar.f226597a = java.lang.Math.max(vVar.getInt("crash_count", 0), 0);
            this.f226573p = jVar;
        }
        str = null;
        this.f226571n = str;
        this.f226574q = null;
        d55.e eVar2 = new d55.e();
        eVar2.f226553a = null;
        this.f226566f = new java.util.concurrent.atomic.AtomicReference(eVar2);
        android.util.SparseArray sparseArray2 = new android.util.SparseArray(2);
        this.f226567g = sparseArray2;
        sparseArray2.put(1, new java.util.ArrayList());
        sparseArray2.put(2, new java.util.ArrayList());
        android.content.Context context22 = this.f226564d;
        d55.v vVar2 = new d55.v(context22, "recovery_crash_count");
        vVar2.a();
        d55.k kVar2 = new d55.k(vVar2);
        d55.j jVar2 = new d55.j(kVar2, new d55.v(context22, "recovery_crash"));
        kVar2.f226597a = java.lang.Math.max(vVar2.getInt("crash_count", 0), 0);
        this.f226573p = jVar2;
    }

    public void a() {
        b();
        android.content.Context context = this.f226564d;
        d55.j b17 = d55.j.b(context);
        b17.d();
        b17.e();
        d55.j c17 = d55.j.c(context);
        c17.d();
        c17.e();
    }

    public void b() {
        this.f226572o.d();
    }

    public void c() {
        d55.a0 a0Var = this.f226574q;
        android.content.Context context = this.f226564d;
        if (a0Var == null) {
            this.f226574q = new d55.a0(context);
            ((d55.a) ((d55.h) this.f226566f.get())).f226553a = this.f226574q;
        }
        if (this.f226573p == null) {
            d55.v vVar = new d55.v(context, "recovery_crash_count");
            vVar.a();
            d55.k kVar = new d55.k(vVar);
            d55.j jVar = new d55.j(kVar, new d55.v(context, "recovery_crash"));
            kVar.f226597a = java.lang.Math.max(vVar.getInt("crash_count", 0), 0);
            this.f226573p = jVar;
        }
        this.f226573p.a();
        if (this.f226572o == null) {
            d55.j jVar2 = this.f226573p;
            long j17 = jVar2.f226588a;
            java.lang.String str = jVar2.f226589b;
            d55.k kVar2 = jVar2.f226591d;
            this.f226572o = new d55.j(j17, str, new d55.k(kVar2.f226597a, kVar2.f226598b), jVar2.f226590c);
        }
    }

    public int d() {
        return this.f226573p.f226591d.f226597a;
    }

    public void e() {
        d55.j jVar = this.f226572o;
        jVar.f226591d.f226597a++;
        jVar.f226589b = this.f226571n;
        jVar.f226588a = this.f226570m;
    }

    public boolean f() {
        d55.o0.a(4, "MicroMsg.recovery.trigger", "onLaunchRecovery");
        try {
            ((d55.h) this.f226566f.get()).b(this.f226564d, this.f226572o);
            return true;
        } catch (java.lang.Throwable th6) {
            d55.q0.a("MicroMsg.recovery.trigger", "on launch recovery action error, mission aborted", th6);
            return false;
        }
    }

    public void g(int i17) {
        d55.o0.a(4, "MicroMsg.recovery.trigger", "recovery event, level = " + i17);
        java.util.Iterator it = ((java.util.List) this.f226567g.get(i17)).iterator();
        while (it.hasNext()) {
            try {
                ((d55.l) it.next()).a(this.f226564d, this.f226572o, i17);
            } catch (java.lang.Throwable th6) {
                d55.q0.a("MicroMsg.recovery.trigger", "recovery event error", th6);
            }
        }
    }

    public void h() {
        d55.o0.a(4, "MicroMsg.recovery.trigger", "#onTerminate");
        try {
            ((d55.h) this.f226566f.get()).a(this.f226564d, this.f226572o);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void i(boolean z17) {
        if (z17) {
            this.f226572o.e();
            return;
        }
        d55.j jVar = this.f226572o;
        d55.k kVar = jVar.f226591d;
        kVar.f226598b.putInt("crash_count", kVar.f226597a).d();
        jVar.f226590c.putString("crash_version", jVar.f226589b).putLong("crash_time", jVar.f226588a).d();
    }

    public b0(d55.b0 b0Var) {
        this.f226568h = b0Var;
        this.f226564d = b0Var.f226564d;
        this.f226565e = b0Var.f226565e;
        this.f226569i = b0Var.f226569i;
        this.f226571n = b0Var.f226571n;
        this.f226573p = b0Var.f226573p;
        this.f226574q = b0Var.f226574q;
        this.f226566f = b0Var.f226566f;
        this.f226567g = b0Var.f226567g;
    }
}
