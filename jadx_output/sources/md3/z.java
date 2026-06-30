package md3;

/* loaded from: classes7.dex */
public final class z extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f325868f = true;

    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadLiteApp";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("appId", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            s().invoke(h(1, "preloadLiteApp fail, appId is null"));
            return;
        }
        java.lang.String optString2 = data.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, "");
        java.lang.String str = data.optBoolean("onlyPreLoadBaseLib", false) ? "updateBaseLibPath" : "preloadLiteApp";
        if (f325868f) {
            f325868f = false;
            ku5.u0 u0Var = ku5.t0.f312615d;
            md3.x xVar = new md3.x(this, optString, optString2, str);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(xVar, 500L, false);
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            md3.y yVar = md3.y.f325867d;
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(yVar, 5000L, false);
        }
        s().invoke(k());
    }
}
