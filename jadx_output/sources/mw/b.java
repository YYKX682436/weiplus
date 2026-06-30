package mw;

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
        hw.c0 c0Var = (hw.c0) this.f317890a;
        if (c0Var != null) {
            fw.v vVar = c0Var.f285362x;
            vVar.getClass();
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder newBuilder = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.newBuilder();
            newBuilder.setMask(optBoolean);
            newBuilder.setMaskColor(i17);
            vVar.n("showPopupWindow", newBuilder.build().toByteArray(), fw.u.f267036d);
        }
        s().invoke(k());
    }
}
