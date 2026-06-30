package e04;

/* loaded from: classes15.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public long f245966a;

    /* renamed from: b, reason: collision with root package name */
    public long f245967b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f245968c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f245969d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245970e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f245971f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f245973h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245974i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f245976k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f245977l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245978m;

    /* renamed from: n, reason: collision with root package name */
    public long f245979n;

    /* renamed from: o, reason: collision with root package name */
    public long f245980o;

    /* renamed from: p, reason: collision with root package name */
    public long f245981p;

    /* renamed from: q, reason: collision with root package name */
    public long f245982q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f245983r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f245984s;

    /* renamed from: t, reason: collision with root package name */
    public long f245985t;

    /* renamed from: g, reason: collision with root package name */
    public int f245972g = -1;

    /* renamed from: j, reason: collision with root package name */
    public e04.k2 f245975j = e04.k2.f246000e;

    /* renamed from: u, reason: collision with root package name */
    public e04.i1 f245986u = e04.i1.f245957e;

    public final int a(e04.g1 g1Var, e04.h1 h1Var, boolean z17) {
        if (!z17) {
            return 1;
        }
        java.lang.Boolean bool = g1Var.f245917a;
        if (bool == null) {
            return 11;
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (kotlin.jvm.internal.o.b(bool, bool2)) {
            return 12;
        }
        if (!g1Var.f245924h) {
            return 14;
        }
        if (g1Var.f245919c || !g1Var.f245943i) {
            return 13;
        }
        qt5.d dVar = g1Var.f245944j;
        if (dVar != null) {
            if (!(dVar != null && dVar.f366677a == 0)) {
                return 13;
            }
        }
        java.lang.Boolean bool3 = h1Var.f245917a;
        if (bool3 == null) {
            return 21;
        }
        if (kotlin.jvm.internal.o.b(bool3, bool2)) {
            return 22;
        }
        if (!h1Var.f245924h) {
            return 24;
        }
        if (h1Var.f245919c || !h1Var.f245949i) {
            return 23;
        }
        qt5.d dVar2 = h1Var.f245950j;
        if (dVar2 != null) {
            if (!(dVar2 != null && dVar2.f366677a == 0)) {
                return 23;
            }
        }
        if (this.f245977l) {
            return !this.f245978m ? 32 : 0;
        }
        return 31;
    }

    public final void b() {
        this.f245968c = false;
        this.f245970e = false;
        this.f245971f = false;
        this.f245972g = -1;
        this.f245973h = null;
        this.f245974i = false;
        this.f245975j = e04.k2.f246000e;
        this.f245976k = false;
        this.f245979n = 0L;
        this.f245977l = false;
        this.f245978m = false;
        this.f245980o = 0L;
        this.f245981p = 0L;
        this.f245982q = 0L;
        this.f245983r = false;
        this.f245984s = false;
        this.f245985t = 0L;
        this.f245986u = e04.i1.f245957e;
    }

    public final void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraReporter", "setCameraFacing: " + i17 + ", isBackCamera: " + z17);
        this.f245972g = i17;
        this.f245973h = java.lang.Boolean.valueOf(z17);
    }

    public final void d(boolean z17, e04.k2 retryReason) {
        kotlin.jvm.internal.o.g(retryReason, "retryReason");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraReporter", "setRetryOpenCamera: " + z17 + ", " + retryReason);
        this.f245974i = z17;
        this.f245975j = retryReason;
    }
}
