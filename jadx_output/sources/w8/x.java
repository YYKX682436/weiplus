package w8;

/* loaded from: classes15.dex */
public final class x implements w8.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final w8.w f443789a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f443790b = new t9.p(32);

    /* renamed from: c, reason: collision with root package name */
    public int f443791c;

    /* renamed from: d, reason: collision with root package name */
    public int f443792d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443793e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443794f;

    public x(w8.w wVar) {
        this.f443789a = wVar;
    }

    @Override // w8.h0
    public void a(t9.p pVar, boolean z17) {
        int m17 = z17 ? pVar.f416541b + pVar.m() : -1;
        if (this.f443794f) {
            if (!z17) {
                return;
            }
            this.f443794f = false;
            pVar.w(m17);
            this.f443792d = 0;
        }
        while (true) {
            int i17 = pVar.f416542c;
            int i18 = pVar.f416541b;
            if (i17 - i18 <= 0) {
                return;
            }
            int i19 = this.f443792d;
            t9.p pVar2 = this.f443790b;
            if (i19 < 3) {
                if (i19 == 0) {
                    int m18 = pVar.m();
                    pVar.w(pVar.f416541b - 1);
                    if (m18 == 255) {
                        this.f443794f = true;
                        return;
                    }
                }
                int min = java.lang.Math.min(pVar.f416542c - pVar.f416541b, 3 - this.f443792d);
                pVar.b(pVar2.f416540a, this.f443792d, min);
                int i27 = this.f443792d + min;
                this.f443792d = i27;
                if (i27 == 3) {
                    pVar2.t(3);
                    pVar2.x(1);
                    int m19 = pVar2.m();
                    int m27 = pVar2.m();
                    this.f443793e = (m19 & 128) != 0;
                    this.f443791c = (((m19 & 15) << 8) | m27) + 3;
                    int a17 = pVar2.a();
                    int i28 = this.f443791c;
                    if (a17 < i28) {
                        byte[] bArr = pVar2.f416540a;
                        pVar2.t(java.lang.Math.min(4098, java.lang.Math.max(i28, bArr.length * 2)));
                        java.lang.System.arraycopy(bArr, 0, pVar2.f416540a, 0, 3);
                    }
                }
            } else {
                int min2 = java.lang.Math.min(i17 - i18, this.f443791c - i19);
                pVar.b(pVar2.f416540a, this.f443792d, min2);
                int i29 = this.f443792d + min2;
                this.f443792d = i29;
                int i37 = this.f443791c;
                if (i29 != i37) {
                    continue;
                } else {
                    if (this.f443793e) {
                        byte[] bArr2 = pVar2.f416540a;
                        int i38 = t9.d0.f416498a;
                        int i39 = -1;
                        for (int i47 = 0; i47 < i37; i47++) {
                            i39 = t9.d0.f416504g[((i39 >>> 24) ^ (bArr2[i47] & 255)) & 255] ^ (i39 << 8);
                        }
                        if (i39 != 0) {
                            this.f443794f = true;
                            return;
                        }
                        pVar2.t(this.f443791c - 4);
                    } else {
                        pVar2.t(i37);
                    }
                    this.f443789a.a(pVar2);
                    this.f443792d = 0;
                }
            }
        }
    }

    @Override // w8.h0
    public void b() {
        this.f443794f = true;
    }

    @Override // w8.h0
    public void c(t9.a0 a0Var, q8.g gVar, w8.g0 g0Var) {
        this.f443789a.c(a0Var, gVar, g0Var);
        this.f443794f = true;
    }
}
