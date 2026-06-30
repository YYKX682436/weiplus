package nd1;

/* loaded from: classes7.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.m1 f336337g;

    public l1(nd1.m1 m1Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f336337g = m1Var;
        this.f336334d = jSONObject;
        this.f336335e = e9Var;
        this.f336336f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String optString = this.f336334d.optString("color", "");
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336335e;
        com.tencent.mm.plugin.appbrand.page.v5 pageView = e9Var.t3().x0().getPageView();
        nd1.m1 m1Var = this.f336337g;
        int i17 = this.f336336f;
        if (pageView == null) {
            e9Var.a(i17, m1Var.o("fail:page don't exist"));
            return;
        }
        if (optString.equals("white") || optString.equals("black")) {
            pageView.f3(optString);
        }
        e9Var.a(i17, m1Var.o("ok"));
    }
}
