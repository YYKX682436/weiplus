package vd3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f436057a = jz5.h.b(vd3.a.f436056d);

    public final java.util.HashMap a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        bf3.x0 x0Var = bf3.x0.f19674a;
        kotlin.jvm.internal.o.d(context);
        android.graphics.Point a17 = x0Var.a(context);
        android.graphics.Point point = new android.graphics.Point();
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            point.x = currentWindowMetrics.getBounds().width();
            point.y = currentWindowMetrics.getBounds().height();
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int b17 = a06.d.b(java.lang.Integer.valueOf(a17.x).floatValue() / ((java.lang.Number) ((jz5.n) this.f436057a).getValue()).floatValue());
        int b18 = a06.d.b(java.lang.Integer.valueOf(a17.y).floatValue() / ((java.lang.Number) ((jz5.n) this.f436057a).getValue()).floatValue());
        int b19 = a06.d.b(java.lang.Integer.valueOf(point.y).floatValue() / ((java.lang.Number) ((jz5.n) this.f436057a).getValue()).floatValue());
        jz5.l[] lVarArr = new jz5.l[17];
        lVarArr[0] = new jz5.l("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        bf3.p0 p0Var = bf3.p0.f19645a;
        java.lang.Object value = ((jz5.n) bf3.p0.f19649e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        lVarArr[1] = new jz5.l("brand", (java.lang.String) value);
        java.lang.Object value2 = ((jz5.n) bf3.p0.f19650f).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        lVarArr[2] = new jz5.l("model", (java.lang.String) value2);
        lVarArr[3] = new jz5.l("pixelRatio", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) this.f436057a).getValue()).floatValue()));
        java.lang.Object value3 = ((jz5.n) bf3.p0.f19651g).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        lVarArr[4] = new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, (java.lang.String) value3);
        java.lang.Object value4 = ((jz5.n) bf3.p0.f19652h).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        lVarArr[5] = new jz5.l("version", (java.lang.String) value4);
        lVarArr[6] = new jz5.l("fontSizeSetting", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f19646b).getValue()).intValue()));
        lVarArr[7] = new jz5.l("fontSizeScaleFactor", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f19647c).getValue()).floatValue()));
        lVarArr[8] = new jz5.l("screenWidth", java.lang.Integer.valueOf(b17));
        lVarArr[9] = new jz5.l("screenHeight", java.lang.Integer.valueOf(b18));
        lVarArr[10] = new jz5.l("screenHeightWithNavigationBar", java.lang.Integer.valueOf(b19));
        lVarArr[11] = new jz5.l("windowWidth", java.lang.Integer.valueOf(b17));
        lVarArr[12] = new jz5.l("windowHeight", java.lang.Integer.valueOf(b18));
        lVarArr[13] = new jz5.l("system", "Android " + android.os.Build.VERSION.RELEASE);
        lVarArr[14] = new jz5.l("theme", com.tencent.mm.ui.bk.C() ? "dark" : "light");
        int i17 = com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation;
        lVarArr[15] = new jz5.l("deviceOrientation", i17 != 1 ? i17 != 2 ? "" : "landscape" : "portrait");
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        lVarArr[16] = new jz5.l("isTeenMode", java.lang.Boolean.valueOf(c0Var != null ? c0Var.isTeenMode() : false));
        java.util.HashMap i18 = kz5.c1.i(lVarArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.MBGetSystemInfoImpl", "systemInfo: " + i18);
        return i18;
    }
}
