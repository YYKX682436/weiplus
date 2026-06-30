package p5;

/* loaded from: classes16.dex */
public class m {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f351982f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.Executor f351983g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.Executor f351984h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f351985a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f351986b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f351987c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Exception f351988d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f351989e;

    static {
        p5.f fVar = p5.f.f351971c;
        f351982f = fVar.f351972a;
        f351983g = fVar.f351973b;
        f351984h = p5.c.f351966b.f351969a;
        new p5.m((java.lang.Object) null);
        new p5.m(java.lang.Boolean.TRUE);
        new p5.m(java.lang.Boolean.FALSE);
        new p5.m(true);
    }

    public m() {
        this.f351985a = new java.lang.Object();
        this.f351989e = new java.util.ArrayList();
    }

    public p5.m a(p5.h hVar, java.util.concurrent.Executor executor, p5.g gVar) {
        boolean z17;
        p5.n nVar = new p5.n();
        synchronized (this.f351985a) {
            synchronized (this.f351985a) {
                z17 = this.f351986b;
            }
            if (!z17) {
                ((java.util.ArrayList) this.f351989e).add(new p5.j(this, nVar, hVar, executor, gVar));
            }
        }
        if (z17) {
            try {
                executor.execute(new p5.k(gVar, nVar, hVar, this));
            } catch (java.lang.Exception e17) {
                nVar.a(new p5.i(e17));
            }
        }
        return nVar.f351990a;
    }

    public final void b() {
        synchronized (this.f351985a) {
            java.util.Iterator it = this.f351989e.iterator();
            while (it.hasNext()) {
                try {
                    ((p5.h) it.next()).a(this);
                } catch (java.lang.RuntimeException e17) {
                    throw e17;
                } catch (java.lang.Exception e18) {
                    throw new java.lang.RuntimeException(e18);
                }
            }
            this.f351989e = null;
        }
    }

    public boolean c(java.lang.Object obj) {
        synchronized (this.f351985a) {
            if (this.f351986b) {
                return false;
            }
            this.f351986b = true;
            this.f351987c = obj;
            this.f351985a.notifyAll();
            b();
            return true;
        }
    }

    public m(java.lang.Object obj) {
        this.f351985a = new java.lang.Object();
        this.f351989e = new java.util.ArrayList();
        c(obj);
    }

    public m(boolean z17) {
        java.lang.Object obj = new java.lang.Object();
        this.f351985a = obj;
        this.f351989e = new java.util.ArrayList();
        if (z17) {
            synchronized (obj) {
                if (!this.f351986b) {
                    this.f351986b = true;
                    obj.notifyAll();
                    b();
                }
            }
            return;
        }
        c(null);
    }
}
