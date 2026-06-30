package yx3;

/* loaded from: classes10.dex */
public final class v {
    public int A;
    public int B;
    public boolean C;
    public java.lang.String D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public dk4.a f467941a;

    /* renamed from: b, reason: collision with root package name */
    public vx3.i f467942b;

    /* renamed from: c, reason: collision with root package name */
    public yx3.k f467943c;

    /* renamed from: d, reason: collision with root package name */
    public dk4.a f467944d;

    /* renamed from: e, reason: collision with root package name */
    public vx3.c f467945e;

    /* renamed from: f, reason: collision with root package name */
    public long f467946f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f467947g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f467948h;

    /* renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.r2 f467951k;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f467953m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f467954n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f467955o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f467956p;

    /* renamed from: q, reason: collision with root package name */
    public ao4.b f467957q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f467958r;

    /* renamed from: s, reason: collision with root package name */
    public long f467959s;

    /* renamed from: t, reason: collision with root package name */
    public long f467960t;

    /* renamed from: u, reason: collision with root package name */
    public long f467961u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f467962v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f467963w;

    /* renamed from: x, reason: collision with root package name */
    public long f467964x;

    /* renamed from: y, reason: collision with root package name */
    public vx3.g f467965y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f467966z;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f467949i = jz5.h.b(yx3.p.f467919d);

    /* renamed from: j, reason: collision with root package name */
    public float f467950j = -1.0f;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f467952l = kotlinx.coroutines.z0.b();

    static {
        vx3.e[] eVarArr = vx3.e.f441276d;
    }

    public v() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        this.f467954n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(p0Var));
        this.f467956p = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(p0Var));
        this.f467962v = true;
        this.f467963w = "";
        this.f467965y = vx3.g.f441279f;
        this.f467966z = "";
        this.D = "";
        vx3.e[] eVarArr = vx3.e.f441276d;
    }

    public static final long a(yx3.v vVar) {
        return ((java.lang.Number) ((jz5.n) vVar.f467949i).getValue()).longValue();
    }

    public final void b() {
        kotlinx.coroutines.r2 r2Var = this.f467955o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f467955o = null;
        if (this.f467943c != null) {
            if (!mx3.f0.i()) {
                f(false);
            }
            try {
                yx3.k kVar = this.f467943c;
                if (kVar != null) {
                    kVar.k();
                }
                yx3.k kVar2 = this.f467943c;
                if (kVar2 != null) {
                    kVar2.h();
                }
                this.f467943c = null;
                this.f467944d = null;
                this.f467941a = null;
                this.f467945e = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "Player destroyed");
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                this.f467943c = null;
                throw th6;
            }
            this.f467943c = null;
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        try {
            vx3.c cVar = this.f467945e;
            if ((cVar != null ? cVar.f441270a : null) == vx3.d.f441273d) {
                e(true);
            }
            yx3.k kVar = this.f467943c;
            if (kVar != null) {
                kVar.i(this.f467948h);
            }
            yx3.k kVar2 = this.f467943c;
            if (kVar2 != null) {
                kVar2.f();
            }
        } catch (java.lang.Exception unused) {
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (kotlin.jvm.internal.o.b(r1, r2 != null ? r2.f234482s : null) == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(vx3.b r19) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx3.v.d(vx3.b):void");
    }

    public final void e(boolean z17) {
        kotlinx.coroutines.r2 r2Var = this.f467953m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f467953m = null;
        this.f467953m = kotlinx.coroutines.l.d(this.f467954n, null, null, new yx3.q(z17, null), 3, null);
    }

    public final void f(boolean z17) {
        int i17;
        int i18;
        if (mx3.f0.i()) {
            return;
        }
        int i19 = z17 ? 0 : fp.h.c(21) ? 3 : 2;
        if (z17 && (i18 = wo.v1.f447823c.f447588J) > -1) {
            i19 = i18;
        } else if (!z17 && (i17 = wo.v1.f447823c.I) > -1) {
            i19 = i17;
        }
        ym1.e eVar = ym1.f.f463134h;
        if (i19 != eVar.b().f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "set AudioManager mode: %s", java.lang.Integer.valueOf(i19));
            xm1.h.y(eVar.b(), i19, null, 2, null);
        }
    }
}
