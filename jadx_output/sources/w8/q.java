package w8;

/* loaded from: classes15.dex */
public final class q implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f443740a = new t9.p(10);

    /* renamed from: b, reason: collision with root package name */
    public q8.o f443741b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443742c;

    /* renamed from: d, reason: collision with root package name */
    public long f443743d;

    /* renamed from: e, reason: collision with root package name */
    public int f443744e;

    /* renamed from: f, reason: collision with root package name */
    public int f443745f;

    @Override // w8.h
    public void a(t9.p pVar) {
        if (this.f443742c) {
            int i17 = pVar.f416542c - pVar.f416541b;
            int i18 = this.f443745f;
            if (i18 < 10) {
                int min = java.lang.Math.min(i17, 10 - i18);
                byte[] bArr = pVar.f416540a;
                int i19 = pVar.f416541b;
                t9.p pVar2 = this.f443740a;
                java.lang.System.arraycopy(bArr, i19, pVar2.f416540a, this.f443745f, min);
                if (this.f443745f + min == 10) {
                    pVar2.w(0);
                    if (73 != pVar2.m() || 68 != pVar2.m() || 51 != pVar2.m()) {
                        this.f443742c = false;
                        return;
                    } else {
                        pVar2.x(3);
                        this.f443744e = pVar2.l() + 10;
                    }
                }
            }
            int min2 = java.lang.Math.min(i17, this.f443744e - this.f443745f);
            this.f443741b.a(pVar, min2);
            this.f443745f += min2;
        }
    }

    @Override // w8.h
    public void b() {
        this.f443742c = false;
    }

    @Override // w8.h
    public void c() {
        int i17;
        if (this.f443742c && (i17 = this.f443744e) != 0 && this.f443745f == i17) {
            this.f443741b.b(this.f443743d, 1, i17, 0, null);
            this.f443742c = false;
        }
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        if (z17) {
            this.f443742c = true;
            this.f443743d = j17;
            this.f443744e = 0;
            this.f443745f = 0;
        }
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f443644d, 4);
        this.f443741b = l17;
        g0Var.b();
        l17.c(com.google.android.exoplayer2.Format.f(g0Var.f443645e, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_ID3, null, -1, null));
    }
}
