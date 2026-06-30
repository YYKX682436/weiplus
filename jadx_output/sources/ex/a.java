package ex;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showCustomHalfScreenDialog";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("extra");
        cx.w0 w0Var = (cx.w0) this.f317890a;
        if (w0Var != null) {
            kotlin.jvm.internal.o.d(optString);
            ax.t tVar = w0Var.f224479x;
            tVar.getClass();
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder newBuilder = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.newBuilder();
            newBuilder.setExtra(optString);
            tVar.n("showCustomHalfScreenDialog", newBuilder.build().toByteArray(), new ax.r(optString));
        }
        s().invoke(k());
    }
}
