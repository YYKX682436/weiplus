package p13;

/* loaded from: classes12.dex */
public abstract class t extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final p13.u f351135n;

    /* renamed from: o, reason: collision with root package name */
    public p13.v f351136o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.ref.WeakReference f351137p;

    public t(p13.u uVar) {
        this.f351135n = uVar;
        this.f351137p = new java.lang.ref.WeakReference(uVar.f351151m);
        if (uVar.f351154p) {
            return;
        }
        uVar.f351151m = null;
    }

    @Override // p13.c
    public boolean i() {
        java.lang.ref.WeakReference weakReference = this.f351137p;
        p13.u uVar = this.f351135n;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(uVar.f351141c)) {
            try {
                uVar.f351141c = new java.lang.String(uVar.f351141c.getBytes("UTF8"), "UTF8");
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        p13.v vVar = new p13.v(uVar);
        this.f351136o = vVar;
        try {
            try {
                vVar.f351157b = this;
                p(vVar);
                this.f351136o.f351158c = 0;
                com.tencent.mm.sdk.platformtools.n3 n3Var = uVar.f351152n;
                if (n3Var == null) {
                    o13.x xVar = (o13.x) weakReference.get();
                    if (xVar != null) {
                        xVar.X2(this.f351136o);
                    }
                } else {
                    n3Var.post(new p13.s(this));
                }
                return true;
            } catch (java.lang.Exception e17) {
                if (e17 instanceof java.lang.InterruptedException) {
                    this.f351136o.f351158c = 1;
                } else {
                    this.f351136o.f351158c = -1;
                }
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = uVar.f351152n;
            if (n3Var2 == null) {
                o13.x xVar2 = (o13.x) weakReference.get();
                if (xVar2 != null) {
                    xVar2.X2(this.f351136o);
                }
            } else {
                n3Var2.post(new p13.s(this));
            }
            throw th6;
        }
    }

    @Override // p13.c
    public void n() {
        this.f351065e = true;
        this.f351135n.f351151m = null;
    }

    public void p(p13.v vVar) {
        vVar.f351159d = p13.r.b(this.f351135n.f351141c, false);
        vVar.f351158c = -5;
    }
}
