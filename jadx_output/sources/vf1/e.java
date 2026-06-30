package vf1;

/* loaded from: classes7.dex */
public class e implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f436317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb1.a0 f436318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf1.f f436319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vf1.g f436320g;

    public e(vf1.g gVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, tb1.a0 a0Var, vf1.f fVar) {
        this.f436320g = gVar;
        this.f436317d = lVar;
        this.f436318e = a0Var;
        this.f436319f = fVar;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 16) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f436317d;
            tb1.a0 a0Var = this.f436318e;
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                tb1.b.f416889a.f416890a = true;
                this.f436320g.F(lVar, a0Var, this.f436319f);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("cameraId", java.lang.Integer.valueOf(a0Var.getCameraId()));
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            tb1.d0 d0Var = new tb1.d0();
            d0Var.p(lVar);
            d0Var.r(jSONObject);
            d0Var.m();
            tb1.b.f416889a.f416890a = false;
        }
    }
}
