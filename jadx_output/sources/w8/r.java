package w8;

/* loaded from: classes15.dex */
public final class r implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f443746a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.j f443747b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f443748c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f443749d;

    /* renamed from: e, reason: collision with root package name */
    public q8.o f443750e;

    /* renamed from: f, reason: collision with root package name */
    public int f443751f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f443752g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f443753h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f443754i;

    /* renamed from: j, reason: collision with root package name */
    public long f443755j;

    /* renamed from: k, reason: collision with root package name */
    public int f443756k;

    /* renamed from: l, reason: collision with root package name */
    public long f443757l;

    public r(java.lang.String str) {
        t9.p pVar = new t9.p(4);
        this.f443746a = pVar;
        pVar.f416540a[0] = -1;
        this.f443747b = new q8.j();
        this.f443748c = str;
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        while (true) {
            int i17 = pVar.f416542c;
            int i18 = pVar.f416541b;
            if (i17 - i18 <= 0) {
                return;
            }
            int i19 = this.f443751f;
            t9.p pVar2 = this.f443746a;
            if (i19 == 0) {
                byte[] bArr = pVar.f416540a;
                while (true) {
                    if (i18 >= i17) {
                        pVar.w(i17);
                        break;
                    }
                    byte b17 = bArr[i18];
                    boolean z17 = (b17 & 255) == 255;
                    boolean z18 = this.f443754i && (b17 & 224) == 224;
                    this.f443754i = z17;
                    if (z18) {
                        pVar.w(i18 + 1);
                        this.f443754i = false;
                        pVar2.f416540a[1] = bArr[i18];
                        this.f443752g = 2;
                        this.f443751f = 1;
                        break;
                    }
                    i18++;
                }
            } else if (i19 == 1) {
                int min = java.lang.Math.min(i17 - i18, 4 - this.f443752g);
                pVar.b(pVar2.f416540a, this.f443752g, min);
                int i27 = this.f443752g + min;
                this.f443752g = i27;
                if (i27 >= 4) {
                    pVar2.w(0);
                    int c17 = pVar2.c();
                    q8.j jVar = this.f443747b;
                    if (q8.j.b(c17, jVar)) {
                        this.f443756k = jVar.f360635c;
                        if (!this.f443753h) {
                            int i28 = jVar.f360636d;
                            this.f443755j = (jVar.f360639g * 1000000) / i28;
                            this.f443750e.c(com.google.android.exoplayer2.Format.c(this.f443749d, jVar.f360634b, null, -1, 4096, jVar.f360637e, i28, null, null, 0, this.f443748c));
                            this.f443753h = true;
                        }
                        pVar2.w(0);
                        this.f443750e.a(pVar2, 4);
                        this.f443751f = 2;
                    } else {
                        this.f443752g = 0;
                        this.f443751f = 1;
                    }
                }
            } else if (i19 == 2) {
                int min2 = java.lang.Math.min(i17 - i18, this.f443756k - this.f443752g);
                this.f443750e.a(pVar, min2);
                int i29 = this.f443752g + min2;
                this.f443752g = i29;
                int i37 = this.f443756k;
                if (i29 >= i37) {
                    this.f443750e.b(this.f443757l, 1, i37, 0, null);
                    this.f443757l += this.f443755j;
                    this.f443752g = 0;
                    this.f443751f = 0;
                }
            }
        }
    }

    @Override // w8.h
    public void b() {
        this.f443751f = 0;
        this.f443752g = 0;
        this.f443754i = false;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f443757l = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f443749d = g0Var.f443645e;
        g0Var.b();
        this.f443750e = gVar.l(g0Var.f443644d, 1);
    }
}
