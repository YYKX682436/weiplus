package v8;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v8.h f433996a = new v8.h();

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f433997b = new t9.p(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f433998c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f433999d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f434000e;

    public boolean a(q8.f fVar) {
        int i17;
        int i18;
        int i19;
        t9.a.d(fVar != null);
        boolean z17 = this.f434000e;
        t9.p pVar = this.f433997b;
        if (z17) {
            this.f434000e = false;
            pVar.s();
        }
        while (!this.f434000e) {
            int i27 = this.f433998c;
            v8.h hVar = this.f433996a;
            if (i27 < 0) {
                if (!hVar.a(fVar, true)) {
                    return false;
                }
                int i28 = hVar.f434005d;
                if ((hVar.f434002a & 1) == 1 && pVar.f416542c == 0) {
                    this.f433999d = 0;
                    int i29 = 0;
                    do {
                        int i37 = this.f433999d;
                        int i38 = 0 + i37;
                        if (i38 >= hVar.f434004c) {
                            break;
                        }
                        this.f433999d = i37 + 1;
                        i19 = hVar.f434007f[i38];
                        i29 += i19;
                    } while (i19 == 255);
                    i28 += i29;
                    i18 = this.f433999d + 0;
                } else {
                    i18 = 0;
                }
                ((q8.b) fVar).f(i28);
                this.f433998c = i18;
            }
            int i39 = this.f433998c;
            this.f433999d = 0;
            int i47 = 0;
            do {
                int i48 = this.f433999d;
                int i49 = i39 + i48;
                if (i49 >= hVar.f434004c) {
                    break;
                }
                this.f433999d = i48 + 1;
                i17 = hVar.f434007f[i49];
                i47 += i17;
            } while (i17 == 255);
            int i57 = this.f433998c + this.f433999d;
            if (i47 > 0) {
                int a17 = pVar.a();
                int i58 = pVar.f416542c + i47;
                if (a17 < i58) {
                    pVar.f416540a = java.util.Arrays.copyOf(pVar.f416540a, i58);
                }
                ((q8.b) fVar).e(pVar.f416540a, pVar.f416542c, i47, false);
                pVar.v(pVar.f416542c + i47);
                this.f434000e = hVar.f434007f[i57 + (-1)] != 255;
            }
            if (i57 == hVar.f434004c) {
                i57 = -1;
            }
            this.f433998c = i57;
        }
        return true;
    }
}
