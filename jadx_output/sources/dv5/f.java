package dv5;

/* loaded from: classes16.dex */
public final class f extends dv5.e {

    /* renamed from: b, reason: collision with root package name */
    public final dv5.h f244041b;

    /* renamed from: c, reason: collision with root package name */
    public final dv5.c f244042c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f244043d;

    /* renamed from: e, reason: collision with root package name */
    public int f244044e;

    /* renamed from: f, reason: collision with root package name */
    public int f244045f;

    /* renamed from: g, reason: collision with root package name */
    public int f244046g;

    /* renamed from: h, reason: collision with root package name */
    public long f244047h;

    /* renamed from: i, reason: collision with root package name */
    public int f244048i;

    /* renamed from: j, reason: collision with root package name */
    public int f244049j;

    /* renamed from: k, reason: collision with root package name */
    public int f244050k;

    /* renamed from: l, reason: collision with root package name */
    public int f244051l;

    /* renamed from: m, reason: collision with root package name */
    public int f244052m;

    /* renamed from: n, reason: collision with root package name */
    public int f244053n;

    /* renamed from: o, reason: collision with root package name */
    public int f244054o;

    /* renamed from: p, reason: collision with root package name */
    public int f244055p;

    /* renamed from: q, reason: collision with root package name */
    public int f244056q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f244057r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f244058s;

    /* renamed from: t, reason: collision with root package name */
    public int f244059t;

    /* renamed from: u, reason: collision with root package name */
    public int f244060u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Object f244061v;

    /* renamed from: w, reason: collision with root package name */
    public int f244062w;

    public f(dv5.h hVar, dv5.c cVar) {
        super(null);
        this.f244044e = 0;
        this.f244045f = 0;
        this.f244046g = 0;
        this.f244047h = 0L;
        this.f244048i = 0;
        this.f244049j = 0;
        this.f244050k = 0;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        this.f244056q = 0;
        this.f244057r = null;
        this.f244058s = null;
        this.f244059t = 0;
        this.f244060u = 0;
        this.f244061v = null;
        this.f244062w = 0;
        this.f244041b = hVar;
        this.f244042c = cVar;
        this.f244043d = cVar != null;
    }

    @Override // dv5.e
    public void a(int i17, int i18, java.lang.Object obj, int i19, int i27) {
        this.f244044e = i18;
        this.f244061v = obj;
        this.f244062w = i19;
        this.f244060u = i27;
        this.f244048i = 0;
        this.f244049j = 0;
        this.f244050k = 0;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void b(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39, int i47) {
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244046g = i28;
        this.f244047h = j17;
        this.f244048i = 5;
        this.f244049j = i29;
        this.f244050k = i37;
        this.f244051l = i38;
        this.f244052m = i39;
        this.f244053n = i47;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void c(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39) {
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244046g = i28;
        this.f244047h = j17;
        this.f244048i = 4;
        this.f244049j = i29;
        this.f244050k = i37;
        this.f244051l = i38;
        this.f244052m = i39;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void d(int i17, int i18, int i19, int i27, int i28, int[] iArr) {
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244056q = i28;
        this.f244048i = iArr.length;
        this.f244049j = 0;
        this.f244050k = 0;
        this.f244051l = iArr.length > 0 ? iArr[0] : 0;
        this.f244052m = iArr.length > 1 ? iArr[1] : 0;
        this.f244053n = iArr.length > 2 ? iArr[2] : 0;
        this.f244054o = iArr.length > 3 ? iArr[3] : 0;
        this.f244055p = iArr.length > 4 ? iArr[4] : 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void e(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244048i = i29;
        this.f244049j = 0;
        this.f244050k = 0;
        this.f244051l = i28;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        this.f244056q = i37;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void f(int i17, int i18, int i19, int i27, int i28, long j17, int i29) {
        boolean z17 = this.f244043d;
        if (z17) {
            i28 = this.f244042c.m(i28);
        }
        if (i18 == 26) {
            if (z17) {
                if (i19 > 65535) {
                    i18 = 27;
                }
            } else if (i19 > 65535) {
                throw new av5.z("string index out of bound: " + ev5.a.d(i19) + ", perhaps you need to enable force jumbo mode.");
            }
        }
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244046g = i28;
        this.f244047h = j17;
        this.f244048i = 1;
        this.f244049j = i29;
        this.f244050k = 0;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void g(int i17, int i18, int i19, int[] iArr) {
        this.f244044e = i18;
        this.f244059t = i19;
        if (this.f244043d) {
            this.f244058s = new int[iArr.length];
            for (int i27 = 0; i27 < iArr.length; i27++) {
                this.f244058s[i27] = this.f244042c.m(iArr[i27]);
            }
        } else {
            this.f244058s = iArr;
        }
        this.f244048i = 0;
        this.f244049j = 0;
        this.f244050k = 0;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void h(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244046g = i28;
        this.f244047h = j17;
        this.f244048i = i37;
        this.f244049j = i29;
        this.f244050k = 0;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void i(int i17, int i18, int[] iArr, int[] iArr2) {
        this.f244044e = i18;
        this.f244057r = iArr;
        if (this.f244043d) {
            this.f244058s = new int[iArr2.length];
            for (int i19 = 0; i19 < iArr2.length; i19++) {
                this.f244058s[i19] = this.f244042c.m(iArr2[i19]);
            }
        } else {
            this.f244058s = iArr2;
        }
        this.f244048i = 0;
        this.f244049j = 0;
        this.f244050k = 0;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void j(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38) {
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244046g = i28;
        this.f244047h = j17;
        this.f244048i = 3;
        this.f244049j = i29;
        this.f244050k = i37;
        this.f244051l = i38;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    @Override // dv5.e
    public void k(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        if (this.f244043d) {
            i28 = this.f244042c.m(i28);
        }
        this.f244044e = i18;
        this.f244045f = i19;
        this.f244046g = i28;
        this.f244047h = j17;
        this.f244048i = 2;
        this.f244049j = i29;
        this.f244050k = i37;
        this.f244051l = 0;
        this.f244052m = 0;
        this.f244053n = 0;
        this.f244054o = 0;
        this.f244055p = 0;
        dv5.b.c(this.f244041b, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r4 != ((short) r4)) goto L10;
     */
    @Override // dv5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r4, int r5, int r6, int r7, int r8, long r9) {
        /*
            r3 = this;
            boolean r4 = r3.f244043d
            dv5.h r7 = r3.f244041b
            if (r4 == 0) goto L2b
            dv5.c r4 = r3.f244042c
            int r8 = r4.m(r8)
            r4 = 40
            r0 = 42
            r1 = 41
            if (r5 == r4) goto L20
            if (r5 == r1) goto L17
            goto L2b
        L17:
            int r4 = r7.f244036b
            int r4 = r8 - r4
            short r1 = (short) r4
            if (r4 == r1) goto L2b
        L1e:
            r5 = r0
            goto L2b
        L20:
            int r4 = r7.f244036b
            int r4 = r8 - r4
            byte r2 = (byte) r4
            if (r4 == r2) goto L2b
            short r5 = (short) r4
            if (r4 != r5) goto L1e
            r5 = r1
        L2b:
            r3.f244044e = r5
            r3.f244045f = r6
            r3.f244046g = r8
            r3.f244047h = r9
            r4 = 0
            r3.f244048i = r4
            r3.f244049j = r4
            r3.f244050k = r4
            r3.f244051l = r4
            r3.f244052m = r4
            r3.f244053n = r4
            r3.f244054o = r4
            r3.f244055p = r4
            dv5.b.c(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dv5.f.l(int, int, int, int, int, long):void");
    }
}
