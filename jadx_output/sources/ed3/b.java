package ed3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.jsapi.oe.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(ya.b.LEVEL);
        java.lang.String optString2 = data.optString("content");
        java.lang.String str = "[" + e().f344331a + ']' + optString2;
        boolean optBoolean = data.optBoolean("enableVConsole", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(str) && !r26.i0.p("verbose", optString, true) && !r26.i0.p("debug", optString, true)) {
            if (r26.i0.p("info", optString, true)) {
                if (str.length() > 500) {
                    java.lang.String substring = str.substring(0, 500);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    com.tencent.mars.xlog.Log.i("MBJsApiSystemLog", substring);
                } else {
                    com.tencent.mars.xlog.Log.i("MBJsApiSystemLog", str);
                }
            } else if (r26.i0.p("warn", optString, true)) {
                com.tencent.mars.xlog.Log.w("MBJsApiSystemLog", str);
            } else {
                com.tencent.mars.xlog.Log.e("MBJsApiSystemLog", str);
            }
        }
        if (optBoolean) {
            lc3.e eVar = this.f317890a;
            sc3.k1 k1Var = eVar instanceof sc3.k1 ? (sc3.k1) eVar : null;
            if (k1Var != null) {
                kotlin.jvm.internal.o.d(optString2);
                k1Var.H0().Ke(r26.p0.E0(optString2, 131072));
            }
        }
        s().invoke(k());
    }
}
