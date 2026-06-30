package kl4;

/* loaded from: classes11.dex */
public final class a0 extends jm4.t3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f308867d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public ll4.d f308868e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f308869f;

    /* renamed from: g, reason: collision with root package name */
    public long f308870g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f308871h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Float f308872i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f308873m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f308874n;

    /* renamed from: o, reason: collision with root package name */
    public ll4.d f308875o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f308876p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f308877q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f308878r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f308879s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f308880t;

    /* renamed from: u, reason: collision with root package name */
    public final kl4.q f308881u;

    static {
        ml4.b.f328407a.a();
    }

    public a0() {
        kotlin.jvm.internal.i iVar = null;
        this.f308877q = new com.tencent.unit_rc.WeakPtr(iVar, 1, iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlatformPlayerCore", "initTingPlatformPlayerCore");
        this.f308878r = jz5.h.b(kl4.t.f308963d);
        this.f308879s = "MicroMsg.TingPlatformPlayerCoreTask@" + a();
        this.f308880t = "MicroMsg.TingPlatformPlayerCore@" + a();
        this.f308881u = new kl4.q(this);
    }

    @Override // jm4.w3
    public void P1(jm4.u3 u3Var) {
        this.f308867d.remove(new com.tencent.unit_rc.WeakPtr(u3Var));
    }

    @Override // jm4.w3
    public void Z8(jm4.u3 u3Var) {
        if (u3Var == null) {
            rk4.k5.d(this.f308880t, "addPlayerStateClient listener is null");
        } else {
            this.f308867d.add(new com.tencent.unit_rc.WeakPtr(u3Var));
        }
    }

    public final java.lang.String a() {
        return (java.lang.String) this.f308878r.getValue();
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop last player core. playId:");
        ll4.d dVar = this.f308875o;
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.o()) : null);
        com.tencent.mars.xlog.Log.i(this.f308880t, sb6.toString());
        ll4.d dVar2 = this.f308875o;
        if (dVar2 != null) {
            dVar2.stop();
        }
        ll4.d dVar3 = this.f308875o;
        if (dVar3 != null) {
            dVar3.release();
        }
        this.f308875o = null;
    }

    @Override // jm4.w3
    public float h() {
        java.lang.Float f17 = this.f308872i;
        if (f17 == null) {
            ll4.d dVar = this.f308868e;
            f17 = dVar != null ? java.lang.Float.valueOf(dVar.h()) : null;
            if (f17 == null) {
                return 1.0f;
            }
        }
        return f17.floatValue();
    }

    @Override // jm4.w3
    public int i() {
        return 0;
    }

    @Override // jm4.w3
    public long k() {
        ll4.d dVar = this.f308868e;
        if (dVar != null) {
            return dVar.k();
        }
        return 0L;
    }

    @Override // jm4.w3
    public long m() {
        if (this.f308871h) {
            return this.f308870g;
        }
        ll4.d dVar = this.f308868e;
        if (dVar != null) {
            return dVar.m();
        }
        return 0L;
    }

    @Override // jm4.w3
    public long s() {
        ll4.d dVar = this.f308868e;
        if (dVar != null) {
            return dVar.d();
        }
        return 0L;
    }
}
