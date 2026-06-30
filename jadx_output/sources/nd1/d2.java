package nd1;

/* loaded from: classes7.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.e2 f336289g;

    public d2(nd1.e2 e2Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f336289g = e2Var;
        this.f336286d = e9Var;
        this.f336287e = i17;
        this.f336288f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336286d;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.t3().x0().getCurrentPage();
        boolean z17 = currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1;
        nd1.e2 e2Var = this.f336289g;
        int i17 = this.f336287e;
        if (!z17) {
            e9Var.a(i17, e2Var.o("fail:not TabBar page"));
        } else {
            ((com.tencent.mm.plugin.appbrand.page.y1) currentPage).getTabBar().i(this.f336288f.optBoolean("animation", true));
            e9Var.a(i17, e2Var.o("ok"));
        }
    }
}
