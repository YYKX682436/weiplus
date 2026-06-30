package zd;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f471509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f471511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zd.g f471512g;

    public f(zd.g gVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f471512g = gVar;
        this.f471509d = e9Var;
        this.f471510e = i17;
        this.f471511f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f471509d;
        boolean isRunning = e9Var.isRunning();
        zd.g gVar = this.f471512g;
        int i17 = this.f471510e;
        if (!isRunning) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
            e9Var.a(i17, gVar.o("fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (((ce.g) V0.B1(ce.g.class)) == null) {
            e9Var.a(i17, gVar.o("fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 D = zd.g.D(V0, this.f471511f, false);
        e9Var.a(i17, gVar.p(D.f81320b, D.f81319a));
    }
}
