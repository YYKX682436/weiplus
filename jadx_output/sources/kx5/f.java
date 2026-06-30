package kx5;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx5.m f313295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kx5.n f313298g;

    public f(kx5.n nVar, kx5.m mVar, java.lang.String str, int i17) {
        this.f313298g = nVar;
        this.f313295d = mVar;
        this.f313296e = str;
        this.f313297f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f313296e;
        kx5.c cVar = (kx5.c) this.f313295d;
        nx5.c.b("WxaRouter.WxaRouter", "invoke releaseEngine timeout. destroy engine: %d", java.lang.Integer.valueOf(cVar.f313286b));
        if (!cVar.f313285a) {
            kx5.n.a(cVar.f313288d, cVar.f313287c);
            cVar.f313285a = true;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.METHOD, str);
            jSONObject.put("timeout", this.f313297f);
        } catch (org.json.JSONException unused) {
        }
        kx5.l lVar = this.f313298g.f313323m;
        if (lVar != null) {
            lVar.dataReporting("invokeMethodTimeout", jSONObject.toString(), "");
        }
        nx5.c.c("WxaRouter.WxaRouter", "invokeMethod %s timeout", str);
    }
}
