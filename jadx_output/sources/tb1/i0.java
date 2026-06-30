package tb1;

/* loaded from: classes7.dex */
public class i0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f416900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f416901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gb1.n f416902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tb1.k0 f416903g;

    public i0(tb1.k0 k0Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, gb1.n nVar) {
        this.f416903g = k0Var;
        this.f416900d = weakReference;
        this.f416901e = weakReference2;
        this.f416902f = nVar;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        tb1.a0 a0Var = (tb1.a0) this.f416900d.get();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f416901e.get();
        if (i17 == 16) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0 && a0Var != null && lVar != null) {
                tb1.b.f416889a.f416890a = true;
                this.f416903g.P(lVar, a0Var, this.f416902f);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (a0Var != null) {
                hashMap.put("cameraId", java.lang.Integer.valueOf(a0Var.getCameraId()));
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertCamera", "onRequestPermissionsResult weak camera is null, get Camera id fail");
            }
            if (lVar != null) {
                java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
                tb1.d0 d0Var = new tb1.d0();
                d0Var.p(lVar);
                d0Var.r(jSONObject);
                d0Var.m();
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertCamera", "onRequestPermissionsResult weak camera is null, dispatch data fail");
            }
            tb1.b.f416889a.f416890a = false;
        }
    }
}
