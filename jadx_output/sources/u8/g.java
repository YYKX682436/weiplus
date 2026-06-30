package u8;

/* loaded from: classes15.dex */
public final class g implements u8.e {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f425253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425255c;

    /* renamed from: d, reason: collision with root package name */
    public int f425256d;

    /* renamed from: e, reason: collision with root package name */
    public int f425257e;

    public g(u8.b bVar) {
        t9.p pVar = bVar.P0;
        this.f425253a = pVar;
        pVar.w(12);
        this.f425255c = pVar.p() & 255;
        this.f425254b = pVar.p();
    }

    @Override // u8.e
    public int a() {
        t9.p pVar = this.f425253a;
        int i17 = this.f425255c;
        if (i17 == 8) {
            return pVar.m();
        }
        if (i17 == 16) {
            return pVar.r();
        }
        int i18 = this.f425256d;
        this.f425256d = i18 + 1;
        if (i18 % 2 != 0) {
            return this.f425257e & 15;
        }
        int m17 = pVar.m();
        this.f425257e = m17;
        return (m17 & 240) >> 4;
    }

    @Override // u8.e
    public int b() {
        return this.f425254b;
    }

    @Override // u8.e
    public boolean c() {
        return false;
    }
}
