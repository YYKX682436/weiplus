package nd1;

/* loaded from: classes7.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336393h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336394i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.t1 f336395m;

    public s1(nd1.t1 t1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        this.f336395m = t1Var;
        this.f336389d = e9Var;
        this.f336390e = i17;
        this.f336391f = str;
        this.f336392g = i18;
        this.f336393h = str2;
        this.f336394i = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336389d;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.t3().x0().getCurrentPage();
        boolean z17 = currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1;
        nd1.t1 t1Var = this.f336395m;
        int i17 = this.f336390e;
        if (!z17) {
            e9Var.a(i17, t1Var.o("fail:not TabBar page"));
            return;
        }
        zl1.t tabBar = ((com.tencent.mm.plugin.appbrand.page.y1) currentPage).getTabBar();
        zl1.b0 b0Var = tabBar.f473615d;
        nd1.q1 q1Var = new nd1.q1(this, tabBar);
        java.lang.String str = this.f336391f;
        int i18 = this.f336392g;
        tabBar.h(this.f336392g, this.f336393h, b0Var.a(str, q1Var, e9Var, i18), tabBar.f473615d.a(this.f336394i, new nd1.r1(this, tabBar), e9Var, i18), false);
        e9Var.a(i17, t1Var.o("ok"));
    }
}
