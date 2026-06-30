package gm1;

/* loaded from: classes7.dex */
public final class e extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.wxassistant.c3 c3Var = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a;
        c3Var.getClass();
        f06.v[] vVarArr = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92151b;
        boolean[] zArr = {((java.lang.Boolean) com.tencent.mm.plugin.appbrand.wxassistant.c3.f92152c.b(c3Var, vVarArr[0])).booleanValue(), ((java.lang.Boolean) com.tencent.mm.plugin.appbrand.wxassistant.c3.f92153d.b(c3Var, vVarArr[1])).booleanValue(), ((java.lang.Boolean) com.tencent.mm.plugin.appbrand.wxassistant.c3.f92154e.b(c3Var, vVarArr[2])).booleanValue()};
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mdc));
        builder.setMultiChoiceItems(new java.lang.String[]{"关闭CloseApplet时同时转发小程序", "启动无头模式前台UI", "是否启动无头小程序"}, zArr, new gm1.a(zArr));
        builder.setPositiveButton("OK", new gm1.b(zArr, this));
        builder.setNegativeButton("Cancel", new gm1.c(this));
        builder.setOnDismissListener(new gm1.d(this));
        builder.create().show();
    }
}
