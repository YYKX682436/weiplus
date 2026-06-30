package tb1;

/* loaded from: classes7.dex */
public final class l0 implements tb1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1.m0 f416910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f416911b;

    public l0(tb1.m0 m0Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f416910a = m0Var;
        this.f416911b = tVar;
    }

    @Override // tb1.z
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertCameraWC", "onRelease");
        tb1.m0 m0Var = this.f416910a;
        mi1.w0 w0Var = m0Var.f416912i;
        if (w0Var != null) {
            kotlin.jvm.internal.o.d(w0Var);
            w0Var.dismiss();
            m0Var.f416912i = null;
        }
    }

    @Override // tb1.z
    public void onInit() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertCameraWC", "onInit");
        tb1.m0 m0Var = this.f416910a;
        if (m0Var.f416912i == null) {
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f416911b;
            if (tVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                m0Var.f416912i = mi1.c.a(((com.tencent.mm.plugin.appbrand.page.v5) tVar).t3()).h(mi1.d.CAMERA);
            }
        }
    }
}
