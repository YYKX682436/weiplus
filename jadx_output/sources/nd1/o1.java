package nd1;

/* loaded from: classes7.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336372h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336373i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336374m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nd1.p1 f336375n;

    public o1(nd1.p1 p1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f336375n = p1Var;
        this.f336368d = e9Var;
        this.f336369e = i17;
        this.f336370f = i18;
        this.f336371g = str;
        this.f336372h = str2;
        this.f336373i = str3;
        this.f336374m = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336368d;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.getRuntime().x0().getCurrentPage();
        boolean z17 = currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1;
        nd1.p1 p1Var = this.f336375n;
        int i19 = this.f336369e;
        if (!z17) {
            e9Var.a(i19, p1Var.o("fail:not TabBar page"));
            return;
        }
        zl1.t tabBar = ((com.tencent.mm.plugin.appbrand.page.y1) currentPage).getTabBar();
        java.lang.String str = this.f336373i;
        java.lang.String str2 = this.f336374m;
        tabBar.getClass();
        try {
            i17 = ik1.w.l(str);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        try {
            i18 = ik1.w.l(str2);
        } catch (java.lang.Exception unused2) {
            i18 = -1;
        }
        int i27 = 0;
        while (true) {
            java.util.LinkedList linkedList = tabBar.f473620i;
            if (i27 >= linkedList.size()) {
                tabBar.e(new zl1.b(tabBar));
                e9Var.a(i19, p1Var.o("ok"));
                return;
            }
            if (i27 == this.f336370f) {
                zl1.r rVar = (zl1.r) linkedList.get(i27);
                rVar.f473610f = false;
                rVar.f473611g = "";
                rVar.f473612h = 0;
                rVar.f473613i = -1;
                java.lang.String str3 = this.f336371g;
                if ("redDot".equals(str3)) {
                    ((zl1.r) linkedList.get(i27)).f473610f = true;
                } else if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT.equals(str3)) {
                    ((zl1.r) linkedList.get(i27)).f473611g = this.f336372h;
                    ((zl1.r) linkedList.get(i27)).f473612h = i17;
                    ((zl1.r) linkedList.get(i27)).f473613i = i18;
                } else if (com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE.equals(str3)) {
                    ((zl1.r) linkedList.get(i27)).f473610f = false;
                    ((zl1.r) linkedList.get(i27)).f473611g = "";
                }
            }
            i27++;
        }
    }
}
