package wc1;

/* loaded from: classes7.dex */
public class t implements com.tencent.mm.plugin.appbrand.jsapi.h0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.HashSet f444495d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f444496e;

    public t(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        this.f444496e = false;
        boolean y17 = d0Var.x() != null ? com.tencent.mm.sdk.platformtools.t8.y(d0Var.x().qe("supportListenTaskStateChange"), false) : false;
        this.f444496e = y17;
        if (y17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoadSubPackageTaskCallbackFilter", "JsApiOnLoadSubPackageTaskStateChange support listen task state change");
        }
    }
}
