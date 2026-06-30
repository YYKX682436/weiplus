package iw;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showCustomHalfScreenDialog";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("extra");
        hw.c0 c0Var = (hw.c0) this.f317890a;
        if (c0Var != null) {
            kotlin.jvm.internal.o.d(optString);
            fw.v vVar = c0Var.f285362x;
            vVar.getClass();
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder newBuilder = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.newBuilder();
            newBuilder.setExtra(optString);
            vVar.n("showCustomHalfScreenDialog", newBuilder.build().toByteArray(), new fw.t(optString));
        }
        s().invoke(k());
    }
}
