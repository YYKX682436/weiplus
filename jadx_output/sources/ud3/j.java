package ud3;

/* loaded from: classes7.dex */
public final class j extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final ud3.d f426671f = new ud3.d();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalDataSize";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap a17 = this.f426671f.a(data, e().f344331a);
        java.lang.Object obj = a17.get("error");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!kotlin.jvm.internal.o.b(zVar, lc3.x.f317934a)) {
            s().invoke(h(zVar.f317944a, zVar.f317945b));
            return;
        }
        yz5.l s17 = s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("size", a17.get("size"));
        a0Var.put("quota", a17.get("quota"));
        m(a0Var);
        s17.invoke(a0Var);
    }
}
