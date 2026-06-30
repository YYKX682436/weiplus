package r8;

/* loaded from: classes15.dex */
public final class f extends r8.e {

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f393282b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f393283c;

    /* renamed from: d, reason: collision with root package name */
    public int f393284d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f393285e;

    /* renamed from: f, reason: collision with root package name */
    public int f393286f;

    public f(q8.o oVar) {
        super(oVar);
        this.f393282b = new t9.p(t9.n.f416532a);
        this.f393283c = new t9.p(4);
    }

    public boolean a(t9.p pVar) {
        int m17 = pVar.m();
        int i17 = (m17 >> 4) & 15;
        int i18 = m17 & 15;
        if (i18 == 7) {
            this.f393286f = i17;
            return i17 != 5;
        }
        throw new r8.d("Video format not supported: " + i18);
    }

    public void b(t9.p pVar, long j17) {
        int m17 = pVar.m();
        long o17 = j17 + (pVar.o() * 1000);
        q8.o oVar = this.f393281a;
        if (m17 == 0 && !this.f393285e) {
            t9.p pVar2 = new t9.p(new byte[pVar.f416542c - pVar.f416541b]);
            pVar.b(pVar2.f416540a, 0, pVar.f416542c - pVar.f416541b);
            u9.a a17 = u9.a.a(pVar2);
            this.f393284d = a17.f425727b;
            oVar.c(com.google.android.exoplayer2.Format.m(null, "video/avc", null, -1, -1, a17.f425728c, a17.f425729d, -1.0f, a17.f425726a, -1, a17.f425730e, null));
            this.f393285e = true;
            return;
        }
        if (m17 == 1 && this.f393285e) {
            t9.p pVar3 = this.f393283c;
            byte[] bArr = pVar3.f416540a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i17 = 4 - this.f393284d;
            int i18 = 0;
            while (pVar.f416542c - pVar.f416541b > 0) {
                pVar.b(pVar3.f416540a, i17, this.f393284d);
                pVar3.w(0);
                int p17 = pVar3.p();
                t9.p pVar4 = this.f393282b;
                pVar4.w(0);
                oVar.a(pVar4, 4);
                oVar.a(pVar, p17);
                i18 = i18 + 4 + p17;
            }
            this.f393281a.b(o17, this.f393286f == 1 ? 1 : 0, i18, 0, null);
        }
    }
}
