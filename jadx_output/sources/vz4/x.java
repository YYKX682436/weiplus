package vz4;

/* loaded from: classes8.dex */
public class x implements kh0.h {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.regex.Pattern f441752u = java.util.regex.Pattern.compile(".*#.*wechat_redirect");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f441753a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f441755c;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.model.s f441757e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.model.WepkgVersion f441758f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.wepkg.event.c f441759g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.game.report.api.GameWebPerformanceInfo f441760h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.wepkg.model.m f441761i;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.event.d f441764l;

    /* renamed from: o, reason: collision with root package name */
    public long f441767o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f441769q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f441770r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f441771s;

    /* renamed from: b, reason: collision with root package name */
    public long f441754b = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f441756d = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f441762j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f441763k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f441765m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f441766n = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public boolean f441768p = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f441772t = false;

    public x() {
        java.util.Map map = vz4.s.f441744a;
        if (!com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            com.tencent.mm.plugin.wepkg.utils.n.a("", new vz4.p());
        }
        this.f441761i = new com.tencent.mm.plugin.wepkg.model.m();
        if (vz4.s.f441746c == 0) {
            vz4.b.b();
        }
        vz4.s.f441746c++;
        vz4.t tVar = new vz4.t(this);
        this.f441759g = tVar;
        com.tencent.mm.plugin.wepkg.event.h.f188332a.add(new java.lang.ref.WeakReference(tVar));
    }

    public final void a() {
        this.f441768p = false;
        ((com.tencent.mm.plugin.game.luggage.e0) ((s43.k) i95.n0.c(s43.k.class))).Ai(this.f441755c);
    }

    public java.lang.String b() {
        return vz4.b.a();
    }

    public boolean c() {
        return this.f441756d;
    }

    public boolean d(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (f441752u.matcher(str).find()) {
            return false;
        }
        return this.f441756d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(java.lang.String str, boolean z17, boolean z18) {
        this.f441771s = z18;
        this.f441753a = str;
        java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
        this.f441755c = kh0.i.a(str);
        com.tencent.mm.plugin.wepkg.model.s b17 = vz4.s.b(str, z17);
        int i17 = b17.f188395a;
        if ((i17 == 0) == true) {
            this.f441757e = b17;
            this.f441756d = true;
            com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = b17.f188462d;
            this.f441758f = wepkgVersion;
            com.tencent.mm.plugin.wepkg.utils.a.c("WepkgUsed", this.f441753a, this.f441755c, wepkgVersion.f188376f, 2L, 0L, null);
            com.tencent.mm.plugin.wepkg.utils.a.c("EnterWeb", this.f441753a, this.f441755c, this.f441758f.f188376f, 1L, 0L, null);
        } else {
            com.tencent.mm.plugin.wepkg.utils.a.c("WepkgUsed", this.f441753a, this.f441755c, b17.f188397c, 3L, 0L, com.tencent.mm.plugin.wepkg.utils.a.d(i17));
        }
        if (b17.f188396b) {
            com.tencent.mm.plugin.wepkg.utils.a.c("WepkgUsed", this.f441753a, this.f441755c, b17.f188397c, 1L, 0L, null);
        }
        java.lang.String str2 = this.f441753a;
        java.lang.String str3 = this.f441755c;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion2 = this.f441758f;
        com.tencent.mm.plugin.wepkg.utils.a.c("WepkgUsed", str2, str3, wepkgVersion2 != null ? wepkgVersion2.f188376f : "", 0L, 0L, null);
        if (this.f441756d && !com.tencent.mm.sdk.platformtools.t8.K0(this.f441755c)) {
            boolean z19 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_page_cache, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "isOpenPageCache:%b", java.lang.Boolean.valueOf(z19));
            if (z19) {
                s43.k kVar = (s43.k) i95.n0.c(s43.k.class);
                java.lang.String str4 = this.f441755c;
                ((com.tencent.mm.plugin.game.luggage.e0) kVar).getClass();
                java.lang.String b18 = ew4.c.c().b(str4);
                this.f441769q = b18;
                if (b18 != null && b18.length() < 8) {
                    this.f441769q = null;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "wepkgAvailable:%s, pkgId:%s", java.lang.Boolean.valueOf(this.f441756d), this.f441755c);
        if (this.f441760h == null) {
            com.tencent.mm.game.report.api.GameWebPerformanceInfo b19 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(str);
            this.f441760h = b19;
            b19.f68184q = kh0.i.a(str);
            com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.f441760h;
            gameWebPerformanceInfo.f68177g = this.f441756d ? 1 : 0;
            gameWebPerformanceInfo.M = vz4.b.a();
            com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo2 = this.f441760h;
            com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion3 = this.f441758f;
            gameWebPerformanceInfo2.N = wepkgVersion3 != null ? wepkgVersion3.f188376f : "";
        }
        return this.f441756d;
    }

    public void f(android.webkit.ConsoleMessage consoleMessage) {
        this.f441763k = true;
        java.lang.String message = consoleMessage != null ? consoleMessage.message() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(message) || !message.equalsIgnoreCase("weixin://whiteScreenEnd")) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "mIsReceivedWhiteScreenEnd: true");
        this.f441762j = true;
    }

    public void g(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f441770r;
        if (b4Var != null) {
            b4Var.d();
        }
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f441755c)) {
            ((java.util.HashMap) vz4.s.f441744a).remove(this.f441755c);
            com.tencent.mm.plugin.wepkg.model.i.c().e(this.f441755c, 2, 1);
        }
        int i17 = vz4.s.f441746c - 1;
        vz4.s.f441746c = i17;
        if (i17 == 0) {
            ((java.util.HashMap) vz4.s.f441744a).clear();
            vz4.b.b();
        }
        com.tencent.mm.plugin.wepkg.event.h.b(this.f441759g);
    }

    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        boolean z17;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion;
        if (this.f441754b != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f441754b;
            java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
            java.lang.String a17 = kh0.i.a(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mm.plugin.wepkg.utils.a.c("PageLoadTime", str, "", null, 2L, currentTimeMillis, null);
            } else if (!this.f441756d || (wepkgVersion = this.f441758f) == null) {
                com.tencent.mm.plugin.wepkg.utils.a.c("PageLoadTime", str, a17, null, 0L, currentTimeMillis, null);
            } else {
                com.tencent.mm.plugin.wepkg.utils.a.c("PageLoadTime", str, wepkgVersion.f188374d, wepkgVersion.f188376f, 1L, currentTimeMillis, null);
            }
            this.f441754b = 0L;
        }
        if (!this.f441756d || this.f441757e == null || this.f441771s) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f441769q)) {
            com.tencent.mm.plugin.wepkg.model.s sVar = this.f441757e;
            sVar.getClass();
            java.lang.Object obj2 = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
            com.tencent.xweb.y0 a18 = sVar.a(kh0.i.b(str));
            if (a18 != null) {
                java.io.InputStream inputStream = a18.f220626f;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "startTimer");
        if (this.f441770r == null) {
            this.f441770r = new com.tencent.mm.sdk.platformtools.b4(new vz4.w(this), false);
        }
        this.f441770r.c(1000L, 1000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.xweb.y0 i(com.tencent.xweb.WebView r18, java.lang.String r19, com.tencent.xweb.x0 r20) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vz4.x.i(com.tencent.xweb.WebView, java.lang.String, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }
}
