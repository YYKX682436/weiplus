package kl;

/* loaded from: classes13.dex */
public abstract class e implements kl.k {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.Object f308709o = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f308710a;

    /* renamed from: b, reason: collision with root package name */
    public kl.l f308711b;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f308721l;

    /* renamed from: n, reason: collision with root package name */
    public kl.l f308723n;

    /* renamed from: c, reason: collision with root package name */
    public int f308712c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f308713d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f308714e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f308715f = 44100;

    /* renamed from: g, reason: collision with root package name */
    public int f308716g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f308717h = 2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f308718i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f308719j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f308720k = false;

    /* renamed from: m, reason: collision with root package name */
    public byte[][] f308722m = new byte[2];

    public e(int i17) {
        this.f308710a = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // kl.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] a(byte[] r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.e.a(byte[]):byte[]");
    }

    @Override // kl.k
    public void b() {
    }

    @Override // kl.k
    public hl.e c(int i17) {
        return null;
    }

    @Override // kl.k
    public void d() {
    }

    public kl.l e() {
        return kl.c.a(this.f308710a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if (r13 != 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] f(byte[] r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.e.f(byte[]):byte[]");
    }

    public void g(int i17, int i18, int i19) {
        synchronized (this) {
            int i27 = this.f308712c;
            this.f308712c = i17;
            this.f308713d = i18;
            this.f308714e = i19;
            if (this.f308715f != i17) {
                kl.l lVar = this.f308711b;
                if (lVar == null) {
                    kl.l e17 = e();
                    this.f308711b = e17;
                    e17.b(this.f308721l, this.f308712c, this.f308714e, this.f308715f, this.f308717h);
                } else if (lVar != null && i27 != i17) {
                    lVar.release();
                    kl.l e18 = e();
                    this.f308711b = e18;
                    e18.b(this.f308721l, this.f308712c, this.f308714e, this.f308715f, this.f308717h);
                }
                if (this.f308713d == 2 && this.f308716g == 2) {
                    kl.l lVar2 = this.f308723n;
                    if (lVar2 == null) {
                        kl.l e19 = e();
                        this.f308723n = e19;
                        e19.b(this.f308721l + "RResample", this.f308712c, this.f308714e, this.f308715f, this.f308717h);
                    } else if (lVar2 != null && i27 != this.f308712c) {
                        lVar2.release();
                        kl.l e27 = e();
                        this.f308723n = e27;
                        e27.b(this.f308721l + "RResample", this.f308712c, this.f308714e, this.f308715f, this.f308717h);
                    }
                }
                this.f308720k = true;
            } else {
                this.f308720k = false;
                kl.l lVar3 = this.f308711b;
                if (lVar3 != null) {
                    lVar3.release();
                    this.f308711b = null;
                }
            }
            if (this.f308717h != this.f308714e) {
                this.f308719j = true;
            }
            if (this.f308716g != this.f308713d) {
                this.f308718i = true;
            }
        }
    }

    @Override // kl.k
    public void release() {
        synchronized (this) {
            kl.l lVar = this.f308711b;
            if (lVar != null) {
                lVar.release();
                this.f308711b = null;
            }
            kl.l lVar2 = this.f308723n;
            if (lVar2 != null) {
                lVar2.release();
                this.f308723n = null;
            }
        }
    }
}
