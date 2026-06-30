package ju5;

/* loaded from: classes15.dex */
public class n0 extends ju5.f {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f302129g;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f302130c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f302131d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f302132e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f302133f;

    static {
        zt5.l.a(wt5.a.b().getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
        f302129g = "soter_triggered_oom_count" + zt5.l.a(wt5.a.b().getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
    }

    public n0(android.content.Context context, ju5.h hVar) {
        boolean z17 = false;
        this.f302130c = false;
        this.f302131d = "";
        this.f302132e = "";
        ju5.l0 l0Var = new ju5.l0(this);
        zt5.d dVar = hVar.f302094c;
        if (dVar != null) {
            zt5.h.f475601a = dVar;
        }
        zt5.e eVar = hVar.f302095d;
        if (eVar != null) {
            zt5.i.f475602a = eVar;
        }
        fu5.d b17 = fu5.d.b();
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("soter_status", 0);
        b17.getClass();
        synchronized (fu5.d.class) {
            b17.f266915d = sharedPreferences;
        }
        zt5.o.f475608a = l0Var;
        if (wt5.a.f449537c == null) {
            zt5.h.c("Soter.SoterCore", "soter: SoterCore IMPL is null then call getProviderSoterCore to init", new java.lang.Object[0]);
            au5.b f17 = wt5.a.f();
            wt5.a.f449537c = f17;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(f17 == null);
            zt5.h.c("Soter.SoterCore", "soter: SoterCore IMPL is null[%b], after call getProviderSoterCore to init", objArr);
        }
        synchronized (wt5.a.class) {
            if (wt5.a.f449537c == null) {
                zt5.h.c("Soter.SoterCore", "soter: SoterCore IMPL is null then call tryToInitSoterTreble to init", new java.lang.Object[0]);
                if (au5.j.f14156n) {
                    zt5.h.c("Soter.SoterCore", "soter: treble is initializing", new java.lang.Object[0]);
                } else {
                    au5.j jVar = new au5.j();
                    wt5.a.f449537c = jVar;
                    jVar.f14167h = wt5.a.f449536b;
                    if (!wt5.a.f449537c.j(context)) {
                        wt5.a.f449537c = null;
                        zt5.h.c("Soter.SoterCore", "soter: SoterCore IMPL is null after call tryToInitSoterTreble to init", new java.lang.Object[0]);
                    }
                }
            }
        }
        au5.c.v();
        if (wt5.a.l() && (wt5.a.n(context) || wt5.a.m(context, 2))) {
            z17 = true;
        }
        this.f302130c = z17;
        this.f302133f = hVar.f302093b;
        this.f302131d = hVar.f302092a;
        this.f302132e = hVar.f302096e;
    }

    @Override // ju5.f
    public void c() {
        if (this.f302130c) {
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f266913b = true;
            }
            fu5.d b18 = fu5.d.b();
            b18.getClass();
            synchronized (fu5.d.class) {
                b18.f266912a = true;
            }
            b(new eu5.d(0));
            return;
        }
        zt5.h.f("Soter.TaskInit", "soter: TaskInit check isNativeSupport[" + this.f302130c + "]", new java.lang.Object[0]);
        b(new eu5.d(2));
        synchronized (fu5.d.class) {
            fu5.d b19 = fu5.d.b();
            b19.getClass();
            synchronized (fu5.d.class) {
                b19.f266913b = false;
            }
        }
        fu5.d b27 = fu5.d.b();
        b27.getClass();
        synchronized (fu5.d.class) {
            b27.f266912a = true;
        }
    }

    @Override // ju5.f
    public boolean d() {
        return true;
    }

    @Override // ju5.f
    public void e(eu5.e eVar) {
    }

    @Override // ju5.f
    public void f() {
    }

    @Override // ju5.f
    public boolean g() {
        if (fu5.d.b().e()) {
            zt5.h.b("Soter.TaskInit", "soter: duplicate initialize soter", new java.lang.Object[0]);
            b(new eu5.d(1028, "soter already have initialized"));
            return true;
        }
        int[] iArr = this.f302133f;
        if (iArr == null || iArr.length <= 0) {
            zt5.h.b("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new java.lang.Object[0]);
            b(new eu5.d(1024, "no business scene provided"));
            return true;
        }
        java.lang.String str = this.f302131d;
        if (str == null) {
            str = "";
        }
        if (str.length() > 16) {
            zt5.h.f("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24. soter will try to make it compat", new java.lang.Object[0]);
            java.lang.String a17 = zt5.l.a(this.f302131d.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
            java.lang.String substring = (zt5.l.b(a17) || a17.length() < 16) ? null : a17.substring(0, 16);
            if (zt5.l.b(substring)) {
                zt5.h.f("Soter.TaskInit", "soter: saltlen compat failed!!", new java.lang.Object[0]);
                b(new eu5.d(1025, "the account salt length is too long"));
                return true;
            }
            this.f302131d = substring;
        }
        java.lang.String str2 = this.f302132e;
        if (!zt5.l.b(str2) && str2.length() > 24) {
            zt5.h.b("Soter.TaskInit", "soter: the passed ask name is too long (larger than 24).", new java.lang.Object[0]);
            b(new eu5.d(1026, "the passed ask name is too long (larger than 24)"));
            return true;
        }
        zt5.h.f("Soter.TaskInit", "soter: it is strongly recommended to check device support from server, so you'd better provider a net wrapper to check it", new java.lang.Object[0]);
        if (!zt5.l.b(str2)) {
            zt5.h.c("Soter.TaskInit", "soter: provided valid ASK name", new java.lang.Object[0]);
            zt5.j.a().f475604a = str2;
        }
        ju5.o.a().c(new ju5.m0(this));
        return false;
    }

    public void h(java.lang.String str, int[] iArr) {
        for (int i17 : iArr) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = "Wechat";
            objArr[1] = java.lang.Integer.valueOf(android.os.Process.myUid());
            objArr[2] = str == null ? "" : str;
            objArr[3] = java.lang.Integer.valueOf(i17);
            fu5.d.b().a().put(i17, java.lang.String.format("%suid%d_%s_scene%d", objArr));
        }
    }
}
