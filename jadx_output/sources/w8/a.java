package w8;

/* loaded from: classes15.dex */
public final class a implements q8.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f443556e = t9.d0.f("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f443557a;

    /* renamed from: b, reason: collision with root package name */
    public final w8.b f443558b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f443559c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f443560d;

    public a() {
        this(0L);
    }

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        t9.p pVar = this.f443559c;
        int c17 = ((q8.b) fVar).c(pVar.f416540a, 0, 2786);
        if (c17 == -1) {
            return -1;
        }
        pVar.w(0);
        pVar.v(c17);
        boolean z17 = this.f443560d;
        w8.b bVar = this.f443558b;
        if (!z17) {
            bVar.f443574l = this.f443557a;
            this.f443560d = true;
        }
        bVar.a(pVar);
        return 0;
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f443558b.e(gVar, new w8.g0(0, 1));
        gVar.j();
        gVar.b(new q8.l(-9223372036854775807L));
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        int a17;
        t9.p pVar = new t9.p(10);
        int i17 = 0;
        while (true) {
            ((q8.b) fVar).b(pVar.f416540a, 0, 10, false);
            pVar.w(0);
            if (pVar.o() != f443556e) {
                break;
            }
            pVar.x(3);
            int l17 = pVar.l();
            i17 += l17 + 10;
            ((q8.b) fVar).a(l17, false);
        }
        q8.b bVar = (q8.b) fVar;
        bVar.f360620e = 0;
        bVar.a(i17, false);
        int i18 = 0;
        int i19 = i17;
        while (true) {
            bVar.b(pVar.f416540a, 0, 5, false);
            pVar.w(0);
            if (pVar.r() != 2935) {
                bVar.f360620e = 0;
                i19++;
                if (i19 - i17 >= 8192) {
                    return false;
                }
                bVar.a(i19, false);
                i18 = 0;
            } else {
                i18++;
                if (i18 >= 4) {
                    return true;
                }
                byte[] bArr = pVar.f416540a;
                if (bArr.length < 5) {
                    a17 = -1;
                } else {
                    byte b17 = bArr[4];
                    a17 = n8.a.a((b17 & 192) >> 6, b17 & 63);
                }
                if (a17 == -1) {
                    return false;
                }
                bVar.a(a17 - 5, false);
            }
        }
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        this.f443560d = false;
        this.f443558b.b();
    }

    public a(long j17) {
        this.f443557a = j17;
        this.f443558b = new w8.b(null);
        this.f443559c = new t9.p(2786);
    }
}
