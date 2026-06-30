package ru5;

/* loaded from: classes10.dex */
public class g {

    /* renamed from: i, reason: collision with root package name */
    public static final ru5.j f399797i = new ru5.b();

    /* renamed from: j, reason: collision with root package name */
    public static final ru5.j f399798j = new ru5.l();

    /* renamed from: k, reason: collision with root package name */
    public static final ru5.f f399799k = new ru5.f();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f399800a;

    /* renamed from: b, reason: collision with root package name */
    public ru5.j f399801b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ru5.a f399802c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ru5.g f399803d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ru5.g f399804e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f399805f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f399806g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f399807h = new java.util.concurrent.atomic.AtomicBoolean(false);

    public g() {
    }

    public static ru5.g b() {
        return new ru5.g(f399799k);
    }

    public final void a() {
        if (this.f399806g) {
            synchronized (this.f399805f) {
                if (this.f399806g) {
                    this.f399805f.notifyAll();
                }
            }
        }
    }

    public void c(ru5.a aVar) {
        if (aVar == null) {
            a();
            return;
        }
        ru5.e eVar = new ru5.e(this, aVar);
        if (this.f399800a != null) {
            ru5.j jVar = this.f399801b;
            if (jVar == null) {
                eVar.run();
            } else {
                jVar.execute(eVar);
            }
        }
    }

    public ru5.a d() {
        return null;
    }

    public ru5.j e() {
        return this.f399801b;
    }

    public ru5.g f(ru5.a aVar) {
        java.util.Objects.requireNonNull(aVar);
        ru5.g gVar = new ru5.g();
        gVar.f399801b = e();
        gVar.f399803d = null;
        this.f399804e = gVar;
        this.f399802c = aVar;
        this.f399807h.compareAndSet(false, true);
        c(aVar);
        return gVar;
    }

    public java.lang.Object g() {
        try {
            if (this.f399800a == null) {
                synchronized (this.f399805f) {
                    if (this.f399800a == null) {
                        this.f399806g = true;
                        this.f399805f.wait();
                        this.f399806g = false;
                    }
                }
            }
        } catch (java.lang.InterruptedException unused) {
        }
        return this.f399800a;
    }

    public g(java.lang.Object obj) {
        this.f399800a = obj;
    }
}
