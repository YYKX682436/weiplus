package fx;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getFrameSetOffsetInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            s().invoke(h(1, "empty frameSetName"));
        }
        cx.w0 w0Var = (cx.w0) this.f317890a;
        if (w0Var != null) {
            fx.a aVar = new fx.a(this);
            ax.t tVar = w0Var.f224479x;
            tVar.getClass();
            com.tencent.mm.flutter.plugin.proto.d0 h17 = com.tencent.mm.flutter.plugin.proto.e0.h();
            h17.g(optString);
            tVar.n("getFrameSetOffsetInfo", h17.build().toByteArray(), new ax.p(aVar));
        }
    }
}
