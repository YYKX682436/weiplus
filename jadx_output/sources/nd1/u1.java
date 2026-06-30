package nd1;

/* loaded from: classes7.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336402h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336403i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.v1 f336404m;

    public u1(nd1.v1 v1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f336404m = v1Var;
        this.f336398d = e9Var;
        this.f336399e = i17;
        this.f336400f = str;
        this.f336401g = str2;
        this.f336402h = str3;
        this.f336403i = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336398d;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.getRuntime().x0().getCurrentPage();
        boolean z17 = currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1;
        nd1.v1 v1Var = this.f336404m;
        int i17 = this.f336399e;
        if (!z17) {
            e9Var.a(i17, v1Var.o("fail:not TabBar page"));
            return;
        }
        zl1.t tabBar = ((com.tencent.mm.plugin.appbrand.page.y1) currentPage).getTabBar();
        java.lang.String str = this.f336402h;
        java.lang.String str2 = this.f336403i;
        java.lang.String str3 = this.f336400f;
        java.lang.String str4 = this.f336401g;
        tabBar.getClass();
        tabBar.e(new zl1.g(tabBar, str3, str4, str, str2));
        e9Var.a(i17, v1Var.o("ok"));
    }
}
