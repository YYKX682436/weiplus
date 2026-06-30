package hi1;

/* loaded from: classes7.dex */
public class c implements hi1.l {
    @Override // hi1.l
    public void a() {
        l75.q0 q0Var = com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.f86293a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "refreshGridView");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String packageName = context.getPackageName();
        hi1.o oVar = hi1.o.f281500c;
        java.util.List list = oVar.f281501a;
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(packageName, list == null ? com.tencent.mm.R.layout.f488117hm : hi1.n.f281499a[list.size()]);
        if (android.os.Build.VERSION.SDK_INT < 36) {
            remoteViews.setRemoteAdapter(com.tencent.mm.R.id.pmb, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.Service.AppBrandWidgetGridService.class));
        } else if (oVar.f281501a != null) {
            ii1.e eVar = new ii1.e(context);
            android.widget.RemoteViews.RemoteCollectionItems.Builder builder = new android.widget.RemoteViews.RemoteCollectionItems.Builder();
            for (int i17 = 0; i17 < oVar.f281501a.size(); i17++) {
                builder.addItem(i17, eVar.getViewAt(i17));
            }
            remoteViews.setRemoteAdapter(com.tencent.mm.R.id.pmb, builder.build());
        }
        remoteViews.setEmptyView(com.tencent.mm.R.id.pmb, com.tencent.mm.R.id.pmc);
        com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.a(remoteViews, com.tencent.mm.R.id.pmg, "action_click_bg", 3);
        remoteViews.setPendingIntentTemplate(com.tencent.mm.R.id.pmb, android.app.PendingIntent.getActivity(context, 0, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.entry.WidgetEntryActivity.class), fp.g0.b(134217728)));
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class)), remoteViews);
    }
}
