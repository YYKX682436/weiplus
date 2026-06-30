package nd1;

/* loaded from: classes7.dex */
public abstract class f0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f336298g;

    public f0(java.lang.Class cls) {
        this.f336298g = cls;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public final java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data) {
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(lVar);
        if (a17 == null) {
            return o("fail:page don't exist");
        }
        if (data == null) {
            return o("fail:invalid data");
        }
        java.lang.Class cls = this.f336298g;
        java.lang.Object B1 = a17.B1(cls);
        if (B1 == null) {
            if (!a17.isRunning()) {
                return o("fail:interrupted");
            }
            if (a17.a0()) {
                throw new java.lang.IllegalAccessError(java.lang.String.format("%s Not Found", cls.getName()));
            }
            return o("fail:not supported");
        }
        nd1.i2 i2Var = (nd1.i2) this;
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        ni1.e ext = (ni1.e) B1;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(ext, "ext");
        int optInt = data.optInt("orientation", 0);
        java.lang.String str = optInt != -90 ? optInt != 90 ? "portrait" : "landscape" : "landscapeLeft";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrivateJsApiSetDisplayOrientation", "set display orientation:%s", str);
        ext.f(str);
        java.lang.String o17 = i2Var.o("ok");
        kotlin.jvm.internal.o.f(o17, "makeReturnJson(...)");
        return o17;
    }
}
