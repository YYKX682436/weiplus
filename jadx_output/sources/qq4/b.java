package qq4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public int f365969c;

    /* renamed from: d, reason: collision with root package name */
    public long f365970d;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f365975i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f365976j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f365977k;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f365979m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365980n;

    /* renamed from: o, reason: collision with root package name */
    public android.util.Size f365981o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.Size f365982p;

    /* renamed from: q, reason: collision with root package name */
    public long f365983q;

    /* renamed from: r, reason: collision with root package name */
    public long f365984r;

    /* renamed from: s, reason: collision with root package name */
    public int f365985s;

    /* renamed from: t, reason: collision with root package name */
    public long f365986t;

    /* renamed from: a, reason: collision with root package name */
    public int f365967a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.j0 f365968b = new androidx.lifecycle.j0(java.lang.Integer.valueOf(this.f365967a));

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f365971e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f365972f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f365973g = new androidx.lifecycle.j0(java.lang.Boolean.valueOf(this.f365972f));

    /* renamed from: h, reason: collision with root package name */
    public int f365974h = 1;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f365978l = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String type, pq4.c thread) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(thread, "thread");
        this.f365978l.put(type, thread);
    }

    public final boolean b() {
        return (wo.v1.f447822b.f447660e == 1 && this.f365984r == 0) || kotlin.jvm.internal.o.b(this.f365975i, java.lang.Boolean.TRUE) || this.f365976j;
    }

    public final boolean c() {
        long j17 = this.f365970d;
        if (671097600 <= j17 && j17 < 805306368) {
            return true;
        }
        java.lang.String str = this.f365971e;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (r26.n0.B(lowerCase, "iphone", false)) {
            return true;
        }
        java.lang.String lowerCase2 = this.f365971e.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
        return r26.n0.B(lowerCase2, "ipad", false);
    }

    public final void d() {
        dr4.p1 p1Var;
        dr4.p1 p1Var2;
        this.f365969c = 0;
        this.f365981o = null;
        this.f365982p = null;
        this.f365983q = 0L;
        this.f365984r = 0L;
        this.f365967a = 0;
        boolean e17 = com.tencent.mm.sdk.platformtools.u3.e();
        androidx.lifecycle.j0 j0Var = this.f365968b;
        if (e17) {
            j0Var.setValue(0);
        } else {
            j0Var.postValue(0);
        }
        this.f365976j = false;
        this.f365970d = 0L;
        gq4.a aVar = gq4.v.Bi().f176559b;
        if (aVar != null && (p1Var2 = ((com.tencent.mm.plugin.voip.model.d0) aVar).f176375f) != null) {
            p1Var2.o(gq4.v.wi().f365967a);
        }
        this.f365971e = "";
        gq4.a aVar2 = gq4.v.Bi().f176559b;
        if (aVar2 == null || (p1Var = ((com.tencent.mm.plugin.voip.model.d0) aVar2).f176375f) == null) {
            return;
        }
        p1Var.o(gq4.v.wi().f365967a);
    }
}
