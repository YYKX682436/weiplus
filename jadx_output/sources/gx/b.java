package gx;

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
        cx.w0 w0Var = (cx.w0) this.f317890a;
        if (w0Var != null) {
            kotlin.jvm.internal.o.d(optString);
            gx.a aVar = new gx.a(optString, this);
            com.tencent.mm.flutter.plugin.proto.d0 h17 = com.tencent.mm.flutter.plugin.proto.e0.h();
            h17.g(optString);
            w0Var.f224479x.n("getFrameSetPosition", h17.build().toByteArray(), new cx.q0(aVar));
        }
    }
}
