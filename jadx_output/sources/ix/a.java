package ix;

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
        cx.w0 w0Var = (cx.w0) this.f317890a;
        if (w0Var != null) {
            ax.t tVar = w0Var.f224479x;
            tVar.getClass();
            tVar.n("dismissPopupWindow", com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.newBuilder().build().toByteArray(), ax.m.f14953d);
        }
        s().invoke(k());
    }
}
