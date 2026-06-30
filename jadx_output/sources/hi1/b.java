package hi1;

/* loaded from: classes7.dex */
public class b implements l75.q0 {
    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.c(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class)));
        } else {
            com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.d(new hi1.a(this, appWidgetManager, context));
        }
    }
}
