package u8;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f425241a;

    /* renamed from: b, reason: collision with root package name */
    public int f425242b;

    /* renamed from: c, reason: collision with root package name */
    public int f425243c;

    /* renamed from: d, reason: collision with root package name */
    public long f425244d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f425245e;

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f425246f;

    /* renamed from: g, reason: collision with root package name */
    public final t9.p f425247g;

    /* renamed from: h, reason: collision with root package name */
    public int f425248h;

    /* renamed from: i, reason: collision with root package name */
    public int f425249i;

    public d(t9.p pVar, t9.p pVar2, boolean z17) {
        this.f425247g = pVar;
        this.f425246f = pVar2;
        this.f425245e = z17;
        pVar2.w(12);
        this.f425241a = pVar2.p();
        pVar.w(12);
        this.f425249i = pVar.p();
        t9.a.e(pVar.c() == 1, "first_chunk must be 1");
        this.f425242b = -1;
    }

    public boolean a() {
        int i17 = this.f425242b + 1;
        this.f425242b = i17;
        if (i17 == this.f425241a) {
            return false;
        }
        boolean z17 = this.f425245e;
        t9.p pVar = this.f425246f;
        this.f425244d = z17 ? pVar.q() : pVar.n();
        if (this.f425242b == this.f425248h) {
            t9.p pVar2 = this.f425247g;
            this.f425243c = pVar2.p();
            pVar2.x(4);
            int i18 = this.f425249i - 1;
            this.f425249i = i18;
            this.f425248h = i18 > 0 ? pVar2.p() - 1 : -1;
        }
        return true;
    }
}
