package mw;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "dismissPopupWindow";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MBJsApiDismissPopupWindow", "data:".concat(data.a()));
        hw.c0 c0Var = (hw.c0) this.f317890a;
        if (c0Var != null) {
            fw.v vVar = c0Var.f285362x;
            vVar.getClass();
            vVar.n("dismissPopupWindow", com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.newBuilder().build().toByteArray(), fw.q.f267032d);
        }
        s().invoke(k());
    }
}
