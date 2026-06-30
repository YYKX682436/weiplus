package fc3;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: q, reason: collision with root package name */
    public static final fc3.a f261020q = new fc3.a(null);

    /* renamed from: r, reason: collision with root package name */
    public static android.graphics.Typeface f261021r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f261022s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.List f261023t;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f261024a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f261025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f261026c;

    /* renamed from: d, reason: collision with root package name */
    public final fc3.s f261027d;

    /* renamed from: e, reason: collision with root package name */
    public int f261028e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f261029f;

    /* renamed from: g, reason: collision with root package name */
    public int f261030g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f261031h;

    /* renamed from: i, reason: collision with root package name */
    public long f261032i;

    /* renamed from: j, reason: collision with root package name */
    public long f261033j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f261034k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f261035l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261036m;

    /* renamed from: n, reason: collision with root package name */
    public int f261037n;

    /* renamed from: o, reason: collision with root package name */
    public int f261038o;

    /* renamed from: p, reason: collision with root package name */
    public int f261039p;

    static {
        android.graphics.PointF pointF = new android.graphics.PointF(320.0f, 560.0f);
        f261022s = kz5.c0.i(new android.graphics.PointF(30.0f / pointF.x, 110.0f / pointF.y), new android.graphics.PointF(235.0f / pointF.x, 65.0f / pointF.y), new android.graphics.PointF(95.0f / pointF.x, 68.0f / pointF.y), new android.graphics.PointF(293.0f / pointF.x, 120.0f / pointF.y), new android.graphics.PointF(70.0f / pointF.x, 270.0f / pointF.y), new android.graphics.PointF(300.0f / pointF.x, 345.0f / pointF.y), new android.graphics.PointF(22.0f / pointF.x, 337.0f / pointF.y), new android.graphics.PointF(255.0f / pointF.x, 305.0f / pointF.y), new android.graphics.PointF(41.0f / pointF.x, 464.0f / pointF.y), new android.graphics.PointF(287.0f / pointF.x, 470.0f / pointF.y));
        f261023t = kz5.c0.i(new fc3.b(56.0f, 0.35f, 3.0f), new fc3.b(32.0f, 0.3f, 1.0f), new fc3.b(24.0f, 0.3f, 1.0f), new fc3.b(60.0f, 0.35f, 3.0f), new fc3.b(48.0f, 0.2f, 2.0f), new fc3.b(36.0f, 0.35f, 1.0f), new fc3.b(32.0f, 0.35f, 1.0f), new fc3.b(40.0f, 0.2f, 2.0f), new fc3.b(28.0f, 0.3f, 1.0f), new fc3.b(24.0f, 0.3f, 1.0f));
    }

    public e(android.content.Context context, android.widget.FrameLayout layout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f261024a = context;
        this.f261025b = layout;
        this.f261026c = 800;
        this.f261027d = new fc3.s(context, layout);
        this.f261035l = "";
        this.f261036m = "";
        this.f261039p = 88;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " pauseAllKeywordText");
        this.f261029f = null;
        this.f261030g = 0;
        this.f261033j = 0L;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f261031h;
        if (b4Var != null) {
            kotlin.jvm.internal.o.d(b4Var);
            if (b4Var.e()) {
                return;
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f261031h;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            this.f261031h = null;
        }
    }

    public final void b() {
        try {
            if (f261021r == null) {
                java.lang.String str = com.tencent.mm.plugin.luckymoney.model.e5.e() + "/WXfzysc.ttf";
                if (!com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mm.plugin.luckymoney.model.e5.p();
                }
                if (com.tencent.mm.vfs.w6.j(str)) {
                    f261021r = android.graphics.Typeface.createFromFile(str);
                } else {
                    f261021r = null;
                    com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyKeywordTextHelper", "ttf not exits:" + str);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
        fc3.s sVar = this.f261027d;
        sVar.f261082g = 1.0f;
        sVar.f261081f = 6.0f;
        sVar.f261079d = 3000L;
        sVar.f261085j = sVar.f261076a.getResources().getColor(com.tencent.mm.R.color.f479371p3);
        sVar.f261083h = false;
        sVar.f261089n = true;
        sVar.f261086k = f261021r;
        sVar.f261084i = new android.view.animation.DecelerateInterpolator(1.5f);
    }

    public final void c(java.util.List keywords) {
        kotlin.jvm.internal.o.g(keywords, "keywords");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " shootAllKeywordText:" + keywords.size());
            this.f261030g = 0;
            this.f261029f = keywords;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f261033j = java.lang.System.currentTimeMillis();
            e();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
    }

    public final void d(java.lang.String text) {
        fc3.k walletText;
        kotlin.jvm.internal.o.g(text, "text");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f261032i = java.lang.System.currentTimeMillis();
        android.widget.FrameLayout frameLayout = this.f261025b;
        android.graphics.PointF pointF = new android.graphics.PointF(frameLayout.getWidth() / 2, frameLayout.getHeight() - i65.a.b(this.f261024a, this.f261039p));
        fc3.s sVar = this.f261027d;
        sVar.getClass();
        sVar.f261080e = pointF;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " shootKeywordText:" + text + " startPos:" + sVar.f261080e + " posSize:" + this.f261028e);
        int i17 = this.f261028e;
        java.util.List list = f261022s;
        if (i17 < list.size()) {
            android.graphics.PointF pointF2 = (android.graphics.PointF) list.get(this.f261028e);
            fc3.b bVar = (fc3.b) f261023t.get(this.f261028e);
            android.graphics.PointF pointF3 = new android.graphics.PointF(pointF2.x * frameLayout.getWidth(), pointF2.y * frameLayout.getHeight());
            this.f261028e++;
            sVar.c(new fc3.k(text, pointF3, bVar.f261013a, bVar.f261014b, bVar.f261015c));
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sVar.f261078c).iterator();
        while (true) {
            if (!it.hasNext()) {
                walletText = null;
                break;
            }
            walletText = (fc3.k) it.next();
            int i18 = walletText.f261056g;
            if (i18 != 4 && i18 != 5) {
                break;
            }
        }
        if ((walletText != null ? walletText.f261054e : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyKeywordTextHelper", "first text is null");
            return;
        }
        sVar.getClass();
        kotlin.jvm.internal.o.g(walletText, "walletText");
        if (walletText.f261054e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletTextAnimator", sVar.hashCode() + " popText:" + walletText.f261050a + " withAnimation:true");
            walletText.f261056g = 4;
            android.widget.TextView textView = walletText.f261054e;
            kotlin.jvm.internal.o.d(textView);
            textView.animate().alpha(0.0f).setDuration(500L).setListener(new fc3.l(sVar, walletText));
        } else {
            sVar.b(walletText);
        }
        android.widget.TextView textView2 = walletText.f261054e;
        kotlin.jvm.internal.o.d(textView2);
        float x17 = textView2.getX();
        kotlin.jvm.internal.o.d(walletText.f261054e);
        float width = x17 + (r4.getWidth() / 2);
        android.widget.TextView textView3 = walletText.f261054e;
        kotlin.jvm.internal.o.d(textView3);
        float y17 = textView3.getY();
        kotlin.jvm.internal.o.d(walletText.f261054e);
        sVar.c(new fc3.k(text, new android.graphics.PointF(width, y17 + (r5.getHeight() / 2)), walletText.f261052c, walletText.f261053d, walletText.f261055f));
    }

    public final void e() {
        try {
            java.util.List list = this.f261029f;
            if (list != null) {
                kotlin.jvm.internal.o.d(list);
                if (list.size() > this.f261030g) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " shootNextKeywordText:" + this.f261030g);
                    if (this.f261031h == null) {
                        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                        f0Var.f310116d = this.f261030g;
                        this.f261031h = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new fc3.d(this, f0Var), false);
                    }
                    com.tencent.mm.sdk.platformtools.b4 b4Var = this.f261031h;
                    kotlin.jvm.internal.o.d(b4Var);
                    if (b4Var.e()) {
                        java.util.List list2 = this.f261029f;
                        kotlin.jvm.internal.o.d(list2);
                        java.lang.String timeMs = ((z21.c) list2.get(this.f261030g)).f469560b;
                        kotlin.jvm.internal.o.f(timeMs, "timeMs");
                        long parseLong = java.lang.Long.parseLong(timeMs);
                        if (this.f261030g > 0) {
                            java.util.List list3 = this.f261029f;
                            kotlin.jvm.internal.o.d(list3);
                            java.lang.String timeMs2 = ((z21.c) list3.get(this.f261030g - 1)).f469560b;
                            kotlin.jvm.internal.o.f(timeMs2, "timeMs");
                            parseLong -= java.lang.Long.parseLong(timeMs2);
                        }
                        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f261031h;
                        if (b4Var2 != null) {
                            b4Var2.c(parseLong, parseLong);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
    }

    public final void f(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " stopAll withAnimation:" + z17);
        this.f261034k = false;
        this.f261027d.d(z17);
        this.f261029f = null;
        this.f261030g = 0;
        this.f261028e = 0;
        this.f261033j = 0L;
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f261031h;
        if (b4Var2 != null) {
            kotlin.jvm.internal.o.d(b4Var2);
            if (!b4Var2.e() && (b4Var = this.f261031h) != null) {
                b4Var.d();
            }
        }
        this.f261031h = null;
    }
}
