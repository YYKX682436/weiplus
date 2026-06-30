package nd1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.l f336322g;

    public k(nd1.l lVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f336322g = lVar;
        this.f336319d = e9Var;
        this.f336320e = i17;
        this.f336321f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336319d;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.t3().x0().getCurrentPage();
        boolean z17 = currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1;
        nd1.l lVar = this.f336322g;
        int i17 = this.f336320e;
        if (!z17) {
            e9Var.a(i17, lVar.o("fail:not TabBar page"));
        } else {
            ((com.tencent.mm.plugin.appbrand.page.y1) currentPage).getTabBar().d(this.f336321f.optBoolean("animation", true));
            e9Var.a(i17, lVar.o("ok"));
        }
    }
}
