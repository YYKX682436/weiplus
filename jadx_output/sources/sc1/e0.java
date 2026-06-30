package sc1;

/* loaded from: classes7.dex */
public class e0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f405654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f405655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f405656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f405657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc1.x0 f405658h;

    public e0(sc1.x0 x0Var, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f405658h = x0Var;
        this.f405654d = activity;
        this.f405655e = lVar;
        this.f405656f = jSONObject;
        this.f405657g = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f405655e;
        if (i17 == 117) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
                sc1.x0 x0Var = this.f405658h;
                x0Var.getClass();
                x0Var.B(lVar, this.f405656f, this.f405657g, lVar.getJsRuntime());
            } else {
                com.tencent.mm.sdk.platformtools.u3.i(new sc1.d0(this), 50L);
            }
        }
        si1.e1.b(lVar.getAppId(), this);
    }
}
