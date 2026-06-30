package w8;

/* loaded from: classes15.dex */
public final class f implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f443624a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f443625b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f443626c;

    /* renamed from: d, reason: collision with root package name */
    public q8.o f443627d;

    /* renamed from: e, reason: collision with root package name */
    public int f443628e;

    /* renamed from: f, reason: collision with root package name */
    public int f443629f;

    /* renamed from: g, reason: collision with root package name */
    public int f443630g;

    /* renamed from: h, reason: collision with root package name */
    public long f443631h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f443632i;

    /* renamed from: j, reason: collision with root package name */
    public int f443633j;

    /* renamed from: k, reason: collision with root package name */
    public long f443634k;

    public f(java.lang.String str) {
        t9.p pVar = new t9.p(new byte[15]);
        this.f443624a = pVar;
        byte[] bArr = pVar.f416540a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f443628e = 0;
        this.f443625b = str;
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        while (true) {
            int i17 = pVar.f416542c;
            int i18 = pVar.f416541b;
            if (i17 - i18 <= 0) {
                return;
            }
            int i19 = this.f443628e;
            boolean z17 = false;
            if (i19 == 0) {
                while (true) {
                    if (pVar.f416542c - pVar.f416541b <= 0) {
                        break;
                    }
                    int i27 = this.f443630g << 8;
                    this.f443630g = i27;
                    int m17 = i27 | pVar.m();
                    this.f443630g = m17;
                    if (m17 == 2147385345) {
                        this.f443630g = 0;
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    this.f443629f = 4;
                    this.f443628e = 1;
                }
            } else if (i19 == 1) {
                t9.p pVar2 = this.f443624a;
                byte[] bArr = pVar2.f416540a;
                int min = java.lang.Math.min(i17 - i18, 15 - this.f443629f);
                pVar.b(bArr, this.f443629f, min);
                int i28 = this.f443629f + min;
                this.f443629f = i28;
                if (i28 == 15) {
                    byte[] bArr2 = pVar2.f416540a;
                    if (this.f443632i == null) {
                        java.lang.String str = this.f443626c;
                        java.lang.String str2 = this.f443625b;
                        t9.o oVar = new t9.o(bArr2, bArr2.length);
                        oVar.f(60);
                        int i29 = n8.y.f335595a[oVar.d(6)];
                        int i37 = n8.y.f335596b[oVar.d(4)];
                        int d17 = oVar.d(5);
                        int i38 = d17 >= 29 ? -1 : (n8.y.f335597c[d17] * 1000) / 2;
                        oVar.f(10);
                        com.google.android.exoplayer2.Format c17 = com.google.android.exoplayer2.Format.c(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS, null, i38, -1, i29 + (oVar.d(2) > 0 ? 1 : 0), i37, null, null, 0, str2);
                        this.f443632i = c17;
                        this.f443627d.c(c17);
                    }
                    this.f443633j = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f443631h = (int) (((((((bArr2[4] & 1) << 6) | ((r3 & 252) >> 2)) + 1) * 32) * 1000000) / this.f443632i.f44093y);
                    pVar2.w(0);
                    this.f443627d.a(pVar2, 15);
                    this.f443628e = 2;
                }
            } else if (i19 == 2) {
                int min2 = java.lang.Math.min(i17 - i18, this.f443633j - this.f443629f);
                this.f443627d.a(pVar, min2);
                int i39 = this.f443629f + min2;
                this.f443629f = i39;
                int i47 = this.f443633j;
                if (i39 == i47) {
                    this.f443627d.b(this.f443634k, 1, i47, 0, null);
                    this.f443634k += this.f443631h;
                    this.f443628e = 0;
                }
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f443628e = 0;
        this.f443629f = 0;
        this.f443630g = 0;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f443634k = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f443626c = g0Var.f443645e;
        g0Var.b();
        this.f443627d = gVar.l(g0Var.f443644d, 1);
    }
}
