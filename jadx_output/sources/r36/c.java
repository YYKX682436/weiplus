package r36;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final x36.o f369348d;

    /* renamed from: e, reason: collision with root package name */
    public static final x36.o f369349e;

    /* renamed from: f, reason: collision with root package name */
    public static final x36.o f369350f;

    /* renamed from: g, reason: collision with root package name */
    public static final x36.o f369351g;

    /* renamed from: h, reason: collision with root package name */
    public static final x36.o f369352h;

    /* renamed from: i, reason: collision with root package name */
    public static final x36.o f369353i;

    /* renamed from: a, reason: collision with root package name */
    public final x36.o f369354a;

    /* renamed from: b, reason: collision with root package name */
    public final x36.o f369355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369356c;

    static {
        x36.n nVar = x36.o.f451696h;
        f369348d = nVar.a(":");
        f369349e = nVar.a(":status");
        f369350f = nVar.a(":method");
        f369351g = nVar.a(":path");
        f369352h = nVar.a(":scheme");
        f369353i = nVar.a(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            x36.n r0 = x36.o.f451696h
            x36.o r2 = r0.a(r2)
            x36.o r3 = r0.a(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.c.<init>(java.lang.String, java.lang.String):void");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof r36.c)) {
            return false;
        }
        r36.c cVar = (r36.c) obj;
        return this.f369354a.equals(cVar.f369354a) && this.f369355b.equals(cVar.f369355b);
    }

    public int hashCode() {
        return ((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f369354a.hashCode()) * 31) + this.f369355b.hashCode();
    }

    public java.lang.String toString() {
        return m36.e.j("%s: %s", this.f369354a.u(), this.f369355b.u());
    }

    public c(x36.o oVar, java.lang.String str) {
        this(oVar, x36.o.f451696h.a(str));
    }

    public c(x36.o oVar, x36.o oVar2) {
        this.f369354a = oVar;
        this.f369355b = oVar2;
        this.f369356c = oVar.l() + 32 + oVar2.l();
    }
}
