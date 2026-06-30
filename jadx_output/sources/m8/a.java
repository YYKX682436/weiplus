package m8;

/* loaded from: classes15.dex */
public abstract class a implements m8.b0, m8.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f324535d;

    /* renamed from: e, reason: collision with root package name */
    public m8.d0 f324536e;

    /* renamed from: f, reason: collision with root package name */
    public int f324537f;

    /* renamed from: g, reason: collision with root package name */
    public int f324538g;

    /* renamed from: h, reason: collision with root package name */
    public d9.g0 f324539h;

    /* renamed from: i, reason: collision with root package name */
    public long f324540i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f324541m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f324542n;

    public a(int i17) {
        this.f324535d = i17;
    }

    @Override // m8.g
    public void b(int i17, java.lang.Object obj) {
    }

    @Override // m8.c0
    public int g() {
        return 0;
    }

    @Override // m8.b0
    public t9.j j() {
        return null;
    }

    public final void k() {
        t9.a.d(this.f324538g == 1);
        this.f324538g = 0;
        this.f324539h = null;
        this.f324542n = false;
        l();
    }

    public abstract void l();

    public void m(boolean z17) {
    }

    public abstract void n(long j17, boolean z17);

    public void o() {
    }

    public void p() {
    }

    public void q(com.google.android.exoplayer2.Format[] formatArr, long j17) {
    }

    public final int r(m8.s sVar, o8.g gVar, boolean z17) {
        int a17 = this.f324539h.a(sVar, gVar, z17);
        if (a17 == -4) {
            if (gVar.b(4)) {
                this.f324541m = true;
                return this.f324542n ? -4 : -3;
            }
            gVar.f343611g += this.f324540i;
        } else if (a17 == -5) {
            com.google.android.exoplayer2.Format format = sVar.f324666a;
            long j17 = format.C;
            if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                sVar.f324666a = new com.google.android.exoplayer2.Format(format.f44075d, format.f44079h, format.f44080i, format.f44077f, format.f44076e, format.f44081m, format.f44084p, format.f44085q, format.f44086r, format.f44087s, format.f44088t, format.f44090v, format.f44089u, format.f44091w, format.f44092x, format.f44093y, format.f44094z, format.A, format.B, format.D, format.E, format.F, j17 + this.f324540i, format.f44082n, format.f44083o, format.f44078g);
            }
        }
        return a17;
    }
}
