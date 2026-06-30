package fj1;

/* loaded from: classes7.dex */
public final class n extends lc3.b0 implements fj1.q {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f263128f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f263129g;

    public n(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f263128f = clazz;
        this.f263129g = jz5.h.b(new fj1.l(this));
    }

    @Override // lc3.c0
    public java.lang.String f() {
        java.lang.Object value = ((jz5.n) this.f263129g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (java.lang.String) value;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        return new fj1.n(this.f263128f);
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        lc3.a0 a0Var;
        ej1.c cVar;
        lc3.a0 a0Var2;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = this.f317892c;
        if (str == null) {
            kotlin.jvm.internal.o.o("privateData");
            throw null;
        }
        java.lang.String b17 = fj1.q.b(str);
        if (b17 == null || b17.length() == 0) {
            return;
        }
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        fj1.y d17 = ((fh1.z) ((fh1.x0) eVar).f262622x).d(b17);
        if (d17 == null) {
            yz5.l s17 = s();
            try {
                a0Var2 = (lc3.a0) new lc3.a0().put("errno", 4).put("errMsg", "fail:internal error");
            } catch (java.lang.Exception unused) {
                a0Var2 = new lc3.a0();
            }
            kotlin.jvm.internal.o.f(a0Var2, "errorsInfoToJson(...)");
            s17.invoke(a0Var2);
            return;
        }
        try {
            cVar = d17.f263149i;
        } catch (jz5.e0 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAMagicBrushFrameMBJsApiAsyncWrapper[" + f() + ']', "invoke get exception:" + e17);
            k0Var = null;
        }
        if (cVar == null) {
            kotlin.jvm.internal.o.o("jsapiPool");
            throw null;
        }
        k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) ((java.util.HashMap) ((jz5.n) ((fj1.j) cVar).f263121b).getValue()).get(f());
        if (k0Var != null) {
            kotlinx.coroutines.l.d(d17.f263156p, null, null, new fj1.m(k0Var, d17, this, data, null), 3, null);
            return;
        }
        yz5.l s18 = s();
        try {
            a0Var = (lc3.a0) new lc3.a0().put("errno", 100).put("errMsg", "fail:jsapi not supported");
        } catch (java.lang.Exception unused2) {
            a0Var = new lc3.a0();
        }
        kotlin.jvm.internal.o.f(a0Var, "errorsInfoToJson(...)");
        s18.invoke(a0Var);
    }
}
