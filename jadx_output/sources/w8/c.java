package w8;

/* loaded from: classes15.dex */
public final class c implements q8.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f443580e = t9.d0.f("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f443581a;

    /* renamed from: b, reason: collision with root package name */
    public final w8.d f443582b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f443583c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f443584d;

    public c() {
        this(0L);
    }

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        t9.p pVar = this.f443583c;
        int c17 = ((q8.b) fVar).c(pVar.f416540a, 0, 200);
        if (c17 == -1) {
            return -1;
        }
        pVar.w(0);
        pVar.v(c17);
        boolean z17 = this.f443584d;
        w8.d dVar = this.f443582b;
        if (!z17) {
            dVar.f443614o = this.f443581a;
            this.f443584d = true;
        }
        dVar.a(pVar);
        return 0;
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f443582b.e(gVar, new w8.g0(0, 1));
        gVar.j();
        gVar.b(new q8.l(-9223372036854775807L));
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        t9.p pVar = new t9.p(10);
        byte[] bArr = pVar.f416540a;
        t9.o oVar = new t9.o(bArr, bArr.length);
        int i17 = 0;
        while (true) {
            ((q8.b) fVar).b(pVar.f416540a, 0, 10, false);
            pVar.w(0);
            if (pVar.o() != f443580e) {
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
        int i19 = 0;
        int i27 = i17;
        while (true) {
            bVar.b(pVar.f416540a, 0, 2, false);
            pVar.w(0);
            if ((pVar.r() & 65526) != 65520) {
                bVar.f360620e = 0;
                i27++;
                if (i27 - i17 >= 8192) {
                    return false;
                }
                bVar.a(i27, false);
                i18 = 0;
                i19 = 0;
            } else {
                i18++;
                if (i18 >= 4 && i19 > 188) {
                    return true;
                }
                bVar.b(pVar.f416540a, 0, 4, false);
                oVar.e(14);
                int d17 = oVar.d(13);
                if (d17 <= 6) {
                    return false;
                }
                bVar.a(d17 - 6, false);
                i19 += d17;
            }
        }
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        this.f443584d = false;
        w8.d dVar = this.f443582b;
        dVar.f443607h = 0;
        dVar.f443608i = 0;
        dVar.f443609j = 256;
    }

    public c(long j17) {
        this.f443581a = j17;
        this.f443582b = new w8.d(true, null);
        this.f443583c = new t9.p(200);
    }
}
