package w8;

/* loaded from: classes15.dex */
public final class d implements w8.h {

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f443599r = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f443600a;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f443603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f443604e;

    /* renamed from: f, reason: collision with root package name */
    public q8.o f443605f;

    /* renamed from: g, reason: collision with root package name */
    public q8.o f443606g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f443610k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f443611l;

    /* renamed from: m, reason: collision with root package name */
    public long f443612m;

    /* renamed from: n, reason: collision with root package name */
    public int f443613n;

    /* renamed from: o, reason: collision with root package name */
    public long f443614o;

    /* renamed from: p, reason: collision with root package name */
    public q8.o f443615p;

    /* renamed from: q, reason: collision with root package name */
    public long f443616q;

    /* renamed from: b, reason: collision with root package name */
    public final t9.o f443601b = new t9.o(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f443602c = new t9.p(java.util.Arrays.copyOf(f443599r, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f443607h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f443608i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f443609j = 256;

    public d(boolean z17, java.lang.String str) {
        this.f443600a = z17;
        this.f443603d = str;
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        while (true) {
            int i17 = pVar.f416542c;
            int i18 = pVar.f416541b;
            int i19 = i17 - i18;
            if (i19 <= 0) {
                return;
            }
            int i27 = this.f443607h;
            t9.p pVar2 = this.f443602c;
            if (i27 == 0) {
                byte[] bArr = pVar.f416540a;
                while (true) {
                    if (i18 >= i17) {
                        pVar.w(i18);
                        break;
                    }
                    int i28 = i18 + 1;
                    int i29 = bArr[i18] & 255;
                    int i37 = this.f443609j;
                    if (i37 != 512 || i29 < 240 || i29 == 255) {
                        int i38 = i29 | i37;
                        if (i38 == 329) {
                            this.f443609j = 768;
                        } else if (i38 == 511) {
                            this.f443609j = 512;
                        } else if (i38 == 836) {
                            this.f443609j = 1024;
                        } else {
                            if (i38 == 1075) {
                                this.f443607h = 1;
                                this.f443608i = 3;
                                this.f443613n = 0;
                                pVar2.w(0);
                                pVar.w(i28);
                                break;
                            }
                            if (i37 != 256) {
                                this.f443609j = 256;
                                i28--;
                            }
                        }
                        i18 = i28;
                    } else {
                        this.f443610k = (i29 & 1) == 0;
                        this.f443607h = 2;
                        this.f443608i = 0;
                        pVar.w(i28);
                    }
                }
            } else if (i27 != 1) {
                if (i27 == 2) {
                    int i39 = this.f443610k ? 7 : 5;
                    t9.o oVar = this.f443601b;
                    if (f(pVar, oVar.f416536a, i39)) {
                        oVar.e(0);
                        if (this.f443611l) {
                            oVar.f(10);
                        } else {
                            int d17 = oVar.d(2) + 1;
                            if (d17 != 2) {
                                d17 = 2;
                            }
                            int d18 = oVar.d(4);
                            oVar.f(1);
                            byte[] bArr2 = {(byte) (((d17 << 3) & 248) | ((d18 >> 1) & 7)), (byte) (((d18 << 7) & 128) | ((oVar.d(3) << 3) & 120))};
                            android.util.Pair b17 = t9.e.b(bArr2);
                            com.google.android.exoplayer2.Format c17 = com.google.android.exoplayer2.Format.c(this.f443604e, "audio/mp4a-latm", null, -1, -1, ((java.lang.Integer) b17.second).intValue(), ((java.lang.Integer) b17.first).intValue(), java.util.Collections.singletonList(bArr2), null, 0, this.f443603d);
                            this.f443612m = 1024000000 / c17.f44093y;
                            this.f443605f.c(c17);
                            this.f443611l = true;
                        }
                        oVar.f(4);
                        int d19 = (oVar.d(13) - 2) - 5;
                        if (this.f443610k) {
                            d19 -= 2;
                        }
                        q8.o oVar2 = this.f443605f;
                        long j17 = this.f443612m;
                        this.f443607h = 3;
                        this.f443608i = 0;
                        this.f443615p = oVar2;
                        this.f443616q = j17;
                        this.f443613n = d19;
                    }
                } else if (i27 == 3) {
                    int min = java.lang.Math.min(i19, this.f443613n - this.f443608i);
                    this.f443615p.a(pVar, min);
                    int i47 = this.f443608i + min;
                    this.f443608i = i47;
                    int i48 = this.f443613n;
                    if (i47 == i48) {
                        this.f443615p.b(this.f443614o, 1, i48, 0, null);
                        this.f443614o += this.f443616q;
                        this.f443607h = 0;
                        this.f443608i = 0;
                        this.f443609j = 256;
                    }
                }
            } else if (f(pVar, pVar2.f416540a, 10)) {
                this.f443606g.a(pVar2, 10);
                pVar2.w(6);
                q8.o oVar3 = this.f443606g;
                int l17 = pVar2.l() + 10;
                this.f443607h = 3;
                this.f443608i = 10;
                this.f443615p = oVar3;
                this.f443616q = 0L;
                this.f443613n = l17;
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f443607h = 0;
        this.f443608i = 0;
        this.f443609j = 256;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f443614o = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f443604e = g0Var.f443645e;
        g0Var.b();
        this.f443605f = gVar.l(g0Var.f443644d, 1);
        if (!this.f443600a) {
            this.f443606g = new q8.d();
            return;
        }
        g0Var.a();
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f443644d, 4);
        this.f443606g = l17;
        g0Var.b();
        l17.c(com.google.android.exoplayer2.Format.f(g0Var.f443645e, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_ID3, null, -1, null));
    }

    public final boolean f(t9.p pVar, byte[] bArr, int i17) {
        int min = java.lang.Math.min(pVar.f416542c - pVar.f416541b, i17 - this.f443608i);
        pVar.b(bArr, this.f443608i, min);
        int i18 = this.f443608i + min;
        this.f443608i = i18;
        return i18 == i17;
    }
}
