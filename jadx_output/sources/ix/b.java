package ix;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showPopupWindow";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        int i17;
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("mask");
        try {
            i17 = android.graphics.Color.parseColor(data.optString("maskColor"));
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiShowPopupWindow", data.optString("maskColor"));
            i17 = 0;
        }
        cx.w0 w0Var = (cx.w0) this.f317890a;
        if (w0Var != null) {
            ax.t tVar = w0Var.f224479x;
            tVar.getClass();
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder newBuilder = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.newBuilder();
            newBuilder.setMask(optBoolean);
            newBuilder.setMaskColor(i17);
            tVar.n("showPopupWindow", newBuilder.build().toByteArray(), ax.s.f14958d);
        }
        s().invoke(k());
    }
}
