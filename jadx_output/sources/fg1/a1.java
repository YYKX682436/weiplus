package fg1;

/* loaded from: classes7.dex */
public class a1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd1.i f261840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f261841b;

    public a1(fg1.g1 g1Var, pd1.i iVar) {
        this.f261841b = g1Var;
        this.f261840a = iVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        pd1.i iVar = this.f261840a;
        fg1.g1 g1Var = this.f261841b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, value: " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            bg.f fVar = g1Var.f261868a;
            bg.f fVar2 = g1Var.f261868a;
            fVar.G = ik1.w.c(jSONObject.optInt("x", fVar.G));
            fVar.H = ik1.w.c(jSONObject.optInt("y", fVar.H));
            fVar.A();
            iVar.a(fVar2.C(), fVar2.D());
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, parse " + str + " failed");
            iVar.a(g1Var.f261868a.C(), g1Var.f261868a.D());
        }
    }
}
