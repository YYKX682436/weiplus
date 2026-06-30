package v8;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final int f434001h = t9.d0.f("OggS");

    /* renamed from: a, reason: collision with root package name */
    public int f434002a;

    /* renamed from: b, reason: collision with root package name */
    public long f434003b;

    /* renamed from: c, reason: collision with root package name */
    public int f434004c;

    /* renamed from: d, reason: collision with root package name */
    public int f434005d;

    /* renamed from: e, reason: collision with root package name */
    public int f434006e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f434007f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final t9.p f434008g = new t9.p(255);

    public boolean a(q8.f fVar, boolean z17) {
        t9.p pVar = this.f434008g;
        pVar.s();
        this.f434002a = 0;
        this.f434003b = 0L;
        this.f434004c = 0;
        this.f434005d = 0;
        this.f434006e = 0;
        q8.b bVar = (q8.b) fVar;
        long j17 = bVar.f360617b;
        if (!(j17 == -1 || j17 - (bVar.f360618c + ((long) bVar.f360620e)) >= 27) || !bVar.b(pVar.f416540a, 0, 27, true)) {
            if (z17) {
                return false;
            }
            throw new java.io.EOFException();
        }
        if (pVar.n() != f434001h) {
            if (z17) {
                return false;
            }
            throw new m8.x("expected OggS capture pattern at begin of page");
        }
        if (pVar.m() != 0) {
            if (z17) {
                return false;
            }
            throw new m8.x("unsupported bit stream revision");
        }
        this.f434002a = pVar.m();
        byte[] bArr = pVar.f416540a;
        long j18 = bArr[r2] & 255;
        long j19 = j18 | ((bArr[r4] & 255) << 8);
        long j27 = j19 | ((bArr[r2] & 255) << 16);
        long j28 = j27 | ((bArr[r4] & 255) << 24);
        long j29 = j28 | ((bArr[r2] & 255) << 32);
        long j37 = j29 | ((bArr[r4] & 255) << 40);
        pVar.f416541b = pVar.f416541b + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.f434003b = j37 | ((bArr[r2] & 255) << 48) | ((255 & bArr[r4]) << 56);
        pVar.f();
        pVar.f();
        pVar.f();
        int m17 = pVar.m();
        this.f434004c = m17;
        this.f434005d = m17 + 27;
        pVar.s();
        bVar.b(pVar.f416540a, 0, this.f434004c, false);
        for (int i17 = 0; i17 < this.f434004c; i17++) {
            int m18 = pVar.m();
            this.f434007f[i17] = m18;
            this.f434006e += m18;
        }
        return true;
    }
}
