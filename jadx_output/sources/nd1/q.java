package nd1;

/* loaded from: classes.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f336379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd1.r f336381i;

    public q(nd1.r rVar, com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
        this.f336381i = rVar;
        this.f336376d = yVar;
        this.f336377e = i17;
        this.f336378f = str;
        this.f336379g = jSONObject;
        this.f336380h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f336376d;
        int i17 = yVar.getRuntime().E0().f305844g;
        int s17 = yVar.getRuntime().x0().s(false);
        nd1.r rVar = this.f336381i;
        int i18 = this.f336377e;
        if (s17 < i17) {
            com.tencent.mm.plugin.appbrand.page.i3 x07 = yVar.getRuntime().x0();
            x07.getClass();
            x07.c0(new com.tencent.mm.plugin.appbrand.page.k4(x07, this.f336378f, this.f336379g, this.f336380h));
            yVar.a(i18, rVar.o("ok"));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNavigateTo", "page limit exceeded: " + i17);
        yVar.a(i18, rVar.o("fail:page limit exceeded: " + i17));
    }
}
