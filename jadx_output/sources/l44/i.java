package l44;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static float f316169b;

    /* renamed from: c, reason: collision with root package name */
    public static float f316170c;

    /* renamed from: a, reason: collision with root package name */
    public static final l44.i f316168a = new l44.i();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f316171d = new java.util.HashMap();

    public static final void b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordScreenWidthHeight", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        if (context == null || f316169b > 0.0f || f316170c > 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordScreenWidthHeight", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            return;
        }
        f316169b = com.tencent.mm.ui.bl.b(context).x;
        f316170c = com.tencent.mm.ui.bl.b(context).y;
        com.tencent.mars.xlog.Log.i("AdClickCoordinateHelper", "record screen height = " + f316170c + ", screen width = " + f316169b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordScreenWidthHeight", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
    }

    public final float a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoordinateY", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        view.getLocationOnScreen(new int[2]);
        java.lang.Float valueOf = java.lang.Float.valueOf(r3[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        float floatValue = valueOf.floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoordinateY", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        return floatValue;
    }
}
