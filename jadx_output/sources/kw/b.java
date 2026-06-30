package kw;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getFrameSetPosition";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        hw.c0 c0Var = (hw.c0) this.f317890a;
        if (c0Var != null) {
            kotlin.jvm.internal.o.d(optString);
            kw.a aVar = new kw.a(optString, this);
            com.tencent.mm.flutter.plugin.proto.d0 h17 = com.tencent.mm.flutter.plugin.proto.e0.h();
            h17.g(optString);
            c0Var.f285362x.n("getFrameSetPosition", h17.build().toByteArray(), new hw.y(aVar));
        }
    }
}
