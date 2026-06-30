package hd3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.jsapi.cd.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("enable");
        lc3.e eVar = this.f317890a;
        sc3.k1 k1Var = eVar instanceof sc3.k1 ? (sc3.k1) eVar : null;
        if (k1Var != null) {
            k1Var.H0().Da(optBoolean);
        }
        s().invoke(k());
    }
}
