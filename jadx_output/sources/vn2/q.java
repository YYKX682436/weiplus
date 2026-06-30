package vn2;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438355a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f438356b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f438357c;

    /* renamed from: d, reason: collision with root package name */
    public long f438358d;

    /* renamed from: e, reason: collision with root package name */
    public long f438359e;

    /* renamed from: f, reason: collision with root package name */
    public long f438360f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f438361g;

    /* renamed from: h, reason: collision with root package name */
    public int f438362h;

    public q(java.lang.String finderContextId) {
        boolean z17;
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        this.f438355a = finderContextId;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        this.f438356b = z18;
        this.f438361g = "";
    }

    public final void a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        d("onStop " + this.f438361g);
        if (kotlin.jvm.internal.o.b(this.f438357c, activity)) {
            this.f438357c = null;
        }
    }

    public final void b() {
        this.f438358d = java.lang.System.currentTimeMillis();
        d("pageIn pageInEnterTimeMs=" + this.f438358d);
    }

    public final void c() {
        d("pageOut pageInEnterTimeMs=" + this.f438358d);
        java.lang.String str = this.f438361g;
        if (this.f438358d > 0) {
            r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f438358d;
            long j18 = currentTimeMillis - j17;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            p52.d[] dVarArr = p52.d.f352007d;
            ((q30.k) pVar).wi(new q52.e(Ri, str, j18, j17, currentTimeMillis2, null, null, 0, false, null, null, this.f438355a, true, 0, false, 0, 0, null, 255840, null));
            this.f438358d = 0L;
        }
    }

    public final void d(java.lang.String str) {
        if (this.f438356b) {
            com.tencent.mars.xlog.Log.i("MegaVideo19943Report_" + this.f438355a, str);
        }
    }

    public final void e() {
        this.f438359e = java.lang.System.currentTimeMillis();
        d("sessionIn sessionInEnterTimeMs=" + this.f438359e);
    }

    public final void f() {
        d("sessionOut sessionInEnterTimeMs=" + this.f438359e + ",activity=" + this.f438361g);
        java.lang.String str = this.f438361g;
        int i17 = this.f438362h;
        if (this.f438359e > 0) {
            this.f438360f = java.lang.System.currentTimeMillis();
            r30.p pVar = (r30.p) i95.n0.c(r30.p.class);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            long j17 = this.f438360f;
            long j18 = this.f438359e;
            p52.d[] dVarArr = p52.d.f352007d;
            ((q30.k) pVar).wi(new q52.e(Ri, str, j17 - j18, j18, j17, null, null, 1, false, null, null, this.f438355a, true, 0, false, 0, i17, null, 190304, null));
            this.f438359e = 0L;
            this.f438360f = 0L;
        }
    }
}
