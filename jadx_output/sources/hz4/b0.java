package hz4;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: q, reason: collision with root package name */
    public static hz4.b0 f286381q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f286382a;

    /* renamed from: b, reason: collision with root package name */
    public long f286383b;

    /* renamed from: c, reason: collision with root package name */
    public long f286384c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f286385d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Toast f286387f;

    /* renamed from: h, reason: collision with root package name */
    public tl.y0 f286389h;

    /* renamed from: i, reason: collision with root package name */
    public w21.k0 f286390i;

    /* renamed from: l, reason: collision with root package name */
    public jz4.a f286393l;

    /* renamed from: e, reason: collision with root package name */
    public long f286386e = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f286391j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f286392k = "";

    /* renamed from: m, reason: collision with root package name */
    public iz4.l f286394m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f286395n = new hz4.y(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f286396o = new hz4.z(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f286397p = new com.tencent.mm.sdk.platformtools.b4(new hz4.a0(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final fp.e f286388g = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);

    public static hz4.b0 a() {
        if (f286381q == null) {
            f286381q = new hz4.b0();
        }
        return f286381q;
    }

    public final void b() {
        if (this.f286382a) {
            this.f286396o.removeMessages(4096);
            if (this.f286391j.equals("speex")) {
                this.f286390i.stopRecord();
            } else {
                this.f286389h.b();
            }
            fp.e eVar = this.f286388g;
            if (eVar != null) {
                eVar.a();
            }
            long j17 = this.f286383b;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            this.f286384c = j18;
            boolean z18 = j18 < 800;
            this.f286397p.d();
            if (z18) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f286392k);
                if (r6Var.m()) {
                    r6Var.l();
                }
                this.f286395n.sendEmptyMessageDelayed(0, 500L);
            } else {
                long j19 = this.f286384c / 1000;
            }
            this.f286382a = false;
        }
    }

    public int c(android.content.Context context, int i17, android.widget.TextView textView, jz4.a aVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.vfs.z2 m17;
        if (!this.f286382a) {
            this.f286382a = true;
            this.f286393l = aVar;
            this.f286391j = str;
            this.f286392k = str2;
            fp.e eVar = this.f286388g;
            if (eVar != null) {
                eVar.b();
            }
            this.f286385d = false;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f286392k)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.p5.a(true), "wenote/voice/data");
                if (!r6Var.m()) {
                    r6Var.J();
                }
                java.lang.String o17 = r6Var.o();
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(o17);
                java.lang.String str4 = a17.f213279f;
                if (str4 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                    if (!str4.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, null);
                if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
                    com.tencent.mm.vfs.z2 m19 = b3Var.m(a17, m18);
                    if (m19.a()) {
                        m19.f213266a.r(m19.f213267b);
                    }
                }
                do {
                    str3 = o17 + "/" + java.lang.System.currentTimeMillis();
                    com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
                    java.lang.String str5 = a18.f213279f;
                    if (str5 != null) {
                        java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
                        if (!str5.equals(l18)) {
                            a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                        }
                    }
                    m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                } while (!m17.a() ? false : m17.f213266a.F(m17.f213267b));
                this.f286392k = str3;
            }
            if ((com.tencent.mm.sdk.platformtools.t8.K0(str) ? "amr" : str).equals("speex")) {
                this.f286390i = new w21.k0();
            } else {
                tl.y0 y0Var = new tl.y0();
                this.f286389h = y0Var;
                y0Var.f420191d = new hz4.x(this);
            }
            this.f286386e = -1L;
            if ((str.equals("speex") ? java.lang.Boolean.valueOf(this.f286390i.startRecord(this.f286392k)) : java.lang.Boolean.valueOf(this.f286389h.a(this.f286392k, 3600010))).booleanValue()) {
                this.f286383b = android.os.SystemClock.elapsedRealtime();
                this.f286397p.c(200L, 200L);
            } else {
                this.f286383b = 0L;
            }
            if (this.f286383b == 0) {
                return -1;
            }
            this.f286396o.sendEmptyMessage(4096);
        }
        return 0;
    }
}
