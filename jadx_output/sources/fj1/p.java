package fj1;

/* loaded from: classes7.dex */
public final class p extends lc3.d0 implements fj1.q {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f263131d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f263132e;

    public p(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f263131d = clazz;
        this.f263132e = jz5.h.b(new fj1.o(this));
    }

    @Override // lc3.c0
    public java.lang.String f() {
        java.lang.Object value = ((jz5.n) this.f263132e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (java.lang.String) value;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        lc3.a0 a0Var;
        lc3.a0 a0Var2;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = this.f317892c;
        if (str == null) {
            kotlin.jvm.internal.o.o("privateData");
            throw null;
        }
        java.lang.String b17 = fj1.q.b(str);
        if (!(b17 == null || b17.length() == 0)) {
            lc3.e eVar = this.f317890a;
            kotlin.jvm.internal.o.d(eVar);
            fj1.y d17 = ((fh1.z) ((fh1.x0) eVar).f262622x).d(b17);
            if (d17 != null) {
                ej1.c cVar = d17.f263149i;
                if (cVar == null) {
                    kotlin.jvm.internal.o.o("jsapiPool");
                    throw null;
                }
                com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) ((java.util.HashMap) ((jz5.n) ((fj1.j) cVar).f263121b).getValue()).get(f());
                if (k0Var == null) {
                    try {
                        a0Var = (lc3.a0) new lc3.a0().put("errno", 100).put("errMsg", "fail:jsapi not supported");
                    } catch (java.lang.Exception unused) {
                        a0Var = new lc3.a0();
                    }
                    kotlin.jvm.internal.o.f(a0Var, "errorsInfoToJson(...)");
                    return a0Var;
                }
                com.tencent.mm.plugin.appbrand.jsapi.a1 a1Var = (com.tencent.mm.plugin.appbrand.jsapi.a1) k0Var;
                fj1.b0 b0Var = d17.f263151k;
                if (b0Var == null) {
                    kotlin.jvm.internal.o.o("jsapiInvokePermissionController");
                    throw null;
                }
                if (!b0Var.f263106b.a(b0Var.f263105a.d(), a1Var.getClass())) {
                    try {
                        a0Var2 = (lc3.a0) new lc3.a0().put("errno", 102).put("errMsg", "fail:jsapi has no permission");
                    } catch (java.lang.Exception unused2) {
                        a0Var2 = new lc3.a0();
                    }
                    kotlin.jvm.internal.o.d(a0Var2);
                    return a0Var2;
                }
                java.lang.String A = k0Var instanceof yc1.b ? a1Var.A(d17.d(), data, d17.d().getJsRuntime()) : a1Var.z(d17.d(), data);
                kotlin.jvm.internal.o.d(A);
                lc3.a0 a0Var3 = new lc3.a0(A);
                if (!a0Var3.has("errCode")) {
                    a0Var3.put("errCode", 0);
                }
                return a0Var3;
            }
        }
        return new lc3.a0();
    }
}
