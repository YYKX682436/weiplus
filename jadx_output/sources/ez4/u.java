package ez4;

/* loaded from: classes12.dex */
public final class u implements ih0.p {

    /* renamed from: a, reason: collision with root package name */
    public final dz4.i f257942a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f257943b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f257944c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f257945d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f257946e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f257947f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f257948g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f257949h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f257950i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f257951j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f257952k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f257953l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f257954m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f257955n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f257956o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f257957p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f257958q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f257959r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f257960s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f257961t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f257962u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f257963v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f257964w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f257965x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f257966y;

    public u(dz4.i data, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f257942a = data;
        this.f257943b = sessionId;
        this.f257947f = jz5.h.b(new ez4.t(this));
        this.f257948g = jz5.h.b(new ez4.a(this));
        this.f257949h = jz5.h.b(new ez4.s(this));
        this.f257950i = jz5.h.b(new ez4.k(this));
        this.f257951j = jz5.h.b(new ez4.m(this));
        this.f257952k = jz5.h.b(new ez4.l(this));
        this.f257953l = jz5.h.b(new ez4.h(this));
        this.f257954m = jz5.h.b(new ez4.p(this));
        this.f257955n = jz5.h.b(new ez4.f(this));
        this.f257956o = jz5.h.b(new ez4.n(this));
        this.f257957p = jz5.h.b(new ez4.o(this));
        this.f257958q = jz5.h.b(new ez4.j(this));
        this.f257959r = jz5.h.b(new ez4.r(this));
        this.f257960s = jz5.h.b(new ez4.e(this));
        this.f257961t = jz5.h.b(new ez4.c(this));
        this.f257962u = jz5.h.b(new ez4.i(this));
        this.f257963v = jz5.h.b(new ez4.d(this));
        this.f257964w = jz5.h.b(new ez4.b(this));
        this.f257965x = jz5.h.b(new ez4.g(this));
        this.f257966y = jz5.h.b(new ez4.q(this));
    }

    public final dz4.y1 a() {
        return (dz4.y1) ((jz5.n) this.f257962u).getValue();
    }

    public final dz4.u3 b() {
        return (dz4.u3) ((jz5.n) this.f257954m).getValue();
    }

    public dz4.i3 c() {
        return (dz4.i3) ((jz5.n) this.f257951j).getValue();
    }

    public void d(android.app.Activity activity) {
        java.lang.ref.WeakReference weakReference = this.f257944c;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (activity != null) {
            this.f257944c = new java.lang.ref.WeakReference(activity);
            if (this.f257942a.f245291b) {
                hz4.b0.a();
                return;
            }
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f257944c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f257944c = null;
        dz4.u3 b17 = b();
        java.util.Set callbackSet = b17.f245431b;
        kotlin.jvm.internal.o.f(callbackSet, "callbackSet");
        synchronized (callbackSet) {
            b17.f245431b.clear();
        }
    }
}
